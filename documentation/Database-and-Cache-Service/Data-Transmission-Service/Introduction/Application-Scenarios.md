# Application Scenario

Application scenarios for data transmission DTS is specified as follows.

## Data Migration - Hot Migration and Onboarding of Data

DTS supports data migration without service suspension in such a way that incremental data of the source database will be continuously obtained and updated to the target database in the migration process. During the data migration process, service provided by the source database will not be affected, reducing influence to business by JD Cloud Onboarding to the greatest extent.

![1570775871943](../../../../image/Data-Transmission-Service/dts-005.png)



## Data Subscription - Business Asynchronous Decoupling

Via the data subscription service provided by DTS, deeply-coupled business can be optimized to asynchronous coupling via real-time message notification. For example, the business system A can directly return data after writing in data; the underlayer obtains data change via the data subscription service of DTS; and finally, the business system B can subscribe these changed data via SDK subscription.

![image-20200629182618385](../../../../image/Data-Transmission-Service/dts-036.png)



