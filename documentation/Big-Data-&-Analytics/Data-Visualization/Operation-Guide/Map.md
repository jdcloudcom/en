#### 4. Map Component Configuration

Currently the Data Visualization Screen support: 3D border map (China/World), 2D border map (China/World), and 2D/3D GIS map
. 6 types of maps in total. Wherein the border map may drill down to the district and county levels. GIS map may drill down to the street level.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/0c852ad8a6c245cb666d8b49ae507f0e.png)


Each map component supports multi-layer data superimposing, allowing you to superimpose fly-lines, 3D column diagrams, bubbles, tracks, and thermal effects on the same map. In addition, each data presentation method supports multiple series of business data. For example, you can use different colors and shapes of the scatter diagram to represent different types of crops.

##### 4.1 3D Border Map (China/World)

3D map component configuration includes: Global settings, regional settings, data layer settings (scatter, 3D column diagram, fly-line, and thermal power), lighting effects design, chart size and position.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/40e68e274f2360952dc2cb32d0c148ef.png)


###### 4.1.1 3D Border Map - Global Style Settings

The global settings of the map components mainly include: Map regional settings (e.g. select a province), default map block color, map center point, and map zoom level. In the 3D case, the up and down tilt angle and the left and right rotation angle of the map are also included.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/a73e615eaf695e368e5280cb443ba50e.png)


###### 4.1.2 3D Border Map - Regional Style Settings

You can particularly set colors for each region of the map. You can use colors to represent the regions you are focusing on, or you can configure the colors to achieve a personalized visual effect.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/9556a61274f0b51ff89fcd395c11d457.png)


###### 4.1.3 3D Border Map - Scatter Layer Style Settings

The scatter layer supports multiple series of data association, and the data series configuration method is consistent with the basic chart data series configuration method.

You can set scatter shapes in the scatter layer and differentiate business data by scatter type. The system currently supports: 7 shapes including triangle, prototype and needle types.

By setting text remarks in the scatter layer, you can map data to the scatter layer. You can also customize your remarks via JS programming method.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/97b637e48005aed910e0ab4547b673a4.png)


###### 4.1.4 3D Border Map - Style Settings of Column Diagram Layer

The column diagram layer supports multiple series of data association, and the data series configuration method is consistent with the basic chart data series configuration method.

You can personalize the shapes of the columns in each data series, including: Thickness, color, and chamfer roundness. Same as the scatter layer, you can represent different business meanings by the shape and color of the columns.

In the column diagram layer, you can also set text remarks as in the scatter layer.

In the column diagram layer, you can also enable the data mapping function. Once this function is enabled, you can represent the data size by not only the column height but also the color.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/053ceb938f0ef6a96826443869791d7d.png)


###### 4.1.5 3D Border Map - Style Settings of Fly-line Layer

The fly-line layer supports multiple series of data association, and the data series configuration method is consistent with the basic chart data series configuration method.

You can personalize the shapes of the fly-lines in each data series, including: The width of fly-line, color, and fly-line trail effects. Same as the scatter layer, you can represent different business meanings by these attributes.

In the fly-line layer, you can also enable the light superimposing effect; the more data is superimposed, the higher the brightness of fly-line will be.

In the fly-line layer, you can still enable the data mapping function. Once this function is enabled, you can use colors to represent the business data that is represented by fly-lines. For example, you can use colors to represent the volume of transactions sent from Beijing to Shanghai.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/dc40454ea737d1eb49d1b2498a9e5aae.png)


###### 4.1.6 3D Border Map - Style Settings of Regional Thermal Layer

Regional thermal power only supports a single data series, and you can set the mapping of data to color.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/859c422b1d040c12b255aa2f4b2d379b.png)


###### 4.1.7 3D Border Map - Light and Post Effects Superimposing

You can achieve even cooler display effect with light and shadow settings. You can adjust the main light source, ambient light, highlights, depth of field and other special effects.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/819b235d2a66db0073409e42b3ac17a4.png)


The following figure is a comparison of the light source effects: The left is the effect of enabling the light source, and the right is the effect of disabling it.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/7555d4bde7e4e9094c40999ae4cab325.png)


###### 4.1.8 3D Map Data Settings

Each data layer in the map requires separate data association. The data source types supported by the system are consistent with the basic statistical charts, including: Json files, APIs, and relational databases.

In the data association of the scatter layer, you need to set 4 values (name,lon,lat.s) for each data. The name
is used to represent the business name of the scatter, lon/lat is the latitude and longitude of data, and S is used to distinguish different data series. Wherein the name
and S fields can be optional fields.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/a7a6407c7424291280ee2cced7413558.png)


