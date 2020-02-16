# Nginx Server Installation Certificate

## **Download Certificate**

1. Log in the Console, select **Cloud Security** -> **SSL Certificate** -> **Certificate Management** from the navigation bar on the left in turn and log in the SSL Certificate Management Page

![证书列表页面](/image/SSL-Certification/证书列表页面.png)

2. Select the certificate to be downloaded and click **Download** on the right side to download the certificate.

![下载对应格式的证书](/image/SSL-Certification/下载对应格式的证书.png)

## Create Directory

1. Log in your Nginx server, create the **cert** directory under the Nginx installation directory (the default Nginx installation directory is /usr/local/nginx/conf) and copy the downloaded certificate file and key pair file in the **cert** directory.

## **Modify the nginx.conf file**

1. Modify the Nginx installation directory/conf/nginx.conf file.

Find the following configuration information:

```
# HTTPS server
  server {
  listen 443;
  server_name localhost;
  ssl on;
  ssl_certificate cert.pem;
  ssl_certificate_key cert.key;
  ssl_session_timeout 5m;
  ssl_protocols TLSv1 TLSv1.1 TLSv1.2;
  ssl_ciphers ALL:!ADH:!EXPORT56:RC4+RSA:+HIGH:+MEDIUM:+LOW:+SSLv2:+EXP;
  ssl_prefer_server_ciphers on;
  location / {
                                          
```

Modify the nginx.conf file according to the note contents in the following file:

```
# The following attributes which begin with ssl are related to certificate configuration, while other attributes shall be configured based on your own demands.
server {
listen 443 ssl;   #The access port number of SSL protocol is 443. If ssl is not added here, Nginx cannot be started possibly.
server_name localhost;  #Revise localhost as the domain associated to your certificate, such as www.example.com.
root html;
index index.html index.htm;
ssl_certificate cert/domain name.pem;   #Replace domain name.pem with your certificate file name.
ssl_certificate_key cert/domain name.key;   #Replace domain name.key with your certificate key pair file name.
ssl_session_timeout 5m;
ssl_ciphers ECDHE-RSA-AES128-GCM-SHA256:ECDHE:ECDH:AES:HIGH:!NULL:!aNULL:!MD5:!ADH:!RC4;  #Use this encryption suite.
ssl_protocols TLSv1 TLSv1.1 TLSv1.2;   #Use this protocol for configuration.
ssl_prefer_server_ciphers on;   
location / {
root html;   #site directory.
index index.html index.htm;   
}
}                     
```

2. Save the nginx.conf file and exit.

3. Execute the following commands to reboot the Nginx server.

```
nginx -s stop
nginx -s start
```

## Subsequent Operation

After the certificate is installed, you can verify if the certificate is successfully installed by logging in the certificate associated domain.

```
https://domain name   #Replace domain name with the domain associated with the certificate
```

If a little lock icon is shown on the website address bar, it means that the certificate is successfully installed.