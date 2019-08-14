# **Query Forbidden Information List**
### 1. Description

Query Forbidden Information List (queryForbiddenInfoList)

### 2. Request Parameter

| **Name**      | **Type** | **Compulsory or not** | **Description**                          |
| ----------- | ------ | -------- | ------------------------------- |
| username      | String | Yes       | JD User Name pin                          |
| signature  | String | Yes        | User Signature    Signature: Signature information used for certification, signature algorithm: Date (the format is yyyymmdd), md5 value of the character string adding up username and user name secret key. Signature Example: For example, if the current date is 2016-10-23, the user pin is: jcloud_00 ,the user secret key SecretKey is: e7a31b1c5ea0efa9aa2f29c6559f7d61, then the signature is MD5(20161023jcloud_00e7a31b1c5ea0efa9aa2f29c6559f7d61)                    |
| domain      | String | No        | Forbidden Domain |
| url      | String | No        | Forbidden url |
| pageNumber   | int | No        | Query paging page number, 1 by default if not uploaded |
| pageSize   | int | No        | Query paging entries, 10 entries by default if not uploaded |

### 3. Return Parameter

| **Name**         | **Description**               |
| -------------- | -------------------- |
| status      | Result Status                 |
| msg | Notification Information                   |
| data | Return Data                   |


### 4. Call Example

- #### Request Address
http://opencdn.jcloud.com/api/queryForbiddenInfoList

- #### Request Example
##### curl Request Example:
```
curl -X POST \
  http://opencdn.jcloud.com/api/queryForbiddenInfoList \
  -H 'Content-Type: application/json' \
  -d '{
    "username": "test_user",
    "signature": "d00f58f89e8cd55dc080aec0d8051845",
    "pageNumber": "1",
    "pageSize": "10",
    "url": "",
    "domain": ""
}'
```


* json Format

```
{
    "username": "test_user",
    "signature": "d00f58f89e8cd55dc080aec0d8051845",
    "pageNumber": "1",
    "pageSize": "10",
    "url": "",
    "domain": ""
}
 ```

- #### Return Example

* json Format

```
{
	"status": 0,
	"msg": "Succeeded",
	"data": {
		"total": 2,
		"forbiddenList": [{
			"forbiddenDomain": "www.a.com",
			"forbiddenInfoId": 1,
			"forbiddenPreson": "test_user",
			"forbiddenType": "domain",
			"linkOther": "n",
			"reason": "test"
		},
		{
			"forbiddenDomain": "www.a.com",
			"forbiddenInfoId": 2,
			"forbiddenPreson": "test_user",
			"forbiddenType": "url",
			"forbiddenUrl": "/test1/test4.txt",
			"linkOther": "n",
			"reason": "test1"
		}]
	}
}

```
