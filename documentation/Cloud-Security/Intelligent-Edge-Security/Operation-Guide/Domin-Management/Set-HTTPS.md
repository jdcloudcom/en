# Set HTTPS

Click the domain to go to the configuration page and set the "communication protocol" in the "resource information"

## SSL Certificate

Firstly, upload the management certificate to the SSL Certificate Service Platform and then you can choose the certificate corresponding to the domain according to the certificate name on Intelligent Edge Security Console.

![SSL证书](/image/Intelligent-Edge-Security/SSL证书.png)

## Customized Certificate

If you haven’t uploaded the management certificate to the ssl Certificate Service Platform, you can add the certificate content and secret key on the Intelligent Edge Security Console and also synchronize them to the SSL Certificate Service Management Platform. You must set the name of this certificate while synchronizing.

![自定义证书](/image/Intelligent-Edge-Security/自定义证书.png)

## Redirect Type

1. Default means: If the client protocol is HTTP, the request protocol from the client to the Intelligent Edge Security node is HTTP, with HTTPS in a similar way;

2. HTTPS-->HTTP means: The former request method HTTPS from the client to the Intelligent Edge Security node is compulsorily redirected to HTTP;

3. HTTP-->HTTPS means: The former request method HTTP from the client to the Intelligent Edge Security node is compulsorily redirected to HTTPS.

