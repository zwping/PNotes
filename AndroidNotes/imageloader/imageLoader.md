## 图片加载笔记

> 会对[Glide](https://github.com/bumptech/glide) Picasso Fresco及Sketch进行剖析，选出最适合快速开发的图片加载框架

#### 对比
| 对比项 | Glide | Picasso | Fresco | Sketch |
|:---:|:---:|:---:|:---:|:---:|
| 作者 | bumptech |  |  |  |
| 公司 |  |  |  |  |
| 时间 | 2014 |  |  |  |
| 版本 | 4.4.0 |  |  |  |
| Bitmap格式 | RGB_565 | ARGB_8888 |  |  |
| 加载速度 | 1 | 2 |  |  |
| 支持Gif | 支持 | 不支持(jac) |  |  |
| 播放本地视频 | 支持 | 不支持 |  |  |
| thumbnail | 支持 | 不支持 |  |  |
| 库的大小 |  |  |  |  |
| 方法数 |  |  |  |  |
|  |  |  |  |  |
|  |  |  |  |  |
|  |  |  |  |  |
|  |  |  |  |  |

#### Glide使用笔记

> 阅 [文-Glide介绍](http://www.jcodecraeer.com/a/anzhuokaifa/androidkaifa/2015/0327/2650.html)、[郭霖-Glide最全解析](http://blog.csdn.net/column/details/15318.html)得出的笔记

- Glide.with(#) Glide和Activity/Fragment的生命周期绑定，#尽量直接传Activity或Fragment，不传Context
- Glide更改默认Bitmap格式为ARGB_8888[案例](https://github.com/zwping/PNotes/blob/master/AndroidNotes/imageloader/src/main/java/win/zwping/imageloader/glide/GlideModule.java)，<b>√建议使用</b>
- Glide加载图片的大小和ImageView大小一致，默认会对不同大小ImageView Glide都会进行不同大小图片的缓存，所以Glide占用内存更多
- Glide默认只缓存加载大小的图片，每次重新加载至不同大小的ImageView时都会重新拉取Url，在这建议Glide设置同时缓存全尺寸和不同大小的尺寸[案例]()，下次再加载至不同大小的ImageView，会从缓存中取全尺寸的图片，调整大小缓存并显示，<b>√建议使用</b>
- Glide方法数过于庞大，建议开启[ProGuard](https://github.com/bumptech/glide#proguard)，<b>√建议使用</b>
- Glide加载gif时，一定要用diskCacheStrategy(DiskCacheStrategy.SOURCE)或NONE，不然会将gif每一帧都压缩缓存，超级耗时

> Glide QA

- <font color="#F08080">Glide怎么监听Activity/Fragment的生命周期</font>
<br />
添加隐藏的Fragment，监听其生命周期达到with()传入值对应的生命周期 [示例](https://github.com/bumptech/glide/blob/master/library/src/main/java/com/bumptech/glide/manager/SupportRequestManagerFragment.java)
<br />