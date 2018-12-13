# Application Scenarios

## The description to the application scenarios to KMS Key Management Service of JD Cloud is as follows:

### Data Encryption and Decryption (<4KB)

Where the sensitive data (such as the password, the certificate, telephone number and other data not greater than 4KB) requires encryption and decryption, the user may encrypt and decrypt such data by using the online tool via the KMS management console or do so via specified user Key by calling OpenAPI interface of KMS.

Taking the password protection for the MySQL database for example, please give the description by calling OpenAPI interface of KMS:

1. The user creates a user Key by using the KMS service at first;

2. Call “encryption data” interface of KMS and encrypt the plaintext password of MySQL database into the ciphertext by using specified user Key;

3. Save the ciphertext locally;

4. 	When there is a need to connecting the database, please call “Data Decryption” APIs of KMS service to decrypt the ciphertext password into the plaintext password.
![数据加解密](/image/Key-Management-Service/小数据加解密.png )

### Envelope Encryption and Decryption Data
Where there are mass data (such as photos, videos and files) requiring encryption and decryption, the user may encrypt and decrypt such data with the envelope encryption method locally without transmitting such mass data to KMS via the network. In this way, the data encryption and decryption is made efficiently, the data security is guaranteed, and at the same time the expense for use is reduced.

Taking protection to local storage files for example, please encrypt and decrypt the operation instructions via the envelopment method:

- Encrypt

1. The user creates a user Key by using the KMS service at first;

2. The user calls the APIs “producing data keys” of KMS to create data encryption keys (DEK). The user obtains a data encryption key in the plaintext form and a data encryption key in the ciphertext form;

3. The user can encrypt the plaintext file by using the data encryption key in the plaintext form, produce the ciphertext file and delete the data Key in the plaintext form.

4. The data encryption key in the ciphertext form and the ciphertext file are saved in the local memory by the user together.
![信封加密](/image/Key-Management-Service/信封加密.png )

- Decrypt

1. Read data encryption key of ciphertext and ciphertext files.

2. Call “Decryption data Key” APIs of KMS and use data encryption key of corresponding user Key decryption ciphertext to obtain data encryption key in the plaintext form; rotation of Key will have no influence to the original Key decryption process;

3. Decrypt the ciphertext file by using the data encryption key in the plaintext form to obtain the data of plaintext file.
![信封解密](/image/Key-Management-Service/信封解密.png )

### Encryption and Storage of Confidential Data
During use of service, the use of storage of confidential data is inevitable, such as the access password of MySQL. If such confidential information is saved in form of plaintext, such information will be revealed and more losses will be caused in case of hacker invasion.

The confidential data management is a private data encryption management service, which encrypts and storages specified confidential data by using the service Key and accesses application program, service and private information necessary for IT resources by replacing the plaintext data with the identifier ID. With such service, users can rotate, manage and retrieve database certificates, API keys and other private information during the complete life cycle. The user and the application program can retrieve private information by calling API, without encoding sensitive information in the plaintext form.

Scenarios of service access to MySQL database are introduced as below:
![机密场景说明1](/image/Key-Management-Service/机密场景说明图1.png )

Under the circumstance that no confidential encryption service is used, once obtaining the server permission, the hacker is able to capture the database connection password in the form of plaintext and outputting data by connecting the database via a tool.

![机密场景说明2](/image/Key-Management-Service/机密场景说明图2.png )

Once the confidential encryption service is used, the account and password of the database will be saved in the form of identifier ID rather than the plaintext form. Even if the hacker gets the server permission, the hacker can get a string of encrypted identifier ID only rather than the password in the plaintext form, guaranteeing security of confidential information.

![机密场景说明3](/image/Key-Management-Service/机密场景说明图3.png )

Meanwhile, when the server is captured by the hacker, the confidentially-rotated MySQL password can be used triggered and synchronized to the MySQL database, guaranteeing security of confidential information.

## Related References

- [Introduction to KMS Key Management Service](/documentation/Cloud-Security/Key-Management-Service/Product-Overview.md)
