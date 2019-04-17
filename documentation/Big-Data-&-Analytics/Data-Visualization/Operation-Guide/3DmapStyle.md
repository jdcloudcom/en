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

You can personalize the shapes of the fly-lines in each data series, including the width of fly-line, color, and fly-line trail effects. Like the scatter layer, you can represent different business meanings by these attributes.

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

Each data layer in the map requires separate data association. The data source types supported by the system are consistent with the basic statistical charts, including Json files, APIs, and relational databases.

In the data association of the scatter layer, you need to set 4 values (name, lon, lat. s) for each data. The name
is used to represent the business name of the scatter, lon/lat is the latitude and longitude of data, and S is used to distinguish different data series. Wherein the name
and S fields can be optional fields.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/a7a6407c7424291280ee2cced7413558.png)


In the data association of the column diagram layer, you need to set 5 values (lon,lat,name,value,s) for each data. The lon/lat is the latitude and longitude of data, name is the business data name, value is used to map the column height to data value, and S is used to distinguish different data series. Wherein the name
and S fields can be optional fields.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/1c4cf25008724f938758d8d731345146.png)


In the data association of the fly-line layer, you need to set 4 values (from, to, value, s) for each data. From/to
is the starting and ending points of the fly-line. The starting and ending points need to be associated by lon/lat, the value is used to map the fly-line color to the business value, and S is used to distinguish different data series. Wherein value
and S fields can be optional fields.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/b92e40055d47b6411a7af2fc2fd827f3.png)


In the data association of the thermal layer, you need to set 2 values (name,value) for each data. Unlike other data layer settings, the thermal layer requires you to associate the map regional names such as Beijing City and Hebei Province. value is used to map the fly-line color to the business value, and S is used to distinguish different data series. Wherein value
and S fields can be optional fields.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/baedf6313a387eda4b9f335cb99c2169.png)
