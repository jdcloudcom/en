#  Object Storage Service Type Introduction
OSS provides 4 storage types: Standard Storage, Infrequent Access Storage, Archival Storage and Reduced Redundancy Storage, covering all data storage scenarios from hot to cold.

**Description**: See pricing information [Price Overview](https://docs.jdcloud.com/en/object-storage-service/price-overview) for each storage type, see [Billing Rules](https://docs.jdcloud.com/en/object-storage-service/billing-rules) for specific billing method.

* [Standard Storage](StorageClass-Overview#user-content-1)
* [Infrequent Access Storage](StorageClass-Overview#user-content-2)
* [Archival Storage](StorageClass-Overview#user-content-3)
* [Reduced Redundancy Storage](StorageClass-Overview#user-content-4)


### Standard Storage (STANDARD)

<div id="user-content-1"></div>
Provide the users with high-reliability, high-availability and high-performance object storage service, which can support frequent data access. Standard storage has low access delay and higher throughput, so it is applicable to the files with a large number of hot-spots. Standard storage type is the suitable choice for social networking, sharing images, large websites, audio and video applications and big data analysis.

### Infrequent Access Storage (STANDARD-IA)

<div id="user-content-2"></div>
OSS infrequent access storage type is suitable for data stored for a long term without frequent access (once and twice accesses every month averagely). The unit price for storage is lower than the standard type and it is applicable to long-term backup of all kinds of mobile applications, intelligent devices and enterprise data and supports real-time data access. An Object of the infrequent access storage type has a minimum storage time; there will be certain costs if an Object stored for less than 30 days is deleted in advance. An Object of the infrequent access storage type has a minimum measuring space; if an Object size is less than 64KB, the bucket will be calculated according to 64KB, and data acquisition incurs certain costs.

### Archival Storage (GLACIER)

<div id="user-content-3"></div>
OSS archival storage type has the lowest unit price among storage types and is suitable for archival data requiring long-term storage (more than half a year is recommended) and rarely accessed during the storage cycle of the data; when the data is retrieved, you need to wait for few minutes to few hours according to the retrieval mode you selected. Archival storage type is suitable for archival data, operation logs, film and television materials requiring for long-term preservation. An Object of the archival storage type has a minimum storage time; if deleting Object with the storage time less than 60 days, there will be certain costs. An Object of the archival storage type has the minimum measuring space; if Object size is less than 48KB, the bucket will be calculated by 48KB, and data acquisition incurs data retrieval costs.


### Reduced Redundancy Storage (REDUCED_REDUNDANCY)

<div id="user-content-4"></div>
OSS reduced redundancy storage type requires the user to withstand data loss, which is not recommended for use.



### Storage Type Comparison

| Comparative Item        | Standard Storage                                               | Infrequent Access Storage                             | Archival Storage                               |
| ------------- | ------------------------------------------------------ | ------------------------------------ | -------------------------------------- |
| Data Persistence    | 99.999999999%                                          | 99.999999999%                        | 99.999999999%                          |
| Service    | 99.9%                                                  | 99.9%                                | 99.0%                                  |
| Data Access Delay  | ms-level Delay of Real-time Access                                       | ms-level Delay of Real-time Access                     | Require Advanced Application for Recovery                         |
| Image Processing      | Supported                                                   | Supported                                 | Supported after Retrieval                             |
| Audio and Video Processing    | Supported                                                   | Supported                                 | Supported after Retrieval                             |
| Regions Supported      | All Regions                                               | All Regions                             | All Regions                               |
| HTTPS Encryption Transmission | Supported                                                   | Supported                                 | Supported                                   |
| Storage Cost      | Standard                                                   | Relatively Low                                 | Extremely Low                                   |
| Data Retrieval Cost  | Free                                                   | Relatively Low                                 | Relatively High                                   |
| Minimum Measurement Space  | None                                                     | 64KB                                 | 48KB                                   |
| Minimum Storage Time  | None                                                     | 30 Days                                 | 60 Days                                   |
| Read and Write Request Cost  | Extremely Low                                                   | Relatively Low                                 | Relatively Low                                   |
| Adaptive Scenario      | Audio and Video Distribution Origin Server, Image Sharing and Large-scale Website | Net Disk Storage, Government and Enterprise Data Backup and Monitoring Data Storage | Medical Imaging, File Data, Business Log and Video Material |

