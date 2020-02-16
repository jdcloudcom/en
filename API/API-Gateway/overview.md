# API Gateway


## Introduction
API Gateway Related APIs


### Version
v1


## API
|Interface Name|Request Method|Function Description|
|---|---|---|
|**authorizedApiGroupList**|GET|Search all authorized api group list|
|**batchOffline**|POST|Off-line by batch|
|**bindGroupAuth**|POST|Associate Group|
|**bindGroupKey**|POST|Associate Group|
|**bindGroupPolicy**|POST|Associate|
|**checkApiNameExist**|POST|Check if the API name is duplicated when creating an API. If it is duplicated, return to the duplicated apiId; if it isn’t, return to null|
|**checkAuthExist**|POST|Check if accessAuth is duplicated|
|**checkGroupNameExist**|POST|Check if group name is duplicated. If it is duplicated, return to the duplicated apiGroupId; if it isn’t, return to null|
|**checkKeyExist**|POST|Check if AccessKey is duplicated|
|**checkPin**|POST|Verify whether pin exists|
|**checkPolicyName**|PATCH|Check if the policy name is duplicated|
|**checkRevisionExist**|POST|Check if version number is duplicated. If it is duplicated, return to the duplicated version number; if it isn’t, return to null|
|**createAccessAuth**|POST|Create access authorization|
|**createAccessKey**|POST|Create New Key Pair|
|**createApiGroup**|POST|Create an API group|
|**createApis**|POST|Create api|
|**createBackendConfig**|POST|Enable backend configuration|
|**createKey**|POST|Create Key|
|**createRateLimitPolicy**|POST|Create traffic control policy|
|**createRevision**|POST|Create revision|
|**createSubscriptionKey**|POST|Create New Key Pair|
|**createUserDomain**|POST|Add user domain|
|**deleteAccessAuth**|DELETE|Delete access authorization|
|**deleteAccessKey**|DELETE|Key Pair Deletion|
|**deleteApi**|DELETE|Delete api|
|**deleteApiByName**|DELETE|Delete api|
|**deleteApiGroup**|DELETE|Delete a single API group|
|**deleteBackendConfig**|DELETE|Delete backend configuration|
|**deleteRateLimitPolicy**|DELETE|Delete a single traffic control policy|
|**deleteRevision**|DELETE|Delete a single revision|
|**deleteSubscriptionKey**|DELETE|Key Pair Deletion|
|**deleteUserDomain**|DELETE|Delete user domain APIs|
|**deploy**|POST|Release Version|
|**describeApiGroup**|GET|Search the details of API group|
|**describeApiGroups**|GET|Search groups|
|**describeBackendConfig**|GET|Search backendConfig|
|**describeBackendConfigs**|GET|Search all backend configurations under the assigned circumstance|
|**describeDeployment**|GET|Search deployment details of this version|
|**describeDeployments**|GET|Search deployment list|
|**describeIsDeployApiGroups**|GET|Search groups|
|**describeRevisions**|GET|Search revision list|
|**getRevisionIds**|GET|Search all revision numbers in a group|
|**modifyApiGroupAttribute**|PUT|Modify API group information|
|**modifyRevision**|PATCH|Modify a single revision|
|**offline**|POST|Off-line|
|**queryAccessAuth**|GET|Search a single access authorization|
|**queryAccessAuths**|GET|Search access authorization list|
|**queryAccessKey**|GET|Search a single key pair|
|**queryAccessKeys**|GET|Search key pair list|
|**queryApi**|GET|Search a single api|
|**queryApis**|GET|Search api list|
|**queryAuthGroupList**|GET|Search the deployment list that can be associated|
|**queryBindGroupAuth**|GET|Search the details associated|
|**queryBindGroupKey**|GET|Search the associated group details|
|**queryBindGroupPolicy**|GET|Search the deployment details associated|
|**queryKeyGroupList**|GET|Search the deployment list that can be associated|
|**queryKeyInfo**|GET|Search the details of key|
|**queryKeys**|GET|Search key list|
|**queryPolicyGroupList**|GET|Search the deployment list that can be associated|
|**queryRateLimitPolicies**|GET|Search the traffic control policy list|
|**queryRateLimitPolicy**|GET|Search a single traffic control policy|
|**queryRevision**|GET|Search the api corresponding to a version|
|**querySubscriptionKey**|GET|Search a single key pair|
|**querySubscriptionKeys**|GET|Search key pair list|
|**queryUcAccessKeys**|GET|Search key pair list|
|**queryUserDomains**|GET|Search domian list|
|**resetKey**|PUT|Reset the acesskey and secretkey of key|
|**updateAccessAuth**|PATCH|Update access authorization|
|**updateAccessKey**|PATCH|Update key pair|
|**updateApi**|PUT|Modify api|
|**updateApiByName**|PUT|Modify api|
|**updateBackendConfig**|PATCH|Modify the backend configuration|
|**updateKey**|PATCH|Modify key information|
|**updateRateLimitPolicy**|PATCH|Modify the traffic control policy|
|**updateSubscriptionKey**|PATCH|Update key pair|
