# **Query Accelerated Domain Name**

## **1. Description**

Query Accelerated Domain Name

## **2. Request Parameter**

| **Name**   | **Type** | **Compulsory or Not ** | **Description**                                                     |
| ---------- | -------- | ------------ | ------------------------------------------------------------ |
| username   | String   | Yes           | JD User Name pin                                               |
| signature  | String   | Yes           | User Signature, verify user's identity information through md5 method to ensure information security.  md5=date+username+secret key SecretKey date: format is yyyymmddusername: JD user name pin secret key: example agreed between the Parties: such as current date 2016-10-23, user pin: jcloud_00, user secret key SecretKey: e7a31b1c5ea0efa9aa2f29c6559f7d61, then the signature is MD5(20161023jcloud_00e7a31b1c5ea0efa9aa2f29c6559f7d61) |
| domain     | String   | No           | Fuzzily match accelerated domain name                                            |
| pageNumber | int      | No           | Query the paging page number, 1 by default if not uploaded                                    |
| pageSize   | int      | No           | Query the paging number, 10 by default if not uploaded                                   |
| type       | String   | No           | Types of the domain name service resources, currently only supports web means    static small files, download means large file acceleration, vod means video acceleration   (Types not supported currently: dynamic means dynamic acceleration, live means live streaming acceleration) |
| status     | String   | No           | Status, query all the domain names if not uploaded, 0(query the suspended domain names), 1 (query the enabled domain names), 4 (query the deploying domain names), 5 (query the domain names being audited), 6 (query the unapproved and rejected domain names) |

## **3. Return Parameter**

| **Name** | **Description**                                                     |
| -------- | ------------------------------------------------------------ |
| status   | Result status, means whether the API request is succeeded, 0 means succeeded, others means failed    |
| msg      | Note information, e.g. the reasons why task sending is failed, etc.                             |
| data     | Domain Name Information Array                                                 |
| domain   | Accelerated Domain Name                                                     |
| cname    | cname                                                        |
| type     | Types of the domain name service resources, currently only supports web means  static small files, download means large file acceleration, vod means video acceleration  (Types not supported currently: dynamic means dynamic acceleration, live means live streaming acceleration) |
| status   | The enabling application status of the domain name, auditing, approved, running, stopped             |

 

**4. Call Example**

- **Request Address**

http://opencdn.jcloud.com/api/queryDomains

- ### **Request Example**

curl Request Example: 

```
curl -H “Content-type: application/json” -X POST -d ‘{“username”:“test_user”,“signature”:“914a3f412fd9bc1eec14bb5eb104d253”,“pageNumber”:1,“pageSize”:10}’ http://opencdn.jcloud.com/api/queryDomains
```

• Json Format

```
http://opencdn.jcloud.com/api/queryDomains
{
    "username" :"test_user",
    "signature" :"b036e6094db32b5a5abc47e6be426c50",
    "pageNumber":1,
    "pageSize":10
   
 }
```

- ### **Return Example**

  ### •        Json Format

```
{
    "status": 0,
    "msg": “Successful",
    "data": {
        "total": 10,
        "domains": [
            {
                "cname": "www.a.com.s.galileo.jcloud-cdn.com",
                "domain": "www.a.com",
                "status": “Deploying",
                "type": “Image Small File"
            },
            {
                "cname": "www.b.com.s.galileo.jcloud-cdn.com",
                "domain": " www.b.com ",
                "status": “Deploying",
                "type": “Image Small File"
            }
            ]
    }
}
```

 