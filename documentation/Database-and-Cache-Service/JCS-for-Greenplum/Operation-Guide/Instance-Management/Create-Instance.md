# Create instance

You can quickly create Greenplum instances through the JCS for Greenplum Console. This article introduces how to create JDW instances through the Console.

## Preconditions

- JD Cloud account registration is done and real-name verification is completed. If you have no accounts, please [register](https://accounts.jdcloud.com/p/regPage?source=jdcloud&ReturnUrl=//uc.jdcloud.com/passport/complete?returnUrl=http://uc.jdcloud.com/redirect/loginRouter?returnUrl=https%3A%2F%2Fwww.jdcloud.com%2Fhelp%2Fdetail%2F734%2FisCatalog%2F1), or [real-name verification](https://uc.jdcloud.com/account/certify).
- If the billing type is pay by configuration, please confirm that your account balance (including coupon) is not less than RMB 50.

## Operation Steps

1. Log in the [Greenplum Console](https://jdw-console.jdcloud.com/list).

2. On the "Instance List" page, click **Create** to enter the "Create Instance" page.

   ![11](../../../../../image/JCS-for-Greenplum/jdw-001.png)

   

3. On the "Create Instance" page, select the billing type, with **Monthly Package** or **Pay By Configuration** optional.

4. Select instance configuration.

   - Region

     JD Cloud’s Data Centers are distributed in many worldwide locations which are referred as the regions. JCS for Greenplum currently supports cn-north-1, and will support more regions in the future.

     Description:

     - The cloud service products in one region are interconnected through the intranet, but the resource intranets of different accounts are completely isolated;
     - The intranets between the cloud service products in different regions are not interconnected;
     - When purchasing the cloud service, you are suggested to choose the region closest to your customers to reduce access latency;

   - Specification

     Support selection of node specifications and node counts. The node is the data node of the Greenplum instance, that is, the Segment node.

     - As for the node specification, support jdw.dc1.large (2vcpu /16G Mem /160G SSD), jdw.dc1.large (2vcpu /16G Mem /160G SSD) two specifications.
     - As for node counts, support 2-8 nodes.

   - Network

     JCS for Greenplum supports VPC deployment, and please firstly go to create VPC and subnets, if you haven’t completed network planning yet.

     The Greenplum instance cannot be changed after VPC is selected. Please make sure that your Greenplum instance is in the same VPC as Virtual Machines, for avoiding that your Virtual Machines cannot connect to Greenplum instances.

   - Accounts

     It is optional whether to create accounts while creating instances. It is allowed to create accounts immediately or after instance creation is completed.

     The account is of high permission type, each Greenplum instance only supports creation of one account at the Console. You can create other accounts through this account.

   - Purchase

     If the monthly package is selected as the billing type, the purchase duration shall be determined. JCS for Greenplum supports a choice of 1 month to 3 years. Generally, the longer the purchase time, the cheaper the unit price, and the specific discount information can be viewed at the time duration of instance page creation.

5. Click **Buy Now** to enter the "Order Confirmation" page.

6. Confirm the instance information on the "Order Confirmation" page and read the JCS for Greenplum Service Terms.

   - Please click **Instant Account Setup** in case the billing type is pay by configuration.
   - If the billing type is monthly package, please click **Pay Now** to enter the "Order Payment" page to complete the payment process.

7. After the payment process is completed, the page will automatically redirect to "Greenplum Instance List" page to wait for completion of the instance creation. You can view the newly created Greenplum instance on the "Instance List" page.

