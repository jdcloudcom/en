# Tian An Security Service Financial Encryption Machine - Instance Initialization

## Preparatory Work

1. First, you need to connect your computer in use to VPC with the VPN method
2. Add the address of your computer in VPC to the white list of JD Cloud HSM instances
3. Download the VsmManager bundled software
4. Well prepare the matching UKey sent by JD Cloud

## Modify the UKey password

Open the VsmManager software in the software package, click **Device Management**, insert the UKey and refresh; perform the "Password Change Operation" on the UKey; the default UKey password is "12345678".

![修改密码](/image/JDCloudHSM/Tass/修改密码.png)

## Initialization Process

1. Open the VsmManager software in the software package, click **VSM Login Management**, and click **Register Administrator** in the popped-up window

![打开软件](/image/JDCloudHSM/Tass/打开软件.png)

2. Insert a blank UKey, select it after refresh, and enter the UKey password. So, this UKey will be used as the management UKey for logging in the JD Cloud HSM instance.

![注册管理员](/image/JDCloudHSM/Tass/注册管理员.png)

3. Click **Log in** and log in with the newly created administrator UKey; the administrator UKey should not be pulled out during the entire management process.

4. Click **Key Management** and click **Original Initialization**. The role of **Original Initialization** is to initialize a new data encryption instance.

![原始初始化01](/image/JDCloudHSM/Tass/原始初始化01.png)

5. Click **Next** to enter the number of "components"; "Component" is the factor for creating the data encryption instance root key, and 2~8 of them are optional. There are 2 examples here.

![原始初始化02](/image/JDCloudHSM/Tass/原始初始化02.png)

6. Click **Random Secret Value** on the software and then click **Generate Component UKey

![原始初始化03](/image/JDCloudHSM/Tass/原始初始化03.png)

7. Insert a new UKey as the first component UKey; click **OK** and enter the password. So the first component UKey has been created.

![原始初始化04](/image/JDCloudHSM/Tass/原始初始化04.png)

8. Make the second component Ukey according to the corresponding process.

![原始初始化05](/image/JDCloudHSM/Tass/原始初始化05.png)

9. Insert the newly created component UKey in turn as a composite factor for DMK.

![原始初始化06](/image/JDCloudHSM/Tass/原始初始化06.png)

10. Click **Synthesize DMK**. So, the device's root key has been initialized.

![原始初始化07](/image/JDCloudHSM/Tass/原始初始化07.png)

11. Select the authorization mechanism. In the example here, the select 1-from-1 authorization mechanism is used

![原始初始化09](/image/JDCloudHSM/Tass/原始初始化09.png)

| Authorization Mechanism | Description |
| -- | -- |
| Without Authorization | When the data encryption example is without any authorization, insert the administrator UKey to operate, not recommended |
| select 1-from-1 Authorization | When one authorized UKey is used, it is required to insert the authorized UKey when the JD Cloud HSM instance is managed |
| select 2-from-3 Authorization | When three authorized Ukeys are used, it is required to insert two of them when the JD Cloud HSM instance is managed |
| select 3-from-5 Authorization | When five authorized Ukeys are used, it is required to insert three of them when the JD Cloud HSM instance is managed |

12. Initialize the authorized UKey

![原始初始化10](/image/JDCloudHSM/Tass/原始初始化10.png)

13. The initialization of JD Cloud HSM is complete.

![原始初始化11](/image/JDCloudHSM/Tass/原始初始化11.png)


## Related References

[Downloading of VsmManager Bundled Software](https://database-audit.s3.cn-north-1.jdcloud-oss.com/cloudhsm-public/VsmManager_1.2.2.15.rar)

[Downloading of Tian An Security Service EVSM Service Manual](/image/JDCloudHSM/Cloud Encryption Service-User’s Manual for EVSM Management Tool V1.3.pdf)

[Application Development Manual for Tian An Security Service Financial Encryption Machine](/image/JDCloudHSM/Application Development Manual for Tian An Security Service Financial Data Cipher Machine_V1.48.pdf)
