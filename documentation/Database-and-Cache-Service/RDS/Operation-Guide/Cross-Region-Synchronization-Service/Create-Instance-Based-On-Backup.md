# Create a New Instance based on Backup Data
Creating a new instance based on backup data refers to create a new instance by backing up any time point during the effective storage time. Contents can be replicated exactly same as the main instance, including instance data and instance settings. When a new instance is created based on backup data, it is recommended to select a type and storage space that is greater than or equal to the original instance, otherwise data restoration may take longer time due to performance limits.

## Precondition
* Cross-region backup service permissions have been enabled.
* The account balance (or the Coupon amount) shall not be less than RMB 50 if the resources are paid by configuration.

## Precautions
* The data of the cross-region backup synchronization service is retained for 7 days, and you can select a data time point within 7 days to create a new instance.

## Operation Steps
1. Login [Cross-region Backup Service Management Console](https://rds-console.jdcloud.com/acrossRegionList).
2. Select the target instance that requires to create a new instance based on the backup data on the service list page and click ***Creates a New Instance Based on the Backup Data*** in ***Operation*** to enter the creation page.
3. Billing Method: Monthly package or pay by configuration are available. Please refer to the billing method.
4. Parameters of the instance Configuration as Follows:
    * Region: The region where the new instance is located, cannot be modified. By default, and the domain where the backup data is located is used by default.
    * Select Time: You can select any day of the last 7 days, but it cannot be earlier than the creation date of the synchronization service, which is subject to the console.
    * Database Type: The database type of the original instance cannot be modified. The database type of the source instance is in synchronization service by default.
    * Version: The database version of the original instance cannot be modified. The database version of the source instance in the synchronization service is used by default.
    * Type: CPU and memory of the instance in different types corresponding to relevant performance and price.
    * Storage Space: This storage space includes data space, system file space, and binlog file space. Make sure that the storage space is not less than the storage space of the source instance in the synchronization service.
    * Basic Information
        * Database Name: It is allowed to repeat, while the length and characters of the name have certain limits, which shall be subject to the console.
    * Virtual Private Cloud: If there is no Virtual Private Cloud or subnet in the current region, please make the relevant creation in advance, and add the hyperlink address on the interface to jump to the corresponding page to create [Virtual Private Cloud](https://console.jdcloud.com/host/vpc/list), [Subnet](https://console.jdcloud.com/host/subnet/list)); when a Virtual Private Cloud is selected, users shall ensure that the VM and database instance to be connected to the database instance are in a same Virtual Private Cloud.
    * Deployment Mode: Currently, it supports single-availability zone deployment and multi-availability zone deployment.
    * Purchase Duration: The purchase duration shall be selected if the billing method is monthly package, with options varying from 1 month to 2 years. The longer the purchase duration, the greater the discount is, which shall be subject to the console.
    
    ![Screenshot](https://img1.jcloudcs.com/cms/75c646b0-0a12-433a-b9e6-f4cacc4e3a5120180725142347.png)

5. Click ***Buy Now*** to enter the order confirmation page.
6. Read the RDS Terms of Service and finish subsequent operations as per instructions.
    * Instance of Monthly Package: Click ***Pay Now***, enter the payment confirmation page, there is a variety of payment methods, such as coupons, balances and bank cards.
    * Instance Paid by Configuration: Click ***Instant Account Setup*** to start creating an instance and enter the instance list page.
