# Configuration Description

This Tutorial will guide the users to create a Load Balancer in the Virtual Private Cloud and to make the Load Balancer associate Elastic IP so as to realize the diversion function of Load Balancer during the public network’s access to the Virtual Machine. This Tutorial is applicable to the scenario where a number of Virtual Machines provide outward services and the traffic distribution is required, such as large websites.

## Before Creation

- Make sure the users have registered the users' JD Cloud account and finished real-name verification.

- Make sure the users have created an Elastic IP which has not associated resources.

## Procedures

Step 1: Create a Virtual Private Cloud (VPC)

Step 2: Create a Load Balancer based on VPC the users have created.

Step 3: During the process of creating a Load Balancer, the users can choose to assign an Elastic IP or no Elastic IP. This Tutorial is based on the assignment of no Elastic IP.

Step 4: Make the Load Balancer the users have created associate Elastic IP through Load Balancer associating Elastic IP or Elastic IP associating Load Balancer.

## Follow-up Tests

After the Load Balancer associates the Elastic IP, the users can test the connectivity of the Elastic IP by using Ping Elastic IP addresses.