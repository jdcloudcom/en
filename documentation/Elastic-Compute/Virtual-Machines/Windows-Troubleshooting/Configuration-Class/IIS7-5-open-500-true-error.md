# Enable 500 True Error by IIS7.5
Windows VMs use IIS as the website of Web service, and "500 - Internal Server Error" appears as shown below during the visit. This error reporting does not output a specific error item, which brings some difficulties to the troubleshooting. The following method can be used to display the actual error reporting of the program, so that the website error can be analyzed in a targeted manner.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/iis7.5%E5%BC%80%E5%90%AF500%E7%9C%9F%E5%AE%9E%E6%8A%A5%E9%94%9901.png)

**Specific steps are as follows:**

1. Remotely connect the Virtual Machines; and in the menu bar, select **Start** > **Management Tool** > **Internet Information Service (IIS) Manager**.

2. Click Website in the left navigation pane, find the error reporting website, find and open the Error Page file, as shown below.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/iis7.5%E5%BC%80%E5%90%AF500%E7%9C%9F%E5%AE%9E%E6%8A%A5%E9%94%9902.png)

3. In the operation bar on the right, click Edit Function Settings.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/iis7.5%E5%BC%80%E5%90%AF500%E7%9C%9F%E5%AE%9E%E6%8A%A5%E9%94%9903.png)

4. In the Edit Error Page Settings window that pops up, select Detailed Error and click **OK**.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/iis7.5%E5%BC%80%E5%90%AF500%E7%9C%9F%E5%AE%9E%E6%8A%A5%E9%94%9904.png)

If your problem still can not solved, please submit open ticket to us.
