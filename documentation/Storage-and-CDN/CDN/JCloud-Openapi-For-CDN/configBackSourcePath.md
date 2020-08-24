## BackSource configuration of multiple paths (configBackSourcePath)

This configuration is not supported in the acceleration outside China/on a global scale

### Request mode
POST

### Request address
/v1/domain/{domain}/configBackSourcePath

### Request parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domain**|String|Yes| |User Domain|
|**configs**|List<ConfigBackSourcePathItems>|Yes| | Configuration Information|

### ConfigBackSourcePathItems
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**path**|String|Yes| |Must start with '/'|
|**origHost**|String|No| |BackSource host |
|**urlHost**|String|No| |url BackSource host |

### Return parameter
|Name|Type|Description|
|---|---|---|
|**result**|Object| |
|**requestId**|String| |
