## 图片加载笔记

> 会对[Glide](https://github.com/bumptech/glide) Picasso Fresco及Sketch进行剖析，选出最适合快速开发的图片加载框架

#### 对比
| 对比项 | Glide | Picasso | Fresco | Sketch |
| --- | --- | --- | --- | --- |
| 作者 | bumptech |  |  |  |
| 公司 |  |  |  |  |
| 时间 | 2014 |  |  |  |
| 版本 |  |  |  |  |
| Bitmap格式 | RGB_565 | ARGB_8888 |  |  |
|  |  |  |  |  |
|  |  |  |  |  |
|  |  |  |  |  |
|  |  |  |  |  |
|  |  |  |  |  |
|  |  |  |  |  |
|  |  |  |  |  |
|  |  |  |  |  |
|  |  |  |  |  |
|  |  |  |  |  |

#### Glide使用笔记

- Glide.with(#) Glide和Activity/Fragment的生命周期绑定，#尽量传Activity或Fragment，不传Context
- Glide更改默认Bitmap格式为ARGB_8888[案例]()