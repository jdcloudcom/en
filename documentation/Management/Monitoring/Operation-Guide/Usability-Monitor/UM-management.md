## Management of Availability Monitoring Tasks
### Creating Availability Monitoring
(1) Log in JD Cloud Monitoring Console and click **Management->Monitoring->Availability Monitoring** to enter the Dashboard list page. Click **Create Availability Monitoring** in the upper left corner.

(2) Enter the name of the monitoring task and select the virtual machine serving as the detection source.

(3) Detection target supports URL/IP and RDS while the detection type supports HTTP(s) and TELNET.

(4) When selecting HTTP(s), it supports the request modes of GET, POST and HEAD, and fill in the HTTP request HEAD, Cookie and submission contents corresponding to different request modes.

![](https://raw.githubusercontent.com/jdcloudcom/cn/monitoring/image/Cloud-Monitor/Usability-Monitor/UM-%E6%96%B0%E5%BB%BA.png)

### Modification of Availability Monitoring
(1) Log in JD Cloud Monitoring Console and click **Management->Monitoring->Availability Monitoring** to enter the Dashboard list page. Click **Modify** in the monitoring task operation bar in the list that you want to modify.

(2) Modifiable items include: monitor task name, detection source, and content in advanced configuration.

(3) Items not modifiable include: detection target, detection method and request method.

![](https://github.com/jdcloudcom/cn/blob/monitoring/image/Cloud-Monitor/Usability-Monitor/UM-%E4%BF%AE%E6%94%B9.png)

### Delete the monitoring task.
(1) Log in JD Cloud Monitoring Console and click **Management->Monitoring->Availability Monitoring** to enter the Dashboard list page.

(2) Select the task that is required to be deleted, click **More** in the operation, and select Delete button.

(3) When the task is deleted, the relevant alarm rules will be deleted synchronously.

![](https://raw.githubusercontent.com/jdcloudcom/cn/monitoring/image/Cloud-Monitor/Usability-Monitor/UM-%E5%88%A0%E9%99%A4.png)

### View the availability monitoring chart
(1) Log in JD Cloud Monitoring Console and click **Management->Monitoring->Availability Monitoring** to enter the Dashboard list page.

2. Select the task of which the monitoring chart is to be viewed, and click Monitoring Table button in the operation.

![](https://raw.githubusercontent.com/jdcloudcom/cn/monitoring/image/Cloud-Monitor/Usability-Monitor/UM-view.png)







