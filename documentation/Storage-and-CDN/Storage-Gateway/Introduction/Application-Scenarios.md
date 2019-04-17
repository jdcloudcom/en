# Application Scenarios

## File Sharing and Backup

Support file sharing between multiple Virtual Machines, e.g., server A stores its log on the gateway for subsequent processing and analysis, server B also stores its application data on the gateway to implement the statelessness of the Virtual Machine itself and Storage Gateway will asynchronously back up the data to OSS finally for implement data high reliability of data.

![文件共享及备份](../../../../image/Storage-Gateway/storagegateway-4.png)

## Data Processing and Distribution

File Gateway will finally store files on Object Storage Service (OSS), OSS provides data processing and distribution capability for files, which can relieve the pressure of resource servers and offer expansive and reliable storage for the static resources by utilizing unlimited capacity and high frequent read and write characteristic.

![数据处理及分发](../../../../image/Storage-Gateway/storagegateway-5.png)
