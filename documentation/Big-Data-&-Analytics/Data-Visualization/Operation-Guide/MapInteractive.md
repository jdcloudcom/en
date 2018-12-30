##### 4.3 2D/3D Border Map - Interaction Settings

Both 2D/3D border maps support drill-down. If you click the Enable button in the interaction settings, then the map in the preview/release status will implement the drill-down function. In addition, you can personalize the center point and zoom level of the map after drill-down. In the following example: The left is the Data Visualization before the map is drilled down, and the right is the Data Visualization after clicking a region.

In the 2D/3D border map drill-down incidents, you can drill down the map step by step by clicking the mouse (the minimum drill-down granularity is district and county level); if you need to return to the previous level, click on the blank area of the map region to return.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/de7fcd3bc3d64c8b12f4ee149ba20b45.png)



![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/5f9ab4d2703fe2243a55172d71aadd2f.png)


If you want other charts to be linked after the map is drilled down, then you need to set the region in the chart a variable, and associate SQL of other charts to this variable. For example, in the figure below, if you want the data of the line chart on the right side to be linked after the map is drilled down, then you need to associate the map regional variable area in the line chart SQL.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/37cb4b90956177849834ab00e8f0b24f.png)
