# dash Authentication Parameter Setting API

### Description

Set dash authentication parameter



### Request Path

/api/bytedance/setAuthConfig



### Request Parameter

| **Name**      | **Type** | **Required or Not** | **Description**                          |
| ----------- | ------ | -------- | ------------------------------- |
| username      | String | Yes        | JD User Name pin                          |
| signature  | String | Yes        | Signature Calculated by General Signature Algorithm |
| domainName      | String | Yes      | Accelerated Domain |
| authKey | String | No       | Authentication key (if enableUrlAuth=on, it is required) |
| enableUrlAuth | String | Yes        | Enable Authentication or Not (Optional value: on,off; default value is off)    |
| age | String | No       | Authentication Time Stamp Expiration Time, default value is 0 |
| encAlgorithm | String | No       | Authentication Parameter Encryption Algorithm, default value is md5 and only md5 is supported |
| timeFormat | String | No       | Time Stamp Format (Optional value: hex (hexadecimal), dec (decimal system), default value is hex) |
| uriType       | String | No       | Encryption Algorithm Version (Optional value: dash/dashv2/video, default value is dashv2) |
| rule | String | No | Authentication key Generation Sequence (permutation and combination of $key, $uri, $time represent the parameter sequence when an authentication key is generated, default value: $key$uri$time) |
### Return Parameter

| **Name**         | **Description**               |
| -------------- | -------------------- |
| status      | Result Status                 |
| msg | Notification Information                   |
| data        | taskid           |


### Call Example

##### Request Example
```html
{
	"domainName":"test.aaa.com",
	"signature":"9f310af4c0b55575874dc6354e90c447",
	"authKey":"aaaaaaaa",
	"enableUrlAuth":"off",
	"age":"111",
	"encAlgorithm":"md5",
	"timeFormat":"dec",
	"uriType":"dashv2",
	"rule":"$time$key$uri"
}
​```
```

##### Return Example

* json Format

```json
{
  "status": 0,
  "msg": "Succeeded",
  "data": "1846"
}
```

```

```
