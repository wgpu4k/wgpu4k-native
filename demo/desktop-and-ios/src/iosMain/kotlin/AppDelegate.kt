@file:OptIn(ExperimentalForeignApi::class)

package io.ygdrasil.wgpu

import ffi.NativeAddress
import kotlinx.cinterop.COpaque
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CValue
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.interpretCPointer
import kotlinx.cinterop.objcPtr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.useContents
import platform.CoreGraphics.CGSize
import platform.MetalKit.MTKView
import platform.MetalKit.MTKViewDelegateProtocol
import platform.UIKit.UIApplication
import platform.UIKit.UIScreen
import platform.UIKit.UIViewController
import platform.UIKit.UIWindow
import platform.darwin.NSObject

class AppDelegate {

    private var window: UIWindow? = null
    private var viewDelegate: ViewDelegate? = null

    fun application(
        application: UIApplication,
        didFinishLaunchingWithOptions: Map<Any?, *>?
    ): Boolean {
        window = UIWindow(frame = UIScreen.mainScreen.bounds).also { window ->
            UIViewController().also { controller ->
                MTKView().also { view ->
                    UIScreen.mainScreen.nativeScale
                    controller.view = view
                    window.rootViewController = controller

                    configureApplication(
                        view,
                        UIScreen.mainScreen.bounds.useContents {
                            (size.width * UIScreen.mainScreen.nativeScale).toInt() to (size.height * UIScreen.mainScreen.nativeScale).toInt()
                        }
                    )

                }
            }
        }
        window?.makeKeyAndVisible()
        return true
    }

    fun configureApplication(view: MTKView, size: Pair<Int, Int>) {
        try {
            val (width, height) = size
            val layer = view.layer
            val layerPointer: COpaquePointer = interpretCPointer<COpaque>(layer.objcPtr())!!.reinterpret()
            val instance = wgpuCreateInstance(null) ?: error("Can't create WGPU instance")
            val surface = getSurfaceFromMetalLayer(instance, layerPointer.let(::NativeAddress)) ?: error("Can't create Surface")
            val adapter = getAdapter(surface, instance)
            val device = getDevice(adapter)
            val compatibleFormat = compatibleFormat(surface, adapter)
            val alphaMode = compatibleAlphaMode(surface, adapter)
            configureSurface(device, width, height, surface, compatibleFormat, alphaMode)

            val scene = HelloTriangleScene(device, compatibleFormat, surface)
            scene.initialize()


            viewDelegate = ViewDelegate(scene)
            view.delegate = viewDelegate
        } catch (e: Throwable) {
            e.printStackTrace()
            throw e
        }

    }

}

class ViewDelegate(
    val scene: HelloTriangleScene,
) : NSObject(), MTKViewDelegateProtocol {

    override fun mtkView(view: MTKView, drawableSizeWillChange: CValue<CGSize>) {}

    override fun drawInMTKView(view: MTKView) {
        scene.render()
    }

}

