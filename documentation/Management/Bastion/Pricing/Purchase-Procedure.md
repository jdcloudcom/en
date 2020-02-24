# Purchase Process 
Bastion can be purchased via the Console


## 1. Operation Entry
- After entering [Bastion List Page](https://bastion-console.jdcloud.com/list), you can the summary information of Bastion instance under current region, including specification and expiration time, etc.
- Click ** [Create]** button to create an instance.

![](/image/Bastion/Instance-List.png) 
   
## 2. Purchase Bastion
On the Bastion purchase page, complete the instance type configuration according to your business demand.
Parameters configured by instance are described as below:

- Billing Method: Only "Monthly Package" billing method is supported. For selection of billing method, please refer to [Billing Rules](./Billing-Rules.md).
- Region: Select the region where the Bastion is located, **Once the Bastion selects a region, it cannot be changed, so please select it carefully. It is recommended that the Bastion should be located at the same region as the VM Instance to be managed.**
- Specification: Specification of Bastion instance, including count of manageable assets and count of supported session concurrency. After selecting the specification, you can see the specific quota information under the specification region. For more information about quota, please refer to [Price Overview](./Price-Overview.md).
- VPC: Only creation in VPC is supported. If the user has no VPC and Subnet, he can create a VPC and Subnet through the links of [Create VPC] and [Create a new subnet]. After creation completion, click **Refresh** to view the created VPC and Subnet.
- Quantity: Count of Bastion instance to be enabled
- Purchase Duration: Valid period of Bastion instance to be enabled. The longer duration you purchase, the more discounts you will enjoy, which is subject to the Console.

## 3. Confirm Purchase
After information entering completion, you can click **Price Information** on the right side of the page and click **Buy Now

![](/image/Bastion/Create-Instance-1.png) 

## 4. Pay Order
Then enter the order confirmation page, click **Pay Now** after confirming the correctness of purchase information

![](/image/Bastion/Create-Instance-2.png) 

## 5. Initialize Bastion
After successful payment, it will automatically return to instance list page that you can view the instance status is "Initializing". The initializing process takes 1-2 minutes. If there is no newly purchased Bastion in the list, please refresh the list manually.

![](/image/Bastion/Create-Instance-3.png) 

## 6. Creation Completed
Click **Refresh** and it shows that the instance creation is completed. It means normal operation if the status is "Running"

