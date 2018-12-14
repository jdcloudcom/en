# Configuration Description

This Tutorial will guide the users to create a Load Balancer in the Virtual Private Cloud and to associate the Load Balancer with Elastic IP so as to realize the service distribution of public network’s access from Load Balancer to the backend Virtual Machines. This Tutorial is applicable to the scenario where a number of Virtual Machines provide outward services and the traffic distribution is required, such as large websites.

## Before Creation

- Make sure the users have registered the users' JD Cloud account and finished real-name verification.

- Make sure the users have created an Elastic IP which has not associated resources.

## Procedures

Step 1: Create a Virtual Private Cloud (VPC)

Step 2: Create a Load Balancer based on VPC the users have created.

Step 3: During the process of creating a Load Balancer, the users can choose to assign an Elastic IP or no Elastic IP. This Tutorial is based on the assignment of no Elastic IP.

Step 4: Associate the Load Balancer the users have created with Elastic IP through Load Balancer associating with Elastic IP or Elastic IP associating with Load Balancer.

## Follow-up Tests

After the Load Balancer associates with the Elastic IP, the users can test the connectivity of the Elastic IP by using Ping Elastic IP addresses.
