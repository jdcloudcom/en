# Associated Certificate

If the protocol type of the website information added by you contains **HTTPS**, you must upload the HTTPS certificate associated with the website domain on the Web Application Firewall Console, and the certificate must be correct and valid. In this way, the normal protection for HTTPS protocol access request of the website by the Web Application Wall can be guaranteed.

The Certificate Service of Web Application Firewall is associated with the SSL Certificate Service of JD Cloud & AI. Therefore, the certificate matched with the domain among SSL certificates will be displayed when the certificate is associated with website domain. If there is no certificate required, you can click **Upload Certificate** to redirect to the Certificate Management page of SSL certificate and add a certificate by automatically uploading existing valid certificate via the SSL Certificate service. If you do not have a valid certificate, you can purchase a required one from JD Cloud SSL Certificate Service.

Operation Steps

1. Log in JD Cloud & AI [Web Application Firewall Console](https://cloudwaf-console.jdcloud.com/overview/business).

2. Click **Website Configuration** on the left side navigation bar.

3. Locate the domain to be operated on the **Web Configuration** page and click the **Unassociated Certificate** of HTTPS in the Protocol Status column.

![image](../../../../image/WAF/join-in-WAF/Match-Cert-entry.png)

4. In the **Associate Certificate** dialog box, click **Associate Certificate** or **Upload Certificate**.

a. Click the **Certificate List**, through which relevant certificates containing the domain to be configured in the SSL Certificate Service will be shown in the drop-down box, and then select a certificate and click **OK** to **Associate Certificate**.

![image](../../../../image/WAF/join-in-WAF/Match-Cert-Choose.png)

b. If there is no data shown or no certificate that you want to associate with in the drop-down box, you can click the **Upload** button to redirect to the SSL Certificate Management page to **Upload Certificate**, including the private key and public key of the certificate. For specific operations, please refer to [Certificate Upload Guidance](https://docs.jdcloud.com/en/ssl-certificate/upload-ssl-certificate). After the certificate is uploaded, please return to Step a to complete operations to **Associate Certificate**.

c. If you need to apply for a new certificate, you can click **Purchase Certificate** on the [SSL Certificate Management Page](https://docs.jdcloud.com/en/ssl-certificate/manage-ssl-certificate) to purchase one. For specific operations, please refer to [Certificate Purchase](https://docs.jdcloud.com/en/ssl-certificate/apply-ssl-certificate).

d. If you want to update your certificate, you only need to update it on the SSL Console, and then your Web Application Firewall will be updated automatically.