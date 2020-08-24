# Bandwidth Expansion Pack

When subscribing a Web Application Firewall (WAF) by purchasing monthly package, the WAF instance of each version is limited to a certain business bandwidth. If your business has a greater demand for bandwidth, you can purchase a bandwidth expansion pack. This context mainly introduces the relevant conception and evaluation methods.


## **What is Business Bandwidth Limit**?

WAF business bandwidth refers to the flow rate of normal business traffic (unit: Mbps) in each WAF instance including all domains and sites protected by the WAF instance. 50Mbps bandwidth corresponds to 1,000-1,500 QPS (Query Per Second, that is, the number of requests per second; for instance, a HTTP GET with a URL request is a Query). QPS corresponding to each request resource is slightly different as their sizes are different.

Each version of WAF instance is limited to a certain business bandwidth. For example, in the WAP enterprise package, the business bandwidth on origin servers inside of JD Cloud is limited to 100Mbps while the business bandwidth on servers outside of JD Cloud is limited to 50Mbps. 

![image](../../../../image/WAF/price-image/site-bakage.jpg)

## How to Select Bandwidth Limit

When purchasing a WAF, you need to consider in advance the peak value of the daily total inbound and outbound traffic of all domains (sites) that you want to configure and protect through WAF, so as to ensure that the business bandwidth limit corresponding to the WAF package you have purchased is greater than the peak value of the daily total inbound or outbound traffic, whichever is greater.

> Note: Generally, the outbound traffic is be greater.

You can refer to the monitoring tool of the server in your site to evaluate the flow rate of your actual business traffic. For example, if you need to configure and protect five sites via your WAF, the peak value of the normal outbound traffic of each site shall not exceed 10Mbps, and the total traffic shall not exceed 50Mbps. In such case, you only need to purchase a WAF enterprise package.

> Note: The traffic for business evaluation refers to normal business traffic. When purchasing a WAF instance, you can increase the business bandwidth limit of your WAF instance by purchasing a bandwidth expansion pack.

## Exceed the Business Bandwidth Limit

If your normal business traffic exceeds the business bandwidth limit on the WAF instance you have purchased, the traffic forwarding of all the businesses you have configured in the WAF instance may be affected.

After exceeding the business bandwidth limit, phenomena such as traffic limiting and random packet losses may occur, causing your normal business to be unavailable, lagged and delayed for a certain period of time.

If this case arises, you need to upgrade the WAF version or purchase a bandwidth expansion pack to expand your business bandwidth, so as to avoid the impacts that may incur as a result of your normal business traffic exceeding the business bandwidth limit.

## How to Select Bandwidth Expansion Pack

If your business traffic through the domains (sites) protected by your WAF is high, you can purchase a bandwidth expansion pack to prevent you from exceeding the business limit of the WAF instance. For example, your demand for business traffic is 80Mbps (as for origin servers outside of JD Cloud) currently, and you have purchased a WAF enterprise instance (the bandwidth is limit to 50Mbps); in such case, you need to purchase an extra expansion bandwidth of 30Mbps to ensure that your business access can be normal.

- If you have already purchased a WAF instance, you can **Upgrade Current WAF Instance** to change the bandwidth expansion pack configuration, for a greater demand for business bandwidth. On the **Instance Management** page, find the corresponding instance name, click **Upgrade**, open the **Upgrade Package** page, select the expansion bandwidth pack size required, and complete payment. For specific operations, please refer to [Renewal and Upgrade](Renew-And-Upgrade.md).

- You can also add an extra business bandwidth expansion based on your actual business demand when purchasing a WAF instance.

![image](../../../../image/WAF/price-image/WAF-bangwidth-buy.png)







