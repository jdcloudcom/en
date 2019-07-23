# IOPS Configured for Performance Type SSD Cloud Disk

JD Cloud provides the function of configuring the IOPS of Performance Type SSD Cloud Disk. When buying a performance type SSD cloud disk and for a purchased performance type SSD cloud disk, you can configure its IOPS.

The configuration instantly takes effect. The performance type SSD cloud disk paid by configuration will be billed according to the new IOPS configuration, from the next hour of the change; as for monthly package cloud disks, the expiration time for the resource of the cloud disk will be updated based on the updated price.

The specific action steps are as follows:

## Purchase a new performance type SSD cloud disk, and configure its IOPS

1. Log in to the JD Cloud Console, and click on **Elastic Compute** - **Cloud Disk Service** menu on the left menu to enter the Cloud Disk Service List page. Click **Create** to enter the Cloud Disk Service Creation page.

2. Choose the "region" and "availability zone" to be purchased on the purchase page, and choose "performance type SSD cloud disk" in the "specification" column. Then, the required cloud disk capacity and IOPS can be configured.

![create](../../../../../image/Elastic-Compute/CloudDisk/cloud-disk/creating_disk_iops.PNG)

   The minimum configurable value of IOPS is 200, and its maximum configuration value doesn’t exceed 50 times of the created Cloud Disk (GiB) and 32,000. For instance, when the capacity of a created Cloud Disk is 20GB, the minimum and maximum IOPSs are 200 and 20 times 50=1,000 respectively. So, the maximum configurable value of IOPS is 1,000; when the capacity of a created cloud disk is 700GB, 700 times 50=35,000, higher than 32,000. So, the IOPS can be configured as up to 32,000.

3. After the specification of a cloud disk is configured, choose whether to conduct encryption and the basic information about the cloud disk in succession as required, and click **Buy Now** to complete creation of a performance type SSD disk with pre-configured IOPS.

4. Pay by monthly package and pay by configuration are operated in the same way.

## Modify the IOPS of a purchased performance type SSD cloud disk

You can configure the IOPS of a performance type SSD cloud disk purchased in the following way:

1. Log in to the JD Cloud Console, and click on **Elastic Compute** - **Cloud Disk Service** menu on the left menu to enter the Cloud Disk Service List page. Click **Modify Cloud Disk Service** in "more" of the Cloud Disk Service operation column of the IOPS to be modified.

2. Enter the target IOPS value in the input box before the "IOPS" in the popped out "Cloud Disk Modification Box". The modifiable scope of IOPS is also 200 to 32,000, and doesn’t exceed 50 times of the capacity of the Cloud Disk.

  ![edit](../../../../../image/Elastic-Compute/CloudDisk/cloud-disk/edit_iops.png)
  
3. After the IOPS is modified, the cloud disk paid by configuration will update the latest unit price of the cloud disk under the IOPS configuration in real time, and the monthly package cloud disk will compute in real time the "expiration time after configuration change" after IOPS change. The amount for configuration enhancement to be paid by you will be computed, if you enhance the IOPS of the original disk; the expiration time of the Cloud Disk will be prolonged correspondingly, if you reduce the IOPS configuration. After configuration is completed, click **OK** to complete the payment process (if payment is required). So, the IOPS configuration adjustment of the cloud disk is completed.

