# Back-to-origin Authentication Parameter Setting API

### Description

Set back-to-origin authentication parameter



### Request Path

/api/bytedance/setSourceAuthConfig



### Request Parameter

| **Name**       | **Type** | **Required or Not** | **Description**                                                     |
| -------------- | -------- | ------------ | ------------------------------------------------------------ |
| username       | String   | Yes           | JD User Name pin                                                |
| signature      | String   | Yes           | Signature Calculated by General Signature Algorithm                                       |
| domainName     | String   | Yes           | Accelerated Domain                                                     |
| originRole     | String   | No           | Master/Slave Back-to-origin (Optional value: master, slave)                           |
| enable         | String   | Yes           | Enable Authentication or Not (Optional value: on,off)                               |
| authType       | String   | No           | Authentication Type (Optional value: oss,aws (which is not supported for the time being, if tos, enable=on, it is required)   |
| originAuthRule | Objects  | No           | Specific Authentication Parameter (Optional value: TOSAuthInfo, OSSAuthInfo) (if enableUrlAuth=on, it is required) |


### TOSAuthInfo

| **Name**    | **Type** | **Required or Not** | **Description**                                                     |
| ----------- | -------- | ------------ | ------------------------------------------------------------ |
| authVersion | String   | Yes           | Configurable v1, v2.                                              |
| accessKey   | String   | Yes           | Key Pair                                                         |
| secretKey   | String   | Yes           | Encryption Key of Key Pair                                               |
| authHeaders | Object   | No           | Need the request header for participate authentication（v2 useage,eg：[{"name":"header-1","value":"a"},{"name":"header-2","value":"b"}] |
| expireTime  | String   | No           | Unit is s, default value is 900                                              |





### OSSAuthInfo

| **Name**  | **Type** | **Required or Not** | **Description**       |
| ---------- | -------- | ------------ | -------------- |
| accessKey  | String   | Yes           | Key Pair           |
| secretKey  | String   | Yes           | Encryption Key of Key Pair |
| bucketName | String   | Yes           |                |
| objectName | String   | No           |                |







### Return Parameter

| **Name** | **Description** |
| -------- | -------- |
| status   | Result Status |
| msg      | Notification Information |
| data     | taskid   |


### Call Example

##### Request Example
```html
{
	"domainName":"test.aaa.com",
	"signature":"9f310af4c0b55575874dc6354e90c447",
	"authKey":"aaaaaaaa",
	"enable":"on",
	"originRole":"master",
	"authType":"tos",
	"originAuthRule":{
		"accessKey":"aaa",
		"secretKey":"bbb",
		"authVersion":"v2",
		"AuthHeaders":[
			{
				"name":"a-b-c",
				"value":"aaaaaaa"
			},{
				"name":"d-e-f",
				"value":"ddddddd"
			}],
		"ExpireTime":"800"
	}
}
```
```

##### Return Example

* json Format

​```json
{
  "status": 0,
  "msg": "Succeeded",
  "data": "1846"
}
```

```

```
