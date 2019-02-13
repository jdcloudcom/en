### 1. Log in JD Cloud console

### 2. Select the domain service > HTTPDNS

### 3. Add domain to be used

​                           

### 4. Use HTTP DNS interface to resolve the domain

HTTP DNS uses HTTP interface to provide domain resolution service externally. The service access address is available on the Account Overview page. Each user has two service IP addresses, and may try the other service address when one service address is exceptional.

| Request Method | HTTP GET                                                     |
| -------- | ------------------------------------------------------------ |
| Service URL  | http://{service address}/v1/{Account_id}/d   {service address}: It is available in the access address bar on the console Account Overview page   {Account_id}: It is available in the account information bar on the console Account Overview page |

URL Parameter Description:

| Parameter Name | Parameter Type   | Required or Not | Description                                                         |
| -------- | ---------- | -------- | ------------------------------------------------------------ |
| dn       | Domain       | Yes       | Domains to be resolved are separated by commas                           |
| ip       | IPv4 Address   | No       | Client Address                                                   |
| t        | Unix Time Stamp | Yes       | Expiration time of signature, the seconds (positive integral number) since January 1, 1970, which cannot exceed 24h from the current time |
| s        | Character String     | Yes       | Authentication character string, of which the generation rules refer to the following authentication algorithm                         |

 

Authentication Algorithm:

s = md5sum(dn-key-t)

Authentication Field Description

| dn   | Domain to be resolved, same as parameter dn in URL    |
| ---- | ---------------------------------------- |
| key  | User’s authentication key pair, available from the user console account information bar |
| t    | Authentication expiration time, same as parameter t in URL         |

 

Example:

| Example Parameter     | Parameter Value                                                       |
| ------------ | ------------------------------------------------------------ |
| {Service Address}   | 103.224.222.208                                              |
| {Account_id} | 123456                                                       |
| Domain to be Resolved   | [www.jdcloud.com](http://www.jdcloud.com)                    |
| Client IP     | 1.1.1.1                                                      |
| Customer Managed Key     | testKey                                                      |
| Authentication Expiration Time | 1544612446                                                   |
| Authentication Character String   | s=md5sum([www.jdcloud.com-testKey-1544612446](http://www.jdcloud.com-testKey-1544612446))   i.e. fec6da1a46911f77a455908a124f4142 |

Complete Request:

http:// 103.224.222.208 /123456/v1/d?dn=www.jdcloud.com&ip= 1.1.1.1&t=1544612446&s= fec6da1a46911f77a455908a124f4142

 

Request succeeded:

​         HTTP response status code is 200 OK, response result is in JSON format, and the example is as follows:

{

"ret_code":0,

"msg":"Success",

"data":[{

"domain":"www.jdcloud.com",

"ips":[" 101.124.93.21 "," 101.124.18.188"],

"ttl":600

}]

}

Request failed: HTTP response status code is 4XX, response result is in JSON format, and the example is as follows:

{

"ret_code":10015,

"msg":"Query domain is not in access domain list",

"data":"www.test.com"

}

 

| Name     | Description                                                         |
| -------- | ------------------------------------------------------------ |
| ret_code | Request response, 0 for success, non-0 for failure                                   |
| msg      | Response result description information, “success” for success, notification on detailed information for failure           |
| data     | Response data, domain resolution result for successful request, string type for failure, and it may also be null or more detailed error notification |
| domain   | Resolved Domain                                                     |
| ips      | Resolution Result                                                     |
| ttl      | Record TTL                                                      |