In the data association of the column diagram layer, you need to set 5 values (lon,lat,name,value,s) for each data. The lon/lat is the latitude and longitude of data, name is the business data name, value is used to map the column height to data value, and S is used to distinguish different data series. Wherein the name
and S fields can be optional fields.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/1c4cf25008724f938758d8d731345146.png)


In the data association of the fly-line layer, you need to set 4 values (from,to,value,s) for each data. From/to
is the starting and ending points of the fly-line. The starting and ending points need to be associated by lon/lat, the value is used to map the fly-line color to the business value, and S is used to distinguish different data series. Wherein value
and S fields can be optional fields.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/b92e40055d47b6411a7af2fc2fd827f3.png)


In the data association of the thermal layer, you need to set 2 values (name,value) for each data. Unlike other data layer settings, the thermal layer requires you to associate the map regional names such as Beijing City and Hebei Province. value is used to map the fly-line color to the business value, and S is used to distinguish different data series. Wherein value
and S fields can be optional fields.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/baedf6313a387eda4b9f335cb99c2169.png)


##### 4.2 2D Border Map (China/World)

2D map component configuration includes: Global settings, regional settings, data layer settings (ripple layer, fly-line layer, regional thermal layer, and point thermal layer) and chart size and position.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/a6e1777695446b8fd260696755f8dd19.png)


###### 4.2.1 2D Border Map - Global Style Settings

The global settings of the 2D map are used to confirm the map regions (e.g. the map of province or city), borderline style, default regional colors, and regional tags. In addition, you can adjust the size and position of the map by dragging and dropping, or you can adjust it precisely by modifying the map center and map zoom level.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/b6aefc5bc52208c6835b3dbbe536a731.png)


###### 4.2.2 2D Border Map - Interaction Style Settings

The interaction style only works when you enable a map drill-down interaction in the interaction settings. The interaction style is used to set the color when a map region is selected.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/ef6e611498ae8920291cc3653df62fcc.png)


###### 4.2.3 2D Border Map - Regional Style Settings

The regional settings are used to personalize the style of your map. You can set the color of the region, the color of the regional border, and the width of the border.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/809d9b5d90a235758047737225477720.png)


###### 4.2.4 2D Border Map - Ripple Layer Style

The data ripple layer has rich representation forms. You can set the shape of the ripples (such as circles, squares, triangles, etc. There are 7 types in total), drawing methods (filling, edge line), ripple color, ripple size, ripple animation, etc. The figure below shows the effects after adjusting the shape, drawing method, color,
and attributes of the ripples.

In addition, the ripple layer supports multiple series of data display. You can display multiple business indicators on the same map.

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

In the data settings of ripple layer, you need to set (lon,lat,value,s,name), wherein lon,lat is the latitude and longitude of data, value
is the indicator value of business data (e.g. 100 orders), Name field is the business name mark, and S is the business data type.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/e5db4d4711f36d9afa4ba448dd4e1bec.png)



In the data settings of fly-line layer, you need to set (from,to,value,s), wherein from/to is the starting and ending points of business data flow (you need to set the latitude and longitude of starting and ending points in addition), value
can be used to present the data indicator of the flow (e.g. the logistics quantity sent from Beijing to Shanghai), and S is the business data type. S and Value
are both optional values.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/db4d904ba8066c13bffb98812c61d91d.png)



In the data setting of the regional thermal power, you need to set (name, value, s), wherein the name field is the name of the business data region (e.g. Beijing City), and value
is the thermal value of business data.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/2f2ade52e6dded29812942cf96705d92.png)



In the data settings of point thermal power, you need to set (lon,lat,value,s) for each data, wherein lon,lat is the latitude and longitude of data, value
is the thermal value of business data, and S is the business data type.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/de424d7616e68c58e66f27bf602afe5c.png)



##### 4.3 2D/3D Border Map - Interaction Settings

Both 2D/3D border maps support drill-down. If you click **Enable** in the interaction settings, then the map in the preview/release status will implement the drill-down function. In addition, you can personalize the center point and zoom level of the map after drill-down. In the following example: The left is the Data Visualization Screen before the map is drilled down, and the right is the Data Visualization Screen after clicking a region.

In the 2D/3D border map drill-down events, you can drill down the map step by step by clicking the mouse (the minimum drill-down granularity is district and county level); if you need to return to the previous level, click on the blank area of the map region to return.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/de7fcd3bc3d64c8b12f4ee149ba20b45.png)



![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/5f9ab4d2703fe2243a55172d71aadd2f.png)


If you want other charts to be linked after the map is drilled down, then you need to set the region in the chart a variable, and associate SQL of other charts to this variable. For example: in the figure below, if you want the data of the line chart on the right side to be linked after the map is drilled down, then you need to associate the map regional variable area in the line chart SQL.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/37cb4b90956177849834ab00e8f0b24f.png)
