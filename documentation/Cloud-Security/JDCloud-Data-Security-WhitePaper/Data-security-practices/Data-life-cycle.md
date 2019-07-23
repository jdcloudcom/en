## 4. Data Full Life Cycle Security Guarantee
  To guarantee that users can safely process cloud data, JD Cloud applies different security measures to each stage of full data life cycle, including data production, data storage, data transmission, data access, data utilization and data destruction. With JD Cloud’s full-process data security protection system, systematic security protection can be provided. With user-friendly operation interface and APIs, application by users and integration are convenient and individual demands for data security by users of different industries are satisfied.

![Life-Cycle](https://user-images.githubusercontent.com/51605713/59327713-f0cbce80-8d1c-11e9-8a91-6dc90a53f555.jpg)
  
  ### 4.1 Data Production
  Data production refers to replacement, update or modification to new contents produced by users or existing contents. For this stage, JD Cloud suggests that users shall well make data classification first, conduct risk analysis, analyze results based on risks, define storage position, storage service and security protection measures of protection data, and well make data distinguish and isolation in the beginning stage of the full life cycle of data.
  
  - Data Category and Grading
  
  When using JD Cloud’s service, users are controllers and owners of data. It is suggested that users can make category and grading management to data asset on their own. Based on data security demands, users can make category and grading management to data, recognize sensitive data and implement differential protection and fine-granularity control to data of each type and level. This is conducive to reaching compliance requirements and preventing sensitive data from leakage.
  
  It is suggested that each user shall make a complete risk assessment to its own cloud data. For recognized key or sensitive data, users can select additional data protection measures as required. Based on discovery results of sensitive data, JD Cloud can help users further analyze relationship between data, output data category and risk rating information and recommend data classification and grading architecture scheme.
  
  - Region and Isolation
  
  Users can select content data storage region on their own or select the location to deploy JD Cloud service according their specific requirements for geological location. Users can replicate and back up their own business data in the region. Without a user’s authorization, JD Cloud will not move users’ content data cross regions or duplicate the same.
  
  Generally, user data are saved in a database. To guarantee account data security as well as isolate and store user data based on the database. In other words, data of different types, i.e., users’ business data and JD Cloud platform’s data, are isolated and the security guarantee measures for storage data of database are enjoyed.
  
  ### 4.2 Data Storage
  Data storage refers to that data are submitted to a storage library, which occurs often when data are producing. For sensitive and key data stored in cloud, it is suggested users shall apply encrypted measures for protection, to lower data leakage risk. With security policies and tools of JD Cloud, users can possess and control their own data, define content storage location and protect dynamic and static content, while JD Cloud can manage access permission to cloud service and resource for users. JD Cloud provides users with the encryption service conforming to the commercial password management requirements of the state and users can easily build its safe applications.
  
  - Key Management
  
  JD Cloud Key Management Service (KMS) helps users manage and back up their encrypted keys, provide full life cycle management to cloud key, such as creation, disabling, rotation and deletion. KMS has realized integration of various cloud products. Users may user their own CMK to encrypt EBS Cloud Disk Service, OSS and RDS type database, realizing encrypted storage of cloud data. By completing technical schemes, KMS guarantees high service availability and possesses complete disaster tolerance and backup measures, to guarantee that the key will not be lost due to the force majeure.
  
  - Storage Encryption
  
  The encryption to Cloud Disk Service refers to the encryption to the data of the Cloud Disk Service for the purpose of guaranteeing security of static data in the Cloud Disk Service and data transmission security between VM instances and Cloud Disk Service.
  
  To protect data while they are stored on the disk in Object Storage Service (OSS) data center, you can set default encryption for the bucket so as to apply server-end encryption to objects stored during the default encryption validity period. When encrypting on server-side, OSS encrypts objects before saving them to the data center disk and decrypts them when downloading them.
  
The encrypted operation of data stored in the database instance of Microsoft SQL Server via transparent data encryption (TDE) is supported by RDS. TDE will automatically encrypt such data before writing them into a memory and automatically decrypt such data when reading them from the memory. The database file is encrypted in the page level. The page in the encrypted database will be encrypted before being wrote into a disk, but will be decrypted when being read into a memory.

- Storage and Backup

JD Cloud’s storage disaster recovery service provides disaster recovery capacity to services such as elastic cloud server, Cloud Disk Service and dedicated storage. Through multiple technologies such as storage replication, data redundancy and cache acceleration, cross-region replication function and real-time synchronization to assigned regions are provided to data storage by users, remote disaster recovery is realized, extreme disaster can be easily handled and business smoothness can be guaranteed, applying multiple insurances to important data.

The data backup service has perfect data backup mechanism and supports automatic backup and manual backup. Each instance is automatically backed up by default once per day and backup files can be created at any time as per business conditions. The backup files can be stored in JD Cloud Object Storage Service in the form of three copies. There is no need to worry about data loss.

### 4.3 Data Transmission

JD Cloud provides standard transmission protocols for data switch, transfer and share, conforming sensitive data transmission demands between a cloud platform and a system.

- Network Encryption Transmission

As for the Hybrid Cloud CodeDeploy of users’ businesses and global layout scenario, the virtual private network (VPN) and Direct Connection provided by JD Cloud can be used to realize interconnection of different businesses in different regions and data transmission security.

 ·  The private network is set up via VPN connection with the public network. VPN can encrypt data with methods such as IPSEC, IKE and pre-shared key, provide safe and reliable communication tunnel based on public network and realize access to Intranet by external users, cross-region Intranet interconnection, etc.
 
 ·  Direct Connection provides high-speed, secure, and stable network access service. It enables Intranet communication, data backup and disaster recovery across data centers between JD Cloud network and the network environment of user’s IDC and partners, so as to provide the user with the Hybrid Cloud solutions.
 
 - Encryption Transmission of Application
 
 JD Cloud supports encryption transmission of HTTPS security data, adopts transport layer security (TLS) protocol and provides protection for data transmission between cloud service and users. TLS provides strict identity verification, message privacy and strong integrity (allowing detection to message tampering, interception and forgery), having good interoperability, flexible algorithm as well as easy deployment and utilization.
 
 When Web network business is provided via Internet to users, the certificate management service jointly provided by JD Cloud and the world famous certificate service provider can be used. The certificate can be applied and configured through the Web website, realizing credible website identity verification and security transmission based on encryption protocol.
 
### 4.4 Data Access

Data access refers to access to cloud data by users. It is suggested that strict control and security protection shall be made by users to data access and transmission. To guarantee legal access to data, JD Cloud provides the three-in-one user business IAM, including identity authentication, authorization management and permission authentication.

 - IAM
 
JD Cloud provides the user identity and access management service (IAM). Users can create and manage sub-user accounts through the IAM service, and control the access right of these sub-users to JD Cloud resources.

 - SSH Key Pair
 
For the Linux host for user login, SSH service can encrypt the transmitted data, providing security higher than the traditional Telnet service. However, SSH automatic login based on key pair verification can guarantee users’ security while simplifying login process and reducing operation and maintenance cost.

 - Multi-factor Verification
 
MFA (Multi-Factor Authentication) is a simple and effective best security practice. It can add an extra layer of security protection in addition to the user name and password, and it can perform identity authentication to prevent false deletion when JD Cloud performs sensitive operations. After MFA is enabled, when a user logs in JD Cloud, the system will require the user to enter user name and password, followed by entering a 6-digit dynamic verification code from his or her MFA device. Even if the password of the user is stolen, this user's account cannot be used for login. Multi-factor security verification will ensure the security of the user's account to the maximum extent.

### 4.5 Data Utilization

In the data utilization process, sensitive data shall be subject to data desensitization, watermark and other treatment, making sure that use of data is compliant and avoiding information leakage and law and regulation compliance risk.

 - Desensitization of Sensitive Data
 
For users’ sensitive data, appropriate desensitization algorithms shall be used for data processing, so as to prevent sensitive data from being abused and leaked and realize reliable protection to sensitive and private data.

 - Data Processing Service
 
After a file is uploaded to Object Storage Service by a user, JD Cloud will provide extensive data processing services, capable of realizing diversified data processing functions, including image scaling, cutting, watermark, porn identification, format transformation and pattern management as well as video transcode workflow, and satisfying the access demands of multiple terminal devices under different network scenarios. Meanwhile, data security, transparency and traceability are realized.

### 4.6 Data Destruction

When the user files a request and the contract is terminated, JD Cloud will cancel the user and delete all data in strict accordance with the data destruction standard and the agreement reached with the user.

 - User Cancellation
 
After the JD Cloud account is canceled, JD Cloud will only remove the user’s personal information from the JD Cloud system and keep such information out of being retrieved and accessed or keep such information anonymous. According to provisions of relevant laws, relevant transactions records must be saved for a certain period at the background of JD Cloud. Before operation, users shall back up all information and data concerning JD Cloud account on their own.

 - Data Deletion

When the user deletes data or leaves JD Cloud, JD Cloud will overall clear assigned data and all of their replicas, including deleting index relationship between the user and data and clearing memory, block storage and other buckets. Under specific conditions, retired magnetic memories shall be demagnetized and physically destroyed, making sure that the data cannot be recovered.
