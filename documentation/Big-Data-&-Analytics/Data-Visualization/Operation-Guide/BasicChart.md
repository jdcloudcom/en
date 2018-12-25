#### 3 Configuration of Basic Chart Component

At present, the Data Visualization provides 29 basic statistical charts, such as the line chart, the column diagram, the bar chart, the pie chart, the bubble chart, the scatter diagram, the hydrograph and the dashboard.

The charts are similar to each other with respect of style and data configuration. Three major settings are comprised basically, including:
the global font and chart position setting, the coordinate axis setting (X/Y/polar axis) and the data series and legend setting.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/d703ad879e5a5b4d939078caecbac8b4.png)


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

For example: three business data types, including the rice, the wheat and the corn, are displayed in the figure below.

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


###### 3.1.9 Column Diagram, Line Chart and Box Plot-data Source Setting

The system supports 4 data sources, including the BDP Platform Data Compute, the RDS Cloud Database, API and Json
(the independently-deployed version of the Data Visualization also supports access to the local relational databases via JDBC, such as mysql, postgresql, oracle,
DaMeng, etc.)

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/2053c7923f6ce31af037268241810562.png)


In case of SQL and API, fixed-time data query is supported: Where the user maintains the data refresh frequency, the component data is automatically updated.

The purpose of data setting is to map chart attributes into data.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/632a3e3ab7b0c1970d24e70cfb830a98.png)


##### 3.2 Pie Chart/Indicator Percentage Chart

The hydrograph, the doughnut chart, the indicatrix, the pie chart and the dashboard are applicable for representing indicator proportion data. These charts have powerful graphic representation capacities and have additional decoration components except to data representation.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/c82e0f81d8a4b01d8b87ec841de237f4.png)


###### 3.2.1 Hydrograph

The hydrograph style design covers the outline border decoration and the data area. The system supports 5 borders at present. You are allowed to modify outline border attributes such as shape, color and width, so as to achieve different vision effects. For the data area, the text setting and the water ripple style setting are provided.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/b3eb0085dbb117aad1f53a7bdcb8cf9e.png)


For the hydrograph, you only need to associate one variable, and the system will automatically switch such value to the percent and round off the last number.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/bcec775e09ab48672b176c911ef16a2d.png)


###### 3.2.2 Percentage Bar Chart

The style design of percentage bar chart covers the outline border decoration, the index line and the data area. You are allowed to modify color and background color of the data entry in the outline border style. The index line is used for marking the data. You are allowed to modify the length of each line segment and roundness between line segments. You can set the outer radius and inner radius of a ring for each data entry in the data series style.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/2ef2c862b61f41db5fadff435f6234b7.png)


You need to associate 3 variables (X, Y and S) for the percentage bar chart, among which X refers to the business indicator of each data entry, Y refers to corresponding indicator value and S is used for associate the data with the data series.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/a56fdafc32e4ac65fd8351f6540b03dd.png)


###### 3.2.3 Indicator Percentage Chart

The style design of the indicator percentage chart covers the outline border decoration and the data area. You are allowed to modify color, width, start angle and end angle of outline border in the outline border style. You are allowed to modify color of data entry and font, color and others of data indicator in the data area. When creating the Data Visualization, you are allowed to patch a doughnut chart with several indicator percentage charts.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/f257135572e0a830d7cc391bb9172402.png)


You only to associate the indicator value (Y) for the indicator percentage chart. If you also need to set business indicator name, please do so via style setting.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/20593e6699f3c0f60e2ae2286095882c.png)


###### 3.2.4 Percentage Pie Chart

The percentage pie chart is a basic pie chart with data indicator name, color and others to be set.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/5a45edf69b3d372912db6d2c9d91dc76.png)


To associate data of the percentage pie chart, you need to set (X, Y), in which X refers to the indicator name and Y refers to the indicator value.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/53b5c35905df5d0eb898ca8e98ef7898.png)


###### 3.2.5 Dashboard

