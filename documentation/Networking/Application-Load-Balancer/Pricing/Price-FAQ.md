
# Application Load Balancer Billing FAQ

[1. How to calculate the cost of Load Balancer instance? ](Price-FAQ#user-content-1)

[2. How to calculate the cost of Load Balancer traffic? ](Price-FAQ#user-content-2)

[3. Will the traffic of Intranet Load Balancer be charged for? ](Price-FAQ#user-content-3)

[4. What's the difference between EIP traffic charges and Load Balancer traffic charges? ](Price-FAQ#user-content-4)

[5. How to calculate the traffic of Load Balancer and charge for the traffic? ](Price-FAQ#user-content-5)

[6. Will the traffic of Health Check be billed? ](Price-FAQ#user-content-6)

## 1. How to calculate the cost of Load Balancer instance?
<div id="user-content-1"></div>

The cost for the Load Balancer instance is the underlying resource occupancy fee, which is fixed regardless of whether the Load Balancer instance forwards business traffic or not and will be charged according to the actual duration. The specific price is RMB 5.52/day (RMB 0.23/hour)

## 2. How to calculate the cost of Load Balancer traffic?
<div id="user-content-2"></div>

Traffic cost means the cost arising from user business traffic processed through Load Balancer, which will be charged on the basis of the total outgoing and inbound business traffic actually processed by the Load Balancer. It will charge no cost if Load Balancer does not forward any business traffic.

## 3. Will the traffic of Intranet Load Balancer be charged for?
<div id="user-content-3"></div>

Intranet Load Balancer also charges for traffic. For Intranet Load Balancer or Public Network Load Balancer, the traffic is a measurement coefficient of the system to allocate Load Balancer resource specification. The system will allocate Load Balancer resources of different specifications according to your actual traffic volume so as to meet your business demand. The traffic cost is charged according to Load Balancer resources of different specifications.

## 4. What's the difference between Elastic IP traffic charges and Load Balancer traffic charges?
<div id="user-content-4"></div>

If the Load Balancer is associated to the Elastic IP, the Elastic IP shall be separately billed as an independent product. Load Balancer traffic cost means the cost arising from user business traffic processed through Load Balancer. The traffic volume is a measurement coefficient of the system to allocate Load Balancer resource specification and the system will allocate Load Balancer resources of different specifications according to your actual traffic volume.

## 5. How to calculate the traffic of Load Balancer and charge for the traffic?
<div id="user-content-5"></div>

When the Load Balancer is formally charged, users can calculate the traffic through the LB Monitoring item "Total Number of Bytes". Currently, there are deviations in the statistic data for this monitoring item, so it will not be taken as the reference standard for calculating traffics.

## 6. Will the traffic of Health Check be billed?
<div id="user-content-6"></div>

Traffic cost is the cost arising from user business traffic processed through Load Balancer, so the traffic of Load Balancer Health Check will not be billed.

