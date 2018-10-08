# Custom Domain Name Service

You can associate the customized domain name access to your own Bucket, i.e. CNAME. What’s more, in accordance with the requirements of China's Internet Administration Regulations, if users need to open this function, they must provide valid information such as filling No. of Ministry of Industry and Information Technology and ID Card of domain name holder, which can only be used after being approved by JD Cloud. After you enable the CNAME function, OSS will automatically process access requests to the domain name. 
Application Scenarios
For example, when the users need to migrate the files from the website to OSS, and do not want to modify the code of the web page, i.e., keeping the website link unchanged, CNAME function is particularly suitable for such scenario.
For example, the domain name of user A is www.example.com, the file is abc.html, and the link is: http://www.example.com/abc.html.
The process is as follows:

 1.Create a Bucket named example on OSS and upload it to abc.html website file to the Bucket.
 
 2.OSS console associates the customized domain name www.example.com to the created Bucket.
 
 3.Add CNAME rules on the Domain Name Service server and map www.example.com to Bucket domain name.
 
 4.When the request of http://www.example.com/abc.html arrives at OSS, OSS will find the mapping between www.example.com and Bucket domain name (example.oss.cn-north-1.jcloudcs.com) and converts to an abc.html file that accesses the Bucket. That is, after processed by OSS, the access to http://www.example.com/abc.html, actually is the access to http:// example.oss.cn-north-1.jcloudcs.com / abc.html.
## Console: Customized Domain Name 
After OSS Bucket uploads the object, the address of the object is available, including two parts: OSS domain name + object file name and the format is: <BucketName>. <Endpoint>. In addition to fewer code changes in migrating to OSS, it can also avoid cross-domain or security issues that may be involved in the business; it is recommended that you associate the customized domain name access to your own Bucket. After domain name is associated successfully, in order to use domain name to access OSS normally, it is necessary to add CNAME record pointing to the Internet domain name corresponding to the Bucket.
 Description
* The same domain can only be bound to a unique Bucket in the same region, and each Bucket can be bound to 20 domains at most.
* The domain name you associate must be filed in the Ministry of Industry and Information Technology; otherwise, domain access will be affected.

Customized domain name is available as access address to the storage file in OSS after the customized domain name is associated successfully. For example, your Bucket example is located in cn-north-1, the object file name is test.jpg, and the customized domain name associated is hello-world.com, then the object access address is:

*  Before association: example.oss.cn-north-1.jcloudcs.com /test.jpg
*  After successful association: hello-world.com/test.jpg
  You can associate the customized domain name to the OSS Internet domain name through the console to realize the customized domain name access to the file under the Bucket, or you can configure JD Cloud CDN to realize the acceleration function at the same time. Refer to [Internet domain name- endpoint ](../../API-Reference-S3-Compatible/Regions-And-Endpoints.md)

## Action Steps for Associating Domain Name
1.Login the console->Object Storage Service->space management->enter into a Bucket-> space setting, and click **Customized Domain Name**.

2.Click the button of adding the domain name and open the page for associating user’s domain name, as shown in the following figure:

![Image](https://github.com/jdcloudcom/cn/blob/edit/image/Object-Storage-Service/OSS-094.jpg)
 
3.Associate domain name
    Input the domain name to be associated in the user’s domain name box.
    If CDN acceleration is required, go to JD Cloud CDN console to open CDN acceleration by clicking on the notification copywriting of the tab also of the customized domain name.

4.Submit

Description
* The user is required to manually add CNAME records to the domain name resolver after the submission of setting is completed.
* If your user domain name needs to access the OSS service via the mode of HTTPS, you must purchase the corresponding digital certificate. And submit your certificate through the ticket and host your certificate through JD Cloud OSS.
* If the domain name you input has been maliciously associated by other users, the system prompts that the domain name has been associated. You can complete the validation of domain name ownership in accordance with the OSS verification scheme by clicking the Open Ticket; the domain name can be associated if domain name ownership is verified, and the association between the domain name and the previous Bucket is removed at the same time.
* Currently, only customized domain name are supported to be used to download files. If you need to upload files or make various actions on Bucket, please use Object Storage Service domain name.

## Action steps for domain name resolution (take JD Cloud resolution as an example)
Login JD Cloud DNS console and enter the domain name resolution list page.
Click the destination domain name or the right-handed resolution button to enter the domain name resolution page.
Add resolution, and then add the resolution page.
Choose CNAME in the record type drop-down list; in the record value box, fill in the corresponding storage space Internet domain name (i.e. Bucket domain name, such as BucketName.oss.cn-north-1.jcloudcs.com).
Click confirmation, and the domain name resolution is completed.
Refer to [JD Cloud DNS-Add Resolution Record](../../../../Domain-Name-and-Website/JD-Cloud-DNS/Introduction/What-Is-DNS.md) for details

