##### 4.2 2D Border Map (China/World)

2D map component configuration includes Global settings, regional settings, data layer settings (ripple layer, fly-line layer, regional thermal layer, and point thermal layer) and chart size and position.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/a6e1777695446b8fd260696755f8dd19.png)


###### 4.2.1 2D Border Map - Global Style Settings

The global settings of the 2D map are used to confirm the map regions (e.g. the map of province or city), borderline style, default regional colors, and regional tags. In addition, you can adjust the size and position of the map by dragging, or you can adjust it precisely by modifying the map center and map zooming.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/b6aefc5bc52208c6835b3dbbe536a731.png)


###### 4.2.2 2D Border Map - Interaction Style Settings

The interaction style only works when you enable a map drill-down interaction in the interaction settings. The interaction style is used to set the color when a map region is selected.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/ef6e611498ae8920291cc3653df62fcc.png)


###### 4.2.3 2D Border Map - Regional Style Settings

The regional settings are used to personalize the style of your map. You can set the color of the region, the color of the regional border, and the width of the border.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/809d9b5d90a235758047737225477720.png)


###### 4.2.4 2D Border Map - Ripple Layer Style

The data ripple layer has rich representation forms. You can set the shape of the ripples (such as circles, squares, and triangles. There are 7 types in total), drawing methods (filling, edge line), ripple color, ripple size, ripple animation, etc. The figure below shows the effects after adjusting the shape, drawing method, color
and attributes of the ripples.

In addition, the ripple layer supports multiple series of data display. You can display multiple business indicators on the same map

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/ec47d4f6fc8d4fe2dc77b605f4d855eb.png)


###### 4.2.5 2D Border Map - Fly-line Layer Style

The fly-line layer is mostly used to represent the flow of business data. You can adjust the starting and ending marks of each fly-line and the color/width
and trail effects of fly-line.

The data fly-line layer supports multiple series of data display. You can display the flow of multiple businesses on the same map.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/7d5512108b27900872f52c0c39af230f.png)



###### 4.2.6 2D Border Map - Regional Thermal Style

You can map the map colors to business data on the regional thermal layer. The regional thermal layer only supports single series of data display.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/9906bf888b405dad754c76e4860ce6ff.png)



###### 4.2.7 2D Border Map - Point Thermal Layer Style

You can map the map colors to business data on the point thermal layer. Unlike the regional thermal layer, the point thermal power is not limited to the map regional border, only depending on the latitude and longitude of the associated data.

In the point thermal layer, you can represent the business data more precisely by adjusting the blur radius and thermal radius of the thermal points. The point thermal layer supports single series of data display; you can distinguish different business data by color.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/32e43dee6505e802eb617335a0b5175b.png)



###### 4.2.8 2D Border Map - Data Settings

In the data settings of ripple layer, you need to set (lon, lat, value, s, name), wherein lon, lat is the latitude and longitude of data, value
is the indicator value of business data (e.g. 100 orders), Name field is the business name mark, and S is the business data type.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/e5db4d4711f36d9afa4ba448dd4e1bec.png)



In the data settings of fly-line layer, you need to set (from, to, value, s), wherein from/to is the starting and ending points of business data flow (you need to set the latitude and longitude of starting and ending points in addition), value
can be used to present the data indicator of the flow (e.g. the logistics quantity sent from Beijing to Shanghai), and S is the business data type. S and Value
are both optional values.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/db4d904ba8066c13bffb98812c61d91d.png)



In the data setting of the regional thermal power, you need to set (name, value, s), wherein the name field is the name of the business data region (e.g. Beijing City), and value
is the thermal value of business data.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/2f2ade52e6dded29812942cf96705d92.png)



In the data settings of point thermal power, you need to set (lon,lat,value,s) for each data, wherein lon,lat is the latitude and longitude of data, value
is the thermal value of business data, and S is the business data type.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/de424d7616e68c58e66f27bf602afe5c.png)
