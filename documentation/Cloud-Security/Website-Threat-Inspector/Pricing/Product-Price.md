# Pricing

Website Threat Inspector comprises of **Basic Version** and **Paid Version**. The paid version is composed of **Monthly Package (Enterprise Version)** and **Pay By Quantity**.

For detailed price discounts for the paid version, please visit: https://threatscanner-console.jdcloud.com/jsecscanner/create?version=basic

You may an appropriate service version according to your domain asset quantity.

## Definition of Product Version

| Product Version           | Version Definition                                                     |
| :----------------- | :----------------------------------------------------------- |
| Basic Version             | The product is a basic version in an unpaid status once enabled and users have 5 free scans which is valid within 1 year after enabling. The scan quota is deducted once for each scan of subdomain or IP until the quota runs out, and you may view back to the basic version; the basic version supports free scan of threat risks for Docker Image files (10 images/day) |
| Pay By Once Version         | The service is purchased and billed by times. The scan quota is deducted once for each scan of subdomain or IP until the quota runs out |
| Monthly Package (Enterprise Version) | 1 level I domain will be offered when you purchase 1 unit of **Instance Package** (e.g.: [jd.com](http://jd.com/)), the subdomain and IP count of this domain are not limited. You can purchase expandable instance package in the enterprise version, and 1 level I domain will be offered when you purchase each unit of **Expandable Instance Package** (e.g.: [jd.com](http://jd.com/)), the corresponding subdomain or IP count shall be less than 10) |

## Product Version Specifications

| Version Specification        | Monthly Package (Enterprise Version) | Pay By Quantity Version |  Basic Version |
| --------------- | ------------------ | ---------- | ------ |
| web Vulnerability Detection     | Support               | Support       | Support Viewing Historical Scan Records   |
| Weak Password Detection      | Support               | Support       | Support Viewing Historical Scan Records   |
| Port Risk Detection    | Support               | Support       | Support Viewing Historical Scan Records   |
| API Risk Detection    | Support               | Support       | Support Viewing Historical Scan Records   |
| Asset Association Discovery    | Support               | Support       | Support Viewing Historical Scan Records   |
| Docker Image Risk Detection   | Support (100 Images/Day)    | Support (100 Images/Day)       | Support (10 Images/Day)   |
| Scan Scenarios: Internet Asset  | Support               | Support       | Support Viewing Historical Scan Records   |
| Scan Scenarios: VPC Intranet Asset | Support<br>For vpc subnet scanned, you need to separately pay the cost of scanning probes (container instance) | Support<br>For vpc subnet scanned, you need to separately pay the cost of scanning probes (container instance) | Not Support |
| Scan Scenarios: External IDC Asset | Support<br/>You need to manually deploy a local scanning probe in the IDC environment | Support<br/>You need to manually deploy a local scanning probe in the IDC environment | Not Support |
| Purchase Expandable Instance Packagddde | Support               | Not Support       | Not Support |

#### Instructions to Expense of VPC Intranet Scanning Probe

For VPC intranet scanning within a tenant, you need to separately pay corresponding cost of scanning probes deployed in each VPC subnet(carried by container instance).

The details are subject to the latest container instance price settled by configuration, https://cns-console.jdcloud.com/host/container/create?dataCenter=cn-north-1