# Update History #
API Version: 0.3.0

|Release Time|Version Number|Update|Instructions|
|---|---|---|---|
|2019-03-18   |0.3.0   |Add new interfaces and adjust some fields       | Add simple creation interface of Object Storage Service migration task <br> Add search of assigned task and search of compiling log of specified execution number <br>Add region related interface <br> Add enabling and disabling interface of Load Balancer and Load Balancer listener <br> Add service group search interface by id <br> Add creation and deletion interface of Security Group rules <br> Add interface for authorization of RDS Database accounts through asynchronous tasks <br> Add specification search interface of Database |
|2019-01-05   |0.2.0   |Add interface, adjust part of fields       | Add RDS, OSS basic operations <br> Add Deployment basic operation <br>All requests of passing data in the body, body data structure change <br>Change the field vms in creating Virtual Machines Request (createVmReq) to vm <br> Change addressPrefix of all information in Vpc to cidrBlock <br> Remove masterAZ and slaveAZ from SlbInfo information in Slb, and replaced them with azs data |
|2018-12-18   |0.1.0   |Add interface       | Add basic operations |
