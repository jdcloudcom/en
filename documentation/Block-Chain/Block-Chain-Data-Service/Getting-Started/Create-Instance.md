# Create An Instance

You can quickly create the Block Chain Data Service instance through the console

## Precondition

* The Block Chain Data Service permission has been enabled

## Action Steps

1. Log in [Block Chain Data Service console](https://bds-console.jdcloud.com/block/list). 
2. Click **Create** button in the list page of the instance to enter the Create page.
3. Billing method only includes monthly package.
4. The parameter configure of instance are described as below:
    * Region: select the region of the instance, the intranets of different region resources can't be connected to each other, and they can't be changed after being created. For detailed description of the region, please refer to [Region and Availability Zone](to be supplemented).
    * Type of database: only support SQL Server 2016 enterprise version currently.
    * Specification: CPU and memory of instance. For detailed description of the specification, please refer to [Price Overview](../../Price-Overview.md).
    * Storage space: this storage space includes data (including data files, system files, etc.)
    * VPC: if there is no Virtual Private Cloud or subnet in current region, please create it in advance. A hyperlink address is added on the console, you can jump to corresponding page to create it [VPC](https://console.jdcloud.com/host/vpc/list), [Subnet](https://console.jdcloud.com/host/subnet/list). When selecting Virtual Private Cloud, please ensuring the Virtual Machine and  the Block Chain data service instance are in the same Virtual Private Cloud.
    * Basic Information
        *   Instance Name: duplication is allowed but the length and characters of the name have some limits which are subject to the console.
    * Purchase duration: 1 month to 3 years can be selected; the longer duration you purchase, the more discount you will enjoy, which is subject to the console.
       ![Create An Instance](Pic/Create instance.png)
5. Click **Buy Now** to enter the “Order Confirmation” page.
6. After reading the Block Chain cloud service term, complete further action according to the notification 
    * Monthly package instance: click **Pay Now** to enter the payment confirmation page; you can select several payment methods, such as using coupon, balance, and bank card.
    
  

