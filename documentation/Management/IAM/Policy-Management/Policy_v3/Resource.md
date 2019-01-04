# Resource Description Method

## JRN Description Method

All resources can adopt the following five-section description method below:

``` jrn:<service_name>:<region>:<accountId>:<resourceType>/<resourceId><subresouceType>/<subresouceId> ```

## Format Description

- jrn is the short name of JDCloud Resource Name, indicating the cloud resources of JD Cloud. This field is required.
- service_name is the field describing the short name of a product and is required, with all product lines represented with *. For specific details of the service name, please refer to the cloud service supporting IAM.
- region describes the regional information. This field is required, with all regions indicated with *. The naming method of the existing region is defined as follows:

|  **Region**  | **Region Identifier in JRN** |
| :----------: | :-----------------: |
|  cn-north-1   |     cn-north-1      |
|  cn-east-1   |      cn-east-1      |
|  cn-east-2   |      cn-east-2      |
|  cn-south-1   |     cn-south-1      |
| Public Network (North China) |  cn-north-internet  |

- AccountID describes the primary account information of the resource owner. Each primary account is composed of 12 numbers. AccountID can be viewed from User Center > Basic Data.

- ```<resourceType>/<resourceId>/<subresouceType>/<subresouceId>```, Resource Type refers to the level I resource of the product line Open API, Resource ID refers to the level I resource ID of the product line Open API, Subresource Type refers to the level II resource of the product line Open API and Subresouce ID refers to the level II resource ID of the product line Open API. In case that the subsequent products are required to support the level III and level IV resources, please separate such products with / . All resources can be indicated with *.

  JRN Example:

| **Description**                                             | **JRN Example**                                                  |
| :--------------------------------------------------- | :----------------------------------------------------------- |
| All resources of a specified product line of a specified user                   | jrn:sgw:\*:859150329790:*                                    |
| All resources in a specified region of a specified product line of a specified user     | jrn:sgw:cn-north-1:859150329790:*                            |
| A single resource in a specified region of a specified product line of a specified user     | jrn:sgw:cn-north-1:859150329790:instances/waf-yr9w9sr40      |
| A single second-level resource in a specified region of a specified product line of a specified user | jrn:sgw:cn-north-1:859150329790:database/mysql-ow3z4pnmm2/table/billing |

## JRN Example Supporting IAM Product Line

### Elastic Compute

| Product line name |                           JRN example                            |
| :--------- | :----------------------------------------------------------: |
| POD        | jrn:pod:region:accountid:pods/{podId}<br>jrn:pod:region:accountid:pods/{podId}/containers/{containerName}<br/>jrn:pod:region:accountid:secrets/{name} |

### Network

| Product line name |                           JRN example                            |
| :--------- | :----------------------------------------------------------: |
| Load Balancer   | jrn:lb:region:accountid:loadBalancers/{loadBalancerId}<br>jrn:lb:region:accountid:loadBalancers/{loadBalancerId}/backends/{backendId}<br>jrn:lb:region:accountid:loadBalancers/{loadBalancerId}/listeners/{listenerId}<br>jrn:lb:region:accountid:loadBalancers/{loadBalancerId}/targetGroups/{targetGroupId}<br>jrn:lb:region:accountid:ruleMaps/{ruleMapId} |

### Cloud Security

| Product line name   |                      JRN example                       |
| :----------- | :------------------------------------------------: |
| DDoS         |   jrn:baseanti:region:accountid:ipResources/{ip}   |
| Application Security Gateway | jrn:vpcwaf:region:accountid:instances/{instanceId} |

### Middleware

| Product line name  |                           JRN example                            |
| :---------- | :----------------------------------------------------------: |
| Message Queue | jrn:jcq:region:accountid:/topics/{topicName}<br/>jrn:jcq:region:accountid:/topics/{topicName}/subscriptions/{consumerGroupId} |

