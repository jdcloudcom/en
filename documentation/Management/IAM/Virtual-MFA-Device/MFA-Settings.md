# Different Accounts Enable Entry for MFA Verification

## 1. Primary Account Enables MFA Verification

Select Account Management > Virtual MFA Device > Enable, and then enter the MFA enabling page after identity verification.

![为主账号绑定虚拟MFA设备]( ../../../../image/IAM/Virtual-MFA-Device/为主账号绑定虚拟MFA设备.jpg)


## 2. Primary Account Enables MFA Verification for Sub-user

Entry for Primary Account to Enable Verification for IAM Sub-user is: Console > Identity and Access Management > User Management > User Details > Security Credential > Enable MFA;

![主账号为子用户绑定虚拟MFA设备](../../../../image/IAM/Virtual-MFA-Device/主账号为子用户绑定虚拟MFA设备.jpg)

In addition, the primary account can also ask sub-user to enable MFA verification on its own by click **MFA Verification Must be Enabled**. After such setting by the primary account, for next login, the sub-user will redirect automatically to the MFA enabling page and no other operation can be done before it enables successfully.

![主账号要求子用户绑定虚拟MFA设备](../../../../image/IAM/Virtual-MFA-Device/主账号要求子用户绑定虚拟MFA设备.jpg)

## 3. Sub-user Enables MFA Verification on Its Own

There are two entries for the sub-account to enable MFA on its own, as follows:

* After login with the sub-account, enter the overview page, click the Virtual MFA Verification
* After login with the sub-account, click **MFA Verification** on the upper right menu

![子用户自行绑定虚拟MFA设备](../../../../image/IAM/Virtual-MFA-Device/子账号自行绑定虚拟MFA设备.png)

# MFA Verification Enabling Process:

Step 1: Obtain and enter the MFA verification code

(1) Obtain MFA verification code

Please scan the page QR code by using JD Cloud APP Console "Scan" or "My - MFA Verification- Scan Now". (If your phone is not installed with JD Cloud APP, you can click the blue characters "JD Cloud APP](https://console.jdcloud.com/download)" to get downloading link)

(2) Enter the MFA verification code

After successful associating, JD Cloud APP will refresh a set of dynamic verification code every 30 seconds. Please enter a set of six-digit verification codes within the validity period of MFA verification code, and then click **Confirm to Enable** to complete the virtual MFA device associating.

![MFA开启1](https://github.com/jdcloudcom/cn/blob/1231-ycx/image/IAM/Virtual-MFA-Device/MFA开启1.1.png)

Step 2: Setting Succeeded

After the associating is completed, one set of dynamic verification codes is successfully associated. The next time you log in the console, you will need to verify the dynamic code of the MFA device associated to the account. At the same time, we recommend that you continue to improve the security of the account by enabling sensitive operation verification.

![MFA开启2](https://github.com/jdcloudcom/cn/blob/1231-ycx/image/IAM/Virtual-MFA-Device/MFA开启2.png)

# Disable virtual MFA equipment
You can choose to disable MFA verification protection when you no longer use it. After passing the safety operation verification, directly click Disable at the open entrance to enable it. It should be noted that disabling MFA will result in the dynamic verification code of the equipment associated to the account being unavailable. If you restart it, please associate new equipment and inform the person sharing the account. If you need to replace the MFA token, associate the new MFA after disassociating the old MFA.

![禁用虚拟MFA设备](../../../../image/IAM/Virtual-MFA-Device/禁用虚拟MFA设备.jpg)
