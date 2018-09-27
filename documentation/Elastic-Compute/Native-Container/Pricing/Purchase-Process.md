
# Purchase Process

**Limitations for Purchase of Container Instances **

 1. Each user can create 20 container instances in each region; if you need to create more instances, you may request to increase the quota limit through opening ticket, and JD Cloud will increase the quota limit for you after evaluation based on your actual needs.
 2. Container instance will support the adjustment to configuration later
 3. A single instance is allowed to be associated with only 1 EIP
 4. A single instance data disk is allowed to be mounted with up to 7 Cloud Disk Services

** Cloud Disk Service Methods and Limitations **

Purchase Method: 

System Disk: Only support purchase with an instance

System disk file system format supports xfs or ext4; when creating a container, the system disk of the container will be formatted according to the file system format selected

The mounted directory of the system disk is the root directory "/" and cannot be modified

The current system disk must be deleted together with the container

Data Disk: Support to purchase with or without instance 

Support to purchase with instance

Please refer to Create Container Instance

Purchase without Instance

The container instance supports only the data disks associated at the time of creation

Support only the existing cloud disk services in the xfs or ext4 format as the data disks of containers, and adding cloud disk services in other file system formats will cause creation failure

Please refer to Creating Cloud Disk Services

Limitation for Purchase of Disk 

Each user can create 20 Cloud Disk Services in each region; if you need to create more Cloud Disk Services, you may request to increase the quota limit through opening ticket, and JD Cloud will increase the quota limit for you after evaluation based on your actual needs.

The system disk currently supports only SSD disks.

A single instance data disk is allowed to be mounted with up to 7 Cloud Disk Services

Only the Cloud Disk Services under monthly package support capacity expansion


** Methods and Limitations for Purchase of EIP**
Purchase Method

EIP supports to purchase with or without an instance:

Support to purchase with instance

Please refer to Create Container Instance

Purchase without Instance

Please refer to Create EIP

Limitation of Elastic IP:

Each user can apply for 10 EIPs in each region; if you need to apply for more EIPs, you may request to increase the quota limit through opening ticket, and JD Cloud will increase the quota limit for you after evaluation based on your actual needs.

A single instance is allowed to be associated with only 1 EIP.

The bandwidth of the EIP purchased is the uplink bandwidth, i.e., the outgoing bandwidth.

An instance can be associated/disassociated with EIP repeatedly. To replace the EIP of an instance already associated with a EIP, you must get disassociated with the current associated EIP before getting disassociated with a new EIP.

The EIP under monthly package supports the upward adjustment of bandwidth; the EIP based on pay-by-configuration and pay-by-consumption supports the upward or downward adjustment of bandwidth.


**Operation Steps:**

I. Entrance 1: Product Introduction Page at the Official Website

Open JD Cloud Official Website

Select Products - Elastic Compute - Native Container

Go to the Native Container Product Introduction page and Click Buy Now

II. Entrance 2: Console

Login to JD Cloud’s Console

Select Elastic Compute - Native Container

Go to Container Instance and Click Create