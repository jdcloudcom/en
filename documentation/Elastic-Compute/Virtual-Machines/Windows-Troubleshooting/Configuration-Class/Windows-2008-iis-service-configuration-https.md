# Configure https for iis Service in Windows 2008
**Create Certificate:**

1. Use the CA service of Windows Server 2008 R2 to create a certificate, and click **Add Role** in **Server Manager**.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%20iis%E6%9C%8D%E5%8A%A1%E9%85%8D%E7%BD%AEhttps01.png)

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%20iis%E6%9C%8D%E5%8A%A1%E9%85%8D%E7%BD%AEhttps02.png)

2. Select **Active Directory Certificate Service**.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%20iis%E6%9C%8D%E5%8A%A1%E9%85%8D%E7%BD%AEhttps03.png)

3. To add services, you need to select three services: **Certificate Authority**, **Certificate Authority Web Registration** and **Online Response Program**.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%20iis%E6%9C%8D%E5%8A%A1%E9%85%8D%E7%BD%AEhttps04.png)

4. Because it is not a domain control environment, you can simply select **Independent (A)**.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%20iis%E6%9C%8D%E5%8A%A1%E9%85%8D%E7%BD%AEhttps05.png)

5. For the first CA installed, simply select **Root CA(R)**.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%20iis%E6%9C%8D%E5%8A%A1%E9%85%8D%E7%BD%AEhttps06.png)

6. Simply select **Create Private Key (R)**.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%20iis%E6%9C%8D%E5%8A%A1%E9%85%8D%E7%BD%AEhttps07.png)

7. Simply keep the default here. Of course, if you need a customized setting, you can also choose customized setting.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%20iis%E6%9C%8D%E5%8A%A1%E9%85%8D%E7%BD%AEhttps08.png)

8. It is recommended to keep the default name of CA here.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%20iis%E6%9C%8D%E5%8A%A1%E9%85%8D%E7%BD%AEhttps09.png)

9. Set the valid period of the certificate, which by default is 5 years. This can be set according to the situation of the Web.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%20iis%E6%9C%8D%E5%8A%A1%E9%85%8D%E7%BD%AEhttps10.png)

10. Set the certificate database location and log location at your discretion.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%20iis%E6%9C%8D%E5%8A%A1%E9%85%8D%E7%BD%AEhttps11.png)

**Create IIS service:**

1. After installing the CA certificate, the installer will automatically boot and start the IIS installation.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%20iis%E6%9C%8D%E5%8A%A1%E9%85%8D%E7%BD%AEhttps12.png)

2. In this case, you need to tick **ASPNETt** and **.NET Expansibility**.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%20iis%E6%9C%8D%E5%8A%A1%E9%85%8D%E7%BD%AEhttps13.png)

3. It should be noted that the computer name or domain name cannot be changed after the certificate is installed.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%20iis%E6%9C%8D%E5%8A%A1%E9%85%8D%E7%BD%AEhttps14.png)

4. Finally, make sure that the certificate service and Web Server IIS are successfully installed.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%20iis%E6%9C%8D%E5%8A%A1%E9%85%8D%E7%BD%AEhttps15.png)

**Create a self-signed certificate:**

1. Select **Server Certificate** in the IIS Manager.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%20iis%E6%9C%8D%E5%8A%A1%E9%85%8D%E7%BD%AEhttps16.png)

2. Select the previously created certificate and select **Create Self-Signed Certificate**.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%20iis%E6%9C%8D%E5%8A%A1%E9%85%8D%E7%BD%AEhttps17.png)

3. Set a name that is concise and understandable.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%20iis%E6%9C%8D%E5%8A%A1%E9%85%8D%E7%BD%AEhttps18.png)

**Build https website:**

1. Add a new website.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%20iis%E6%9C%8D%E5%8A%A1%E9%85%8D%E7%BD%AEhttps19.png)

2. Set the main directory of the website, set the type as https, and simply select the testca that is set in the previous stage for SSL certificate.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%20iis%E6%9C%8D%E5%8A%A1%E9%85%8D%E7%BD%AEhttps20.png)

3. Set an Index.html test page in the root directory of the website.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%20iis%E6%9C%8D%E5%8A%A1%E9%85%8D%E7%BD%AEhttps21.png)

4. Select the site and click the default document.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%20iis%E6%9C%8D%E5%8A%A1%E9%85%8D%E7%BD%AEhttps22.png)

5. Move the Index.html default document to the top.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%20iis%E6%9C%8D%E5%8A%A1%E9%85%8D%E7%BD%AEhttps23.png)

6. Perform access test with HTTPS used for the external network. You can see it and access it, but because the certificate is not issued by a public CA, there will be a security tip. If you purchased a CA certificate, when a paid certificate is used, usually there will be no such security risk tip.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%20iis%E6%9C%8D%E5%8A%A1%E9%85%8D%E7%BD%AEhttps24.png)

7. Select **Go on** and you will find that the website can be accessed normally.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%20iis%E6%9C%8D%E5%8A%A1%E9%85%8D%E7%BD%AEhttps25.png)

If your problem still can not solved, please submit open ticket to us.
