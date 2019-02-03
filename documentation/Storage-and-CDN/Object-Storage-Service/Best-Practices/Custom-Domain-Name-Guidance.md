# Customized domain supports HTTPS access OSS service

## Common Concepts
To associate a customized domain, you need to understand the following concepts:

- User domain, customized domain and the own domain: The domain you purchase from the domain service provider.
- OSS access domain or Bucket domain: The access domain assigned by OSS to your Bucket.

## Customized domain access OSS

After you upload the file to Bucket of JD Cloud OSS, you can use OSS access domain or Bucket domain to access the file. If you want to access these files through a customized domain, you need to associate the customized domain to the bucket where the file is located, and add the CNAME record to the OSS access domain corresponding to the bucket. Refer to [Customized Domain Service](../Operation-Guide/Manage-Bucket/Set-Custom-Domain-Name-2.md).

## Customized domain supports HTTPS access OSS service

When you complete the adding of domain by reference of [Console-Customized Domain Setting](../Operation-Guide/Manage-Bucket/Set-Custom-Domain-Name-2.md),
**your user domain does not yet support access to OSS service via https. If you need to support access to https, you need to open ticket and submit materials as required, then the access to https can be supported.**

## Operation Guide:

* You need to open ticket first to enter the question description “The customized domain of Object Storage Service supports https access”.
* The corresponding materials to be submitted in the ticket are as follows:

|Name                | Description                | 
| :------------------- | :-----------|
|   PIN  |User PIN | 
|  https certificate               | The https certificate of the own domain you want to support   | 
| OSS access domain            | OSS access domain```<BUCKET_NAME>.s3.<REGION>.jcloudcs.com ```  | 
| Contact phone number and email        |  Convenient to inform you in time before the certificate expires   |  

**Description**

* Please check the validity of your certificate before submitting it. The certificate must be valid for more than 3 months. If the certificate is valid for less than 3 months, you need to renew the certificate before submitting it so that you can have the stable service.
* Currently, it only supports association with the new version of S3 domain of JD Cloud Object Storage Service.
* After you open ticket, the normal configuration online effective time is in 1-2 weeks, except holidays. Please give a special description in case of urgent demand.
* When the certificate hosted configuration is completed, the staff member will notify you.




