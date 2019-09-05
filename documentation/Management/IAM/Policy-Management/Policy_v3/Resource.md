# Resource Description Method

## JRN Description Method

All resources can adopt the following five-section description method below:

```JSON
jrn:<service_name>:<region>:<accountId>:<resourceType>/<resourceId><subresouceType>/<subresouceId>
```

## Format Description

- jrn is the short name of JDCloud Resource Name, indicating the cloud resources of JD Cloud. This field is required.
- service_name is the field describing the short name of a product and is required, with all product lines represented with *. For specific details of the service name, please refer to the cloud service supporting IAM.
- region describes the regional information. If the cloud product does not distinguish the region, this field is left blank directly; if the cloud product distinguishes the region, this field is required, with all regions indicated with *. The naming method of the existing region is defined as follows:

|  **Region**  | **Region Identifier in JRN** |
| :----------: | :-----------------: |
|  cn-north-1   |     cn-north-1      |
|  cn-east-1   |      cn-east-1      |
|  cn-east-2   |      cn-east-2      |
|  cn-south-1   |     cn-south-1      |
| Public Network (North China) |  cn-north-internet  |

- AccountID describes the primary account information of the resource owner. Each primary account is composed of 12 numbers. AccountID can be viewed from User Center > Basic Data.

- ` <resourceType>/<resourceId>/<subresouceType>/<subresouceId>` , Resource Type refers to the level I resource of the product line Open API, Resource ID refers to the level I resource ID of the product line Open API, Subresource Type refers to the level II resource of the product line Open API and Subresouce ID refers to the level II resource ID of the product line Open API. In case that the subsequent products are required to support the level III and level IV resources, please separate such products with / . All resources can be indicated with *.

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
| :---------: | :---------------------------------------------------------- |
| Cloud Disk Service      | jrn:disk:regionId:accountId:snapshots/{snapshotId}<br>jrn:disk:regionId:accountId:disks/{diskId}|
| Native Container      | jrn:nativecontainer:regionId:accountId:secrets/{name}<br>jrn:nativecontainer:regionId:accountId:containers/{containerId}|
| POD        | jrn:pod:regionId:accountId:pods/{podId}<br>jrn:pod:regionId:accountId:pods/{podId}/containers/{containerName}<br/>jrn:pod:regionId:accountId:secrets/{name} |
|JCS for Kubernetes  |jrn:kubernetes:regionId:accountId:clusters/{clusterId}<br>jrn:kubernetes:regionId:accountId:clusters/{clusterId}/nodeGroups/{nodeGroupId}|
|Container Registry       |jrn:containerregistry:regionId:accountId:registries/{registryName}<br>jrn:containerregistry:regionId:accountId:registries/{registryName}/repositories/{repositoryName}|
|Function Service      |jrn:function:regionId:accountId:functions/{functionName}|

### Network

| Product line name |                           JRN example                            |
| :---------: | :---------------------------------------------------------- |
| Load Balancer   | jrn:lb:regionId:accountId:loadBalancers/{loadBalancerId}<br>jrn:lb:regionId:accountId:loadBalancers/{loadBalancerId}/backends/{backendId}<br>jrn:lb:regionId:accountId:loadBalancers/{loadBalancerId}/listeners/{listenerId}<br>jrn:lb:regionId:accountId:loadBalancers/{loadBalancerId}/targetGroups/{targetGroupId}<br>jrn:lb:regionId:accountId:loadBalancers/{loadBalancerId}/urlMaps/{urlMapId} |


### Database and Cache

| Product Line Name |                           JRN Example                            |
| :---------: | :---------------------------------------------------------- |
| RDS |jrn:rds:regionId:accountId:instances/{instanceId}<br>jrn:rds:regionId:accountId:instances/{instanceId}/accounts/{accountName}<br>jrn:rds:regionId:accountId:instances/{instanceId}/databases/{dbName}<br>jrn:rds:regionId:accountId:instances/{instanceId}/backups/{backupId}<br>jrn:rds:regionId:accountId:backups/{backupId}<br>jrn:rds:regionId:accountId:instances/{instanceId}/importFiles/{fileName}<br>jrn:rds:regionId:accountId:instances/{instanceId}/binlogs/{binlogBackupId}<br>jrn:rds:regionId:accountId:parameterGroups/{parameterGroupId} |
| JCS for MongoDB | jrn:mongodb:regionId:accountId:instances/{instanceId}<br>jrn:mongodb:regionId:accountId:backups/{backupId}<br>jrn:mongodb:regionId:accountId:backupSynchronicities/{serviceId}|
| Distributed Relational Database Service (DRDS) | jrn:drds:regionId:accountId:instances/{instanceId}<br>jrn:drds:regionId:accountId:instances/{instanceId}/task/{taskId}<br>jrn:drds:regionId:accountId:instances/{instanceId}/databases/{databaseName}<br>jrn:drds:regionId:accountId:instances/{instanceId}/accounts/{accountName}|
| JCS for Redis | jrn:redis:regionId:accountId:cacheInstance/{cacheInstanceId}|
| JCS for Memcached | jrn:memcached:regionId:accountId:instances/{instanceId} |

