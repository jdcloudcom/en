# Price List

The Elastic IP is composed of Standard Elastic IP and Edge Elastic IP, which support different billing types and different rates.

## Billing of Standard Elastic IP

The Elastic IP supports three types of billing, including Monthly Package, Pay by Configuration, and Pay by Consumption.

### Billing by Fixed Bandwidth

| IP provider	| Region	|Bandwidth	| Pay by Configuration (¥/hour)	 |Monthly Package (¥/month) |
|:---:|:---:| ---:| ---:| ---:|
| BGP | cn-north-1/cn-south-1/cn-east-2 | 1Mbps | 0.06 | 23 |
|  |  | 2Mbps | 0.10 | 46 |
|  |  | 3Mbps | 0.14 | 71 |
|  |  | 4Mbps | 0.18 | 96 |
|  |  | 5Mbps | 0.22 | 125 |
|  |  | Above 5Mbps, cost per Mbps | 0.14 | 80 |
|  | cn-east-1 | 1Mbps | 0.05 | 17.25 |
|  |  | 2Mbps | 0.08 | 34.5 |
|  |  | 3Mbps | 0.08 | 53.25 |
|  |  | 4Mbps | 0.14 | 72 |
|  |  | 5Mbps | 0.17 | 93.75 |
|  |  | Above 5Mbps, cost per Mbps | 0.11 | 60 |

### Billing by Consumption

| IP provider	| Region	| IP retention cost (¥/day)	 | traffic cost (¥/GB) |
|:---:|:---:| ---:| ---:|
|BGP	| cn-north-1/cn-south-1/cn-east-1/cn-east-2 | 0.48 | 0.80	|

#### Billing Example

| Region | Billing Type | Charge Formula | Billing Examples |
|:---:|:---:|:---:|:---:|
| cn-north-1 | Pay by fixed bandwidth-monthly package | 5Mbps and below: For exact charges, please see the price list of "Pay by Fixed Bandwidth" <br /><br />  Above 5Mbps: 125+(n-5)\*80 | 50Mbps. The price is: 125+(50-5)\*80=RMB 3,725/month |
|  | Pay by configuration of fixed bandwidth per hour | 5Mbps and below: For exact charges, please see the price list of "Pay by Fixed Bandwidth" <br /><br />  Above 5Mbps: (0.22+(n-5)\*0.14)\*hours | 50Mbps. The price is: (0.22+(50-5)\*0.14)\*24= RMB 156.48/day |
|  | Pay by consumption | IP Retention Fee + Traffic Fee | The max. bandwidth is 50Mbps and the actual traffic produced is 10GB. 0.48+10\*0.80=RMB 8.48/day |

## Billing of Edge Elastic IP

The Edge Elastic IP supports two types of billing, i.e. monthly package and pay by configuration. For actual price list, please contact your account manager offline.

The above price is for reference only and the actual cost is subject to the price displayed when you place an order at the Console.
