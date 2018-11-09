# Method to View and Modify Remote Desktop Port of Windows System
**How to view the port of Windows Remote Desktop:**

1. View by command, i.e. click **Start** - **Run** - enter **cmd**, Confirm and then open the command window and execute the following command:

***tasklist /svc | find "Ter"***

You can see that the process ID of the TermService is 1764.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9F%E8%BF%9C%E7%A8%8B%E6%A1%8C%E9%9D%A2%E7%AB%AF%E5%8F%A3%E6%9F%A5%E7%9C%8B%E5%92%8C%E4%BF%AE%E6%94%B9%E6%96%B9%E6%B3%9501.png)

Then execute the following command:

***netstat -ano | find "1764"***

You can see the port used by the service, as shown in the figure below, is 3389

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9F%E8%BF%9C%E7%A8%8B%E6%A1%8C%E9%9D%A2%E7%AB%AF%E5%8F%A3%E6%9F%A5%E7%9C%8B%E5%92%8C%E4%BF%AE%E6%94%B9%E6%96%B9%E6%B3%9502.png)

2. Open the registry view and enter *regedit* in the Run to open the Registry Editor.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9F%E8%BF%9C%E7%A8%8B%E6%A1%8C%E9%9D%A2%E7%AB%AF%E5%8F%A3%E6%9F%A5%E7%9C%8B%E5%92%8C%E4%BF%AE%E6%94%B9%E6%96%B9%E6%B3%9503.png)

Check the value of the HKEY_LOCAL_MACHINE\SYSTEM\CurrentControlSet\Control\Terminal Server\Wds\rdpwd\Tds\tcp  PortNumber subkey as shown in the following figure:

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9F%E8%BF%9C%E7%A8%8B%E6%A1%8C%E9%9D%A2%E7%AB%AF%E5%8F%A3%E6%9F%A5%E7%9C%8B%E5%92%8C%E4%BF%AE%E6%94%B9%E6%96%B9%E6%B3%9504.png)

You also need to check the value of portnumber under HKEY_LOCAL_MACHINE\SYSTEM\CurrentControlSet\Control\Terminal Server\WinStations\RDP-Tcp. The two values normally ​​are the same, namely, the port number of the remote service.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9F%E8%BF%9C%E7%A8%8B%E6%A1%8C%E9%9D%A2%E7%AB%AF%E5%8F%A3%E6%9F%A5%E7%9C%8B%E5%92%8C%E4%BF%AE%E6%94%B9%E6%96%B9%E6%B3%9505.png)

**How ​​to modify the port of Windows Remote Desktop:**

1. **Start** - **Run** and enter *regedit* to open the Registry Editor.

2. Unfold the registry keys of "HKEY_LOCAL_MACHINE\SYSTEM\CurrentControlSet\Control\TerminalServer\Wds\rdpwd\Tds\tcp" successively. The port number corresponding to the PortNumber key value underneath is the remote desktop port, and it can be modified to the port required by the user, as shown in the following figure:

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9F%E8%BF%9C%E7%A8%8B%E6%A1%8C%E9%9D%A2%E7%AB%AF%E5%8F%A3%E6%9F%A5%E7%9C%8B%E5%92%8C%E4%BF%AE%E6%94%B9%E6%96%B9%E6%B3%9506.png)

3. Then unfold the registry keys of "HKEY_LOCAL_MACHINE\SYSTEM\CurrentControlSet\Control\TerminalServer\WinStations\RDP-Tcp" successively in the registry. Change the PortNumber key value and save it according to the method above, as shown below:

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9F%E8%BF%9C%E7%A8%8B%E6%A1%8C%E9%9D%A2%E7%AB%AF%E5%8F%A3%E6%9F%A5%E7%9C%8B%E5%92%8C%E4%BF%AE%E6%94%B9%E6%96%B9%E6%B3%9507.png)

Note: After the modification, you need to check whether there are limits for security rules in the firewall and tcp/ip filtering, and you need to restart the server to make the modification take effect.

If your problem still can not solved, please submit open ticket to us.
