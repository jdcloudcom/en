# Create a distributed network load balancer instance
Distributed Network Load Balancer Instance is a logic entity running Load Balancer Services, there isn’t any specific entity, and it is used for providing distributed, four-layer, stateless Load Balancer services. Currently Load Balancer Services are divided into public network load balancer service and private network load balancer service. A Distributed Network Load Balancer Instance that is not associated to an elastic IP can only provide the Load Balancer Service for the internal access business of the JD Cloud & AI, that is, the private network Load Balancer Service. A Distributed Network Load Balancer Instance that is associated to an elastic IP can only provide the Load Balancer Service for the external access service of the JD Cloud & AI, that is, the public network Load Balancer Service. You can configure the required type of Load Balancer Service based on the business scenario.

## Note
 * Before creating a distributed network load balancer instance, ensure that the distributed network load balancer instance, public IP and subnet do not meet the quota limit.

 *  When you create a DNLB, the deletion protection feature is disabled by default. If you need to enable the deletion protection to prevent the DNLB from being deleted, please go to the DNLB details page and turn on the deletion protection switch.

## Operation Steps
 1. Select ** Networking**>> **Network Load Balancer** at the navigation bar on the left side of the Console to go to the Application Load Balancer List Page.

 2. Select ** Distributed Network Type** tag to go to the Distributed Network Load Balancer List page.

 3. Click **Create** button, select Distributed Network Load Balancer in the pop-up dialog box, click **OK** button.

 4. Configure parameters of Distributed Network Load Balancer based on requirements.

 5. Click **Buy Now** to complete payment.

 6. It takes a certain amount of time (usually a few seconds) to create a Distributed Network Load Balancer Instance, please view status by manually refreshing the list page.

## Parameter Explanation
| Parameter	| Description	|
| :- | :- |
|Region	|The region where the Distributed Network Load Balancer is located, the region shall be consistent with the region where the selected VPC is located	|
|Availability Zone	|Distributed Network Load Balancers will deploy Load Balancer Instance in all AZs.	|
|Virtual Private Cloud	|The Virtual Private Cloud and subnet information of the Distributed Network Load Balancer, and the Distributed Network Load Balancer only can forward the traffic to the backend server under the same Virtual Private Cloud	|
|Public IP Billing Mode|Flexible Elastic IP billing mode associated to Distributed Network Load Balancer, including by fixed bandwidth and by traffic. If you create a private network load balancer, you can choose not to purchase the public IP. You can also purchase it after creating the Distributed Network Load Balancer by associating EIP|
