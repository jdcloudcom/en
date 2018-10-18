# Enable virtual MFA equipment
## Associate virtual MFA equipment to the primary account
The primary account associates virtual MFA equipment to itself as follows:

Select Account Management > Virtual MFA Equipment > Enable, and the MFA enabled page will pop up after SMS verification.
![]( https://github.com/jdcloudcom/cn/blob/edit/image/IAM/Virtual%20MFA%20device/%E4%B8%BA%E4%B8%BB%E8%B4%A6%E5%8F%B7%E7%BB%91%E5%AE%9A%E8%99%9A%E6%8B%9FMFA%E8%AE%BE%E5%A4%87.png)


## The primary account associates virtual MFA equipment to the subaccount
The primary account associates virtual MFA equipment to the IAM subaccount as follows:

Log in the JD Cloud Console and select Management > Identity and Access Management > User Management > User Details > Security Credential, then the MFA enabled page will pop up.
![](https://github.com/jdcloudcom/cn/blob/edit/image/IAM/Virtual%20MFA%20device/%E4%B8%BB%E8%B4%A6%E5%8F%B7%E4%B8%BA%E5%AD%90%E8%B4%A6%E5%8F%B7%E7%BB%91%E5%AE%9A%E8%99%9A%E6%8B%9FMFA%E8%AE%BE%E5%A4%87.png)

The subaccount associates to virtual MFA equipment by itself
There are two entries for the subaccount to associate to virtual MFA equipment by itself, as follows:

 - After logging in the subaccount, enter the overview page, click the Virtual MFA Equipment, then the MFA enabled page will pop up
 - After logging in the subaccount, enter the Account Management, click the Virtual MFA Equipment, then the MFA enabled page will pop up
![](https://github.com/jdcloudcom/cn/blob/edit/image/IAM/Virtual%20MFA%20device/%E5%AD%90%E8%B4%A6%E5%8F%B7%E8%87%AA%E8%A1%8C%E7%BB%91%E5%AE%9A%E8%99%9A%E6%8B%9FMFA%E8%AE%BE%E5%A4%87.png)

## Virtual MFA equipment enablement process:
Step 1: Open the virtual MFA application. For the convenience of users, we provide JD Cloud Assistant based on the WeChat applet version. In addition, we also support the Google Authenticator of IOS version and the Google Authenticator of Android version. Please refer to the Guidance for Third-party Application Installation and Usage for specific instructions.

We recommend you to use the WeChat applet JD Cloud Assistant. Please open WeChat - “Scan” to scan the QR code in the picture.

![](https://github.com/jdcloudcom/cn/blob/edit/image/IAM/Virtual%20MFA%20device/%E8%99%9A%E6%8B%9FMFA%E8%AE%BE%E5%A4%87%E5%90%AF%E7%94%A8%E6%B5%81%E7%A8%8B.png)

Step 2: You can add an account, open the WeChat applet JD Cloud Assistant, and scan the QR code in the picture; or you can click the Manual Input to manually add the account and key. After successful associating, JD Cloud Assistant will refresh a set of dynamic verification code every 30 seconds. Click OK after entering two consecutive sets of verification codes to complete the virtual MFA equipment associating.
![](https://github.com/jdcloudcom/cn/blob/edit/image/IAM/Virtual%20MFA%20device/%E8%99%9A%E6%8B%9FMFA%E8%AE%BE%E5%A4%87%E5%90%AF%E7%94%A8%E6%B5%81%E7%A8%8B2.png)

Step 3: After the associating is completed, the two sets of dynamic verification codes are successfully associated. The next time you log in the console, you will need to verify the dynamic code of the MFA equipment associated to the account. At the same time, we recommend that you continue to improve the security of the account by enabling sensitive operation verification. 
![](https://github.com/jdcloudcom/cn/blob/edit/image/IAM/Virtual%20MFA%20device/%E8%99%9A%E6%8B%9FMFA%E8%AE%BE%E5%A4%87%E5%90%AF%E7%94%A8%E6%B5%81%E7%A8%8B3.png)


# Disable virtual MFA equipment
You can choose to disable MFA verification protection when you no longer use it. After passing the safety operation verification, directly click Disable at the open entrance to enable it. It should be noted that disabling MFA will result in the dynamic verification code of the equipment associated to the account being unavailable. If you restart it, please associate new equipment and inform the person sharing the account. If you need to replace the MFA token, associate the new MFA after disassociating the old MFA.

![](https://github.com/jdcloudcom/cn/blob/edit/image/IAM/Virtual%20MFA%20device/%E7%A6%81%E7%94%A8%E8%99%9A%E6%8B%9FMFA%E8%AE%BE%E5%A4%87.png)
