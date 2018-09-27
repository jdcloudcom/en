## Manage Monitoring Chart
### Chart Configuration Item Description
#### Chart Type
Currently, the Dashboard supports two display types, i.e. a line graph and a TopN form.

**Line Graph:** Meets most of the user's monitoring needs. Display in time sequence. For example, the CPU usage of all VM instances under a certain label changes from 13:00 to 15:00 on the same day. A line chart can add multiple monitoring items.

**TopN form:**  Real-time display of Monitoring Item data values from large to small. For example, the CPU usage of all VM instances under a label is sorted from large to small. Only one Monitoring Metric can be added to the TopN form.

#### View Dimension
The data presentation dimensions currently supported by the dashboard include Detail and Summary.

**Detail:** A Monitoring Metric for a Cloud Resource is a data line. Display multiple Cloud Resources and all corresponding Monitoring Metrics in the same chart. The number of data lines in the chart is equal to the number of cloud resources being monitored multiplied by the number of monitoring Metrics.

**Summary:** The same Monitoring Items for multiple Cloud Resources are aggregated into one data line. Display summary data for multiple Monitoring Metrics in the same graph. The number of data lines in the icon is equal to the number of monitored Metrics monitored. The aggregation methods include: maximum, minimum and average

#### Advanced Configuration
After setting the advanced configuration, all the resources in the selected dimension, including the monitoring data of the newly added resources, will be displayed directly in the chart without manual addition.
Currently, the advanced configuration only has labels. The label only supports "VM", "Cloud Disk Service" and "Cloud Database-SQLSERVER". If the product type is selected as other resources, there is no advanced configuration option.

### Add Monitoring Chart
1. Go to the Dashboard details page and click on "Add View" in the top right corner.

<img src="" width="600" align=center />

2. Select chart type, product type, view dimension, monitoring metric (support to add multiple monitoring metrics), chart name, select monitoring resources, click “OK” button to complete the creation of monitoring chart.

<img src="https://raw.githubusercontent.com/jdcloudcom/en/Monitoring/image/Cloud-Monitor/Introduction/Operation-Guide/dashboard/Best-Practices-02.png" width="600" align=center />

## Delete Monitoring Chart
1. Click on "Delete" in the chart.

<img src="" width="600" align=center />

2. The pop-up box prompts whether to delete the monitoring chart, click “OK”, delete the monitoring chart to complete.

<img src="" width="600" align=center />

## Copy Monitoring Chart
You can quickly open the Add Monitor page by clicking the “Copy” option in the chart. Copy the open monitoring chart page and the monitoring chart of the original monitoring chart configuration and monitoring resources, you can adjust the chart configuration and monitoring resources, click OK to generate a new monitoring chart.

<img src="" width="600" align=center />

### Time Filter
1. Click the time icon in the chart.

<img src="" width="600" align=center />

2. Select the time range you want to view, and you can also customize the time range you want to view.

<img src="" width="600" align=center />


### Export Data
1. Click the“Export” Data option in the thumbnail or click the “Export” icon in the enlarged view.

<img src="" width="600" align=center />

2. If the graph type is a line chart, the exported data can be selected from the time period selected by the chart or the time point currently viewed. If the icon type is TopN graph, the time period set by the monitoring graph is directly exported.

<img src="" width="600" align=center />