### Storage

| Product Line Name |                           JRN Example                            |
| :---------: | :---------------------------------------------------------- |
| Object Storage Service     | jrn:oss:regionId:accountId:{BucketName} <br> jrn:oss:regionId:accountId:{BucketName}/{ObjectName}|
| Cloud File Service    | jrn:zfs:regionId:accountId:fileSystems/{fileSystemId} <br> jrn:zfs:regionId:accountId:fileSystems/{fileSystemId}/mountTargets/{mountTargetId}|

### Edge and Acceleration

| Product Line Name |                           JRN Example                            |
| :---------: | :---------------------------------------------------------- |
| CDN| jrn:cdn::accountId:domain/{domain}<br>jrn:cdn::accountId:liveDomain/{domain}<br>jrn:cdn::accountId:domainGroup/{id}|

### Cloud Security

| Product line name |                      JRN example                       |
| :---------: | :---------------------------------------------------------- |
| DDoS         |   jrn:baseanti:regionId:accountId:ipResources/{ip}   |
|Anti-DDoS Protection Package      |   	jrn:antipro:regionId:accuntId:instances/{instanceId}  |
|Web Application Firewall     |  jrn:waf:regionId:accountId:wafInstanceIds/{wafInstanceId}   |
|Anti-DDoS Pro    | 	jrn:ipanti::accooutId:instances/{instanceId} <br>jrn:ipanti::accooutId:instances/{instanceId}/webRules/{webRuleId}<br>jrn:ipanti::AccooutId:instances/{instanceId}/ipSets/{ipSetId}<br>jrn:ipanti::AccooutId:instances/{instanceId}/forwardRules/{forwardRuleId}|
| Application Security Gateway | jrn:sgw:regionId:accountId:instances/{instanceId} |
|Endpoint Security    |  *   |
|Situation Awareness   |   *  |
| SSL Certificate |jrn:ssl::accountId:sslCert/{certId}<br>jrn:ssl::accountId:sslRecord/{recordId}|
|Key Management Service   |  	jrn:kms::accountId:key/{keyId}<br>jrn:kms::accountId:key/{keyId}/version/{version}<br>jrn:kms::accountId:secret/{secretId}<br>jrn:kms::accountId:secret/{secretId}/version/{version}|
|Website Threat Inspector    |  *   |

### Management

| Product Line Name |                           JRN Example                            |
| :---------: | :---------------------------------------------------------- |
| Monitoring |* |
| Resource Orchestration|jrn:jdro:regionId:accountId:stacks/{stackId}|
| Directory Service        |jrn:directoryservice:regionId:accountId:directory/{directoryId}   |
| Log Service|jrn:logs:regionId:accountId:logsets/{logsetUID}<br>jrn:logs:regionId:accountId:logsets/{logsetUID}/logtopics/{logtopicUID}<br>jrn:logs:regionId:accountId:logsets/{logsetUID}/logtopics/{logtopicUID}//shippers/{shipperUID}<br>jrn:logs:regionId:accountId:logsets/{logsetUID}/logtopics/{logtopicUID}/collectinfos/{collectInfoUID}|
| Audit Trail|* |
| IAM|jrn:iam::accountId:group/{groupName} <br>jrn:iam::accountId:policy/{policyName}<br>jrn:iam::accountId:role/{roleName}<br>jrn:iam::accountId:subUser/{subUser}|
| Security Token Service | jrn:iam::accountId:role/{roleName}|
| Renew Management|* |
| Tag Service|* |

### Domain Name & License

| Product Line Name |                           JRN Example                            |
| :---------: | :---------------------------------------------------------- |
| JD Cloud DNS|jrn:domainservice::accountId:domain/{domainId}<br>jrn:domainservice::AccountId:domain/{domainId}/monitor/{monitorId}<br>jrn:domainservice:accountId:domain/{domainId}/ResourceRecord/{resourceRecordId}|
| HTTPDNS|* |

### Video Service

| Product Line Name |                           JRN Example                            |
| :---------: | :---------------------------------------------------------- |
| Video on Demand|* |
| Live Video|* |

