# Certificate Management

JD Cloud Load Balancer supports HTTPS/TLS one-way verification. When configuring HTTPS/TLS listening, you must upload the server certificate to Load Balancer, which is responsible for the decryption of data, and the backend server is no longer required to configure the certificate.
When the certificate is issued via Root CA institution and there is only one certificate in the certificate files, you just need to upload the certificate; when the certificate is issued via intermediate CA institution, and there is a certificate chain in certificate files, you need to upload both the server certificate and intermediate certificate on the certificate chain to the Load Balancer.
 
The format requirements for certificate contents are as follows:

   - Only the certificate in the PEM format is supported, and if the certificate is in any other format, OpenSSL is suggested to be used for conversion.
   - It must begin with “-----BEGIN CERTIFICATE-----” and end with “-----END CERTIFICATE-----”.
   - 64 characters in each line, provided that in the last line there may be less than 64 characters.
   - No space is allowed in the certificate contents.
   - The server certificate in the certificate chain shall be put in the first place, the intermediate certificate shall be put in the second place, and no space is allowed between the certificates.
   - The certificate in the certificate chain conform to the format requirements for intermediate CA institution.

The format requirements for key shall be as follows:

   - Only the secret key in PEM format is supported, and if the key is in any other format, the key is encrypted or the key includes “Proc-Type: 4,ENCRYPTED”, OpenSSL is suggested to be used for conversion.
   - It must begin with “-----BEGIN RSA PRIVATE KEY-----” and end with “-----END RSA PRIVATE KEY-----”.
   - 64 characters in each line, provided that in the last line there may be less than 64 characters.
   - No space is allowed in the key.
## Create Certificate	
1. Click **Network**>**Load Balancer**>**Certificate**, and enter into the certificate list page.

2. Click **Add Certificate** button, and operate as follows in the pop-up dialog box:

   - Select the region: the region where the certificate is used. Where the certificate is required to be used in multiple regions, please select multiple regions.
   - Fill in the certificate name: fill in the certificate name.
   - Fill in the certificate contents: replicate the certificate contents. Click **Example Reference** to view the correct certificate format.
   - Fill in the private key: replicate the private key of the certificate. Click **Example Reference** to view the correct private key format.

    ! [ALB list page](../../../../image/Networking/ALB/ALB-109.png)

3. Click the **Confirm to Submit** button to complete the operation of uploading the certificate and private key.
## Delete Certificate
 Click **Delete** in the **Operation** bar to delete the unused certificate. 
## Replace the Load Balancer certificate
Where the certificate associated with the listener needs to be replaced, please select the certificate by **Edit** in the listener list page of Load Balancer.
1. In the listener list page, click **Edit** under the column of the **Operation** bar, and select the new certificate for frontend listening configuration in the pop-up dialog box.
2. Click **Confirm** to complete the replacement of certificate associated with the listener.

