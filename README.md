# OpenGLStudy
# 升级为演示项目

## 一个使用OpenGLES的基础demo

四棱锥旋转，存在BUG，从运行效果来分析，像是一个3D图形在2D的平面进行旋转
(已解决：解决方案，开启GLES深度测试，并添加深度缓存
```kotlin
glEnable(GL_DEPTH_TEST)
glClear(GL_COLOR_BUFFER_BIT or GL_DEPTH_BUFFER_BIT)
```
)
使用viewpager2切换页面时，第一个页面左滑，最后一个页面右滑会导致程序崩溃