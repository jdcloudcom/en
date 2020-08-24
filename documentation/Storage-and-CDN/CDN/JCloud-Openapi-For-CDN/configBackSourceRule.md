## BackSource Rewriting Configuration (configBackSourceRule)

**API Description**

This configuration is not supported in the acceleration outside China/on a global scale

### Request mode
POST

### Request address
/v1/domain/{domain}/configBackSourceRule

### Request parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domain**|String|Yes| |User Domain|
|**beforeRegex**|String|No| |The escape in regular expressions before BackSource rewriting shall be expressed as double slash "\\\\"; the default configuration of blank fields is "(.*)", while refilling the configured fields means an update|
|**afterRegex**|String|Yes| |The escape in regular expressions after BackSource rewriting shall be expressed as double slash "\\\\", which does not support the regular type with multiple continuous "/(.\*)/(.\*)/(.\*)/(.\*)"|


### Return parameter
|Name|Type|Description|
|---|---|---|
|**result**|Object| |
|**requestId**|String| Request id, the unique identification of each request|
