# Windows File Attribute without Security Tab
**Problem Phenomenon:**

Security tab cannot be found when users right-click on the file or folder attribute, making it impossible to modify the authorization of the file or folder, as shown in the figure below:

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E6%96%87%E4%BB%B6%E5%B1%9E%E6%80%A7%E6%B2%A1%E6%9C%89%E5%AE%89%E5%85%A8%E9%80%89%E9%A1%B9%E5%8D%A101.png)

**Solution:**

1. Click **Start** - **Run** and enter *gpedit.msc* to open **Group Policy**.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E6%96%87%E4%BB%B6%E5%B1%9E%E6%80%A7%E6%B2%A1%E6%9C%89%E5%AE%89%E5%85%A8%E9%80%89%E9%A1%B9%E5%8D%A102.png)

2. Click **User Configuration** - **Manage Templates** - **Windows Components** - **Windows Explorer** and find **Delete Security Tab** on the right.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E6%96%87%E4%BB%B6%E5%B1%9E%E6%80%A7%E6%B2%A1%E6%9C%89%E5%AE%89%E5%85%A8%E9%80%89%E9%A1%B9%E5%8D%A103.png)

3. Double-click to open **Delete Security Tab**, change it to **Not Configured**, and click **OK**. Then right click the file othe folder, and  the **Security Tab** can be found.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E6%96%87%E4%BB%B6%E5%B1%9E%E6%80%A7%E6%B2%A1%E6%9C%89%E5%AE%89%E5%85%A8%E9%80%89%E9%A1%B9%E5%8D%A104.png)

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E6%96%87%E4%BB%B6%E5%B1%9E%E6%80%A7%E6%B2%A1%E6%9C%89%E5%AE%89%E5%85%A8%E9%80%89%E9%A1%B9%E5%8D%A105.png)

If your problem still can not solved, please submit open ticket to us.
