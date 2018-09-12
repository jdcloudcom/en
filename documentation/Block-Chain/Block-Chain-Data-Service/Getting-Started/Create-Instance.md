# Create instance

You can quickly create the block chain data service instance through the console

## Precondition

* The block chain data service permission has been enabled

## Action Steps

1. Log in [Block chain data service console](https://bds-console.jdcloud.com/block/list). 
2. Click **Create** button in the list page in the instance to enter the Create page.
3. Billing method only includes monthly package.
4. Parameters configured by instance are described as below:
    * Region: select the region of the instance; the intranets of different region resources can't be connected to each other, and they can't be changed after being created. For detailed description of the region, please refer to [Region and Availability Zone](https://www.jdcloud.com/help/detail/1844/isCatalog/1).
    * Type of database: only support SQL Server 2016 enterprise version currently.
    * Specification: only support 56 core 224GB configuration currently.
    * Storage space: the storage specification provided is 6000GB. This storage space includes data (including data files, system files, etc.)
    * Virtual private cloud: if there is no virtual private cloud or subnet in current region, please create it in advance. A hyperlink address is added on the interface, you can jump to corresponding page to create it [Virtual Private Cloud](https://console.jdcloud.com/host/vpc/list), [Subnet](https://console.jdcloud.com/host/subnet/list); when selecting virtual private cloud, please ensure the virtual machine needs to connect to a database instance is in the same virtual private cloud with the block chain data service instance.
    * Basic information
        *   Instance name: duplication is allowed but the length and characters of the name have some limits which are subject to the console.
    * Purchase duration: 1 month to 2 years can be selected; the longer duration you purchase, the more discounts you will enjoy, which is subject to the console.
       ![Create instance](Pic/Create instance.png)
5. Click **Buy Now** to enter the “Order Confirmation” page.
6. After reading the block chain cloud service terms, complete further actions according to the notification 
    * Monthly package instance: click Pay Now to enter the Payment Confirmation page; you can select several payment methods, such as using coupon, balance, bank card, etc.
    
  

