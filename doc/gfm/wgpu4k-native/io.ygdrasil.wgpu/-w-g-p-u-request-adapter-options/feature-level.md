//[wgpu4k-native](../../../index.md)/[io.ygdrasil.wgpu](../index.md)/[WGPURequestAdapterOptions](index.md)/[featureLevel](feature-level.md)

# featureLevel

[common]\
expect abstract var [featureLevel](feature-level.md): [WGPUFeatureLevel](../-w-g-p-u-feature-level/index.md)

&quot;Feature level&quot; for the adapter request. If an adapter is returned, it must support the features and limits in the requested feature level.

Implementations may ignore @ref WGPUFeatureLevel_Compatibility and provide @ref WGPUFeatureLevel_Core instead. @ref WGPUFeatureLevel_Core is the default in the JS API, but in C, this field is **required** (must not be undefined).

[android, jvm, native]\
[android, jvm, native]\
actual abstract var [featureLevel](feature-level.md): [WGPUFeatureLevel](../-w-g-p-u-feature-level/index.md)