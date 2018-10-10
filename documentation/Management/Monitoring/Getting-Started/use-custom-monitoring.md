## Use Custom Metric Monitoring
Custom Metric Monitoring is a feature that provides the users with the freedom to define monitoring items and alarm rules. Through this function, the users can monitor the business indicators that they care about, report the collected monitoring data to the Monitoring, and process the data by the Monitoring, and then alarm according to the result.
### Report Monitoring Data
The function of Custom Metric Monitoring provides you with an interface for reporting monitoring data, so that you can report the time series data collected by yourself to the Monitoring. Currently, the method of OpenAPI is supported to report, and the original data and the aggregated statistics can be reported.
Click **How**[Report Monitoring Data](https://github.com/jdcloudcom/cn/blob/edit/documentation/Management-and-Monitoring/Cloud-Monitor/Operation-Guide/%E8%87%AA%E5%AE%9A%E4%B9%89%E7%9B%91%E6%8E%A7.md#Report Monitoring Data).
### View Monitoring Data
**View Namespace**

Enter the JD Cloud Console - Monitoring - Custom Metric Monitoring, enter the Custom Metric Monitoring main page, you can view the namespaces, monitoring objects and metrics that you have reported. As shown in the diagram below:
![](https://raw.githubusercontent.com/jdcloudcom/cn/edit/image/Cloud-Monitor/1.%E5%91%BD%E5%90%8D%E7%A9%BA%E9%97%B4.png)
**View Monitoring Resources**

Click the name of the Namespace to view the status of the resources reported to the Namespace, as shown in the following figure:
![](https://raw.githubusercontent.com/jdcloudcom/cn/edit/image/Cloud-Monitor/2.%E7%9B%91%E6%8E%A7%E5%AF%B9%E8%B1%A1%E5%88%97%E8%A1%A8.png)
**View Monitoring Graph**

Select the monitoring object to be viewed, click **Monitoring Table** in the operation column, and enter the monitoring graph detail page to view the monitoring trend graph of the monitoring object, as shown in the following figure:
![](https://raw.githubusercontent.com/jdcloudcom/cn/edit/image/Cloud-Monitor/3.%E7%9B%91%E6%8E%A7%E5%9B%BE.png)
### Delete Monitoring Data
Enter the JD Cloud Console - Monitoring- Custom Metric Monitoring, enter the Custom Metric Monitoring main page. Click the name of the Namespace, enter the monitoring resource list page, select the monitoring object to be deleted, and click **Delete** in the operation column to delete.

Note: After deleting all the monitoring objects under the Namespace, Cascading delete of the Namespace is also executed.
