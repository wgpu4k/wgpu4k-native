// This file has been generated DO NOT EDIT !!!
package io.ygdrasil.wgpu.android

import com.sun.jna.Callback
import com.sun.jna.Pointer
import com.sun.jna.Structure
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Short
import kotlin.Unit
import kotlin.jvm.JvmField

/**
 * @suppress
 */
public sealed class WGPUStringView(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var `data`: Pointer? = null

	@JvmField
	public var length: Long = 0L

	override fun getFieldOrder(): Unit = listOf("data", "length")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUStringView(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUStringView) : this(other.pointer) {
			this.data = other.data
			this.length = other.length
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUStringView(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUStringView) : this(other.pointer) {
			this.data = other.data
			this.length = other.length
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUAdapterInfo(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var nextInChain: Pointer? = null

	@JvmField
	public var vendor: WGPUStringView.ByValue = WGPUStringView.ByValue()

	@JvmField
	public var architecture: WGPUStringView.ByValue = WGPUStringView.ByValue()

	@JvmField
	public var device: WGPUStringView.ByValue = WGPUStringView.ByValue()

	@JvmField
	public var description: WGPUStringView.ByValue = WGPUStringView.ByValue()

	@JvmField
	public var backendType: Int = 0

	@JvmField
	public var adapterType: Int = 0

	@JvmField
	public var vendorID: Int = 0

	@JvmField
	public var deviceID: Int = 0

	override fun getFieldOrder(): Unit = listOf("nextInChain", "vendor", "architecture", "device", "description", "backendType", "adapterType", "vendorID", "deviceID")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUAdapterInfo(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUAdapterInfo) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.vendor = other.vendor
			this.architecture = other.architecture
			this.device = other.device
			this.description = other.description
			this.backendType = other.backendType
			this.adapterType = other.adapterType
			this.vendorID = other.vendorID
			this.deviceID = other.deviceID
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUAdapterInfo(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUAdapterInfo) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.vendor = other.vendor
			this.architecture = other.architecture
			this.device = other.device
			this.description = other.description
			this.backendType = other.backendType
			this.adapterType = other.adapterType
			this.vendorID = other.vendorID
			this.deviceID = other.deviceID
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUBindGroupDescriptor(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var nextInChain: Pointer? = null

	@JvmField
	public var label: WGPUStringView.ByValue = WGPUStringView.ByValue()

	@JvmField
	public var layout: Pointer? = null

	@JvmField
	public var entryCount: Long = 0L

	@JvmField
	public var entries: Pointer? = null

	override fun getFieldOrder(): Unit = listOf("nextInChain", "label", "layout", "entryCount", "entries")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUBindGroupDescriptor(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUBindGroupDescriptor) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.label = other.label
			this.layout = other.layout
			this.entryCount = other.entryCount
			this.entries = other.entries
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUBindGroupDescriptor(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUBindGroupDescriptor) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.label = other.label
			this.layout = other.layout
			this.entryCount = other.entryCount
			this.entries = other.entries
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUBindGroupEntry(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var nextInChain: Pointer? = null

	@JvmField
	public var binding: Int = 0

	@JvmField
	public var buffer: Pointer? = null

	@JvmField
	public var offset: Long = 0L

	@JvmField
	public var size: Long = 0L

	@JvmField
	public var sampler: Pointer? = null

	@JvmField
	public var textureView: Pointer? = null

	override fun getFieldOrder(): Unit = listOf("nextInChain", "binding", "buffer", "offset", "size", "sampler", "textureView")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUBindGroupEntry(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUBindGroupEntry) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.binding = other.binding
			this.buffer = other.buffer
			this.offset = other.offset
			this.size = other.size
			this.sampler = other.sampler
			this.textureView = other.textureView
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUBindGroupEntry(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUBindGroupEntry) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.binding = other.binding
			this.buffer = other.buffer
			this.offset = other.offset
			this.size = other.size
			this.sampler = other.sampler
			this.textureView = other.textureView
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUBindGroupLayoutDescriptor(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var nextInChain: Pointer? = null

	@JvmField
	public var label: WGPUStringView.ByValue = WGPUStringView.ByValue()

	@JvmField
	public var entryCount: Long = 0L

	@JvmField
	public var entries: Pointer? = null

	override fun getFieldOrder(): Unit = listOf("nextInChain", "label", "entryCount", "entries")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUBindGroupLayoutDescriptor(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUBindGroupLayoutDescriptor) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.label = other.label
			this.entryCount = other.entryCount
			this.entries = other.entries
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUBindGroupLayoutDescriptor(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUBindGroupLayoutDescriptor) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.label = other.label
			this.entryCount = other.entryCount
			this.entries = other.entries
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUBufferBindingLayout(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var nextInChain: Pointer? = null

	@JvmField
	public var type: Int = 0

	@JvmField
	public var hasDynamicOffset: Int = 0

	@JvmField
	public var minBindingSize: Long = 0L

	override fun getFieldOrder(): Unit = listOf("nextInChain", "type", "hasDynamicOffset", "minBindingSize")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUBufferBindingLayout(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUBufferBindingLayout) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.type = other.type
			this.hasDynamicOffset = other.hasDynamicOffset
			this.minBindingSize = other.minBindingSize
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUBufferBindingLayout(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUBufferBindingLayout) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.type = other.type
			this.hasDynamicOffset = other.hasDynamicOffset
			this.minBindingSize = other.minBindingSize
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUSamplerBindingLayout(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var nextInChain: Pointer? = null

	@JvmField
	public var type: Int = 0

	override fun getFieldOrder(): Unit = listOf("nextInChain", "type")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUSamplerBindingLayout(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUSamplerBindingLayout) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.type = other.type
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUSamplerBindingLayout(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUSamplerBindingLayout) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.type = other.type
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUTextureBindingLayout(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var nextInChain: Pointer? = null

	@JvmField
	public var sampleType: Int = 0

	@JvmField
	public var viewDimension: Int = 0

	@JvmField
	public var multisampled: Int = 0

	override fun getFieldOrder(): Unit = listOf("nextInChain", "sampleType", "viewDimension", "multisampled")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUTextureBindingLayout(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUTextureBindingLayout) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.sampleType = other.sampleType
			this.viewDimension = other.viewDimension
			this.multisampled = other.multisampled
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUTextureBindingLayout(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUTextureBindingLayout) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.sampleType = other.sampleType
			this.viewDimension = other.viewDimension
			this.multisampled = other.multisampled
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUStorageTextureBindingLayout(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var nextInChain: Pointer? = null

	@JvmField
	public var access: Int = 0

	@JvmField
	public var format: Int = 0

	@JvmField
	public var viewDimension: Int = 0

	override fun getFieldOrder(): Unit = listOf("nextInChain", "access", "format", "viewDimension")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUStorageTextureBindingLayout(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUStorageTextureBindingLayout) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.access = other.access
			this.format = other.format
			this.viewDimension = other.viewDimension
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUStorageTextureBindingLayout(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUStorageTextureBindingLayout) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.access = other.access
			this.format = other.format
			this.viewDimension = other.viewDimension
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUBindGroupLayoutEntry(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var nextInChain: Pointer? = null

	@JvmField
	public var binding: Int = 0

	@JvmField
	public var visibility: Long = 0L

	@JvmField
	public var buffer: WGPUBufferBindingLayout.ByValue = WGPUBufferBindingLayout.ByValue()

	@JvmField
	public var sampler: WGPUSamplerBindingLayout.ByValue = WGPUSamplerBindingLayout.ByValue()

	@JvmField
	public var texture: WGPUTextureBindingLayout.ByValue = WGPUTextureBindingLayout.ByValue()

	@JvmField
	public var storageTexture: WGPUStorageTextureBindingLayout.ByValue =
			WGPUStorageTextureBindingLayout.ByValue()

	override fun getFieldOrder(): Unit = listOf("nextInChain", "binding", "visibility", "buffer", "sampler", "texture", "storageTexture")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUBindGroupLayoutEntry(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUBindGroupLayoutEntry) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.binding = other.binding
			this.visibility = other.visibility
			this.buffer = other.buffer
			this.sampler = other.sampler
			this.texture = other.texture
			this.storageTexture = other.storageTexture
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUBindGroupLayoutEntry(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUBindGroupLayoutEntry) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.binding = other.binding
			this.visibility = other.visibility
			this.buffer = other.buffer
			this.sampler = other.sampler
			this.texture = other.texture
			this.storageTexture = other.storageTexture
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUBlendComponent(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var operation: Int = 0

	@JvmField
	public var srcFactor: Int = 0

	@JvmField
	public var dstFactor: Int = 0

	override fun getFieldOrder(): Unit = listOf("operation", "srcFactor", "dstFactor")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUBlendComponent(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUBlendComponent) : this(other.pointer) {
			this.operation = other.operation
			this.srcFactor = other.srcFactor
			this.dstFactor = other.dstFactor
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUBlendComponent(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUBlendComponent) : this(other.pointer) {
			this.operation = other.operation
			this.srcFactor = other.srcFactor
			this.dstFactor = other.dstFactor
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUBlendState(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var color: WGPUBlendComponent.ByValue = WGPUBlendComponent.ByValue()

	@JvmField
	public var alpha: WGPUBlendComponent.ByValue = WGPUBlendComponent.ByValue()

	override fun getFieldOrder(): Unit = listOf("color", "alpha")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUBlendState(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUBlendState) : this(other.pointer) {
			this.color = other.color
			this.alpha = other.alpha
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUBlendState(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUBlendState) : this(other.pointer) {
			this.color = other.color
			this.alpha = other.alpha
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUBufferDescriptor(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var nextInChain: Pointer? = null

	@JvmField
	public var label: WGPUStringView.ByValue = WGPUStringView.ByValue()

	@JvmField
	public var usage: Long = 0L

	@JvmField
	public var size: Long = 0L

	@JvmField
	public var mappedAtCreation: Int = 0

	override fun getFieldOrder(): Unit = listOf("nextInChain", "label", "usage", "size", "mappedAtCreation")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUBufferDescriptor(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUBufferDescriptor) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.label = other.label
			this.usage = other.usage
			this.size = other.size
			this.mappedAtCreation = other.mappedAtCreation
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUBufferDescriptor(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUBufferDescriptor) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.label = other.label
			this.usage = other.usage
			this.size = other.size
			this.mappedAtCreation = other.mappedAtCreation
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUColor(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var r: Double = 0.0

	@JvmField
	public var g: Double = 0.0

	@JvmField
	public var b: Double = 0.0

	@JvmField
	public var a: Double = 0.0

	override fun getFieldOrder(): Unit = listOf("r", "g", "b", "a")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUColor(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUColor) : this(other.pointer) {
			this.r = other.r
			this.g = other.g
			this.b = other.b
			this.a = other.a
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUColor(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUColor) : this(other.pointer) {
			this.r = other.r
			this.g = other.g
			this.b = other.b
			this.a = other.a
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUColorTargetState(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var nextInChain: Pointer? = null

	@JvmField
	public var format: Int = 0

	@JvmField
	public var blend: WGPUBlendState.ByReference? = null

	@JvmField
	public var writeMask: Long = 0L

	override fun getFieldOrder(): Unit = listOf("nextInChain", "format", "blend", "writeMask")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUColorTargetState(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUColorTargetState) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.format = other.format
			this.blend = other.blend
			this.writeMask = other.writeMask
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUColorTargetState(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUColorTargetState) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.format = other.format
			this.blend = other.blend
			this.writeMask = other.writeMask
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUCommandBufferDescriptor(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var nextInChain: Pointer? = null

	@JvmField
	public var label: WGPUStringView.ByValue = WGPUStringView.ByValue()

	override fun getFieldOrder(): Unit = listOf("nextInChain", "label")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUCommandBufferDescriptor(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUCommandBufferDescriptor) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.label = other.label
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUCommandBufferDescriptor(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUCommandBufferDescriptor) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.label = other.label
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUCommandEncoderDescriptor(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var nextInChain: Pointer? = null

	@JvmField
	public var label: WGPUStringView.ByValue = WGPUStringView.ByValue()

	override fun getFieldOrder(): Unit = listOf("nextInChain", "label")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUCommandEncoderDescriptor(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUCommandEncoderDescriptor) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.label = other.label
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUCommandEncoderDescriptor(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUCommandEncoderDescriptor) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.label = other.label
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUCompilationInfo(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var nextInChain: Pointer? = null

	@JvmField
	public var messageCount: Long = 0L

	@JvmField
	public var messages: Pointer? = null

	override fun getFieldOrder(): Unit = listOf("nextInChain", "messageCount", "messages")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUCompilationInfo(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUCompilationInfo) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.messageCount = other.messageCount
			this.messages = other.messages
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUCompilationInfo(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUCompilationInfo) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.messageCount = other.messageCount
			this.messages = other.messages
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUCompilationMessage(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var nextInChain: Pointer? = null

	@JvmField
	public var message: WGPUStringView.ByValue = WGPUStringView.ByValue()

	@JvmField
	public var type: Int = 0

	@JvmField
	public var lineNum: Long = 0L

	@JvmField
	public var linePos: Long = 0L

	@JvmField
	public var offset: Long = 0L

	@JvmField
	public var length: Long = 0L

	override fun getFieldOrder(): Unit = listOf("nextInChain", "message", "type", "lineNum", "linePos", "offset", "length")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUCompilationMessage(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUCompilationMessage) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.message = other.message
			this.type = other.type
			this.lineNum = other.lineNum
			this.linePos = other.linePos
			this.offset = other.offset
			this.length = other.length
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUCompilationMessage(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUCompilationMessage) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.message = other.message
			this.type = other.type
			this.lineNum = other.lineNum
			this.linePos = other.linePos
			this.offset = other.offset
			this.length = other.length
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUComputePassDescriptor(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var nextInChain: Pointer? = null

	@JvmField
	public var label: WGPUStringView.ByValue = WGPUStringView.ByValue()

	@JvmField
	public var timestampWrites: WGPUComputePassTimestampWrites.ByReference? = null

	override fun getFieldOrder(): Unit = listOf("nextInChain", "label", "timestampWrites")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUComputePassDescriptor(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUComputePassDescriptor) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.label = other.label
			this.timestampWrites = other.timestampWrites
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUComputePassDescriptor(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUComputePassDescriptor) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.label = other.label
			this.timestampWrites = other.timestampWrites
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUComputePassTimestampWrites(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var querySet: Pointer? = null

	@JvmField
	public var beginningOfPassWriteIndex: Int = 0

	@JvmField
	public var endOfPassWriteIndex: Int = 0

	override fun getFieldOrder(): Unit = listOf("querySet", "beginningOfPassWriteIndex", "endOfPassWriteIndex")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUComputePassTimestampWrites(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUComputePassTimestampWrites) : this(other.pointer) {
			this.querySet = other.querySet
			this.beginningOfPassWriteIndex = other.beginningOfPassWriteIndex
			this.endOfPassWriteIndex = other.endOfPassWriteIndex
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUComputePassTimestampWrites(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUComputePassTimestampWrites) : this(other.pointer) {
			this.querySet = other.querySet
			this.beginningOfPassWriteIndex = other.beginningOfPassWriteIndex
			this.endOfPassWriteIndex = other.endOfPassWriteIndex
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUProgrammableStageDescriptor(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var nextInChain: Pointer? = null

	@JvmField
	public var module: Pointer? = null

	@JvmField
	public var entryPoint: WGPUStringView.ByValue = WGPUStringView.ByValue()

	@JvmField
	public var constantCount: Long = 0L

	@JvmField
	public var constants: Pointer? = null

	override fun getFieldOrder(): Unit = listOf("nextInChain", "module", "entryPoint", "constantCount", "constants")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUProgrammableStageDescriptor(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUProgrammableStageDescriptor) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.module = other.module
			this.entryPoint = other.entryPoint
			this.constantCount = other.constantCount
			this.constants = other.constants
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUProgrammableStageDescriptor(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUProgrammableStageDescriptor) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.module = other.module
			this.entryPoint = other.entryPoint
			this.constantCount = other.constantCount
			this.constants = other.constants
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUComputePipelineDescriptor(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var nextInChain: Pointer? = null

	@JvmField
	public var label: WGPUStringView.ByValue = WGPUStringView.ByValue()

	@JvmField
	public var layout: Pointer? = null

	@JvmField
	public var compute: WGPUProgrammableStageDescriptor.ByValue =
			WGPUProgrammableStageDescriptor.ByValue()

	override fun getFieldOrder(): Unit = listOf("nextInChain", "label", "layout", "compute")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUComputePipelineDescriptor(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUComputePipelineDescriptor) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.label = other.label
			this.layout = other.layout
			this.compute = other.compute
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUComputePipelineDescriptor(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUComputePipelineDescriptor) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.label = other.label
			this.layout = other.layout
			this.compute = other.compute
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUConstantEntry(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var nextInChain: Pointer? = null

	@JvmField
	public var key: WGPUStringView.ByValue = WGPUStringView.ByValue()

	@JvmField
	public var `value`: Double = 0.0

	override fun getFieldOrder(): Unit = listOf("nextInChain", "key", "value")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUConstantEntry(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUConstantEntry) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.key = other.key
			this.value = other.value
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUConstantEntry(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUConstantEntry) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.key = other.key
			this.value = other.value
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUStencilFaceState(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var compare: Int = 0

	@JvmField
	public var failOp: Int = 0

	@JvmField
	public var depthFailOp: Int = 0

	@JvmField
	public var passOp: Int = 0

	override fun getFieldOrder(): Unit = listOf("compare", "failOp", "depthFailOp", "passOp")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUStencilFaceState(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUStencilFaceState) : this(other.pointer) {
			this.compare = other.compare
			this.failOp = other.failOp
			this.depthFailOp = other.depthFailOp
			this.passOp = other.passOp
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUStencilFaceState(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUStencilFaceState) : this(other.pointer) {
			this.compare = other.compare
			this.failOp = other.failOp
			this.depthFailOp = other.depthFailOp
			this.passOp = other.passOp
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUDepthStencilState(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var nextInChain: Pointer? = null

	@JvmField
	public var format: Int = 0

	@JvmField
	public var depthWriteEnabled: Int = 0

	@JvmField
	public var depthCompare: Int = 0

	@JvmField
	public var stencilFront: WGPUStencilFaceState.ByValue = WGPUStencilFaceState.ByValue()

	@JvmField
	public var stencilBack: WGPUStencilFaceState.ByValue = WGPUStencilFaceState.ByValue()

	@JvmField
	public var stencilReadMask: Int = 0

	@JvmField
	public var stencilWriteMask: Int = 0

	@JvmField
	public var depthBias: Int = 0

	@JvmField
	public var depthBiasSlopeScale: Float = 0f

	@JvmField
	public var depthBiasClamp: Float = 0f

	override fun getFieldOrder(): Unit = listOf("nextInChain", "format", "depthWriteEnabled", "depthCompare", "stencilFront", "stencilBack", "stencilReadMask", "stencilWriteMask", "depthBias", "depthBiasSlopeScale", "depthBiasClamp")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUDepthStencilState(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUDepthStencilState) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.format = other.format
			this.depthWriteEnabled = other.depthWriteEnabled
			this.depthCompare = other.depthCompare
			this.stencilFront = other.stencilFront
			this.stencilBack = other.stencilBack
			this.stencilReadMask = other.stencilReadMask
			this.stencilWriteMask = other.stencilWriteMask
			this.depthBias = other.depthBias
			this.depthBiasSlopeScale = other.depthBiasSlopeScale
			this.depthBiasClamp = other.depthBiasClamp
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUDepthStencilState(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUDepthStencilState) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.format = other.format
			this.depthWriteEnabled = other.depthWriteEnabled
			this.depthCompare = other.depthCompare
			this.stencilFront = other.stencilFront
			this.stencilBack = other.stencilBack
			this.stencilReadMask = other.stencilReadMask
			this.stencilWriteMask = other.stencilWriteMask
			this.depthBias = other.depthBias
			this.depthBiasSlopeScale = other.depthBiasSlopeScale
			this.depthBiasClamp = other.depthBiasClamp
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUQueueDescriptor(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var nextInChain: Pointer? = null

	@JvmField
	public var label: WGPUStringView.ByValue = WGPUStringView.ByValue()

	override fun getFieldOrder(): Unit = listOf("nextInChain", "label")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUQueueDescriptor(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUQueueDescriptor) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.label = other.label
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUQueueDescriptor(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUQueueDescriptor) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.label = other.label
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUDeviceLostCallbackInfo(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var nextInChain: WGPUChainedStruct.ByReference? = null

	@JvmField
	public var mode: Int = 0

	@JvmField
	public var callback: Callback? = null

	@JvmField
	public var userdata1: Pointer? = null

	@JvmField
	public var userdata2: Pointer? = null

	override fun getFieldOrder(): Unit = listOf("nextInChain", "mode", "callback", "userdata1", "userdata2")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUDeviceLostCallbackInfo(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUDeviceLostCallbackInfo) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.mode = other.mode
			this.callback = other.callback
			this.userdata1 = other.userdata1
			this.userdata2 = other.userdata2
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUDeviceLostCallbackInfo(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUDeviceLostCallbackInfo) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.mode = other.mode
			this.callback = other.callback
			this.userdata1 = other.userdata1
			this.userdata2 = other.userdata2
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUUncapturedErrorCallbackInfo(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var nextInChain: WGPUChainedStruct.ByReference? = null

	@JvmField
	public var callback: Callback? = null

	@JvmField
	public var userdata1: Pointer? = null

	@JvmField
	public var userdata2: Pointer? = null

	override fun getFieldOrder(): Unit = listOf("nextInChain", "callback", "userdata1", "userdata2")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUUncapturedErrorCallbackInfo(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUUncapturedErrorCallbackInfo) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.callback = other.callback
			this.userdata1 = other.userdata1
			this.userdata2 = other.userdata2
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUUncapturedErrorCallbackInfo(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUUncapturedErrorCallbackInfo) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.callback = other.callback
			this.userdata1 = other.userdata1
			this.userdata2 = other.userdata2
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUDeviceDescriptor(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var nextInChain: Pointer? = null

	@JvmField
	public var label: WGPUStringView.ByValue = WGPUStringView.ByValue()

	@JvmField
	public var requiredFeatureCount: Long = 0L

	@JvmField
	public var requiredFeatures: Pointer? = null

	@JvmField
	public var requiredLimits: WGPULimits.ByReference? = null

	@JvmField
	public var defaultQueue: WGPUQueueDescriptor.ByValue = WGPUQueueDescriptor.ByValue()

	@JvmField
	public var deviceLostCallbackInfo: WGPUDeviceLostCallbackInfo.ByValue =
			WGPUDeviceLostCallbackInfo.ByValue()

	@JvmField
	public var uncapturedErrorCallbackInfo: WGPUUncapturedErrorCallbackInfo.ByValue =
			WGPUUncapturedErrorCallbackInfo.ByValue()

	override fun getFieldOrder(): Unit = listOf("nextInChain", "label", "requiredFeatureCount", "requiredFeatures", "requiredLimits", "defaultQueue", "deviceLostCallbackInfo", "uncapturedErrorCallbackInfo")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUDeviceDescriptor(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUDeviceDescriptor) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.label = other.label
			this.requiredFeatureCount = other.requiredFeatureCount
			this.requiredFeatures = other.requiredFeatures
			this.requiredLimits = other.requiredLimits
			this.defaultQueue = other.defaultQueue
			this.deviceLostCallbackInfo = other.deviceLostCallbackInfo
			this.uncapturedErrorCallbackInfo = other.uncapturedErrorCallbackInfo
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUDeviceDescriptor(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUDeviceDescriptor) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.label = other.label
			this.requiredFeatureCount = other.requiredFeatureCount
			this.requiredFeatures = other.requiredFeatures
			this.requiredLimits = other.requiredLimits
			this.defaultQueue = other.defaultQueue
			this.deviceLostCallbackInfo = other.deviceLostCallbackInfo
			this.uncapturedErrorCallbackInfo = other.uncapturedErrorCallbackInfo
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUExtent3D(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var width: Int = 0

	@JvmField
	public var height: Int = 0

	@JvmField
	public var depthOrArrayLayers: Int = 0

	override fun getFieldOrder(): Unit = listOf("width", "height", "depthOrArrayLayers")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUExtent3D(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUExtent3D) : this(other.pointer) {
			this.width = other.width
			this.height = other.height
			this.depthOrArrayLayers = other.depthOrArrayLayers
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUExtent3D(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUExtent3D) : this(other.pointer) {
			this.width = other.width
			this.height = other.height
			this.depthOrArrayLayers = other.depthOrArrayLayers
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUFragmentState(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var nextInChain: Pointer? = null

	@JvmField
	public var module: Pointer? = null

	@JvmField
	public var entryPoint: WGPUStringView.ByValue = WGPUStringView.ByValue()

	@JvmField
	public var constantCount: Long = 0L

	@JvmField
	public var constants: Pointer? = null

	@JvmField
	public var targetCount: Long = 0L

	@JvmField
	public var targets: Pointer? = null

	override fun getFieldOrder(): Unit = listOf("nextInChain", "module", "entryPoint", "constantCount", "constants", "targetCount", "targets")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUFragmentState(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUFragmentState) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.module = other.module
			this.entryPoint = other.entryPoint
			this.constantCount = other.constantCount
			this.constants = other.constants
			this.targetCount = other.targetCount
			this.targets = other.targets
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUFragmentState(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUFragmentState) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.module = other.module
			this.entryPoint = other.entryPoint
			this.constantCount = other.constantCount
			this.constants = other.constants
			this.targetCount = other.targetCount
			this.targets = other.targets
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUFuture(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var id: Long = 0L

	override fun getFieldOrder(): Unit = listOf("id")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUFuture(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUFuture) : this(other.pointer) {
			this.id = other.id
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUFuture(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUFuture) : this(other.pointer) {
			this.id = other.id
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUFutureWaitInfo(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var future: WGPUFuture.ByValue = WGPUFuture.ByValue()

	@JvmField
	public var completed: Int = 0

	override fun getFieldOrder(): Unit = listOf("future", "completed")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUFutureWaitInfo(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUFutureWaitInfo) : this(other.pointer) {
			this.future = other.future
			this.completed = other.completed
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUFutureWaitInfo(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUFutureWaitInfo) : this(other.pointer) {
			this.future = other.future
			this.completed = other.completed
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUInstanceCapabilities(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var nextInChain: Pointer? = null

	@JvmField
	public var timedWaitAnyEnable: Int = 0

	@JvmField
	public var timedWaitAnyMaxCount: Long = 0L

	override fun getFieldOrder(): Unit = listOf("nextInChain", "timedWaitAnyEnable", "timedWaitAnyMaxCount")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUInstanceCapabilities(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUInstanceCapabilities) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.timedWaitAnyEnable = other.timedWaitAnyEnable
			this.timedWaitAnyMaxCount = other.timedWaitAnyMaxCount
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUInstanceCapabilities(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUInstanceCapabilities) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.timedWaitAnyEnable = other.timedWaitAnyEnable
			this.timedWaitAnyMaxCount = other.timedWaitAnyMaxCount
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUInstanceDescriptor(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var nextInChain: Pointer? = null

	@JvmField
	public var features: WGPUInstanceCapabilities.ByValue = WGPUInstanceCapabilities.ByValue()

	override fun getFieldOrder(): Unit = listOf("nextInChain", "features")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUInstanceDescriptor(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUInstanceDescriptor) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.features = other.features
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUInstanceDescriptor(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUInstanceDescriptor) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.features = other.features
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPULimits(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var nextInChain: Pointer? = null

	@JvmField
	public var maxTextureDimension1D: Int = 0

	@JvmField
	public var maxTextureDimension2D: Int = 0

	@JvmField
	public var maxTextureDimension3D: Int = 0

	@JvmField
	public var maxTextureArrayLayers: Int = 0

	@JvmField
	public var maxBindGroups: Int = 0

	@JvmField
	public var maxBindGroupsPlusVertexBuffers: Int = 0

	@JvmField
	public var maxBindingsPerBindGroup: Int = 0

	@JvmField
	public var maxDynamicUniformBuffersPerPipelineLayout: Int = 0

	@JvmField
	public var maxDynamicStorageBuffersPerPipelineLayout: Int = 0

	@JvmField
	public var maxSampledTexturesPerShaderStage: Int = 0

	@JvmField
	public var maxSamplersPerShaderStage: Int = 0

	@JvmField
	public var maxStorageBuffersPerShaderStage: Int = 0

	@JvmField
	public var maxStorageTexturesPerShaderStage: Int = 0

	@JvmField
	public var maxUniformBuffersPerShaderStage: Int = 0

	@JvmField
	public var maxUniformBufferBindingSize: Long = 0L

	@JvmField
	public var maxStorageBufferBindingSize: Long = 0L

	@JvmField
	public var minUniformBufferOffsetAlignment: Int = 0

	@JvmField
	public var minStorageBufferOffsetAlignment: Int = 0

	@JvmField
	public var maxVertexBuffers: Int = 0

	@JvmField
	public var maxBufferSize: Long = 0L

	@JvmField
	public var maxVertexAttributes: Int = 0

	@JvmField
	public var maxVertexBufferArrayStride: Int = 0

	@JvmField
	public var maxInterStageShaderVariables: Int = 0

	@JvmField
	public var maxColorAttachments: Int = 0

	@JvmField
	public var maxColorAttachmentBytesPerSample: Int = 0

	@JvmField
	public var maxComputeWorkgroupStorageSize: Int = 0

	@JvmField
	public var maxComputeInvocationsPerWorkgroup: Int = 0

	@JvmField
	public var maxComputeWorkgroupSizeX: Int = 0

	@JvmField
	public var maxComputeWorkgroupSizeY: Int = 0

	@JvmField
	public var maxComputeWorkgroupSizeZ: Int = 0

	@JvmField
	public var maxComputeWorkgroupsPerDimension: Int = 0

	override fun getFieldOrder(): Unit = listOf("nextInChain", "maxTextureDimension1D", "maxTextureDimension2D", "maxTextureDimension3D", "maxTextureArrayLayers", "maxBindGroups", "maxBindGroupsPlusVertexBuffers", "maxBindingsPerBindGroup", "maxDynamicUniformBuffersPerPipelineLayout", "maxDynamicStorageBuffersPerPipelineLayout", "maxSampledTexturesPerShaderStage", "maxSamplersPerShaderStage", "maxStorageBuffersPerShaderStage", "maxStorageTexturesPerShaderStage", "maxUniformBuffersPerShaderStage", "maxUniformBufferBindingSize", "maxStorageBufferBindingSize", "minUniformBufferOffsetAlignment", "minStorageBufferOffsetAlignment", "maxVertexBuffers", "maxBufferSize", "maxVertexAttributes", "maxVertexBufferArrayStride", "maxInterStageShaderVariables", "maxColorAttachments", "maxColorAttachmentBytesPerSample", "maxComputeWorkgroupStorageSize", "maxComputeInvocationsPerWorkgroup", "maxComputeWorkgroupSizeX", "maxComputeWorkgroupSizeY", "maxComputeWorkgroupSizeZ", "maxComputeWorkgroupsPerDimension")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPULimits(pointer),
	    Structure.ByReference {
		public constructor(other: WGPULimits) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.maxTextureDimension1D = other.maxTextureDimension1D
			this.maxTextureDimension2D = other.maxTextureDimension2D
			this.maxTextureDimension3D = other.maxTextureDimension3D
			this.maxTextureArrayLayers = other.maxTextureArrayLayers
			this.maxBindGroups = other.maxBindGroups
			this.maxBindGroupsPlusVertexBuffers = other.maxBindGroupsPlusVertexBuffers
			this.maxBindingsPerBindGroup = other.maxBindingsPerBindGroup
			this.maxDynamicUniformBuffersPerPipelineLayout = other.maxDynamicUniformBuffersPerPipelineLayout
			this.maxDynamicStorageBuffersPerPipelineLayout = other.maxDynamicStorageBuffersPerPipelineLayout
			this.maxSampledTexturesPerShaderStage = other.maxSampledTexturesPerShaderStage
			this.maxSamplersPerShaderStage = other.maxSamplersPerShaderStage
			this.maxStorageBuffersPerShaderStage = other.maxStorageBuffersPerShaderStage
			this.maxStorageTexturesPerShaderStage = other.maxStorageTexturesPerShaderStage
			this.maxUniformBuffersPerShaderStage = other.maxUniformBuffersPerShaderStage
			this.maxUniformBufferBindingSize = other.maxUniformBufferBindingSize
			this.maxStorageBufferBindingSize = other.maxStorageBufferBindingSize
			this.minUniformBufferOffsetAlignment = other.minUniformBufferOffsetAlignment
			this.minStorageBufferOffsetAlignment = other.minStorageBufferOffsetAlignment
			this.maxVertexBuffers = other.maxVertexBuffers
			this.maxBufferSize = other.maxBufferSize
			this.maxVertexAttributes = other.maxVertexAttributes
			this.maxVertexBufferArrayStride = other.maxVertexBufferArrayStride
			this.maxInterStageShaderVariables = other.maxInterStageShaderVariables
			this.maxColorAttachments = other.maxColorAttachments
			this.maxColorAttachmentBytesPerSample = other.maxColorAttachmentBytesPerSample
			this.maxComputeWorkgroupStorageSize = other.maxComputeWorkgroupStorageSize
			this.maxComputeInvocationsPerWorkgroup = other.maxComputeInvocationsPerWorkgroup
			this.maxComputeWorkgroupSizeX = other.maxComputeWorkgroupSizeX
			this.maxComputeWorkgroupSizeY = other.maxComputeWorkgroupSizeY
			this.maxComputeWorkgroupSizeZ = other.maxComputeWorkgroupSizeZ
			this.maxComputeWorkgroupsPerDimension = other.maxComputeWorkgroupsPerDimension
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPULimits(pointer),
	    Structure.ByValue {
		public constructor(other: WGPULimits) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.maxTextureDimension1D = other.maxTextureDimension1D
			this.maxTextureDimension2D = other.maxTextureDimension2D
			this.maxTextureDimension3D = other.maxTextureDimension3D
			this.maxTextureArrayLayers = other.maxTextureArrayLayers
			this.maxBindGroups = other.maxBindGroups
			this.maxBindGroupsPlusVertexBuffers = other.maxBindGroupsPlusVertexBuffers
			this.maxBindingsPerBindGroup = other.maxBindingsPerBindGroup
			this.maxDynamicUniformBuffersPerPipelineLayout = other.maxDynamicUniformBuffersPerPipelineLayout
			this.maxDynamicStorageBuffersPerPipelineLayout = other.maxDynamicStorageBuffersPerPipelineLayout
			this.maxSampledTexturesPerShaderStage = other.maxSampledTexturesPerShaderStage
			this.maxSamplersPerShaderStage = other.maxSamplersPerShaderStage
			this.maxStorageBuffersPerShaderStage = other.maxStorageBuffersPerShaderStage
			this.maxStorageTexturesPerShaderStage = other.maxStorageTexturesPerShaderStage
			this.maxUniformBuffersPerShaderStage = other.maxUniformBuffersPerShaderStage
			this.maxUniformBufferBindingSize = other.maxUniformBufferBindingSize
			this.maxStorageBufferBindingSize = other.maxStorageBufferBindingSize
			this.minUniformBufferOffsetAlignment = other.minUniformBufferOffsetAlignment
			this.minStorageBufferOffsetAlignment = other.minStorageBufferOffsetAlignment
			this.maxVertexBuffers = other.maxVertexBuffers
			this.maxBufferSize = other.maxBufferSize
			this.maxVertexAttributes = other.maxVertexAttributes
			this.maxVertexBufferArrayStride = other.maxVertexBufferArrayStride
			this.maxInterStageShaderVariables = other.maxInterStageShaderVariables
			this.maxColorAttachments = other.maxColorAttachments
			this.maxColorAttachmentBytesPerSample = other.maxColorAttachmentBytesPerSample
			this.maxComputeWorkgroupStorageSize = other.maxComputeWorkgroupStorageSize
			this.maxComputeInvocationsPerWorkgroup = other.maxComputeInvocationsPerWorkgroup
			this.maxComputeWorkgroupSizeX = other.maxComputeWorkgroupSizeX
			this.maxComputeWorkgroupSizeY = other.maxComputeWorkgroupSizeY
			this.maxComputeWorkgroupSizeZ = other.maxComputeWorkgroupSizeZ
			this.maxComputeWorkgroupsPerDimension = other.maxComputeWorkgroupsPerDimension
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUMultisampleState(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var nextInChain: Pointer? = null

	@JvmField
	public var count: Int = 0

	@JvmField
	public var mask: Int = 0

	@JvmField
	public var alphaToCoverageEnabled: Int = 0

	override fun getFieldOrder(): Unit = listOf("nextInChain", "count", "mask", "alphaToCoverageEnabled")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUMultisampleState(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUMultisampleState) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.count = other.count
			this.mask = other.mask
			this.alphaToCoverageEnabled = other.alphaToCoverageEnabled
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUMultisampleState(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUMultisampleState) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.count = other.count
			this.mask = other.mask
			this.alphaToCoverageEnabled = other.alphaToCoverageEnabled
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUOrigin3D(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var x: Int = 0

	@JvmField
	public var y: Int = 0

	@JvmField
	public var z: Int = 0

	override fun getFieldOrder(): Unit = listOf("x", "y", "z")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUOrigin3D(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUOrigin3D) : this(other.pointer) {
			this.x = other.x
			this.y = other.y
			this.z = other.z
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUOrigin3D(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUOrigin3D) : this(other.pointer) {
			this.x = other.x
			this.y = other.y
			this.z = other.z
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUPipelineLayoutDescriptor(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var nextInChain: Pointer? = null

	@JvmField
	public var label: WGPUStringView.ByValue = WGPUStringView.ByValue()

	@JvmField
	public var bindGroupLayoutCount: Long = 0L

	@JvmField
	public var bindGroupLayouts: Pointer? = null

	override fun getFieldOrder(): Unit = listOf("nextInChain", "label", "bindGroupLayoutCount", "bindGroupLayouts")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUPipelineLayoutDescriptor(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUPipelineLayoutDescriptor) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.label = other.label
			this.bindGroupLayoutCount = other.bindGroupLayoutCount
			this.bindGroupLayouts = other.bindGroupLayouts
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUPipelineLayoutDescriptor(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUPipelineLayoutDescriptor) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.label = other.label
			this.bindGroupLayoutCount = other.bindGroupLayoutCount
			this.bindGroupLayouts = other.bindGroupLayouts
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUPrimitiveState(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var nextInChain: Pointer? = null

	@JvmField
	public var topology: Int = 0

	@JvmField
	public var stripIndexFormat: Int = 0

	@JvmField
	public var frontFace: Int = 0

	@JvmField
	public var cullMode: Int = 0

	@JvmField
	public var unclippedDepth: Int = 0

	override fun getFieldOrder(): Unit = listOf("nextInChain", "topology", "stripIndexFormat", "frontFace", "cullMode", "unclippedDepth")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUPrimitiveState(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUPrimitiveState) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.topology = other.topology
			this.stripIndexFormat = other.stripIndexFormat
			this.frontFace = other.frontFace
			this.cullMode = other.cullMode
			this.unclippedDepth = other.unclippedDepth
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUPrimitiveState(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUPrimitiveState) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.topology = other.topology
			this.stripIndexFormat = other.stripIndexFormat
			this.frontFace = other.frontFace
			this.cullMode = other.cullMode
			this.unclippedDepth = other.unclippedDepth
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUQuerySetDescriptor(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var nextInChain: Pointer? = null

	@JvmField
	public var label: WGPUStringView.ByValue = WGPUStringView.ByValue()

	@JvmField
	public var type: Int = 0

	@JvmField
	public var count: Int = 0

	override fun getFieldOrder(): Unit = listOf("nextInChain", "label", "type", "count")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUQuerySetDescriptor(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUQuerySetDescriptor) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.label = other.label
			this.type = other.type
			this.count = other.count
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUQuerySetDescriptor(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUQuerySetDescriptor) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.label = other.label
			this.type = other.type
			this.count = other.count
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPURenderBundleDescriptor(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var nextInChain: Pointer? = null

	@JvmField
	public var label: WGPUStringView.ByValue = WGPUStringView.ByValue()

	override fun getFieldOrder(): Unit = listOf("nextInChain", "label")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPURenderBundleDescriptor(pointer),
	    Structure.ByReference {
		public constructor(other: WGPURenderBundleDescriptor) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.label = other.label
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPURenderBundleDescriptor(pointer),
	    Structure.ByValue {
		public constructor(other: WGPURenderBundleDescriptor) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.label = other.label
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPURenderBundleEncoderDescriptor(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var nextInChain: Pointer? = null

	@JvmField
	public var label: WGPUStringView.ByValue = WGPUStringView.ByValue()

	@JvmField
	public var colorFormatCount: Long = 0L

	@JvmField
	public var colorFormats: Pointer? = null

	@JvmField
	public var depthStencilFormat: Int = 0

	@JvmField
	public var sampleCount: Int = 0

	@JvmField
	public var depthReadOnly: Int = 0

	@JvmField
	public var stencilReadOnly: Int = 0

	override fun getFieldOrder(): Unit = listOf("nextInChain", "label", "colorFormatCount", "colorFormats", "depthStencilFormat", "sampleCount", "depthReadOnly", "stencilReadOnly")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPURenderBundleEncoderDescriptor(pointer),
	    Structure.ByReference {
		public constructor(other: WGPURenderBundleEncoderDescriptor) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.label = other.label
			this.colorFormatCount = other.colorFormatCount
			this.colorFormats = other.colorFormats
			this.depthStencilFormat = other.depthStencilFormat
			this.sampleCount = other.sampleCount
			this.depthReadOnly = other.depthReadOnly
			this.stencilReadOnly = other.stencilReadOnly
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPURenderBundleEncoderDescriptor(pointer),
	    Structure.ByValue {
		public constructor(other: WGPURenderBundleEncoderDescriptor) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.label = other.label
			this.colorFormatCount = other.colorFormatCount
			this.colorFormats = other.colorFormats
			this.depthStencilFormat = other.depthStencilFormat
			this.sampleCount = other.sampleCount
			this.depthReadOnly = other.depthReadOnly
			this.stencilReadOnly = other.stencilReadOnly
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPURenderPassColorAttachment(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var nextInChain: Pointer? = null

	@JvmField
	public var view: Pointer? = null

	@JvmField
	public var depthSlice: Int = 0

	@JvmField
	public var resolveTarget: Pointer? = null

	@JvmField
	public var loadOp: Int = 0

	@JvmField
	public var storeOp: Int = 0

	@JvmField
	public var clearValue: WGPUColor.ByValue = WGPUColor.ByValue()

	override fun getFieldOrder(): Unit = listOf("nextInChain", "view", "depthSlice", "resolveTarget", "loadOp", "storeOp", "clearValue")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPURenderPassColorAttachment(pointer),
	    Structure.ByReference {
		public constructor(other: WGPURenderPassColorAttachment) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.view = other.view
			this.depthSlice = other.depthSlice
			this.resolveTarget = other.resolveTarget
			this.loadOp = other.loadOp
			this.storeOp = other.storeOp
			this.clearValue = other.clearValue
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPURenderPassColorAttachment(pointer),
	    Structure.ByValue {
		public constructor(other: WGPURenderPassColorAttachment) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.view = other.view
			this.depthSlice = other.depthSlice
			this.resolveTarget = other.resolveTarget
			this.loadOp = other.loadOp
			this.storeOp = other.storeOp
			this.clearValue = other.clearValue
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPURenderPassDepthStencilAttachment(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var view: Pointer? = null

	@JvmField
	public var depthLoadOp: Int = 0

	@JvmField
	public var depthStoreOp: Int = 0

	@JvmField
	public var depthClearValue: Float = 0f

	@JvmField
	public var depthReadOnly: Int = 0

	@JvmField
	public var stencilLoadOp: Int = 0

	@JvmField
	public var stencilStoreOp: Int = 0

	@JvmField
	public var stencilClearValue: Int = 0

	@JvmField
	public var stencilReadOnly: Int = 0

	override fun getFieldOrder(): Unit = listOf("view", "depthLoadOp", "depthStoreOp", "depthClearValue", "depthReadOnly", "stencilLoadOp", "stencilStoreOp", "stencilClearValue", "stencilReadOnly")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPURenderPassDepthStencilAttachment(pointer),
	    Structure.ByReference {
		public constructor(other: WGPURenderPassDepthStencilAttachment) : this(other.pointer) {
			this.view = other.view
			this.depthLoadOp = other.depthLoadOp
			this.depthStoreOp = other.depthStoreOp
			this.depthClearValue = other.depthClearValue
			this.depthReadOnly = other.depthReadOnly
			this.stencilLoadOp = other.stencilLoadOp
			this.stencilStoreOp = other.stencilStoreOp
			this.stencilClearValue = other.stencilClearValue
			this.stencilReadOnly = other.stencilReadOnly
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPURenderPassDepthStencilAttachment(pointer),
	    Structure.ByValue {
		public constructor(other: WGPURenderPassDepthStencilAttachment) : this(other.pointer) {
			this.view = other.view
			this.depthLoadOp = other.depthLoadOp
			this.depthStoreOp = other.depthStoreOp
			this.depthClearValue = other.depthClearValue
			this.depthReadOnly = other.depthReadOnly
			this.stencilLoadOp = other.stencilLoadOp
			this.stencilStoreOp = other.stencilStoreOp
			this.stencilClearValue = other.stencilClearValue
			this.stencilReadOnly = other.stencilReadOnly
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPURenderPassDescriptor(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var nextInChain: Pointer? = null

	@JvmField
	public var label: WGPUStringView.ByValue = WGPUStringView.ByValue()

	@JvmField
	public var colorAttachmentCount: Long = 0L

	@JvmField
	public var colorAttachments: Pointer? = null

	@JvmField
	public var depthStencilAttachment: WGPURenderPassDepthStencilAttachment.ByReference? = null

	@JvmField
	public var occlusionQuerySet: Pointer? = null

	@JvmField
	public var timestampWrites: WGPURenderPassTimestampWrites.ByReference? = null

	override fun getFieldOrder(): Unit = listOf("nextInChain", "label", "colorAttachmentCount", "colorAttachments", "depthStencilAttachment", "occlusionQuerySet", "timestampWrites")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPURenderPassDescriptor(pointer),
	    Structure.ByReference {
		public constructor(other: WGPURenderPassDescriptor) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.label = other.label
			this.colorAttachmentCount = other.colorAttachmentCount
			this.colorAttachments = other.colorAttachments
			this.depthStencilAttachment = other.depthStencilAttachment
			this.occlusionQuerySet = other.occlusionQuerySet
			this.timestampWrites = other.timestampWrites
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPURenderPassDescriptor(pointer),
	    Structure.ByValue {
		public constructor(other: WGPURenderPassDescriptor) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.label = other.label
			this.colorAttachmentCount = other.colorAttachmentCount
			this.colorAttachments = other.colorAttachments
			this.depthStencilAttachment = other.depthStencilAttachment
			this.occlusionQuerySet = other.occlusionQuerySet
			this.timestampWrites = other.timestampWrites
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUChainedStruct(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var next: ByReference? = null

	@JvmField
	public var sType: Int = 0

	override fun getFieldOrder(): Unit = listOf("next", "sType")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUChainedStruct(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUChainedStruct) : this(other.pointer) {
			this.next = other.next
			this.sType = other.sType
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUChainedStruct(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUChainedStruct) : this(other.pointer) {
			this.next = other.next
			this.sType = other.sType
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPURenderPassMaxDrawCount(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var chain: WGPUChainedStruct.ByValue = WGPUChainedStruct.ByValue()

	@JvmField
	public var maxDrawCount: Long = 0L

	override fun getFieldOrder(): Unit = listOf("chain", "maxDrawCount")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPURenderPassMaxDrawCount(pointer),
	    Structure.ByReference {
		public constructor(other: WGPURenderPassMaxDrawCount) : this(other.pointer) {
			this.chain = other.chain
			this.maxDrawCount = other.maxDrawCount
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPURenderPassMaxDrawCount(pointer),
	    Structure.ByValue {
		public constructor(other: WGPURenderPassMaxDrawCount) : this(other.pointer) {
			this.chain = other.chain
			this.maxDrawCount = other.maxDrawCount
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPURenderPassTimestampWrites(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var querySet: Pointer? = null

	@JvmField
	public var beginningOfPassWriteIndex: Int = 0

	@JvmField
	public var endOfPassWriteIndex: Int = 0

	override fun getFieldOrder(): Unit = listOf("querySet", "beginningOfPassWriteIndex", "endOfPassWriteIndex")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPURenderPassTimestampWrites(pointer),
	    Structure.ByReference {
		public constructor(other: WGPURenderPassTimestampWrites) : this(other.pointer) {
			this.querySet = other.querySet
			this.beginningOfPassWriteIndex = other.beginningOfPassWriteIndex
			this.endOfPassWriteIndex = other.endOfPassWriteIndex
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPURenderPassTimestampWrites(pointer),
	    Structure.ByValue {
		public constructor(other: WGPURenderPassTimestampWrites) : this(other.pointer) {
			this.querySet = other.querySet
			this.beginningOfPassWriteIndex = other.beginningOfPassWriteIndex
			this.endOfPassWriteIndex = other.endOfPassWriteIndex
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUVertexState(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var nextInChain: Pointer? = null

	@JvmField
	public var module: Pointer? = null

	@JvmField
	public var entryPoint: WGPUStringView.ByValue = WGPUStringView.ByValue()

	@JvmField
	public var constantCount: Long = 0L

	@JvmField
	public var constants: Pointer? = null

	@JvmField
	public var bufferCount: Long = 0L

	@JvmField
	public var buffers: Pointer? = null

	override fun getFieldOrder(): Unit = listOf("nextInChain", "module", "entryPoint", "constantCount", "constants", "bufferCount", "buffers")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUVertexState(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUVertexState) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.module = other.module
			this.entryPoint = other.entryPoint
			this.constantCount = other.constantCount
			this.constants = other.constants
			this.bufferCount = other.bufferCount
			this.buffers = other.buffers
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUVertexState(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUVertexState) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.module = other.module
			this.entryPoint = other.entryPoint
			this.constantCount = other.constantCount
			this.constants = other.constants
			this.bufferCount = other.bufferCount
			this.buffers = other.buffers
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPURenderPipelineDescriptor(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var nextInChain: Pointer? = null

	@JvmField
	public var label: WGPUStringView.ByValue = WGPUStringView.ByValue()

	@JvmField
	public var layout: Pointer? = null

	@JvmField
	public var vertex: WGPUVertexState.ByValue = WGPUVertexState.ByValue()

	@JvmField
	public var primitive: WGPUPrimitiveState.ByValue = WGPUPrimitiveState.ByValue()

	@JvmField
	public var depthStencil: WGPUDepthStencilState.ByReference? = null

	@JvmField
	public var multisample: WGPUMultisampleState.ByValue = WGPUMultisampleState.ByValue()

	@JvmField
	public var fragment: WGPUFragmentState.ByReference? = null

	override fun getFieldOrder(): Unit = listOf("nextInChain", "label", "layout", "vertex", "primitive", "depthStencil", "multisample", "fragment")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPURenderPipelineDescriptor(pointer),
	    Structure.ByReference {
		public constructor(other: WGPURenderPipelineDescriptor) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.label = other.label
			this.layout = other.layout
			this.vertex = other.vertex
			this.primitive = other.primitive
			this.depthStencil = other.depthStencil
			this.multisample = other.multisample
			this.fragment = other.fragment
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPURenderPipelineDescriptor(pointer),
	    Structure.ByValue {
		public constructor(other: WGPURenderPipelineDescriptor) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.label = other.label
			this.layout = other.layout
			this.vertex = other.vertex
			this.primitive = other.primitive
			this.depthStencil = other.depthStencil
			this.multisample = other.multisample
			this.fragment = other.fragment
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPURequestAdapterOptions(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var nextInChain: Pointer? = null

	@JvmField
	public var featureLevel: Int = 0

	@JvmField
	public var powerPreference: Int = 0

	@JvmField
	public var forceFallbackAdapter: Int = 0

	@JvmField
	public var backendType: Int = 0

	@JvmField
	public var compatibleSurface: Pointer? = null

	override fun getFieldOrder(): Unit = listOf("nextInChain", "featureLevel", "powerPreference", "forceFallbackAdapter", "backendType", "compatibleSurface")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPURequestAdapterOptions(pointer),
	    Structure.ByReference {
		public constructor(other: WGPURequestAdapterOptions) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.featureLevel = other.featureLevel
			this.powerPreference = other.powerPreference
			this.forceFallbackAdapter = other.forceFallbackAdapter
			this.backendType = other.backendType
			this.compatibleSurface = other.compatibleSurface
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPURequestAdapterOptions(pointer),
	    Structure.ByValue {
		public constructor(other: WGPURequestAdapterOptions) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.featureLevel = other.featureLevel
			this.powerPreference = other.powerPreference
			this.forceFallbackAdapter = other.forceFallbackAdapter
			this.backendType = other.backendType
			this.compatibleSurface = other.compatibleSurface
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUSamplerDescriptor(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var nextInChain: Pointer? = null

	@JvmField
	public var label: WGPUStringView.ByValue = WGPUStringView.ByValue()

	@JvmField
	public var addressModeU: Int = 0

	@JvmField
	public var addressModeV: Int = 0

	@JvmField
	public var addressModeW: Int = 0

	@JvmField
	public var magFilter: Int = 0

	@JvmField
	public var minFilter: Int = 0

	@JvmField
	public var mipmapFilter: Int = 0

	@JvmField
	public var lodMinClamp: Float = 0f

	@JvmField
	public var lodMaxClamp: Float = 0f

	@JvmField
	public var compare: Int = 0

	@JvmField
	public var maxAnisotropy: Short = 0

	override fun getFieldOrder(): Unit = listOf("nextInChain", "label", "addressModeU", "addressModeV", "addressModeW", "magFilter", "minFilter", "mipmapFilter", "lodMinClamp", "lodMaxClamp", "compare", "maxAnisotropy")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUSamplerDescriptor(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUSamplerDescriptor) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.label = other.label
			this.addressModeU = other.addressModeU
			this.addressModeV = other.addressModeV
			this.addressModeW = other.addressModeW
			this.magFilter = other.magFilter
			this.minFilter = other.minFilter
			this.mipmapFilter = other.mipmapFilter
			this.lodMinClamp = other.lodMinClamp
			this.lodMaxClamp = other.lodMaxClamp
			this.compare = other.compare
			this.maxAnisotropy = other.maxAnisotropy
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUSamplerDescriptor(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUSamplerDescriptor) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.label = other.label
			this.addressModeU = other.addressModeU
			this.addressModeV = other.addressModeV
			this.addressModeW = other.addressModeW
			this.magFilter = other.magFilter
			this.minFilter = other.minFilter
			this.mipmapFilter = other.mipmapFilter
			this.lodMinClamp = other.lodMinClamp
			this.lodMaxClamp = other.lodMaxClamp
			this.compare = other.compare
			this.maxAnisotropy = other.maxAnisotropy
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUShaderModuleDescriptor(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var nextInChain: Pointer? = null

	@JvmField
	public var label: WGPUStringView.ByValue = WGPUStringView.ByValue()

	override fun getFieldOrder(): Unit = listOf("nextInChain", "label")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUShaderModuleDescriptor(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUShaderModuleDescriptor) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.label = other.label
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUShaderModuleDescriptor(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUShaderModuleDescriptor) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.label = other.label
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUShaderSourceSPIRV(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var chain: WGPUChainedStruct.ByValue = WGPUChainedStruct.ByValue()

	@JvmField
	public var codeSize: Int = 0

	@JvmField
	public var code: Pointer? = null

	override fun getFieldOrder(): Unit = listOf("chain", "codeSize", "code")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUShaderSourceSPIRV(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUShaderSourceSPIRV) : this(other.pointer) {
			this.chain = other.chain
			this.codeSize = other.codeSize
			this.code = other.code
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUShaderSourceSPIRV(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUShaderSourceSPIRV) : this(other.pointer) {
			this.chain = other.chain
			this.codeSize = other.codeSize
			this.code = other.code
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUShaderSourceWGSL(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var chain: WGPUChainedStruct.ByValue = WGPUChainedStruct.ByValue()

	@JvmField
	public var code: WGPUStringView.ByValue = WGPUStringView.ByValue()

	override fun getFieldOrder(): Unit = listOf("chain", "code")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUShaderSourceWGSL(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUShaderSourceWGSL) : this(other.pointer) {
			this.chain = other.chain
			this.code = other.code
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUShaderSourceWGSL(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUShaderSourceWGSL) : this(other.pointer) {
			this.chain = other.chain
			this.code = other.code
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUSupportedFeatures(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var featureCount: Long = 0L

	@JvmField
	public var features: Pointer? = null

	override fun getFieldOrder(): Unit = listOf("featureCount", "features")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUSupportedFeatures(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUSupportedFeatures) : this(other.pointer) {
			this.featureCount = other.featureCount
			this.features = other.features
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUSupportedFeatures(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUSupportedFeatures) : this(other.pointer) {
			this.featureCount = other.featureCount
			this.features = other.features
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUSupportedWGSLLanguageFeatures(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var featureCount: Long = 0L

	@JvmField
	public var features: Pointer? = null

	override fun getFieldOrder(): Unit = listOf("featureCount", "features")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUSupportedWGSLLanguageFeatures(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUSupportedWGSLLanguageFeatures) : this(other.pointer) {
			this.featureCount = other.featureCount
			this.features = other.features
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUSupportedWGSLLanguageFeatures(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUSupportedWGSLLanguageFeatures) : this(other.pointer) {
			this.featureCount = other.featureCount
			this.features = other.features
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUSurfaceCapabilities(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var nextInChain: Pointer? = null

	@JvmField
	public var usages: Long = 0L

	@JvmField
	public var formatCount: Long = 0L

	@JvmField
	public var formats: Pointer? = null

	@JvmField
	public var presentModeCount: Long = 0L

	@JvmField
	public var presentModes: Pointer? = null

	@JvmField
	public var alphaModeCount: Long = 0L

	@JvmField
	public var alphaModes: Pointer? = null

	override fun getFieldOrder(): Unit = listOf("nextInChain", "usages", "formatCount", "formats", "presentModeCount", "presentModes", "alphaModeCount", "alphaModes")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUSurfaceCapabilities(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUSurfaceCapabilities) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.usages = other.usages
			this.formatCount = other.formatCount
			this.formats = other.formats
			this.presentModeCount = other.presentModeCount
			this.presentModes = other.presentModes
			this.alphaModeCount = other.alphaModeCount
			this.alphaModes = other.alphaModes
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUSurfaceCapabilities(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUSurfaceCapabilities) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.usages = other.usages
			this.formatCount = other.formatCount
			this.formats = other.formats
			this.presentModeCount = other.presentModeCount
			this.presentModes = other.presentModes
			this.alphaModeCount = other.alphaModeCount
			this.alphaModes = other.alphaModes
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUSurfaceConfiguration(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var nextInChain: Pointer? = null

	@JvmField
	public var device: Pointer? = null

	@JvmField
	public var format: Int = 0

	@JvmField
	public var usage: Long = 0L

	@JvmField
	public var width: Int = 0

	@JvmField
	public var height: Int = 0

	@JvmField
	public var viewFormatCount: Long = 0L

	@JvmField
	public var viewFormats: Pointer? = null

	@JvmField
	public var alphaMode: Int = 0

	@JvmField
	public var presentMode: Int = 0

	override fun getFieldOrder(): Unit = listOf("nextInChain", "device", "format", "usage", "width", "height", "viewFormatCount", "viewFormats", "alphaMode", "presentMode")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUSurfaceConfiguration(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUSurfaceConfiguration) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.device = other.device
			this.format = other.format
			this.usage = other.usage
			this.width = other.width
			this.height = other.height
			this.viewFormatCount = other.viewFormatCount
			this.viewFormats = other.viewFormats
			this.alphaMode = other.alphaMode
			this.presentMode = other.presentMode
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUSurfaceConfiguration(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUSurfaceConfiguration) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.device = other.device
			this.format = other.format
			this.usage = other.usage
			this.width = other.width
			this.height = other.height
			this.viewFormatCount = other.viewFormatCount
			this.viewFormats = other.viewFormats
			this.alphaMode = other.alphaMode
			this.presentMode = other.presentMode
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUSurfaceDescriptor(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var nextInChain: Pointer? = null

	@JvmField
	public var label: WGPUStringView.ByValue = WGPUStringView.ByValue()

	override fun getFieldOrder(): Unit = listOf("nextInChain", "label")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUSurfaceDescriptor(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUSurfaceDescriptor) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.label = other.label
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUSurfaceDescriptor(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUSurfaceDescriptor) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.label = other.label
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUSurfaceSourceAndroidNativeWindow(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var chain: WGPUChainedStruct.ByValue = WGPUChainedStruct.ByValue()

	@JvmField
	public var window: Pointer? = null

	override fun getFieldOrder(): Unit = listOf("chain", "window")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUSurfaceSourceAndroidNativeWindow(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUSurfaceSourceAndroidNativeWindow) : this(other.pointer) {
			this.chain = other.chain
			this.window = other.window
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUSurfaceSourceAndroidNativeWindow(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUSurfaceSourceAndroidNativeWindow) : this(other.pointer) {
			this.chain = other.chain
			this.window = other.window
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUSurfaceSourceMetalLayer(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var chain: WGPUChainedStruct.ByValue = WGPUChainedStruct.ByValue()

	@JvmField
	public var layer: Pointer? = null

	override fun getFieldOrder(): Unit = listOf("chain", "layer")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUSurfaceSourceMetalLayer(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUSurfaceSourceMetalLayer) : this(other.pointer) {
			this.chain = other.chain
			this.layer = other.layer
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUSurfaceSourceMetalLayer(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUSurfaceSourceMetalLayer) : this(other.pointer) {
			this.chain = other.chain
			this.layer = other.layer
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUSurfaceSourceWaylandSurface(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var chain: WGPUChainedStruct.ByValue = WGPUChainedStruct.ByValue()

	@JvmField
	public var display: Pointer? = null

	@JvmField
	public var surface: Pointer? = null

	override fun getFieldOrder(): Unit = listOf("chain", "display", "surface")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUSurfaceSourceWaylandSurface(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUSurfaceSourceWaylandSurface) : this(other.pointer) {
			this.chain = other.chain
			this.display = other.display
			this.surface = other.surface
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUSurfaceSourceWaylandSurface(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUSurfaceSourceWaylandSurface) : this(other.pointer) {
			this.chain = other.chain
			this.display = other.display
			this.surface = other.surface
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUSurfaceSourceWindowsHWND(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var chain: WGPUChainedStruct.ByValue = WGPUChainedStruct.ByValue()

	@JvmField
	public var hinstance: Pointer? = null

	@JvmField
	public var hwnd: Pointer? = null

	override fun getFieldOrder(): Unit = listOf("chain", "hinstance", "hwnd")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUSurfaceSourceWindowsHWND(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUSurfaceSourceWindowsHWND) : this(other.pointer) {
			this.chain = other.chain
			this.hinstance = other.hinstance
			this.hwnd = other.hwnd
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUSurfaceSourceWindowsHWND(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUSurfaceSourceWindowsHWND) : this(other.pointer) {
			this.chain = other.chain
			this.hinstance = other.hinstance
			this.hwnd = other.hwnd
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUSurfaceSourceXCBWindow(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var chain: WGPUChainedStruct.ByValue = WGPUChainedStruct.ByValue()

	@JvmField
	public var connection: Pointer? = null

	@JvmField
	public var window: Int = 0

	override fun getFieldOrder(): Unit = listOf("chain", "connection", "window")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUSurfaceSourceXCBWindow(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUSurfaceSourceXCBWindow) : this(other.pointer) {
			this.chain = other.chain
			this.connection = other.connection
			this.window = other.window
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUSurfaceSourceXCBWindow(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUSurfaceSourceXCBWindow) : this(other.pointer) {
			this.chain = other.chain
			this.connection = other.connection
			this.window = other.window
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUSurfaceSourceXlibWindow(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var chain: WGPUChainedStruct.ByValue = WGPUChainedStruct.ByValue()

	@JvmField
	public var display: Pointer? = null

	@JvmField
	public var window: Long = 0L

	override fun getFieldOrder(): Unit = listOf("chain", "display", "window")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUSurfaceSourceXlibWindow(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUSurfaceSourceXlibWindow) : this(other.pointer) {
			this.chain = other.chain
			this.display = other.display
			this.window = other.window
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUSurfaceSourceXlibWindow(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUSurfaceSourceXlibWindow) : this(other.pointer) {
			this.chain = other.chain
			this.display = other.display
			this.window = other.window
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUSurfaceTexture(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var nextInChain: Pointer? = null

	@JvmField
	public var texture: Pointer? = null

	@JvmField
	public var status: Int = 0

	override fun getFieldOrder(): Unit = listOf("nextInChain", "texture", "status")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUSurfaceTexture(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUSurfaceTexture) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.texture = other.texture
			this.status = other.status
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUSurfaceTexture(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUSurfaceTexture) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.texture = other.texture
			this.status = other.status
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUTexelCopyBufferLayout(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var offset: Long = 0L

	@JvmField
	public var bytesPerRow: Int = 0

	@JvmField
	public var rowsPerImage: Int = 0

	override fun getFieldOrder(): Unit = listOf("offset", "bytesPerRow", "rowsPerImage")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUTexelCopyBufferLayout(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUTexelCopyBufferLayout) : this(other.pointer) {
			this.offset = other.offset
			this.bytesPerRow = other.bytesPerRow
			this.rowsPerImage = other.rowsPerImage
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUTexelCopyBufferLayout(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUTexelCopyBufferLayout) : this(other.pointer) {
			this.offset = other.offset
			this.bytesPerRow = other.bytesPerRow
			this.rowsPerImage = other.rowsPerImage
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUTexelCopyBufferInfo(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var layout: WGPUTexelCopyBufferLayout.ByValue = WGPUTexelCopyBufferLayout.ByValue()

	@JvmField
	public var buffer: Pointer? = null

	override fun getFieldOrder(): Unit = listOf("layout", "buffer")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUTexelCopyBufferInfo(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUTexelCopyBufferInfo) : this(other.pointer) {
			this.layout = other.layout
			this.buffer = other.buffer
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUTexelCopyBufferInfo(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUTexelCopyBufferInfo) : this(other.pointer) {
			this.layout = other.layout
			this.buffer = other.buffer
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUTexelCopyTextureInfo(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var texture: Pointer? = null

	@JvmField
	public var mipLevel: Int = 0

	@JvmField
	public var origin: WGPUOrigin3D.ByValue = WGPUOrigin3D.ByValue()

	@JvmField
	public var aspect: Int = 0

	override fun getFieldOrder(): Unit = listOf("texture", "mipLevel", "origin", "aspect")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUTexelCopyTextureInfo(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUTexelCopyTextureInfo) : this(other.pointer) {
			this.texture = other.texture
			this.mipLevel = other.mipLevel
			this.origin = other.origin
			this.aspect = other.aspect
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUTexelCopyTextureInfo(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUTexelCopyTextureInfo) : this(other.pointer) {
			this.texture = other.texture
			this.mipLevel = other.mipLevel
			this.origin = other.origin
			this.aspect = other.aspect
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUTextureDescriptor(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var nextInChain: Pointer? = null

	@JvmField
	public var label: WGPUStringView.ByValue = WGPUStringView.ByValue()

	@JvmField
	public var usage: Long = 0L

	@JvmField
	public var dimension: Int = 0

	@JvmField
	public var size: WGPUExtent3D.ByValue = WGPUExtent3D.ByValue()

	@JvmField
	public var format: Int = 0

	@JvmField
	public var mipLevelCount: Int = 0

	@JvmField
	public var sampleCount: Int = 0

	@JvmField
	public var viewFormatCount: Long = 0L

	@JvmField
	public var viewFormats: Pointer? = null

	override fun getFieldOrder(): Unit = listOf("nextInChain", "label", "usage", "dimension", "size", "format", "mipLevelCount", "sampleCount", "viewFormatCount", "viewFormats")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUTextureDescriptor(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUTextureDescriptor) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.label = other.label
			this.usage = other.usage
			this.dimension = other.dimension
			this.size = other.size
			this.format = other.format
			this.mipLevelCount = other.mipLevelCount
			this.sampleCount = other.sampleCount
			this.viewFormatCount = other.viewFormatCount
			this.viewFormats = other.viewFormats
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUTextureDescriptor(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUTextureDescriptor) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.label = other.label
			this.usage = other.usage
			this.dimension = other.dimension
			this.size = other.size
			this.format = other.format
			this.mipLevelCount = other.mipLevelCount
			this.sampleCount = other.sampleCount
			this.viewFormatCount = other.viewFormatCount
			this.viewFormats = other.viewFormats
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUTextureViewDescriptor(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var nextInChain: Pointer? = null

	@JvmField
	public var label: WGPUStringView.ByValue = WGPUStringView.ByValue()

	@JvmField
	public var format: Int = 0

	@JvmField
	public var dimension: Int = 0

	@JvmField
	public var baseMipLevel: Int = 0

	@JvmField
	public var mipLevelCount: Int = 0

	@JvmField
	public var baseArrayLayer: Int = 0

	@JvmField
	public var arrayLayerCount: Int = 0

	@JvmField
	public var aspect: Int = 0

	@JvmField
	public var usage: Long = 0L

	override fun getFieldOrder(): Unit = listOf("nextInChain", "label", "format", "dimension", "baseMipLevel", "mipLevelCount", "baseArrayLayer", "arrayLayerCount", "aspect", "usage")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUTextureViewDescriptor(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUTextureViewDescriptor) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.label = other.label
			this.format = other.format
			this.dimension = other.dimension
			this.baseMipLevel = other.baseMipLevel
			this.mipLevelCount = other.mipLevelCount
			this.baseArrayLayer = other.baseArrayLayer
			this.arrayLayerCount = other.arrayLayerCount
			this.aspect = other.aspect
			this.usage = other.usage
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUTextureViewDescriptor(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUTextureViewDescriptor) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.label = other.label
			this.format = other.format
			this.dimension = other.dimension
			this.baseMipLevel = other.baseMipLevel
			this.mipLevelCount = other.mipLevelCount
			this.baseArrayLayer = other.baseArrayLayer
			this.arrayLayerCount = other.arrayLayerCount
			this.aspect = other.aspect
			this.usage = other.usage
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUVertexAttribute(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var format: Int = 0

	@JvmField
	public var offset: Long = 0L

	@JvmField
	public var shaderLocation: Int = 0

	override fun getFieldOrder(): Unit = listOf("format", "offset", "shaderLocation")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUVertexAttribute(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUVertexAttribute) : this(other.pointer) {
			this.format = other.format
			this.offset = other.offset
			this.shaderLocation = other.shaderLocation
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUVertexAttribute(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUVertexAttribute) : this(other.pointer) {
			this.format = other.format
			this.offset = other.offset
			this.shaderLocation = other.shaderLocation
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUVertexBufferLayout(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var stepMode: Int = 0

	@JvmField
	public var arrayStride: Long = 0L

	@JvmField
	public var attributeCount: Long = 0L

	@JvmField
	public var attributes: Pointer? = null

	override fun getFieldOrder(): Unit = listOf("stepMode", "arrayStride", "attributeCount", "attributes")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUVertexBufferLayout(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUVertexBufferLayout) : this(other.pointer) {
			this.stepMode = other.stepMode
			this.arrayStride = other.arrayStride
			this.attributeCount = other.attributeCount
			this.attributes = other.attributes
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUVertexBufferLayout(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUVertexBufferLayout) : this(other.pointer) {
			this.stepMode = other.stepMode
			this.arrayStride = other.arrayStride
			this.attributeCount = other.attributeCount
			this.attributes = other.attributes
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUInstanceExtras(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var chain: WGPUChainedStruct.ByValue = WGPUChainedStruct.ByValue()

	@JvmField
	public var backends: Long = 0L

	@JvmField
	public var flags: Long = 0L

	@JvmField
	public var dx12ShaderCompiler: Int = 0

	@JvmField
	public var gles3MinorVersion: Int = 0

	@JvmField
	public var glFenceBehaviour: Int = 0

	@JvmField
	public var dxcPath: WGPUStringView.ByValue = WGPUStringView.ByValue()

	@JvmField
	public var dxcMaxShaderModel: Int = 0

	@JvmField
	public var budgetForDeviceCreation: Pointer? = null

	@JvmField
	public var budgetForDeviceLoss: Pointer? = null

	override fun getFieldOrder(): Unit = listOf("chain", "backends", "flags", "dx12ShaderCompiler", "gles3MinorVersion", "glFenceBehaviour", "dxcPath", "dxcMaxShaderModel", "budgetForDeviceCreation", "budgetForDeviceLoss")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUInstanceExtras(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUInstanceExtras) : this(other.pointer) {
			this.chain = other.chain
			this.backends = other.backends
			this.flags = other.flags
			this.dx12ShaderCompiler = other.dx12ShaderCompiler
			this.gles3MinorVersion = other.gles3MinorVersion
			this.glFenceBehaviour = other.glFenceBehaviour
			this.dxcPath = other.dxcPath
			this.dxcMaxShaderModel = other.dxcMaxShaderModel
			this.budgetForDeviceCreation = other.budgetForDeviceCreation
			this.budgetForDeviceLoss = other.budgetForDeviceLoss
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUInstanceExtras(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUInstanceExtras) : this(other.pointer) {
			this.chain = other.chain
			this.backends = other.backends
			this.flags = other.flags
			this.dx12ShaderCompiler = other.dx12ShaderCompiler
			this.gles3MinorVersion = other.gles3MinorVersion
			this.glFenceBehaviour = other.glFenceBehaviour
			this.dxcPath = other.dxcPath
			this.dxcMaxShaderModel = other.dxcMaxShaderModel
			this.budgetForDeviceCreation = other.budgetForDeviceCreation
			this.budgetForDeviceLoss = other.budgetForDeviceLoss
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUChainedStructOut(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var next: ByReference? = null

	@JvmField
	public var sType: Int = 0

	override fun getFieldOrder(): Unit = listOf("next", "sType")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUChainedStructOut(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUChainedStructOut) : this(other.pointer) {
			this.next = other.next
			this.sType = other.sType
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUChainedStructOut(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUChainedStructOut) : this(other.pointer) {
			this.next = other.next
			this.sType = other.sType
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUBufferMapCallbackInfo(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var nextInChain: WGPUChainedStruct.ByReference? = null

	@JvmField
	public var mode: Int = 0

	@JvmField
	public var callback: Callback? = null

	@JvmField
	public var userdata1: Pointer? = null

	@JvmField
	public var userdata2: Pointer? = null

	override fun getFieldOrder(): Unit = listOf("nextInChain", "mode", "callback", "userdata1", "userdata2")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUBufferMapCallbackInfo(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUBufferMapCallbackInfo) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.mode = other.mode
			this.callback = other.callback
			this.userdata1 = other.userdata1
			this.userdata2 = other.userdata2
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUBufferMapCallbackInfo(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUBufferMapCallbackInfo) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.mode = other.mode
			this.callback = other.callback
			this.userdata1 = other.userdata1
			this.userdata2 = other.userdata2
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUCompilationInfoCallbackInfo(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var nextInChain: WGPUChainedStruct.ByReference? = null

	@JvmField
	public var mode: Int = 0

	@JvmField
	public var callback: Callback? = null

	@JvmField
	public var userdata1: Pointer? = null

	@JvmField
	public var userdata2: Pointer? = null

	override fun getFieldOrder(): Unit = listOf("nextInChain", "mode", "callback", "userdata1", "userdata2")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUCompilationInfoCallbackInfo(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUCompilationInfoCallbackInfo) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.mode = other.mode
			this.callback = other.callback
			this.userdata1 = other.userdata1
			this.userdata2 = other.userdata2
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUCompilationInfoCallbackInfo(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUCompilationInfoCallbackInfo) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.mode = other.mode
			this.callback = other.callback
			this.userdata1 = other.userdata1
			this.userdata2 = other.userdata2
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUCreateComputePipelineAsyncCallbackInfo(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var nextInChain: WGPUChainedStruct.ByReference? = null

	@JvmField
	public var mode: Int = 0

	@JvmField
	public var callback: Callback? = null

	@JvmField
	public var userdata1: Pointer? = null

	@JvmField
	public var userdata2: Pointer? = null

	override fun getFieldOrder(): Unit = listOf("nextInChain", "mode", "callback", "userdata1", "userdata2")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUCreateComputePipelineAsyncCallbackInfo(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUCreateComputePipelineAsyncCallbackInfo) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.mode = other.mode
			this.callback = other.callback
			this.userdata1 = other.userdata1
			this.userdata2 = other.userdata2
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUCreateComputePipelineAsyncCallbackInfo(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUCreateComputePipelineAsyncCallbackInfo) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.mode = other.mode
			this.callback = other.callback
			this.userdata1 = other.userdata1
			this.userdata2 = other.userdata2
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUCreateRenderPipelineAsyncCallbackInfo(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var nextInChain: WGPUChainedStruct.ByReference? = null

	@JvmField
	public var mode: Int = 0

	@JvmField
	public var callback: Callback? = null

	@JvmField
	public var userdata1: Pointer? = null

	@JvmField
	public var userdata2: Pointer? = null

	override fun getFieldOrder(): Unit = listOf("nextInChain", "mode", "callback", "userdata1", "userdata2")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUCreateRenderPipelineAsyncCallbackInfo(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUCreateRenderPipelineAsyncCallbackInfo) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.mode = other.mode
			this.callback = other.callback
			this.userdata1 = other.userdata1
			this.userdata2 = other.userdata2
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUCreateRenderPipelineAsyncCallbackInfo(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUCreateRenderPipelineAsyncCallbackInfo) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.mode = other.mode
			this.callback = other.callback
			this.userdata1 = other.userdata1
			this.userdata2 = other.userdata2
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUPopErrorScopeCallbackInfo(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var nextInChain: WGPUChainedStruct.ByReference? = null

	@JvmField
	public var mode: Int = 0

	@JvmField
	public var callback: Callback? = null

	@JvmField
	public var userdata1: Pointer? = null

	@JvmField
	public var userdata2: Pointer? = null

	override fun getFieldOrder(): Unit = listOf("nextInChain", "mode", "callback", "userdata1", "userdata2")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUPopErrorScopeCallbackInfo(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUPopErrorScopeCallbackInfo) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.mode = other.mode
			this.callback = other.callback
			this.userdata1 = other.userdata1
			this.userdata2 = other.userdata2
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUPopErrorScopeCallbackInfo(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUPopErrorScopeCallbackInfo) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.mode = other.mode
			this.callback = other.callback
			this.userdata1 = other.userdata1
			this.userdata2 = other.userdata2
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPUQueueWorkDoneCallbackInfo(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var nextInChain: WGPUChainedStruct.ByReference? = null

	@JvmField
	public var mode: Int = 0

	@JvmField
	public var callback: Callback? = null

	@JvmField
	public var userdata1: Pointer? = null

	@JvmField
	public var userdata2: Pointer? = null

	override fun getFieldOrder(): Unit = listOf("nextInChain", "mode", "callback", "userdata1", "userdata2")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPUQueueWorkDoneCallbackInfo(pointer),
	    Structure.ByReference {
		public constructor(other: WGPUQueueWorkDoneCallbackInfo) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.mode = other.mode
			this.callback = other.callback
			this.userdata1 = other.userdata1
			this.userdata2 = other.userdata2
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPUQueueWorkDoneCallbackInfo(pointer),
	    Structure.ByValue {
		public constructor(other: WGPUQueueWorkDoneCallbackInfo) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.mode = other.mode
			this.callback = other.callback
			this.userdata1 = other.userdata1
			this.userdata2 = other.userdata2
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPURequestAdapterCallbackInfo(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var nextInChain: WGPUChainedStruct.ByReference? = null

	@JvmField
	public var mode: Int = 0

	@JvmField
	public var callback: Callback? = null

	@JvmField
	public var userdata1: Pointer? = null

	@JvmField
	public var userdata2: Pointer? = null

	override fun getFieldOrder(): Unit = listOf("nextInChain", "mode", "callback", "userdata1", "userdata2")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPURequestAdapterCallbackInfo(pointer),
	    Structure.ByReference {
		public constructor(other: WGPURequestAdapterCallbackInfo) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.mode = other.mode
			this.callback = other.callback
			this.userdata1 = other.userdata1
			this.userdata2 = other.userdata2
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPURequestAdapterCallbackInfo(pointer),
	    Structure.ByValue {
		public constructor(other: WGPURequestAdapterCallbackInfo) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.mode = other.mode
			this.callback = other.callback
			this.userdata1 = other.userdata1
			this.userdata2 = other.userdata2
		}
	}
}

/**
 * @suppress
 */
public sealed class WGPURequestDeviceCallbackInfo(
	pointer: Pointer? = null,
) : Structure(pointer) {
	@JvmField
	public var nextInChain: WGPUChainedStruct.ByReference? = null

	@JvmField
	public var mode: Int = 0

	@JvmField
	public var callback: Callback? = null

	@JvmField
	public var userdata1: Pointer? = null

	@JvmField
	public var userdata2: Pointer? = null

	override fun getFieldOrder(): Unit = listOf("nextInChain", "mode", "callback", "userdata1", "userdata2")

	public class ByReference(
		pointer: Pointer? = null,
	) : WGPURequestDeviceCallbackInfo(pointer),
	    Structure.ByReference {
		public constructor(other: WGPURequestDeviceCallbackInfo) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.mode = other.mode
			this.callback = other.callback
			this.userdata1 = other.userdata1
			this.userdata2 = other.userdata2
		}
	}

	public class ByValue(
		pointer: Pointer? = null,
	) : WGPURequestDeviceCallbackInfo(pointer),
	    Structure.ByValue {
		public constructor(other: WGPURequestDeviceCallbackInfo) : this(other.pointer) {
			this.nextInChain = other.nextInChain
			this.mode = other.mode
			this.callback = other.callback
			this.userdata1 = other.userdata1
			this.userdata2 = other.userdata2
		}
	}
}
