## configUrlRule

**API Description**

This configuration is not supported in the acceleration outside China/on a global scale

### Request mode
POST

### Request address
/v1/domain/{domain}/configUrlRule

### Request parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domain**|String|Yes| |User Domain|
|**beforeRegex**|String|No| |The escape in regular expressions before url rewriting shall be expressed as double slash "\\\\"; the default configuration of blank fields is "(.*)", while refilling the configured fields means an update|
|**afterRegex**|String|Yes| |The regular expression after the url is overwritten. Double slashes "\\\\" are used for escaping. More than one continuous regularizations such as "/(.\*)/(.\*)/(.\*)/(.\*)" are not supported|


### Return parameter
|Name|Type|Description|
|---|---|---|
|**result**|Object| |
|**requestId**|String|Request id, the unique identification of each request |
