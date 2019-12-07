# Restrictions

## Log Service Restrictions

**Limitations for a single user during beta period are as follows:**

**Write rate: 5M/s, QPS: 5000/s, Index: 500M; 
It supports the user’s dumping the log data to Object Storage Service OSS. There are no limitations for dump volume and no charge for dumping. The charge as to storage capacity shall be made according to the billing rules for Object Storage Service OSS.**

Restricted Item | Restrictions
-- | --
The length of full-text retrieval search conditions | The search conditions of full-text retrieval support up to 100 characters
Number of quick retrieval conditions | Up to five retrieval conditions are supported; please use advanced retrieval when there are more than 5 retrieval conditions
The length of quick retrieval value | The value can support up to 50 characters in length
Advanced retrieval condition length | Supports up to 1000 characters
Advanced retrieval field restriction | Advanced retrieval supports up to 30 retrieval fields
"=" condition | Support to enter up to 20 values
"! =" condition | Support to enter up to 20 values

## Log Service Quota

Restricted Item | Quota Restriction
---|---
Number of log collections in a single region | 20
Number of log subjects under a single log collection | 20  

Description: If the quota is not enough, you can open ticket to apply for quota expansion.
