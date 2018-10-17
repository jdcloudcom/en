## Monitoring Graph Management
### Graph Configuration Item Description
#### Graph Type
Currently, the Dashboard supports two display types, i.e. a line graph and a TopN form.

**Line Graph:** Meets most of the user's monitoring needs. Display in time sequence. For example, the CPU usage of all VM instances under a certain label changes from 13:00 to 15:00 on the same day. A line chart can add multiple monitoring items.

**TopN form:** Real-time display of Monitoring Item data values from large to small. For example, the CPU usage of all VM instances under a label is sorted from large to small. Only one Monitoring Item can be added to the TopN form.

#### View Dimension
The data presentation dimensions currently supported by the dashboard include Detail and Summary.

**Detail:** A Monitoring Metric for a Cloud Resource is a data line. Display multiple Cloud Resources and all corresponding Monitoring Metrics in the same chart. The number of data lines in the chart is equal to the number of cloud resources being monitored multiplied by the number of monitoring Metrics.

**Summary:** The same Monitoring Items for multiple Cloud Resources are aggregated into one data line. Display summary data for multiple Monitoring Metrics in the same graph. The number of data lines in the icon is equal to the number of monitored Metrics monitored. The aggregation methods include: maximum, minimum and average

#### Advanced Configuration
After setting the advanced configuration, all the resources in the selected dimension, including the monitoring data of the newly added resources, will be displayed directly in the graph without manual addition.
Currently, the advanced configuration only has labels. The label only supports "VM", "Cloud Disk Service" and "JCS for SQL Server". If the product type is selected as other resources, there is no advanced configuration option.

### Add Monitoring Graph
1. Go to the Dashboard details page and click **Add Graph** in the top right corner.
![](https://github.com/jdcloudcom/cn/blob/edit/image/Cloud-Monitor/dashboard/%E6%B7%BB%E5%8A%A0%E5%9B%BE%E8%A1%A8.png)

2. Select graph type, product type, view dimension, monitoring item (support to add multiple monitoring items), graph name, select monitoring resources, click **OK** to complete the creation of monitoring graph.
![](https://github.com/jdcloudcom/cn/blob/edit/image/Cloud-Monitor/zuijiashijian/%E6%9C%80%E4%BD%B3%E5%AE%9E%E8%B7%B51.2.png)

### Delete Monitoring Chart
1. Click on "Delete" in the chart.
![](https://github.com/jdcloudcom/cn/blob/edit/image/Cloud-Monitor/dashboard/%E5%88%A0%E9%99%A4%E7%9B%91%E6%8E%A7%E5%9B%BE%E8%A1%A8.png)

2. The pop-up box prompts whether to delete the monitoring chart, click “OK”, delete the monitoring chart to complete.
![](https://github.com/jdcloudcom/cn/blob/edit/image/Cloud-Monitor/dashboard/%E5%88%A0%E9%99%A4%E7%9B%91%E6%8E%A7%E5%9B%BE%E8%A1%A8-%E7%A1%AE%E8%AE%A4.png)

### Copy Monitoring Graph
You can quickly open the Add Monitor page by clicking **Copy** option in the graph. Copy the open monitoring graph page and the monitoring graph of the original monitoring graph configuration and monitoring resources, you can adjust the graph configuration and monitoring resources, click **OK** to generate a new monitoring graph.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Cloud-Monitor/dashboard/%E5%A4%8D%E5%88%B6%E7%9B%91%E6%8E%A7%E5%9B%BE%E8%A1%A8.png)

### Time Filter
1. Click the time icon in the chart.
![](https://github.com/jdcloudcom/cn/blob/edit/image/Cloud-Monitor/dashboard/%E6%97%B6%E9%97%B4%E7%AD%9B%E9%80%89.png)

2. Select the time range you want to view, and you can also customize the time range you want to view.
![](https://github.com/jdcloudcom/cn/blob/edit/image/Cloud-Monitor/dashboard/%E6%97%B6%E9%97%B4%E7%AD%9B%E9%80%892.png)


### Export Data
1. Click the “Export” Data option in the thumbnail or click the “Export” icon in the enlarged view.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Cloud-Monitor/dashboard/%E5%AF%BC%E5%87%BA%E6%95%B0%E6%8D%AE.png)

2. If the graph type is a line chart, the exported data can be selected from the time period selected by the chart or the time point currently viewed. If the icon type is TopN graph, the time period set by the monitoring graph is directly exported.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Cloud-Monitor/dashboard/%E5%AF%BC%E5%87%BA%E6%95%B0%E6%8D%AE2.png)