### Big Data & Analytics

| Product Line Name |                           JRN Example                            |
| :---------: | :---------------------------------------------------------- |
| Data Factory 2.0|* |

### Middleware

| Product line name  |                           JRN example                            |
| :---------: | :---------------------------------------------------------- |
| Message Queue      | jrn:jcq:regionId:accountId:/topics/{topicName}<br>jrn:jcq:regionId:accountId:/topics/{topicName}/subscriptions/{consumerGroupId} |
| API Gateway | jrn:apigateway:regionId:accountId:accessAuths/{accessAuthId} <br>jrn:apigateway:regionId:accountId:accessKeys/{accessKeyId}<br>jrn:apigateway:regionId:accountId:apiGroups/{apiGroupId}<br>jrn:apigateway:regionId:accountId:apiGroups/{apiGroupId}/deployments/{deploymentId}<br>jrn:apigateway:regionId:accountId:apiGroups/{apiGroupId}/revision/{revisionId}<br>jrn:apigateway:regionId:accountId:rateLimitPolicies/{policyId}<br>jrn:apigateway:regionId:accountId:subscriptionKeys/{subscriptionKeyId}|
| JCS for Elasticsearch  |  ``jrn:es:regionId:accountId:instances/{instanceId}`` |
| Queue Service |jrn:jqs:regionId:accountId:queue/{queueId}  |
| JD Distributed Service Framework | jrn:jdsf:regionId:accountId:registries/{registryId}<br>jrn:jdsf:regionId:accountId:registries/{registryId}/services/{serviceName}<br>jrn:jdsf:regionId:accountId:registries/{registryId}/services/{serviceName}/instances/{instanceId}<br>jrn:jdsf:regionId:accountId:traces/{instanceId}<br>jrn:jdsf:regionId:accountId:traces/{instanceId}/services/{serviceName}<br>jrn:jdsf:regionId:accountId:traces/{instanceId}/tracings/{traceId}<br>jrn:jdsf:regionId:accountId:appconfig/{appConfigId}<br>jrn:jdsf:regionId:accountId:appconfig/{appConfigId}/versions/{appConfigVersionId}/publishes/{appConfigPublishVersionId}<br>jrn:jdsf:regionId:accountId:deployapps/{appId} |

### Hyper-Converged IDC

| Product Line Name |                           JRN Example                            |
| :---------: | :---------------------------------------------------------- |
| Cloud Physical Server|jrn:cps:regionId:accountId:instances/{instanceId} |
| Cloud Cabinet Service|* |

### Cost Center

| Product Line Name |                           JRN Example                            |
| :---------: | :---------------------------------------------------------- |
| Order Management|* |
| Invoice Management|* |
| Consumption Management|* |
| Consumption Forecast|* |
| Settlement Management|* |
| Fund Management|* |

### Channel Management

| Product Line Name |                           JRN Example                            |
| :---------: | :---------------------------------------------------------- |
| Channel Management|* |


### Developer Tools

| Product Line Name |                           JRN Example                            |
| :---------: | :---------------------------------------------------------- |
| CodeCommit|* |
| CodeBuild|	jrn:compile:regionId:accountId:jobs/{id}<br>jrn:compile:regionId:accountId:jobs/{id}/builds/{id}<br>jrn:compile:regionId:accountId:repos/{name}<br>jrn:compile:regionId:accountId:repos/{name}/hooks/{id}<br>jrn:compile:regionId:accountId:codes/{type}<br>jrn:compile:regionId:accountId:codes/{type}/accessToken/{accessToken}<br>jrn:compile:regionId:accountId:codes/{type}/branches/{branchName}|
| CodeDeploy|jrn:deploy:regionId:accoutId:app/{appId} <br>jrn:deploy:regionId:accoutId:app/{appId}/group/{groupId}<br>jrn:deploy:regionId:accoutId:app/{appId}/group/{groupId}/deploy/{deployId}<br>jrn:deploy:regionId:accoutId:app/{appId}/milestone/{milestoneId} |
| CodePipeline|jrn:pipeline:regionId:accoutId:pipeline/{uuid}<br>jrn:pipeline:regionId:accoutId:pipeline/{uuid}/instance/{instanceUuid}<br>jrn:pipeline:regionId:accoutId:pipeline/{uuid}/instance/{instanceUuid}/actions/{actionUuid}|

### Internet of Things

| Product Line Name |                           JRN Example                            |
| :---------: | :---------------------------------------------------------- |
| IoT Core|* |
| IoT Hub Protocol Adaptor|*	|
