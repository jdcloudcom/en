# Windows Remote Desktop Credential Not Work
**Problem Phenomenon:**

'"Credentials Not Work" prompts in the interface during the remote desktop connection to Windows VM, as shown in the figure below. However, the remote connection can be logged normally via vnc function of VM console. As shown in the figure:

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E8%BF%9C%E7%A8%8B%E6%8A%A5%E5%87%AD%E6%8D%AE%E6%97%A0%E6%B3%95%E5%B7%A5%E4%BD%9C01.png)

**Problem Causes:**

It is usually caused by the enabled **Password Protected Sharing** in the system.



**Solution:**

Users can open **Control Panel** → **All Control Panel Items** → **Network and Sharing Center** → **Advanced Sharing Settings** in sequence, and then select **Close Password Protect Sharing** under **Password Protected Sharing**, as shown below:

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E8%BF%9C%E7%A8%8B%E6%8A%A5%E5%87%AD%E6%8D%AE%E6%97%A0%E6%B3%95%E5%B7%A5%E4%BD%9C02.png)

If your problem still can not solved, please submit open ticket to us.
