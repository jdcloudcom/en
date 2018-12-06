# Overview of Cloud Disk Service expansion

<br>

## Overview

Cloud Disk Service is an extensible storage device provided by JD Cloud for Virtual Machines. Users can upgrade the cloud disk capacity after creating it to increase the storage space and retain original data in the cloud disk at the same time. After the Cloud Disk Service upgrades the capacity, the file system of the cloud system in the Virtual Machines should also be extended to identify the newly added storage space.

There are several scenarios of Cloud Disk Service expansion. Some common scenarios for cloud disk expansion and related document links for Cloud Disk Services used as data disks are listed as below. Please select your suitable expansion mode based on the specific scenario:



- For data disk of expansion Windows instance, please refer to [File System Expansion (Windows)](https://docs.jdcloud.com/cn/cloud-disk-service/expand-file-system-windows).



- For data disk of expansion Linux instance, please refer to [File System Expansion (Linux)](https://docs.jdcloud.com/cn/cloud-disk-service/expand-file-system-linux).



- If Linux instance has not been partitioned before but is used as raw disk formatting, please refer to [Raw Disk File System Expansion (Linux)](https://docs.jdcloud.com/cn/cloud-disk-service/expand-raw-disk-file-system).



- For multi partition disk expansion, please refer to [Multi Partition Disk Expansion](https://docs.jdcloud.com/cn/cloud-disk-service/expand-file-system-multi-partition).


## Expansion limit

The Cloud Disk Service is composed of Premium Hdd Cloud Disk and SSD Cloud Disk. The allowable upper limit of expansion for different types of Cloud Disk Service varies. Please refer to the below table for details:

<table class="confluenceTable"><tbody><tr class="firstRow"><th style="text-align: left; color: rgb(0, 0, 0); padding-top: 7px; padding-bottom: 7px; vertical-align: top; border-top-color: rgb(221, 221, 221); white-space: pre-wrap; background-color: rgb(240, 240, 240);" class="confluenceTh"><span style="color: rgb(0, 0, 0); font-family: Microsoft YaHei, &quot;Microsoft YaHei&quot;; font-size: 14px;">cloud disk type</span></th><th style="text-align: left; color: rgb(0, 0, 0); padding-top: 7px; padding-bottom: 7px; vertical-align: top; border-top-color: rgb(221, 221, 221); white-space: pre-wrap; background-color: rgb(240, 240, 240);" class="confluenceTh"><span style="color: rgb(0, 0, 0); font-family: Microsoft YaHei, &quot;Microsoft YaHei&quot;; font-size: 14px;">capacity before expansion</span></th><th style="text-align: left; color: rgb(0, 0, 0); padding-top: 7px; padding-bottom: 7px; vertical-align: top; border-top-color: rgb(221, 221, 221); white-space: pre-wrap; background-color: rgb(240, 240, 240);" class="confluenceTh"><span style="color: rgb(0, 0, 0); font-family: Microsoft YaHei, &quot;Microsoft YaHei&quot;; font-size: 14px;">capacity upper limit after expansion</span></th></tr><tr><td style="padding-top: 7px; padding-bottom: 7px; vertical-align: top; white-space: pre-wrap;" class="confluenceTd"><span style="color: rgb(0, 0, 0); font-family: Microsoft YaHei, &quot;Microsoft YaHei&quot;; font-size: 14px;">premium Hdd cloud disk</span></td><td style="padding-top: 7px; padding-bottom: 7px; vertical-align: top; white-space: pre-wrap;" class="confluenceTd"><span style="color: rgb(0, 0, 0); font-family: Microsoft YaHei, &quot;Microsoft YaHei&quot;; font-size: 14px;">&lt; 3000GB</span></td><td style="padding-top: 7px; padding-bottom: 7px; vertical-align: top; white-space: pre-wrap;" class="confluenceTd"><span style="color: rgb(0, 0, 0); font-family: Microsoft YaHei, &quot;Microsoft YaHei&quot;; font-size: 14px;">3000GB</span></td></tr><tr><td style="padding-top: 7px; padding-bottom: 7px; vertical-align: top; white-space: pre-wrap;" class="confluenceTd"><span style="color: rgb(0, 0, 0); font-family: Microsoft YaHei, &quot;Microsoft YaHei&quot;; font-size: 14px;">SSD cloud disk</span></td><td style="padding-top: 7px; padding-bottom: 7px; vertical-align: top; white-space: pre-wrap;" class="confluenceTd"><span style="color: rgb(0, 0, 0); font-family: Microsoft YaHei, &quot;Microsoft YaHei&quot;; font-size: 14px;">&lt; 1000GB</span></td><td style="padding-top: 7px; padding-bottom: 7px; vertical-align: top; white-space: pre-wrap;" class="confluenceTd"><span style="color: rgb(0, 0, 0); font-family: Microsoft YaHei, &quot;Microsoft YaHei&quot;; font-size: 14px;">1000GB</span></td></tr></tbody></table>



	

	




	
	


