# Customized Domain Service

## Common Concepts
To associate a customized domain, you need to understand the following concepts:

* User domain, customized domain and the own domain: The domain you purchase from the domain service provider.
* OSS access domain or Bucket domain: The access domain assigned by OSS to your Bucket.

### You can associate the customized domain access to your own Bucket, i.e. CNAME. After you enable the CNAME function, OSS will automatically process access requests to the domain. 

*What’s more, in accordance with the requirements of China's Internet Administration Regulations, if users need to enable this function, they must provide valid information such as ICP filing No. of Ministry of Industry and Information Technology and ID Card of domain holder, which can only be used after being approved by JD Cloud.*

## Application Scenarios

For example, when the users need to migrate the files from the website to OSS, and do not want to modify the code of the web page, i.e., keeping the website link unchanged, CNAME function is particularly suitable for such scenario.
For example, the domain of user A is www.example.com, the file is abc.html, and the link is: http://www.example.com/abc.html.

The process is as follows:

 1. Create a Bucket named example on OSS and upload it to abc.html website file to the storage space.
 
 2. OSS console associates the customized domain www.example.com to the created storage space.
 
 3. Add CNAME rules on the Domain Service server and map www.example.com to storage space domain.
 
 4.httpWhen the request of ://www.example.com/abc.html arrives at OSS, OSS will find the mapping between www.example.com and storage space domain (example.oss.cn-north-1.jcloudcs.com) and converts to an abc.html file that accesses the bucket. That is, after processed by OSS, the access to http://www.example.com/abc.html, actually is the access to http:// example.oss.cn-north-1.jcloudcs.com / abc.html.
 
## Benefits of Customized Domain

* When the users need to migrate the files from the website to OSS without modifying the code of the web page, i.e., keeping the website link unchanged.
* It can also avoid cross-origin or security issues that may be involved in the business. 
 
## Console: Customized Domain 
After OSS Bucket uploads the object, the address of the object is available, including two parts: OSS domain address + object file name. The OSS access domain format is as follows:

```<BucketName>.<Endpoint>```
[Internet Domain- endpoint ](../../API-Reference-S3-Compatible/Regions-And-Endpoints.md)



Customized domain is available as access address to the storage file in OSS after the customized domain is associated successfully. For example, your storage space example is located in cn-north-1, the object file name is test.jpg, and the customized domain associated is hello-world.com, then the object access address is:

* Before association: example.oss.cn-north-1.jcloudcs.com /test.jpg
* After association: hello-world.com/test.jpg
  You can associate the customized domain to the OSS Internet domain through the console to realize the customized domain access to the file under the bucket.

## Operation steps for Associating Domain
1. Log in the Console->OSS->Space Management->Enter into a Bucket->Space Setting, and click **Customized Domain**.

2. Click **Add Domain** and open the page for associating user’s domain, as shown in the following figure:

![图片](https://github.com/jdcloudcom/cn/blob/edit/image/Object-Storage-Service/OSS-094.jpg)
 
3. Associate domain

 *  Input the domain to be associated in the user’s domain box.
 *  If CDN acceleration is required, go to JD Cloud CDN console to enable CDN acceleration by clicking on the notification copywriting of the tab also of the customized domain.
 
4. Submit

**Description**
 
*  Each domain can only be associated with one Bucket of a region, and each Bucket can be associated with maximum 20 domains.
*  ICP filing must be implemented at the Ministry of Industry and Information Technology for the domain associated; otherwise, the domain access will be affected.
*  It is suggested that you can associate the customized domain access to your own Bucket. After the domain is associated successfully, in order to access OSS normally via the domain, the user needs to add the CNAME record pointing the OSS access domain at the place of the domain resolver.
*  If your user domain needs to access the OSS service via the mode of HTTPS, you must purchase the corresponding digital certificate. Please submit your certificate through the ticket and host your certificate through JD Cloud OSS. For details, please refer to [OSS Service for HTTPS Access Supported by Customized Domain](../../Best-Practices/Custom-Domain-Name-Guidance.md).
*  If the entered domain has been maliciously associated by other users, the system prompts that the domain has been associated. You can complete the validation of domain ownership in accordance with the OSS verification scheme by clicking **Open Ticket**; the domain can be associated if domain ownership is verified, and the association between the domain and the previous storage space is removed at the same time.
*  Currently, only file download by customized domain is supported. If you need to upload files or make various actions on the Bucket, please access the domain via the JD Cloud OSS.


## Operation Steps for Domain Resolution (Take JD Cloud Resolution as an Example)

Login JD Cloud DNS console and enter the domain resolution list page.
Click the target domain or the right-handed resolution button to enter the domain resolution page.
Add resolution, and then add the resolution page.
Choose CNAME in the record type drop-down list; in the record value box, fill in the corresponding storage space Internet domain (i.e. Bucket domain, such as BucketName.oss.cn-north-1.jcloudcs.com).
Click **Confirm**, and the domain resolution is completed.
For details, please refer to [JD Cloud DNS-Add Resolution Record](https://docs.jdcloud.com/cn/jd-cloud-dns/domain-record-add)

