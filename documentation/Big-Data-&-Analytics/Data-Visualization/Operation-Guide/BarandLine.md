##### 3.1 Column Diagram, Line Chart and Box Plot

The column diagram, the line chart and the box plot (K line chart) adopt the rectangular coordinate system. With respect to pattern setting, the X-axis setting, Y-axis setting, the multi-series data setting and the chart decoration pattern setting are provided. The data association to the chart is made
,via three variables (X, Y and S), wherein X refers to the X axis value, Y means the Y axis value and S means the data series value.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/95906102ac9c00942c9ebbf37994d14e.png)


The column diagram, the line chart and the box plot are the compound patterns, with two Y axes and a Y axis shared by the polygonal line and the box line. They are representative both in style setting and data setting. For style setting of other charts, please refer to the column diagram, the line chart and the box plot.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/e1dd4f6f71b9241e709e72ec04c208cd.png)


###### 3.1.1 Column Diagram, Line Chart and Box Plot-global Style

Global style: Default style of global font and position of basic chart with respect to container frame

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/e9056e0fe1d433d6c6245ac437e51397.png)


###### 3.1.2 Column Diagram, Line Chart and Box Plot-X Axis

Mainly include: style setting of coordinates, axes, scale marks and grid lines

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/017a51b20cb537fcacfef98b0960cf85.png)


###### 3.1.3 Column Diagram, Line Chart and Box Plot-Y Axis

It is a biaxial chart in the K line chart. The Y axis (polyline) refers to the left coordinate axis. This coordinate axis is shared by the K line and the polyline. The style setting of the Y axis is as the same as that of the X axis, both of which include style settings of coordinates, axes, scale mark and grid lines. In addition, the user is allowed to modify the maximum scales and minimum scales for the Y axis. The user can control the relative position between the polyline and the column diagram by modifying scale limits.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/2e06e3f55c9a4fb64181fbc2cb82c7fa.png)


###### 3.1.4 Column Diagram, Line Chart and Box Plot-Y Axis

The Y axis (column diagram) is the right coordinate axis with configuration attribute as the same as that of the Y polyline setting.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/7fcd785501f0abc39f10063785fc03e4.png)


###### 3.1.5 Column Diagram, Line Chart and Box Plot-legend

When displaying multi-series data (multi-business data), it needs to distinguish business via legends.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/85c2e14c7c1b4202da9c41dca5e1d464.png)


###### 3.1.6 Column Diagram, Line Chart and Box Plot-data Tag

Data tags are used for displaying graphic numbers. When the user checks [Display Data Tag], the business data will be displayed by the column diagram. It is shown in the figure below:

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/80a0b7c7302669c047a9766314370716.png)


###### 3.1.7 Column Diagram, Line Chart and Box Plot-data Series

Data series refer to specific component contents to be displayed via the data. The user can control the business data to be displayed by the chart via the adding and deleting options.

For example, three business data types, including the rice, the wheat and the corn, are displayed in the figure below.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/6d9e6aa43693a915cef5d51f97aeccc0.png)


Adding data series: Three data types, including the K line chart (box plot), the polyline chart and the column diagram, can be associated to each data series.
Once the data series adding button is clicked by the user, the system will add a configuration item of a data series by default in order. For example, where the current chart already has 3 data series, the added data series type value is 4 by default. The business data with the series value 4 will be displayed in the chart only if such business data are contained in the user’s configuration data. Otherwise, no business data will be displayed.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/e2670305307a4cb7f2dfe0ef823ba8c8.png)


Association between data series and data: The user can map the data into the chart via the series value consistent with the data. If the series values set by the user are inconsistent with the data, the data will not be displayed in the chart. Similarly, if the data are not maintained in the series, the data will not be in the chart.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/2e12b5eace9739124ec8dbb6df0a2d63.png)


Style setting of graph data: The user can determine whether to display the column diagram, the polyline chart and the K line chart (box plot) or not, and set chart style details such as modifying weight, color and others of the column diagram. Effects of the polyline chart and the column diagram are as shown in the figure below.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/b6ea92259d9375988bffdf0083500dc5.png)


###### 3.1.8 Column diagram, line chart and box plot-chart size and position

The user can control size and position of charts and canvases by dragging and zooming. The user also can precisely change size and position of charts by inputting values.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/648098390e740aa8ff4c9e519ed6dad8.png)


###### 3.1.9 Column diagram, line chart and box plot-data source setting

The system supports 4 data sources, including the BDP Platform Data Compute, the RDS Cloud Database, API and Json
(the independently-deployed version of the visualization screen also supports access to the local relational databases via JDBC, such as mysql, postgresql, oracle,
DaMeng, etc.).

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/2053c7923f6ce31af037268241810562.png)


In case of SQL and API, fixed-time data query is supported: Where the user maintains the data refresh frequency, the component data is automatically updated.

The purpose of data setting is to map chart attributes into data.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/632a3e3ab7b0c1970d24e70cfb830a98.png)
