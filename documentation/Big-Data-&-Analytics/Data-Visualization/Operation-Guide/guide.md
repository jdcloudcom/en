
1. Log in to JD Cloud Console to select Data Visualization products

After entering the Data Visualization Products from the console, the user can view the Data Visualizations that have been released or are currently being developed. On the current page, the user can create, preview, release (cancel release) and edit the Data Visualization online, including copy, delete, and rename. 
 
2. Create Data Visualization

2.1 Select the template for Data Visualization

The users select Create New Visualization to enter the template selection process, and the left side of the screen lists the templates available for the user to choose. The main display area on the right side is a snapshot of the template.
 
2.2 Edit the layers of Data Visualization online

The editing page of the Data Visualization consists of four areas: the upside is the toolbar, the left side is the layer menu bar, the right side is the style and data binding menu bar, and the middle is the Data Visualization page.

2.2.1 Canvas Editing

The canvas is the main display area of the Data Visualization components. After clicking on the blank area of the canvas, the canvas menu bar will be displayed on the right side. The resolutions of different Data Visualizations can be adapted by adjusting the canvas size and zooming.
Screen Size: Set the screen resolution, 1920 × 1080 by default
Background Image: The user may upload image to set the background image of Data Visualization
Zooming Mode: Zoom the non-standard screens proportionally.
Project Cover: The captured cover will be in the Thumbnail in Application Management.

2.2.2 Layer Editing

The Data Visualization layer controls the coverage effect of the chart display, and the top-layer chart will cover the bottom-layer chart. When the user selects multiple charts in the layer area, the layout model selection will appear on the right side. The user can perform multiple alignment operations such as upward, downward, leftward and rightward.
 

2.2.3 Select Graphic Components

The toolbar consists of two areas: The component library on the left side and the Data Visualization generation area on the right side.
The component library area is located at the most top of the editor page. You can enrich the Data Visualization content through the functions provided by the toolbar, and you can preview or release the created Data Visualization.
At present, the Data Visualization provides the chart library, map library, text indicator library and auxiliary graphics library. You can select any chart from the component library and drag and drop it to the canvas area.
 
2.2.3.1 Chart Style Editing:

The chart styles include: global styles, X/Y axes (the polar coordinate system includes the polar axis and angle axis), legends, chart positions, specific chart style settings and data series design.

* Global styles mainly include fonts, margins and animation effects settings.
 
* X/Y axes mainly include grids, axes, scale values and coordinate font style settings
 
* The legends mainly include the legend locations, font styles and chart settings.
 
* The data series include the data series names, the broken line thickness, the dot radius, the shown area colors, and whether the labels are shown. Click **Add Icon** to create a new data series
  
You can also make more detailed settings for complex icons.
For example, the indicator proportion chart:
  

2.2.3.2 Chart Data Binding:

The data setup consists of 3 parts: Data field mapping, data source selection and data refresh frequency. Wherein, the data field is related to the chart style you select.
  
Data field mapping: Take the line chart as an example, the fields to be mapped includes the X coordinate Y coordinate and the data series (each series displays an area chart)

Data source selection; you can access static data, RDS-MySQL, and JD Cloud Data Compute. When selecting Mysql or Computing Service, you need to enter the SQL sentence and preview the data via ‘View Data’.
 

2.2.4 Release and Preview of Data Visualization

The Data Visualization generation area is located on the right side of the editing page, including the save, preview, and release functions of the Data Visualization.
* Save: Save your settings for the Data Visualization.
* Preview: You can view your maintained Data Visualization in full screen. In the preview case, you can check the data bound by you. If the data source is real-time data, you will also see real-time data display effect.
Previewed Data Visualization is as follows:
* Release Data Visualization
You can release the Data Visualization through password-based access and public access to the Data Visualization.
In the password-based case:

3. Data Source Management

When users use the Data Visualization products, they first need to add data to be analyzed to the Data Visualization.

3.1 Create Data Source Connection
 
a. After entering the data source channel, click **Add** in the upper left corner of the left data source page.
 
b. Select the type of data source you want to add in the pop-up dialog box. Currently two types, RDS and data warehouse, are supported.
 
c. After adding successfully, the database will appear in the data source list, at which point you can use all the datasheets in the database.

3.2 Edit Data Source:

In the list of data sources, click **Delete and Edit the Data Source**.
  
