# **Product Overview**

## **What is Domain Name Resolution?**

The domain Name System, or DNS, is one of the basic systems for the entire Internet service, which is responsible for converting the Internet domain name that people access into an IP address, the process of conversion is called "Domain Name Resolution", so DNS is also called "Domain Name Resolution System". The domain name system is composed of a tree structure. Starting from the root node, it includes the root domain, the top-level domain, and the second-level domain. The bottom leaf represents the host name, and each complete path combination represent a full qualified domain name, also known as the full domain name.

![img](https://github.com/jdcloudcom/cn/blob/edit/image/dns-img/product-describe.png)

Each node of the domain name system consists of several DNS servers. The servers that have domain name resolution configuration management authorities in these node servers are called authoritative DNS servers. The servers that have no domain name resolution configuration management authority, but can synchronize the authoritative DNS server data and use the synchronous cache to provide the resolution service are called the cache DNS servers.

The authoritative DNS server only has data for some domain names and there is no direct connection between them. In order to provide a more comprehensive domain name resolution service, a recursive DNS server is generated, and the recursive DNS server in the Internet is usually managed by the operator. Recursive DNS server, also known as Local DNS, has two core functions of cache and recursive query. After receiving a DNS request, it first determines whether there is a record in the cache. If there is, it returns directly. If not, it queries the root domain, top-level domain, and second-level domain until the result is obtained and returns it to the customer. For detailed query process, see: [Domain Name Effective Process](http://www.jcloud.com/help/detail/2172/isCateLog/1).

## **What is Cloud Resolution?**

Based on the domain name resolution, the cloud resolution is a highly available, highly reliable, and feature-rich authoritative DNS server developed by the JD Cloud team in combination with JD Cloud's high-quality network and host resources. Cloud resolution has an easy-to-use console that makes it easy for users to address domain names. With multi-cluster, multi-node deployment, and 100G protection package, the professional DNS team provides comprehensive service support capabilities.
