# Domain Expansion Pack

This context mainly introduces the conception related to the domain expansion pack of Web Application Firewall (WAF).


## **What is Domain Pack**?

When subscribing a Web Application Firewall, the number of domain pack varies depending on which version you choose to subscribe. Each domain pack is in support of protecting 10 domains at most, all of which must be under the same top-level domain.

The number of domain pack of each service version of Web Application Firewall by default:

Basic version: 1 domain pack.

Advanced version: 1 domain pack.

Enterprise version: 2 domain packs.

Flagship version: 4 domain packs.

For example, if you have purchased the basic version, after enabling the service, you can add 1 top-level domain (such as 'example.com') and 9 child domains or extensive domains at most, such as '1.example.com', '2.example.com', and 'www.example.com'.

> Note: Only the flagship version is in support of adding extensive domain.



## What is Domain Expansion Pack

If you want to add a top-level domain or its child domains beyond the number of domain packs that each version is shipped with, you need to purchase a domain expansion pack. Assuming that you have purchased the advanced version and added a domain 'example.com' or its child domains for protection, when you try to add 'xyz.com' (another top-level domain) or its child domains for protection, you will receive a prompt telling you the domain number limit that the number of top-level domains is limited currently, please upgrade the service and extra purchase a domain expansion pack.

![image](../../../../image/WAF/price-image/WAF-Buy-Names-More.png)

In such case, you need to upgrade the Web Application Firewall service for the purchase of domain expansion pack. On the **Instance Management** page, find the corresponding instance name, click **Upgrade**, open the **Upgrade Package** page, select the number of domain expansion packs required, and complete payment. For specific operations, please refer to [Renewal and Upgrade](Renew-And-Upgrade.md).

