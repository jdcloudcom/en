### Use HTTP DNS interface to resolve the domain

HTTP DNS, by virtual of HTTP API, can provide domain resolution service, with service access address viewed in the Account Overview Page. Each user has multiple service IP addresses. When one service address is abnormal, the user can try other service addresses, improving overall availability.
|||
|---|--|
| Request Method | HTTP GET                                                     |
| Service URL  | `http://{service address}/v1/{Account_id}/d` <br> {service address}: It is available in the access address bar on the console Account Overview page  <br> {Account_id}: It is available in the account information bar on the console Account Overview page |

URL Parameter Description:

| Parameter Name | Parameter Type   | Required or Not | Description                                                         |
| -------- | ---------- | -------- | ------------------------------------------------------------------------ |
| dn       | Domain       | Yes       | Domains to be resolved are separated by commas                           |
| qt       | DNS Type String | No       | Record type that you need to obtain; if no type is transmitted, the record A is the default value; resolution of types A(IPv4) and AAAA(IPv6) are supported; one resolution type is transmitted for one request only   |
| ip       | IP Address   | No       | Client Address                                                   |
| t        | Unix Time Stamp | Yes       | Expiration time of signature, the seconds (positive integral number) since January 1, 1970, which cannot exceed 24h from the current time |
| s        | Character String     | Yes       | Authentication character string, of which the generation rules refer to the following authentication algorithm                         |


Authentication Algorithm:

s = md5sum(dn-key-t)

Authentication Field Description

| Parameter Name  | Parameter Description |
| --- | ----------- |
| dn   | Domain to be resolved, same as parameter dn in URL    |
| key  | User’s authentication key pair, available from the user console account information bar |
| t    | Authentication expiration time, same as parameter t in URL         |

Example:

| Example Parameter     | Parameter Value                                                       |
| ------------ | -----------------------------------------------------------------------------|
| {Service Address}   | 103.224.222.208                                              |
| {Account_id} | 123456                                                                         |
| Domain to be Resolved   | `www.jdcloud.com` |
| Request Type      | A                                                                                |
| Client IP     | 1.1.1.1                                                      |
| Customer Managed Key     | testKey                                                      |
| Authentication Expiration Time | 1544612446                                                   |
| Authentication Character String   | s=md5sum(`www.jdcloud.com-testKey-1544612446`   i.e. fec6da1a46911f77a455908a124f4142 |

Full request for IPv4 resolution:

`http://103.224.222.208/v1/12345/d?dn=www.jdcloud.com&qt=A&ip=1.1.1.1&t=1544612446&s=fec6da1a46911f77a455908a124f4142`
 
Request succeeded:

HTTP response status code is 200 OK, response result is in JSON format, and the example is as follows:
```
{
    "ret_code":0,
    "msg":"Success",
    "data":[{
        "domain":"www.jdcloud.com",
        "ips":[" 101.124.93.21 "," 101.124.18.188"],
        "ttl":600
    }]
}
```

Full request for IPv6 resolution:

`http://103.224.222.208/v1/12345/d?dn=www.jdcloud.com&qt=AAAA&ip=1::1&t=1544612446&s=fec6da1a46911f77a455908a124f4142`
 
Successful request:

HTTP response status code is 200 OK and the response result is in JSON format (as shown below)"
```
{
    "ret_code":0,
    "msg":"Success",
    "data":[{
        "domain":"www.jdcloud.com",
        "ips":["2402:db40:5170:1310::b8"],
        "ttl":600
    }]
}
```

Request failed: HTTP response status code is 4XX, response result is in JSON format, and the example is as follows:
```
{
    "ret_code":10015,
    "msg":"Query domain is not in access domain list",
    "data":"www.test.com"
}
```

| Name     | Description                                                         |
| -------- | ------------------------------------------------------------------------------------ |
| ret_code | Request response, 0 for success, non-0 for failure                                   |
| msg      | Response result description information, "success" for success, notification on detailed information for failure           |
| data     | Response data, domain resolution result for successful request, string type for failure, and it may also be null or more detailed error notification |
| domain   | Resolved Domain                                                     |
| ips      | Resolution Result                                                     |
| ttl      | Record TTL                                                      |