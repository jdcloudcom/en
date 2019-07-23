#  JD Cloud Object Storage Service Type Introduction
OSS provides three storage types: standard storage, archival storage and reduced redundancy storage, covering all data storage scenarios from hot to cold.

**Description**: See pricing information [Price Overview](https://docs.jdcloud.com/en/object-storage-service/price-overview) for each storage type, see [Billing Rules](https://docs.jdcloud.com/en/object-storage-service/billing-rules) for specific billing method.

* [Standard Storage](StorageClass-Overview#user-content-1)
* [Archival Storage](StorageClass-Overview#user-content-2)
* [Reduced Redundancy Storage](StorageClass-Overview#user-content-3)

### Standard Storage (STANDARD)

<div id="user-content-1"></div>

Provide the users with high-reliability, high-availability and high-performance object storage service, which can support frequent data access.
Standard storage has low access delay and higher throughput, so it is applicable to the files with a large number of hot-spots. Standard storage type is the suitable choice for social networking, sharing images, large websites, audio and video applications and big data analysis.

Key Characteristic:
* Data Persistence of 99.999999999%
* Service Availability of 99.9%
* Support Real-time Access
* Support HTTPS Encryption Transmission
* Support Image Processing
* Support Audio and Video Processing
* Support All Regions
* Storage Cost Standard
* No Minimum Storage Time and Minimum Metering Space


### Archival Storage (GLACIER)

<div id="user-content-1"></div>

OSS archival storage type has the lowest unit price among storage types and is suitable for archival data requiring long-term storage (more than half a year is recommended) and rarely accessed during the storage cycle of the data; when the data is retrieved, you need to
wait for few minutes to few hours according to the retrieval mode you selected. Archival storage type is suitable for archival data, operation logs, film and television materials requiring for long-term preservation. An Object of the archival storage type has a minimum storage time; if deleting Object with the storage time
less than 60 days, there will be certain costs. An Object of the archival storage type has the minimum measuring space; if Object size is less than 48KB, the bucket will be calculated by 48KB, and data acquisition incurs data retrieval costs.


Key Characteristic:

* Data Persistence of 99.999999999%
* Service Availability of 99.90%
* The data can only be read if a restore operation is requested in advance
* Support HTTPS Encryption Transmission
* Support All Regions
* Low Storage Cost
* Have Minimum Storage Time and Minimum Metering Space

### Reduced Redundancy Storage (REDUCED_REDUNDANCY)

<div id="user-content-1"></div>

OSS reduced redundancy storage type requires the user to withstand data loss, which is not recommended for use.





