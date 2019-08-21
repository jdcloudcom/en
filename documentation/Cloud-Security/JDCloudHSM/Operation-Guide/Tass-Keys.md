# Tian An Security Service Financial Encryption Machine - Key Management
 
## Preparatory Work

1. First, initialize JD Cloud HSM [operation steps](Tass-Instance.md)

## Conduct authorization

1. Open the VsmManager software and log in with the administrator UKey

2. Click **Device Management** and click **Operation Authorization

![授权01](/image/JDCloudHSM/Tass/授权01.png)

3. Insert the authorized UKey, click **OK**, and enter the UKey password

![授权02](/image/JDCloudHSM/Tass/授权02.png)

4. In the popped-up window, modify the authorization time of "Application Key Management". Here is an example of 30 minutes (you can use the administrator UKey for key management within 30 minutes)

![授权04](/image/JDCloudHSM/Tass/授权04.png)

5. Click **Key Management** in the VsmManager software and click **Symmetric Key Management

![密钥管理01](/image/JDCloudHSM/Tass/密钥管理01.png)

6. Click **Generate Random Key** and fill in the required information in the popped-up window

![密钥管理02](/image/JDCloudHSM/Tass/密钥管理02.png)

7. In our example, the AES algorithm and the key with an index of 1 are chosen to be created

![密钥管理03](/image/JDCloudHSM/Tass/密钥管理03.png)

8. Click**Generate** and click **Refresh** in the key management window. The newly created key will be displayed.

![密钥管理04](/image/JDCloudHSM/Tass/密钥管理04.png)



## Related References

[Downloading of VsmManager Bundled Software](https://docs-downloads.s3.cn-north-1.jdcloud-oss.com/CloudHSM/VsmManager_1.2.2.15.rar)

[Downloading of Tian An Security Service EVSM Service Manual](/image/JDCloudHSM/Cloud Encryption Service-User’s Manual for EVSM Management Tool V1.3.pdf)

[Application Development Manual for Tian An Security Service Financial Encryption Machine](/image/JDCloudHSM/Application Development Manual for Tian An Security Service Financial Data Cipher Machine_V1.48.pdf)