The dashboard is a special proportion chart. It displays data in the form of absolute values. The dashboard style configuration covers the styles and data area setting of two disks. The disk setting covers the border, the scale line, the cutting line and the pointer. The data area setting mainly includes font, color, position and the like of indicators and indicator values.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/e22d396a17b256df71aae04c1fb368ff.png)


The data setting of dashboard comprises two values, name and value, in which name refers to the indicator entry and value refers to the indicator value.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/0ab9fc0a7a705ce8616216eca8177ce4.png)


##### 3.3 Radar Chart

The radar chart supports the round radar chart and the polyline radar chart. The style setting covers the polar axis setting, the style of radar chart, the data tag style and the data series style.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/db4f588fcff74a1611c17a5607f4d66b.png)


You are allowed to adjust the maximum scale value of each axis for the polar axis of the radar chart. If the maximum scale is not maintained, the system will set the maximum scale for the axis based on the maximum value of data. In addition, you also can adjust color and font weight of axis, font of scale value, etc.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/408da87d1906473454bbbd136c330f3d.png)


The style setting of radar chart mainly comprises setting of cutting lines and partitions. Numbers of cutting lines and partitions can be adjusted by adjusting the scale number of polar axes.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/e0aa47ccb0807a30d0e4b30872997ed4.png)


The data tag and the data series are the indications of business data in the radar chart. You are allowed to adjust attributes of data areas, such as outline border, filling and subtracting color and tag field. The radar chart also supports display of multi-series data. You are allowed to add several business options in the data series.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/44dcf22dbee25f4eae1a90cddeacbae3.png)


You need to associate the data series (S) and the statistical dimension. S refers to the data series intended to be described. The indicator item is the statistical dimension of the data series. S is a reserved word which must be marked with the fixed character S in the associated data. When the data are read by the system, S will be used as the business description (series name), while other data will be used as the statistical dimension. In addition, the radar chart also supports the renaming function to the statistical dimension.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/78840f3dc63fd57d8ca244b05db6aa35.png)


##### 3.4 List/List View

The system provides two list types, including the single-indicator list and the multi-indicator list. The single-indicator list only has series number column and the data column, while the multiple-indicator list only allows any indicators added by the user. The indicator and indicator value will be displayed in the form of fold for the single-indicator list. Each column of the multi-indicator list represents a data indicator type.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/906db7306fd1a2009ddc95449dde1339.png)


For style setting, both the lists cover: the global style, the outline border style, the header style setting, the line style setting, the SN column style setting and the data column style setting.

You are allowed to set list font, display rows of list and scrolling animations in the Global Settings.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/6449b5918c93f988705b25bf88295478.png)


The outline border and the header are optional, which can be controlled via the display frame. You are allowed to modify the line color and width of the outline border as well as the header font.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/399570c612d154bcdc89cf3736be9158.png)


The line configuration is mainly used for configuring the background color and the cutting line of each line.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/58874c01eb7a0565dace5db51126472f.png)


Configurations of the SN line and the data column are basically the same, both of which comprise setting of column width and font.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/5e8bdb72d74e3c330273cc01c9ca5c79.png)


You need to upload data in form of list. The order set forth in the list is the data upload order.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/45bbed7260816cf12128657e1ac01b4c.png)


##### 3.5 Date-Heat Map

The date-heat map is a heat map drawn in the rectangular coordinate system, wherein the data of the X/Y axis can be any entries.

The style setting of heat map covers the Global Settings and the X/Y axis and Data Area Setting. The configuration items for the Global Settings and the X/Y axis are as the same as those of the basic chart. You need to map the indicator value and the component color in the data area setting.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/64e68dee5c97efd74f14cbc780995aeb.png)


For the data configuration of the heat map, you need to provide (X,Y,VALUE) for each data block, among which the X axis and Y axis
refer to positions of business data in the rectangular coordinate system, and Value refers to the thermodynamic value of business data.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/b80eb123dd37b606b8f4e1c66dd7b707.png)

