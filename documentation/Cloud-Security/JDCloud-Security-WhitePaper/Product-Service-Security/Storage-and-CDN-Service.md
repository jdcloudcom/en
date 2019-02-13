# 3. Storage and CDN Service         
                   
## 3.1 Object Storage Service (OSS)

JD Cloud Object Storage Service (OSS) provides a safe, stable, mass and convenient object storage service for users with JD's rich technological experience in the field of distributed storage. Provide simple and convenient RESTful interface and SDK which is easy to use. Provide a full range of products including file upload, storage, download, distribution, online processing and provide a complete storage solution for data from a few bytes to a few TB.

· IAM

OSS provides Bucket Policy control permissions in such a way that corresponding permission control can be selected at the time of creating a storage space or after such creation. Bucket Policy can be modified in the permission setting.

· Anti-Leech Mechanism

OSS provides anti-leech configuration function for Bucket, which in order to reduce extra costs incurred by anti-leech of user data stored in OSS by others, OSS supports to set the anti-leech chain method based on the header field, referer in HTTP header. Access sources can be restrained by setting whitelist of Referer field on the console.

· Cross-origin Resource Sharing

Cross-Origin Resource Sharing (CORS) defines the interaction method between a user side Web application program loaded in one domain and resources in another domain. With the mechanism, the Web application server is able to support the cross-station identity and access management, make the cross-station data transmission safer and relieve risk of cross-origin HTTP request. OSS provides cross-origin resource sharing CORS setting in HTML5 protocol, helping users achieve cross-origin resource sharing.

## 3.2 Content Delivery Network (CDN)

JD Cloud CDN (Content Delivery Network) provides users with low cost, high performance and extensible Internet content distribution service based on high quality network infrastructure and Intelligent Cloud technology of JD. Utilize extensive node coverage and advanced cloud scheduling and cloud storage technologies to deliver massive amounts of content to Internet terminal users faster and more reliably, reducing website operating costs and improving users' experience towards Internet application. The predecessor of JD Cloud CDN is the self-built CDN platform serving JD Mall, which has experienced years of test of 618 and Double 11 large promoting business campaign. 600+ nodes of JD Cloud widely cover the regions and operators nationwide, which select high quality infrastructure in the whole network, with edge nodes covering the whole network and whole region to really realize receiving streaming and pushing streaming nearby.

![图 7 京东云内容分发网络节点示意图](https://github.com/jdcloudcom/cn/blob/edit/image/Security-Information/CDN11.jpg)


CDN implements the following functions in terms of IAM, security protocol and network attack protection:

· Referer Anti-Leech

Anti-Leech function identifies and determines sources based on Referer mechanism supported by HTTP protocol and tracks sources through Referer. User can identify and filter visitor identification by configuring blacklist and whitelist accessing Referer so as to restrain CDN resource access.

· URL Authentication

URL Authentication function is a kind of more secure and reliable Origin server resource anti-leech method implemented by cooperation of JD Cloud CDN FastNodes and user resource sites. CDN user site provides encrypted URL (including permission verification information) for the users, users use encrypted URL send requests to the FastNodes that verify the permission information in the encrypted URL to determine the legality of requests, which provides normal response to legal requests and denies illegal requests to effectively protect CDN user site resources.

· IP Blacklist

When a user domain is suffered from attack or brute force access, IP blacklist can deny the access of source IPs.

· Security Protection

Provide HTTPS encryption content distribution and powerful security protection capabilities of Anti-DDoS attack and CC defense.

· Security Auditing

Log Download: support query and download access logs of the designated domain or all domains for the last 30 days, with the log packaging time cycle to be hour or day granularity.

Visitor Analysis: it can analyze the regional distribution of access volume within the specified time range, as well as the traffic, access volume, accessing proportion, average download speed, first packet response time, hit ratio and other information of each region.

Hot-spot Analysis: support traffic, access volume and bandwidth query and analysis of hot-spot domains.
