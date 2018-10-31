# **Query the Domain Name Cache Policy**

## **1. Description**

Query the Domain Name Cache Configuration

## **2. Request Parameter**

| **Name**   | **Type** | **Compulsory or Not ** | **Description**                                                     |
| --------- | -------- | ------------ | ------------------------------------------------------------ |
| username  | String   | Yes            | JD User Name pin                                                |
| signature  | String   | Yes           | User Signature, verify user's identity information through md5 method to ensure information security.  md5=date+username+secret key SecretKey date: format is yyyymmddusername: JD user name pin secret key: example agreed between the Parties: such as current date 2016-10-23, user pin: jcloud_00, user secret key SecretKey: e7a31b1c5ea0efa9aa2f29c6559f7d61, then the signature is MD5(20161023jcloud_00e7a31b1c5ea0efa9aa2f29c6559f7d61) |
| domain         | String   | Yes           | Accelerated Domain Name                                                     |

 

## **3. ** **Return Parameter**

| **Name**   | **Description**                                                  |
| ---------- | --------------------------------------------------------- |
| status     | Result status, means whether the API request is succeeded, 0 means succeeded, others means failed |
| msg        | Note Information                                                  |
| data       | Domain Name Information Array                                              |
| domain     | Accelerated Domain Name                                                  |
| cacheRules | All the Cache Rules of Accelerated Domain Name                                    |
| configId   | Cache Configuration id                                                |
| content    | Cache Configuration Rules                                              |
| ttl        | Cache Time                                                  |
| weight     | Priority levels, can only be between 1-10, 1 means the highest priority                   |
| cacheType  | Cache Type: 0 means no cache, 1 means customization                        |

 

## **4. Call Example**

- ### **Request Address**

http://opencdn.jcloud.com/api/queryDomainCache

- ### **Request Example**

curl Request Example:

```
 curl -H “Content-type: application/json” -X POST -d ‘{“username”:“test_user”,“signature”:“914a3f412fd9bc1eec14bb5eb104d253”,“domain” :“www.b.com”}’ http://opencdn.jcloud.com/api/queryDomainCache
```

 

•        Json Format

```
http://opencdn.jcloud.com/api/queryDomainCache
{
    "username" :"test_user",
    "signature" :"d847267fc702273abf394dd0c3128d64",
    "domain" :"www.b.com"
    
 }
```

- ###  **Return Example**

  ### •        Json Format 

```
{
    "status": 0,
    "msg": “Successful",
    "data": {
        "total": 2,
        "cacheRules": [
            {
                "configId": "1304",
                "content": ".jpg",
                "ttl": 7200,
                "weight": 2
            },
            {
                "configId": "1305",
                "content":    ".wmv;.mp3;.wma;.ogg;.fiv;.mp4;.avi;.mpg;.mpeg;.f4v;.hlv;.rmvb;.rm;.3gp;.img;.m3u8;.ts",
                "ttl": 3600,
                "weight": 3
            }
        ]
    }
}
```