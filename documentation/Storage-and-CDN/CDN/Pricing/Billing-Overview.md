# Billing overview

**I. ** **General Pay-In-Advance Method**

The customer needs to recharge the JD Cloud account in advance.

Two billing modes are supported, traffic billing and  bandwidth peak-value billing, and the traffic billing is the default billing method.

For daily billing, the billing period is 00:00-24:00 per day and the bill of the last day is settled at 06:00.

1. Traffic billing: The billing actually consumed is billed in GB. For daily deduction and monthly tier, traffic consumed by the user in the billing period will be charged by tiers as per natural months for each billing.

| **Billing mode** | **Billing tier**   | **Price (¥/GB) ** |
| ------------ | -------------- | ----------------- |
| Traffic         | 0GB-10TB(inclusive)   | 0.35              |
|              | 10TB-50TB(inclusive)  | 0.32              |
|              | 50TB-100TB(inclusive) | 0.28              |
|              | >100TB         | 0.25              |

2. Bandwidth peak billing: The bandwidth peak consumed is billed; a bandwidth is counted per 5 minutes and 288 points are counted per day in total. For each billing, the maximum bandwidth (bandwidth peak) of the user in this billing period is billed as per the daily tier.

| **Billing mode** | **Billing tier**      | **Price (¥/Mbps/day) * |
| ------------ | ----------------- | ---------------------- |
| Bandwidth peak     | 0-512Mbps(inclusive)     | 1                      |
|              | 512Mbps-5Gbps(inclusive) | 0.9                    |
|              | >5Gbps            | 0.75                   |

**II. Pay-As-You-Go method of Major Customer**

To meet the flexible billing requirements of customers with large business scale, JD Cloud CDN also supports the 95 bandwidth peak or monthly total traffic billing method and the monthly payment and pay-as-you-go billing mode is adopted. The customer shall use the service first and then pay the bill. The consumption bill of last month will be produced on the 1st day of a next month and the charge is paid as per the off-line contractual terms. For specific conditions, please contact the JD Cloud’s business personnel.

Billing instructions for 95 bandwidth peak

* 95 bandwidth peak billing is settled per natural months. In a natural month, the valid bandwidth value of each 5 minutes are sorted by descending order, and the top 5% bandwidth number is removed and the left highest bandwidth value is the 95 bandwidth peak billing value.

* Taking a month with 30d for example, every 5 minutes are deemed as 1 bandwidth value point, each hour has 12 value points and each month has 12 x 24 x 30 = 8640 value points. All points are sorted in decreasing order as  per the bandwidth value, the top 5% value points will be removed (i.e. 8640 x 5% = 432 points) and the 433th point is used as the billing point.
