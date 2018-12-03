

# General Questions

### What is OSS?

JD Cloud Object Storage Service (OSS) is a storage service for Internet provided by JD Cloud, providing bulk, safe, low-cost, and highly reliable cloud storage service. It has a platform-independent RESTful API interface and can provide data reliability of 99.999999999% (eleven “9” in total) and service availability of 99.9%. You can store and access any type of data in any application, anytime and anywhere. In order to realize the unified utilization of resources, reduce the difficulty of using and improve the working efficiency, the data are stored in multi-region and cross-cluster.

### What’s function of OSS?

OSS provides a simple Web service interface for storing and extracting data of any amount. The developers can easily construct applications that use the Internet to store. At the same time, OSS has a high scalability; users only need to pay according to the actual consumption amount. The developers can back up mass data on the cloud in order to address expansion restriction of the bucket or for data security. They can also start with a small amount and expand applications as needed without affecting the performance or reliability. Such as the disaster recovery system, content storage and sharing, data analysis and storage, net disk and other applications.

### How to start using OSS?

To use OSS, you need to register an account of JD Cloud. If you do not have an account of JD Cloud, please enter into the [JD Cloud Registration Page] (https://accounts.jdcloud.com/p/regPage?source=jdcloud&ReturnUrl=https%3a%2f%2fuc.jdcloud.com%2fpassport%2fcomplete%3freturnUrl%3dhttps%3a%2f%2fwww.jdcloud.com) to register according to the notification. After the registration is completed, you can refer to [Getting Started of OSS - Enable OSS Service] (https://docs.jdcloud.com/cn/object-storage-service/sign-up-service-1)。

### What storage types does OSS provide?

OSS currently supports standard storage and reduced redundancy storage.

| Product Contrast | Standard Storage | Reduced Redundancy Storage|
| :------------- |:-------------:| -----:|
| Product Introduction | Object Storage Service of High Reliability, High Availability and High Performance | Object Storage Service of High Reliability and Lower Storage Cost|
| Features and Application Scenarios | It is suitable for reading data frequently and has higher requirements for high availability and high reliability compared to the reduced redundancy. Scenario: Mobile Applications, Website Videos, Data Analysis | Reduced redundancy storage enables customers to store non-critical renewable data at a level of redundancy lower than OSS standard storage <br>. It provides a highly available solution, scenario: Suitable for distributing or sharing content that is persisted elsewhere, <br> or for storing thumbnails, transcoding media, or other easily replicated processed data |
| Storage Price | CNY 0.00427/GB/Day (CNY 0.128/GB/Month) | CNY 0.00233/GB/Day (CNY 0.07/GB/Month) |

Note: Please refer to [OSS Price Overview] (h for pricing of the two storage typesttps://docs.jdcloud.com/cn/object-storage-service/price-overview)。

### How to use the reduced redundancy storage type?

JD Cloud supports the use of the reduced redundancy storage through API that is compatible with AWS S3 and SDK of various languages.

Using the reduced redundancy storage through API that is compatible with AWS S3 and SDK of various languages of JD Cloud OSS, that is, request to add the x-amz-storage-class attribute and set its value as REDUCED_REDUNDANCY when uploading the Object. For details, please refer to [PUTObject](https://github.com/jdcloud-cmw/oss/blob/master/S3-API-Document/Operations-on-Objects/Put-Object.md)。
