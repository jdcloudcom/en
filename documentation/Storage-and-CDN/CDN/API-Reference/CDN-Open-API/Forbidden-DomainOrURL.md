# **Set Forbidden Information**
### 1. Description

Forbidden Domain or URL (forbiddenCdnDomainOrUrl)

### 2. Request Parameter

| **Name**      | **Type** | **Compulsory or not** | **Description**                          |
| ----------- | ------ | -------- | ------------------------------- |
| username      | String | Yes       | JD User Name pin                          |
| signature  | String | Yes        | User Signature    Signature: Signature information used for certification, signature algorithm: Date (the format is yyyymmdd), md5 value of the character string adding up username and user name secret key. Signature Example: For example, if the current date is 2016-10-23, the user pin is: jcloud_00 ,the user secret key SecretKey is: e7a31b1c5ea0efa9aa2f29c6559f7d61, then the signature is MD5(20161023jcloud_00e7a31b1c5ea0efa9aa2f29c6559f7d61)                    |
| domain      | String | Yes        | Forbidden Domain |
| forbiddenType   | String | Yes        | Only can be one of domain or url |
| forbiddenUrl   | String | No        |Only when the forbidden type is url, this parameter is mandatory and only one URL can be forbidden. If multiple URLs need to be deleted, you need to submit multiple requests. url must begin with /  |
| reason   | String | Yes       | Forbidden Reason |
| linkOther   | String | No       | If the associated forbidden parameter is y, it means it is not allowed to add all domains under the associated root domain. If null or n, it means only current domain is forbidden without limit to add domains |
### 3. Return Parameter

| **Name**         | **Description**               |
| -------------- | -------------------- |
| status      | Result Status                 |
| msg | Notification Information                   |
| data | Return Data                   |


### 4. Call Example

- #### Request Address
http://opencdn.jcloud.com/api/forbiddenCdnDomainOrUrl

- #### Request Example
##### curl Request Example:
```
curl -X POST \
  http://opencdn.jcloud.com/api/forbiddenCdnDomainOrUrl \
  -H 'Content-Type: application/json' \
  -d '{
    "username": "test_user",
    "reason": "test_user",
    "forbiddenType": "url",
    "signature": "d00f58f89e8cd55dc080aec0d8051845",
    "forbiddenUrl": "/test",
    "domain": "www.a.com",
    "linkOther": "n"
}'
```


* json Format

```
{
    "username" :"test_user",
    "signature" :"d00f58f89e8cd55dc080aec0d8051845",
    "domain":"www.a.com",
    "forbiddenType":"url",
    "forbiddenUrl":"/test",
    "reason":"test_user",
    "linkOther":"n"
 }
 ```

- #### Return Example

* json Format

```
{
    "status": 0,
    "msg": "Succeeded",
    "data": "www.a.com"
}

```
