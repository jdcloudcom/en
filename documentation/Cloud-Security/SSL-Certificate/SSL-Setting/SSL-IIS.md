# IIS Server Installation Certificate

## **Download Certificate**

1. Log in the Console, select **Cloud Security** -> **SSL Certificate** -> **Certificate Management** from the navigation bar on the left in turn and log in the SSL Certificate Management Page

![证书列表页面](/image/SSL-Certification/证书列表页面.png)

2. Select the certificate to be downloaded and click **Download** on the right side to download the certificate.

![下载对应格式的证书](/image/SSL-Certification/下载对应格式的证书.png)

## Import Certificate

1. Click **Start** **>** **Run** **> MMC** to turn on the Console.

![运行mmc](/image/SSL-Certification/运行mmc.png)

Home Page of Console

![控制台](/image/SSL-Certification/控制台.png)

2. Click dialog boxes **File** **>** **Add** **/** **Delete Management Unit**Open**Add** **/** **Delete Management Unit**.

![打开管理单元](/image/SSL-Certification/打开管理单元.png)

3. Click **Certificate** **>** **Add** **>** **Computer Account** **>** **Next** **>** **Local Computer (Console Running Computer)** **>** **Complete** in the **Available Management Unit**.

![添加证书](/image/SSL-Certification/添加证书.png)

4. Click **Certificate** under **Console Root Node** on the left side navigation bar of the Console to turn on the certificate tree list.

![证书树形列表](/image/SSL-Certification/证书树形列表.png)

5. Click dialog boxes **Individual** **>** **Certificate** **>** **All Tasks** **>** **Import**Open**Certificate Import Guide**.

![证书导入向导](/image/SSL-Certification/证书导入向导.png)

6. Click **Browse** to import the downloaded certificate files in the format of PFX.

![导入证书文件](/image/SSL-Certification/导入证书文件.png)

**Description ** When the certificate file is imported, please select **All Files** type from the drop-down list on the right side of **File Name**.

7. Enter the password in the certificate key pair file.

You can turn the pfx-password .txt file to view the certificate password in the downloaded IIS certificate file.

![输入证书密码](/image/SSL-Certification/输入证书密码.png)

8. Check **Automatically select the certificate memory according to the certificate type** and click **Next** to complete certificate import.

![选择证书存储](/image/SSL-Certification/选择证书存储.png)

## **Associate Certificate**

1. Turn on the IIS7.0 manager panel, locate to the site where the certificate is deployed, and click **Associate**.

2. Click **Add** **>** **Select****https****Type** **>** **Port Selection** **443 >** **Imported****IIS****Certificate Name** **>** **OK** from the dialog box of **Website Association**.

![添加绑定SSL证书](/image/SSL-Certification/添加绑定SSL证书.png)

**Description**: The SSL default port is 443. Please do not make any modification. If another port is used (such as 8443), please be sure to enter https://www.domain.com:8443 applicable when you access a website.

## Subsequent Operation

After the certificate is installed, you can verify if the certificate is successfully installed by logging in the certificate associated domain.

```
https://domain name   #Replace domain name with the domain associated with the certificate
```

If a little lock icon is shown on the website address bar, it means that the certificate is successfully installed.
