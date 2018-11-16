# Windows 2012 IE Browser Disabled
**Problem Phenomenon:**

Open the IE browser and the error prompts as shown below:

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%20ie%E6%B5%8F%E8%A7%88%E5%99%A8%E6%89%93%E4%B8%8D%E5%BC%8001.png)

**Solution:**

1. Right click and select **Run**. Enter *secpol.msc* in the pop-up window.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%20ie%E6%B5%8F%E8%A7%88%E5%99%A8%E6%89%93%E4%B8%8D%E5%BC%8002.png)

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%20ie%E6%B5%8F%E8%A7%88%E5%99%A8%E6%89%93%E4%B8%8D%E5%BC%8003png)

2. Select **Security Settings** - **Local Policies** - **Security Options**, and make the corresponding settings in pages unfolded in sequence. Click to find **User Account Control: Administrator Approval Mode for Built-in Administrator Account** on right side of the **Security Option** page.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%20ie%E6%B5%8F%E8%A7%88%E5%99%A8%E6%89%93%E4%B8%8D%E5%BC%8004.png)

3. Double-click **Page Setup**, click **Enabled**, then click **OK** to save the settings for the account security strategy.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%20ie%E6%B5%8F%E8%A7%88%E5%99%A8%E6%89%93%E4%B8%8D%E5%BC%8005.png)

4. The setting takes effects when the server is rebooted.



If your problem still can not solved, please submit open ticket to us.
