# Create instance

You can quickly create MongoDB instances through the InfluxDB Console. This document introduces how to create MongoDB instances through the Console.

## Preconditions

- JD Cloud account registration is done and real-name verification is completed. If you have no accounts, please [register](https://accounts.jdcloud.com/p/regPage?source=jdcloud&ReturnUrl=//uc.jdcloud.com/passport/complete?returnUrl=http://uc.jdcloud.com/redirect/loginRouter?returnUrl=https%3A%2F%2Fwww.jdcloud.com%2Fhelp%2Fdetail%2F734%2FisCatalog%2F1), or [real-name verification](https://uc.jdcloud.com/account/certify).
- If the billing type is pay by configuration, please confirm that your account balance (including coupon) is not less than RMB 50.

## Operation Steps

1. Log in [InfluxDB Console](http://tsds-console.jdcloud.com/list).

2. On the "Instance List" page, click **Create** to enter the "Create Instance" page.  

   ![156413317861](../../../../image/JCS-for-InfluxDB/1564134317861.png)

3. On the "Create Instance" page, select the billing type, with **Monthly Package** or **Pay by Configuration** optional. 

   ![1564134177620](../../../../image/JCS-for-InfluxDB/1564134177620.png)

4. Select instance configuration.

   - Region

     JD Cloud’s Data Centers are distributed in many worldwide locations which are referred as the regions.

     Now, JCS for InfluxDB is only supported in cn-north-1 and will be supported in more regions later.

     Description:

     - The cloud service products in one region are interconnected through the intranet, but the resource intranets of different accounts are completely isolated;
     - The intranets between the cloud service products in different regions are not interconnected;
     - When purchasing the cloud service, you are suggested to choose the region closest to your customers to reduce access latency;

   - Configuration

     Specification: CPUs and memories occupied by instances, the higher the specification, the more the write-in point per second supported.

     Bucket: Disk space occupied by instances.

   - Network

     JCS for InfluxDB supports VPC deployment. Please firstly go to create Virtual Private Cloud and Subnet, if you haven’t completed network plan yet.

     Description:

     - The InfluxDB instance cannot be changed after VPC is selected. Please make sure that your InfluxDB instance is in the same VPC as Virtual Machines, for avoiding that your Virtual Machines cannot be connected to InfluxDB instances.

   - Instance Name

     You can customize the name of an InfluxDB instance.

   - Purchase Duration

     If the monthly package is selected as the billing type, the purchase duration shall be determined. JCS for InfluxDB supports a choice of 1 month to 3 years. Generally, the longer the purchase duration, and the cheaper the unit price. The specific discount information can be viewed at the duration option on the instance creation page.

5. Click **Buy Now** to enter the "Order Confirmation" page.

6. Confirm instance information on the "Order Confirmation" page and read the JCS for InfluxDB Service Terms.

   - Please click **Instant Account Setup** in case the billing type is pay by configuration.
   - If the billing type is monthly package, please click **Pay Now** to enter the "Order Payment" page to complete the payment process.

7. After the payment process is completed, the page will automatically redirect to the InfluxDB "Instance List" page. After the instance is created, you can view the newly created InfluxDB instance on the "Instance List" page.