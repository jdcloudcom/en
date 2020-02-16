# Apache Server Installation Certificate

## **Download Certificate**

1. Log in the Console, select **Cloud Security** -> **SSL Certificate** -> **Certificate Management** from the navigation bar on the left in turn and log in the SSL Certificate Management Page

![证书列表页面](/image/SSL-Certification/证书列表页面.png)

2. Select the certificate to be downloaded and click **Download** on the right side to download the certificate.

![下载对应格式的证书](/image/SSL-Certification/下载对应格式的证书.png)

## Create Directory

1. Create the cert directory in the **Apache** installation directory and copy the decompressed Apache certificate, certificate chain file and the key pair file to the cert directory. If it is necessary to install several certificates, please create corresponding **cert** directories in the **Apache** directory for storing different certificates.

##  Configure httpd.conf File

1. Modify httpd.conf configuration file.

1) Open the Apache/conf/httpd.conf file under the Apache installation directory, find the following parameters and make configuration according to notes below.

```
#LoadModule ssl_module modules/mod_ssl.so  #Delete the configuration line annotation symbol "#" at the beginning of the line, load the mod_ssl.so module and start the SSL service. By default, this module will not be enabled by Apache. If you cannot find the configuration, please compile the mod_ssl module again.
#Include conf/extra/httpd-ssl.conf  #Delete the configuration line annotation symbol "#" at the beginning of the line.                 
```

2) Save the httpd.conf file and exit.

2. Modify the httpd-ssl.conf configuration file.

1) Open the Apache/conf/extra/httpd-ssl.conf file, find the following parameters and make configuration according to notes below. It is suggested to use the absolute path as the certificate path.

**Description** The http-ssl.conf files can also be saved in the conf.d/ssl.conf directory, depending on different operating systems.

```
<VirtualHost *:443>     
    ServerName   #Modify the domain www.YourDomainName1.com associated when you apply for the certificate.                    
    DocumentRoot  /data/www/hbappserver/public          
    SSLEngine on   
    SSLProtocol all -SSLv2 -SSLv3 # Add a supporting protocol to the SSL protocol and removing unsafe protocol.
    SSLCipherSuite HIGH:!RC4:!MD5:!aNULL:!eNULL:!NULL:!DH:!EDH:!EXP:+MEDIUM   # Modify an encryption suit.
    SSLHonorCipherOrder on
    SSLCertificateFile cert/domain name1_public.crt   # Replace domain name1_public.crt with your certificate file name.
    SSLCertificateKeyFile cert/domain name1.key   # Replace domain name1.key with your certificate key pair file name.
    SSLCertificateChainFile cert/domain name1_chain.crt  # Replace domain name1_chain.crt with your certificate key pair file name; if the certificate chain begins with a character #, please delete it.
</VirtualHost>
 
#If the certificate contains several domains, please copy the above parameters and replace ServerName with the second domain. 
<VirtualHost *:443>     
    ServerName   #Modify it as the second domain www.YourDomainName2.com associated when you apply for the certificate.                    
    DocumentRoot  /data/www/hbappserver/public          
    SSLEngine on   
    SSLProtocol all -SSLv2 -SSLv3 # Add a supporting protocol to the SSL protocol and removing unsafe protocol.
    SSLCipherSuite HIGH:!RC4:!MD5:!aNULL:!eNULL:!NULL:!DH:!EDH:!EXP:+MEDIUM   # Modify an encryption suit.
    SSLHonorCipherOrder on
    SSLCertificateFile cert/domain name2_public.crt   # Replace domain name2 as the second domain applicable when you apply for the certificate.
    SSLCertificateKeyFile cert/domain name2.key   # Replace domain name2 as the second domain applicable when you apply for the certificate.
    SSLCertificateChainFile cert/domain name2_chain.crt  # Replace domain name2 with the second domain you applied for the certificate; if the certificate chain begins with the character #, please delete it.
</VirtualHost>
```

**Description: **Please pay attention that if your browser version supports the SNI function. If no, the multi-domain certificate configuration cannot take effect.

2) Save the httpd-ssl.conf file and exit.

3. Reboot the Apache server to enforce SSL configuration.

Execute the following commands under the bin dictionary of Apache:

1) Stop the Apache service.

```
apachectl -k stop
```

2. Enable the Apache service.

```
apachectl -k start
```

4. **Optional:** Modify the httpd.conf file and set HTTP request to automatically redirect to HTTPS.

Add the following redirection codes to `<VirtualHost *:80> </VirtualHost>` of the httpd.conf file.

```
RewriteEngine on
RewriteCond %{SERVER_PORT} !^443$
RewriteRule ^(.*)$ https://%{SERVER_NAME}$1 [L,R]
```

## Subsequent Operation

After the certificate is installed, you can verify if the certificate is successfully installed by logging in the certificate associated domain.

```
https://domain name   #Replace domain name with the domain associated with the certificate
```

If a little lock icon is shown on the website address bar, it means that the certificate is successfully installed.