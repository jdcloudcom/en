# Forward Audio Files to Local Computer for Play in Windows System
**Problem Phenomenon:**

If a red cross is shown on the sound in the lower right corner after the windows system is remotely connected, the remote sound cannot be played;

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9F%E9%9F%B3%E9%A2%91%E6%96%87%E4%BB%B6%E8%BD%AC%E6%9C%AC%E5%9C%B0%E7%94%B5%E8%84%91%E6%92%AD%E6%94%BE01.png)

**Solution:**

The remote sound can be played on the local computer by setting the local computer remote desktop tool.
Please adjust the following settings in the Virtual Machines first;

**windows 2008 System:**

1. After remote connection, click Start - Management Tool - Remote Desktop Services - Remote Desktop Session Host;

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9F%E9%9F%B3%E9%A2%91%E6%96%87%E4%BB%B6%E8%BD%AC%E6%9C%AC%E5%9C%B0%E7%94%B5%E8%84%91%E6%92%AD%E6%94%BE02.png)

2. Double click rdp-tcp, select Client Settings, and uncheck the audio and video play;

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9F%E9%9F%B3%E9%A2%91%E6%96%87%E4%BB%B6%E8%BD%AC%E6%9C%AC%E5%9C%B0%E7%94%B5%E8%84%91%E6%92%AD%E6%94%BE03.png)

3. Click Start - Run - enter *services.msc*, find the "Windows Audio" service, set this service as automatic, and start it, and then close the remote connection;

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9F%E9%9F%B3%E9%A2%91%E6%96%87%E4%BB%B6%E8%BD%AC%E6%9C%AC%E5%9C%B0%E7%94%B5%E8%84%91%E6%92%AD%E6%94%BE04.png)


**windows 2012 System:**

1. Open windows powershell and enter *gpedit.msc* to open the group policy;

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9F%E9%9F%B3%E9%A2%91%E6%96%87%E4%BB%B6%E8%BD%AC%E6%9C%AC%E5%9C%B0%E7%94%B5%E8%84%91%E6%92%AD%E6%94%BE05.png)

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9F%E9%9F%B3%E9%A2%91%E6%96%87%E4%BB%B6%E8%BD%AC%E6%9C%AC%E5%9C%B0%E7%94%B5%E8%84%91%E6%92%AD%E6%94%BE06.png)

2. Successively click "Computer Configuration" - "Administrative Templates" - "windows Components" - "Remote Desktop Services" - "Remote Desktop Session Host" - "Device and Resource Redirection" to go to "Allow Audio and Video Play Redirection" and select "Enabled";

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9F%E9%9F%B3%E9%A2%91%E6%96%87%E4%BB%B6%E8%BD%AC%E6%9C%AC%E5%9C%B0%E7%94%B5%E8%84%91%E6%92%AD%E6%94%BE07.png)

3. Continue to enter *services.msc* in windows powershell to open the service, find the "Windows Audio" service, set this service as automatic, and start it, and then close the remote connection.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9F%E9%9F%B3%E9%A2%91%E6%96%87%E4%BB%B6%E8%BD%AC%E6%9C%AC%E5%9C%B0%E7%94%B5%E8%84%91%E6%92%AD%E6%94%BE08.png)

After the above configuration is adjusted, open the local remote desktop software for configuration.

**Windows xp System of Local Computer:**

Open the local remote desktop software, click on Options - Local Resources, select the pull-down menu of the remote computer sound, and select Bring to This Computer.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9F%E9%9F%B3%E9%A2%91%E6%96%87%E4%BB%B6%E8%BD%AC%E6%9C%AC%E5%9C%B0%E7%94%B5%E8%84%91%E6%92%AD%E6%94%BE09.png)

**Local Computer Windows 7 System:**

Open the local remote desktop software, click **Options** - **Local Resources**, click **Settings** at the remote sound, select **Play in This Computer** at the remote audio play area of the pop-up tab and click **OK**;

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9F%E9%9F%B3%E9%A2%91%E6%96%87%E4%BB%B6%E8%BD%AC%E6%9C%AC%E5%9C%B0%E7%94%B5%E8%84%91%E6%92%AD%E6%94%BE10.png)

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9F%E9%9F%B3%E9%A2%91%E6%96%87%E4%BB%B6%E8%BD%AC%E6%9C%AC%E5%9C%B0%E7%94%B5%E8%84%91%E6%92%AD%E6%94%BE11.png)

Connect it again, and you will see that the sound in the lower right corner is normal.Then, remotely open the audio file, and you can normally hear the sound locally;

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9F%E9%9F%B3%E9%A2%91%E6%96%87%E4%BB%B6%E8%BD%AC%E6%9C%AC%E5%9C%B0%E7%94%B5%E8%84%91%E6%92%AD%E6%94%BE12.png)

If your problem still can not solved, please submit open ticket to us.
