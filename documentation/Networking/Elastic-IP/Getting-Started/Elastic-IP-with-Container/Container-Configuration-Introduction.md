# Configuration Description

This Tutorial will guide the users to create a container in the Virtual Private Cloud and to associate the container with Elastic IP so as to realize the container’s access to the public network. This Tutorial is applicable to the scenario where the container provides outward services.

## Before Creation

- Make sure the users have registered the users' JD Cloud account and finished real-name verification.

- Make sure the users have created an Elastic IP which has not associated with any resources.

## Procedures

Step 1: Create a Virtual Private Cloud (VPC)

Step 2: Create a container instance based on VPC the users have created.

Step 3: During the process of creating a container instance, the users can choose to assign an Elastic IP or no Elastic IP. This Tutorial is based on the assignment of no Elastic IP.

Step 4: Associate the container instance the users have created with Elastic IP through container instance associating with Elastic IP or Elastic IP associating with container instance.

## Follow-up Tests

After the container instance associates with the Elastic IP, the users can test the connectivity of the Elastic IP by using Ping Elastic IP address.
