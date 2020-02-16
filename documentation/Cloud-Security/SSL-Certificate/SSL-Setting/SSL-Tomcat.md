# Tomcat Server Installation Certificate

## **Download Certificate**

1. Log in the Console, select **Cloud Security** -> **SSL Certificate** -> **Certificate Management** from the navigation bar on the left in turn and log in the SSL Certificate Management Page

![证书列表页面](/image/SSL-Certification/证书列表页面.png)

2. Select the certificate to be downloaded and click **Download** on the right side to download the certificate.

![下载对应格式的证书](/image/SSL-Certification/下载对应格式的证书.png)

## **Create Directory**

1. Create the **cert** directory under the **Tomcat** installation directory and copy the decompressed certificate and password file under the **cert** directory.

##  **Configure the server.xml file**

1. Modify the configuration file server.xml and save it.

File path: Tomcat installation directory/conf/server.xml

Locate to the tag contents of `<Connector port="8443"`and `<Connector port="443"`. Modify the server.xml file by referring to the two parts below:

```
<!--
  <Connector  port="8443"
protocol="HTTP/1.1"
  port="8443" SSLEnabled="true"
  maxThreads="150" scheme="https" secure="true"
  clientAuth="false" sslProtocol="TLS" />
-->
<Connector port="443"
    protocol="HTTP/1.1"
    SSLEnabled="true"
    scheme="https"
    secure="true"
    keystoreFile="domain name.pfx"
    keystoreType="PKCS12"
    keystorePass="Certificate Password"   
    clientAuth="false"
    SSLProtocol="TLSv1+TLSv1.1+TLSv1.2"
    ciphers="TLS_RSA_WITH_AES_128_CBC_SHA,TLS_RSA_WITH_AES_256_CBC_SHA,TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA,TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256,TLS_RSA_WITH_AES_128_CBC_SHA256,TLS_RSA_WITH_AES_256_CBC_SHA256"/>
```

**Description**

Modify the **port** attribute according to the real conditions (the https default port is 443). If another port is used (such as 8443), please be sure to enter https://www.domain.com:8443 applicable when you access a website.
keystoreFile** represents the certificate file path. Please replace your certificate file name with domain name.

keystorePass** represents the certificate password. Please replace contents in the password file pfx-password.txt.

**Optional: **configure the web.xml file

Enable HTTP and redirect to HTTPS by force.

Add the following contents behind the file </welcome-file-list>:

```
<login-config>  
    <!-- Authorization setting for SSL -->  
    <auth-method>CLIENT-CERT</auth-method>  
    <realm-name>Client Cert Users-only Area</realm-name>  
</login-config>  
<security-constraint>  
    <!-- Authorization setting for SSL -->  
    <web-resource-collection >  
        <web-resource-name >SSL</web-resource-name>  
        <url-pattern>/*</url-pattern>  
    </web-resource-collection>  
    <user-data-constraint>  
        <transport-guarantee>CONFIDENTIAL</transport-guarantee>  
    </user-data-constraint>  
</security-constraint>
```

2. Reboot Tomcat.

## Subsequent Operation

After the certificate is installed, you can verify if the certificate is successfully installed by logging in the certificate associated domain.

```
https://domain name   #Replace domain name with the domain associated with the certificate
```

If a little lock icon is shown on the website address bar, it means that the certificate is successfully installed.

