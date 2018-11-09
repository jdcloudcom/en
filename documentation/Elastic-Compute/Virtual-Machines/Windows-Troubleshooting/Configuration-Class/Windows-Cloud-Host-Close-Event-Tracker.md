# Closed Event Tracker of Windows VM
An event tracer prompt box will pop up when you log in the Windows system Virtual Machines again after abnormal restart. Closed Event Tracker means that a "Closed Event Tracker" dialog box is displayed when the system is started again after abnormal shutdown to ask the user the causes for abnormal shutdown.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E4%BA%91%E4%B8%BB%E6%9C%BA%E5%85%B3%E9%97%AD%E4%BA%8B%E4%BB%B6%E8%B7%9F%E8%B8%AA%E7%A8%8B%E5%BA%8F01.png)

If you don't want to track such events, you can turn off the event tracker.

Step 1, open the "Group Policy Editor" window (Run ---gpedit.msc*), and successively unfold **Computer Configuration** → **Administrative Templates** directory in the left pane. Then select the **System** option and double-click the policy option **Show Closed Event Tracker** in the right pane.

Step 2, select the **Disabled** radio button in the opened dialog box **Show Attribute of Closed Event Tracker**, and click **OK** to make the settings take effect.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E4%BA%91%E4%B8%BB%E6%9C%BA%E5%85%B3%E9%97%AD%E4%BA%8B%E4%BB%B6%E8%B7%9F%E8%B8%AA%E7%A8%8B%E5%BA%8F02.png)

