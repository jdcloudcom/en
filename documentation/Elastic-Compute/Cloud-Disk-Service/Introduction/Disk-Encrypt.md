# Cloud Disk Service Encryption
Cloud Disk Service Encryption is in Beta; current online regions include cn-east-2, cn-east-1 and cn-south-1.

**What is Cloud Disk Service Encryption**

Cloud Disk Service Encryption is based on KMS system of JD Cloud, which provides you with a simple and secure encryption method for encrypting your new Cloud Disk. You need not to construct, maintain and protect your own key pair management infrastructure and you also need not to change any existing applications and carry out additional decryption operation. The Cloud Disk Service Encryption function is transparent to your businesses.


**Features**

- Support data static encryption in Cloud Disk Service.
- Provide data encryption for all data transferred between Cloud Disk Service and Virtual Machines.
- Automatically encrypt all snapshots created from encrypted hard disk.
- Automatically encrypt Cloud Disk Service restored from these snapshots.

**Change of Data Encryption Status**

- Existing non-encrypted disk cannot be directly converted to encrypted disk. Accordingly, existing encrypted disk cannot be directly converted to non-encrypted disk.
- Existing snapshot generated from non-encrypted disk cannot be directly converted to encrypted snapshot. Accordingly, existing snapshot generated from encrypted disk cannot be directly converted to non-encrypted snapshot.
- Disk created from encrypted snapshot still is encrypted while disk created from non-encrypted snapshot still is non-encrypted.

**Cost**

 Cloud Disk Service Encryption Function has no extra cost


