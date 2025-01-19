package io.ygdrasil.wgpu

import android.os.Bundle
import android.view.ViewGroup
import androidx.activity.ComponentActivity
import ffi.memoryScope
import io.ygdrasil.wgpu.WGPUAdapterInfo


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layoutParams = ViewGroup
            .LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
            )

        val surfaceView = WGPUSurfaceView(context = this)
        surfaceView.layoutParams = layoutParams
        addContentView(surfaceView, surfaceView.layoutParams)

    }
}