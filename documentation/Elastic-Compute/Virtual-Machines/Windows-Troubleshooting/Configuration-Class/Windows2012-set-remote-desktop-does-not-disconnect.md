# Windows 2012 Remote Desktop Set  as Not Disconnected

Select **Start** in the lower left corner

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%E8%AE%BE%E7%BD%AE%E8%BF%9C%E7%A8%8B%E6%A1%8C%E9%9D%A2%E4%B8%8D%E6%96%AD%E5%BC%8001.png)

Select **Run**.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%E8%AE%BE%E7%BD%AE%E8%BF%9C%E7%A8%8B%E6%A1%8C%E9%9D%A2%E4%B8%8D%E6%96%AD%E5%BC%8002.png)

Enter *gpedit.msc*

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%E8%AE%BE%E7%BD%AE%E8%BF%9C%E7%A8%8B%E6%A1%8C%E9%9D%A2%E4%B8%8D%E6%96%AD%E5%BC%8003.png)

Select Computer Configuration -- Administrative Templates -- Windows Components -- Remote Desktop Services -- Remote Desktop Session Host -- Session Time Limit.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%E8%AE%BE%E7%BD%AE%E8%BF%9C%E7%A8%8B%E6%A1%8C%E9%9D%A2%E4%B8%8D%E6%96%AD%E5%BC%8004.png)

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%E8%AE%BE%E7%BD%AE%E8%BF%9C%E7%A8%8B%E6%A1%8C%E9%9D%A2%E4%B8%8D%E6%96%AD%E5%BC%8005.png)

Disabled in the five options on the right and select [Apply].

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%E8%AE%BE%E7%BD%AE%E8%BF%9C%E7%A8%8B%E6%A1%8C%E9%9D%A2%E4%B8%8D%E6%96%AD%E5%BC%8006.png)
