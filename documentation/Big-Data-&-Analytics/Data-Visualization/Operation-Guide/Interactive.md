#### 6. Interaction Component Configuration

The Data Visualization supports tab interaction and map drill-down interaction. In which, please refer to the foregoing paragraphs for the map drill-down function.

Current, the style settings supported by the system include: default (no event triggered) style, mouse suspension style and mouse selection style. You need to set the tab color and background color for each mouse state.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/20dc29e9197ca283bbd154eff9502660.png)



You need to create one piece of data for each tab. See the figure below.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/5686ffb8b1ee8d7032eab2f15aa0771c.png)



The TAB acts as a controller of interaction; after the mouse events are captured by the tab, you need to first create a variable to pass the value of the TAB to other components.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/5686ffb8b1ee8d7032eab2f15aa0771c.png)



In the Data Visualization shown below, the TAB is used to switch the map data layer.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/85e3780f977367476abf68c735522bd5.png)



The association of ripple layer data is as follows:

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/c8dd4400d56aacddd50dfd5a958c1aa2.png)



The association of point thermal layer data is as follows:

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/8af3db9b22072f4a4e4057109266a29b.png)



The figure below shows the effect of TAB switching map data layer.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/01b4f7cc706ef95c4003802addcbf61b.png)
