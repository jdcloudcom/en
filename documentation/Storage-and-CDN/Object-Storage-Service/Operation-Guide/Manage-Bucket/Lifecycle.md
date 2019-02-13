# Life Cycle Management

## Life Cycle Overview

JD Cloud Object Storage Service supports object Lifecycle management function through Bucket rule setting. Expired Objects can be automatically deleted to facilitate maintenance and reduce cost during the use of Bucket. If users manually maintain the life cycle of data, it will take a lot of time and energy; but the failure of maintenance will lead to high cost. The life cycle management can help users automatically complete data life cycle management, realize automatic process of data deletion, and save manpower and money cost.

## Rule Description

### Rule Definition

The life cycle management rule shall be based on the definition of Bucket, and the configuration rule only become valid under the current Bucket. Each rule contains the following definition items:

**Support Operations**

 - Expire: Set the expiration time of Objects, and OSS will delete the specified Object when the time condition is met.

**Support Resources**

 - Prefix: Support filtering resources by prefix, and only the Objects matching with the prefix are applicable to the rule.

**Support Time Conditions**

 - Date: The absolute date to execute the operation can be specified, and after the date the relevant operation will be executed for the relevant Object;
 
 - Days: The number of relative days can be specified, and after the Days after the last modified date, the relevant operation will executed for the defined Object.

### Rule Example

The life cycle configuration is in XML format, and each Bucket has 1,000 rules at most, for example:

```
<LifecycleConfiguration>
  <Rule>
    <ID>id1</ID>
    <Filter>
       <Prefix>log1/</Prefix>
    </Filter>
    <Status>Enabled</Status>
    <Expiration>
       <Days>365</Days>
    </Expiration>
  </Rule>
  <Rule>
    <ID>id2</ID>
    <Filter>
       <Prefix>log2/</Prefix>
    </Filter>
    <Status>Enabled</Status>
    <Expiration>
       <Date>2020-01-01T00:00:00.000Z</Date>
    </Expiration>
  </Rule>  
  ...
</LifecycleConfiguration>
```

Detail Analysis:

 - ID: The current life cycle rule name is up to 64 characters, and cannot be overlapped with any ID in any other Rule;
 
 - Prefix: Specify the prefix for filtering, and resources meeting the prefix condition will be matched for the rule and become valid;

 - Status: Specify the status of the rule, and Enabled represents the enabled status, in which the rule will match execution all the time; Disabled represents the disabled status, in which the rule will become invalid;

 - Days: The number of relative days can be specified, and after the Days after the last modified date, the relevant operation will executed for the defined Object, and the Days must be a positive integer;
 
 - Date: The absolute date to execute the operation can be specified, and the rule will become valid on the specified date; the date must be UTC 0:00 a.m. in the midnight, and conform to ISO8601 format.

### Note

**Prefix**

 - The name of prefix shall not exceed 1,022 bytes under UTF-8 code;
 
 - When the prefix is null, it indicates that the rule becomes valid to all the resources in the Bucket. Please be careful when configuring the prefix;
 
 - Overlapping is allowed for all the rule prefixes, and when the time condition is met, expiration operation will be executed for all the resources meeting the prefix condition.
 
**Rule Effective Date**
 
 - When the time condition is set as Days, UTC 0:00 a.m. in the midnight after the Days after Last-Modified Time of the Object shall be the effective date and execution time of the rule; if the rule effective date is earlier than the current time, the rule will become valid and be executed at UTC 0:00 a.m. in the midnight next day. For example, if the Last-Modified Time of the Object is UTC 1:00 a.m. on January 1, 2018, and 5 days are defined as the Days for the matching rule, the expiration time shall be UTC 0:00 a.m. on January 7, 2018.

 - When the time condition is set as Date, the rule will become valid and be executed at UTC 0:00 a.m. on the Date; if a past date is set, the rule will become valid and be executed at UTC 0:00 a.m. next day. The operation based on Date is **Not One-time Operation**, and even after the Date, as long as the rule status is "enabled", OSS will continue applying the operation based on Date. Please be careful when setting the Date condition.
 
 - The Days and Date cannot be specified simultaneously in the same rule.
 
 **Execution Description**
 
 - For the configuration in any time condition, OSS will execute operation at UTC (zero zone) 0:00 a.m. on the effective date. As execution is performed in an asynchronous queue, and a large number of inventory Objects may be executed, the actual deletion time may be delayed, and you can obtain the current status of objects through GET or HEAD Object operation.
 
 - OSS makes no bill undertakings for the execution effect of life cycle, i.e. the billing of object resources shall be subject to the actual deletion time.
 
 - **Deletion of expired resources is irreversible. Please configure life cycle time plan reasonably based on your demands.**

## Configuration of Life Cycle

The Object Storage Service supports the setting and management of life cycle rule through console configuration. For setting steps, please refer to the following contents. For life cycle setting with API, please refer to [Put Bucket Lifecycle](../../API-Reference-S3-Compatible/Compatibility-API/Operations-On-Bucket/Put-Bucket-Lifecycle.md).

1. Log in to the Console->Object Storage Service->Space Management->Enter into a Bucket->Space Management->Life Cycle Management. Under the page, you can view the current Bucket life cycle rule list, and can create and delete the life cycle rule.

![生命周期规则列表](../../../../../image/Object-Storage-Service/OSS-105.png)

2. Click the **Creation Rule** to enter into the page to create the life cycle rule, on which the life cycle rule can be set.

![创建生命周期规则](../../../../../image/Object-Storage-Service/OSS-106.png)

Details:

 - Rule Name: The current life cycle rule name cannot be in conflict with the current rule names existing under the Bucket;
 
 - Status: It shall be enabled by default, and may be set as disabled. After being disabled, the rule is no longer valid until it is enabled again;
 
 - Affected Resources: The resources with the specified prefix configuration may be selected to take effect or the entire Bucket is specified to take effect;
 
 - Expiration Policies: It supports two time conditions, i.e. Days and Date, which cannot be specified simultaneously.
 
