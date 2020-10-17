# Set Speed Limit Rules

After the website is accessed to the Web Application Firewall, you can enable the speed limit function. By speed limit, you can restrict the QPS of the specified IP (segment) to access the domain, helping the website prevent the business from being overloaded and unable to provide services. You can set the speed limit rules based on your actual needs.

## Prerequisites

- A Web Application Firewall instance has been enabled. For more information, please refer to [Enable Web Application Firewall](https://docs.jdcloud.com/en/web-application-firewall/purchase-process).
- The website has been accessed. For more information, please refer to [Add Domain](https://docs.jdcloud.com/en/web-application-firewall/step-1).

## Background Information

The speed limit function is to restrict the QPS of a specified IP (segment) to access the domain. For traffic exceeding the threshold, the configuration of returning to 493 intercept page or 302 to be redirected to the custom page can be made to limit the peak traffic of domain access. The speed limit can alleviate the consumption of source server resources by excessive requests where there is a peak in the business request, and intercept each request that exceeds the preset speed limit valve in the minimum unit time (ms) or redirect to a specified page, thereby protecting origin server services so that the origin server can continuously provide services.

## Use Restrictions

For Web Application Firewall instances in Monthly Package, the following restrictions are made to its speed limit function.

| Function     | Description                          | Advanced Version   | Enterprise Version   | Flagship Version   |
| :------- | :----------------------------- | :------- | :------- | :------- |
| Speed Limit Rules | The maximum speed limit rules that can be added.  | 10 (entries) | 20 (entries) | 20 (entries) |

## Operation Steps

1. Log in [Web Application Firewall Console](https://cloudwaf-console.jdcloud.com/overview/business).

2. Click **Website Configuration** on the left navigation bar.

3. Locate the domain to be operated on the **Web Configuration** page and click **Protection Configuration** on the operation bar.

4. On the Protection Configuration page, click the **IAM** tab, locate to the **Speed Limit** module, enable the **Status** switch and click **Add Rules**.

   ![image](../../../../../image/WAF/protect-configure/27.Speed-Limit.png)

5. Add speed limit rules. Configure the following rules in the Add Rules dialog box.

   ![image](../../../../../image/WAF/protect-configure/28.Speed-Limit-Rule.png)

   | Configuration Item              | Description                                                         |
   | :------------------ | :----------------------------------------------------------- |
   | **Rule Name**        | Name the rule.                                                 |
   | **HOST**            | Current HOST                                                     |
   | **URI**             | Specify the restricted URI, that is, set the speed limit information only on the specified page. <br />Fill in: Match mode + path<br />Optional match modes: **Exact Match**, **Prefix Match** and **Inclusion Match**. |
   | **Speed-limited IP/IP segment**     | Input of a single IP address, IP address segment or all IP segments is supported. <br />**IP**: Enter the IPv4 and IPv6 addresses to be restricted. For example 192.168.1.1<br />**IP Segment**: Enter the IP segment to be restricted. IPv4 (8 16 24 32) and IPv6 (64 128) are supported. For example 10.10.10.0/24<br />**All IP Segments**: Enter 0.0.0.0/0 |
   | **Limited Speed Size (qps)** | Enter qps (query per second). The input range of 1-10000000 is supported.        |
   | **Match Action**        | For the IP (segment) requesting traffic, when the QPS of the configured rate limit is reached, the following match actions will be executed: <br />**302 Redirect**: Redirect to the configured target page<br />**Intercept**: Intercept requests and return to 493 page by default. Returning to the custom page is supported (you need to upload a custom page first). |


## Next Steps

After enabling the speed limit rules, you can view the **Log Search** tab and search the **Speed Limit** type report on the **General Log** page to search the logs of access requests that trigger the speed limit rules and thus be filtered or intercepted. For more information, please see **View Security Report**.