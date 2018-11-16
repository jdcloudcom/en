## Product Deployment

#### What shall be done before creating an Application Security Gateway?

Before creating an Application Security Gateway, it is recommended to create a Load Balancer, and forward Web server traffic through Load Balancer.

Application Security Gateway needs to associate with the Load Balancer so as to protect traffic of HTTP/HTTPS.

#### How to manage after the original site is accessed into the Load Balancer?

New listening ports can be added at the Load Balancer to map SSH or remote desktop.

At the same time, you can purchase an EIP to manage the server. You can only open specific management ports through setting up security groups to ensure the security of the web server.

#### To enable the Application Security Gateway, does it need to modify CNAME? And how to modify?

#### To access the Application Security Gateway, it does not need to modify CNAME. Application security belongs to JD Cloud VPC network, so that only traffic can reach JD Application Security Gateway, it can be protected.

#### When HTTP Service is not set with domain name, whether can Application Security Gateway support protection?

It supports. The Application Security Gateway supports protection to IP, and it can be done by associating the corresponding IP on Load Balancer.

#### I only have one Virtual Machine and one EIP, can I use the Application Security Gateway without use of the Load Balancer?

No, you cannot. The Application Security Gateway can be used through associating with the Load Balancer. Currently, the Load Balancer is provided free, it is suggested that the Application Security Gateway is used after creating the Load Balancer and associating with it.

#### What is the amount of protection traffic supported in an Application Security Gateway instance?

The maximum protection traffic supported by default in an Application Security Gateway instance is 100M, if the traffic exceeds 100M, the Application Security Gateway will expand its capacity, which will not influence business traffic and do not require users’ operations.