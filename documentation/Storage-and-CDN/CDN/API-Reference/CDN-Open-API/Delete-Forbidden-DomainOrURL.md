# **Delete Forbidden Information**
### 1. Description

Delete Forbidden Information (deleteForbiddenInfo)

### 2. Request Parameter

| **Name**      | **Type** | **Compulsory or not** | **Description**                          |
| ----------- | ------ | -------- | ------------------------------- |
| username      | String | Yes       | JD User Name pin                          |
| signature  | String | Yes        | User Signature    Signature: Signature information used for certification, signature algorithm: Date (the format is yyyymmdd), md5 value of the character string adding up username and user name secret key. Signature Example: For example, if the current date is 2016-10-23, the user pin is: jcloud_00 ,the user secret key SecretKey is: e7a31b1c5ea0efa9aa2f29c6559f7d61, then the signature is MD5(20161023jcloud_00e7a31b1c5ea0efa9aa2f29c6559f7d61)                |
| forbiddenType   | String | Yes        | Only can be one of domain or url |
| domain      | String | Yes        | Forbidden Domain |
| forbiddenUrl   | String | No        |Only when a forbidden url is deleted, this parameter is mandatory and only one URL can be deleted and forbidden each time. If multiple URLs need to be deleted, you need to submit multiple requests. url must begin with /  |

### 3. Return Parameter

| **Name**         | **Description**               |
| -------------- | -------------------- |
| status      | Result Status                 |
| msg | Notification Information                   |
| data        | Domain                 |


### 4. Call Example

- #### Request Address
http://opencdn.jcloud.com/api/deleteForbiddenInfo

- #### Request Example
##### curl Request Example:
```
curl -X POST \
  http://opencdn.jcloud.com/api/deleteForbiddenInfo \
  -H 'Content-Type: application/json' \
  -d '{
    "username" :"test_user",
    "signature" :"d00f58f89e8cd55dc080aec0d8051845",
    "domain":"www.a.com",
    "forbiddenType":"domain"
 }
'
```


* json Format

```
{
    "username" :"test_user",
    "signature" :"d00f58f89e8cd55dc080aec0d8051845",
    "domain":"www.a.com",
    "forbiddenType":"domain"
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
