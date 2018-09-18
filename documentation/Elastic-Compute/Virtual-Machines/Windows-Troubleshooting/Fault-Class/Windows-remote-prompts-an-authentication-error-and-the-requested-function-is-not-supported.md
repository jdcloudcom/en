# Windows Remote Authentication Error and Requested Function Not Supported
**Problem Phenomenon:**

Remote Desktop Connection Display: Authentication error, and the function required not supported. As shown in the figure:

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E8%BF%9C%E7%A8%8B%E6%8F%90%E7%A4%BA%E5%87%BA%E7%8E%B0%E8%BA%AB%E4%BB%BD%E9%AA%8C%E8%AF%81%E9%94%99%E8%AF%AF%EF%BC%8C%E8%A6%81%E6%B1%82%E7%9A%84%E5%87%BD%E6%95%B0%E4%B8%8D%E5%8F%97%E6%94%AF%E6%8C%8101.png)

**Problem Causes:**

On May 8, 2018, Microsoft released an updated patch that changed the default settings of Windows from "vulnerable" to "alleviated". This updating patch requires that both the server and client are updated to achieve the remote connection. When the VM does not update the patch, but the user client did, the server may be unable to be connected remotely.



**Solution:**

1. Users input *gpedit.msc* in the **Run** and enter **Local Group Policy Editor** on the client.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E8%BF%9C%E7%A8%8B%E6%8F%90%E7%A4%BA%E5%87%BA%E7%8E%B0%E8%BA%AB%E4%BB%BD%E9%AA%8C%E8%AF%81%E9%94%99%E8%AF%AF%EF%BC%8C%E8%A6%81%E6%B1%82%E7%9A%84%E5%87%BD%E6%95%B0%E4%B8%8D%E5%8F%97%E6%94%AF%E6%8C%8102.png)

2. Select **Computer Configuration** > **Administrative Templates** > **System** > **Credential Assignment** > **Encryption Oracle Remediation**.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E8%BF%9C%E7%A8%8B%E6%8F%90%E7%A4%BA%E5%87%BA%E7%8E%B0%E8%BA%AB%E4%BB%BD%E9%AA%8C%E8%AF%81%E9%94%99%E8%AF%AF%EF%BC%8C%E8%A6%81%E6%B1%82%E7%9A%84%E5%87%BD%E6%95%B0%E4%B8%8D%E5%8F%97%E6%94%AF%E6%8C%8103.png)

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E8%BF%9C%E7%A8%8B%E6%8F%90%E7%A4%BA%E5%87%BA%E7%8E%B0%E8%BA%AB%E4%BB%BD%E9%AA%8C%E8%AF%81%E9%94%99%E8%AF%AF%EF%BC%8C%E8%A6%81%E6%B1%82%E7%9A%84%E5%87%BD%E6%95%B0%E4%B8%8D%E5%8F%97%E6%94%AF%E6%8C%8104.png)

3. Select **Enable** and then **Vulnerability**.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E8%BF%9C%E7%A8%8B%E6%8F%90%E7%A4%BA%E5%87%BA%E7%8E%B0%E8%BA%AB%E4%BB%BD%E9%AA%8C%E8%AF%81%E9%94%99%E8%AF%AF%EF%BC%8C%E8%A6%81%E6%B1%82%E7%9A%84%E5%87%BD%E6%95%B0%E4%B8%8D%E5%8F%97%E6%94%AF%E6%8C%8105.png)

This issue also applies to the case where the password is re-entered (entering the password twice) after the remote logging to the VM: change the status of the Encryption Oracle Remediation from unconfigured to enabled, and set the protection level as vulnerable.



If your problem still can not solved, please submit open ticket to us.
