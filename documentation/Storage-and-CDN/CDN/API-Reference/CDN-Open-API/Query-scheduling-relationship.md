# **Real-time Scheduling of the Covering Relation**

## **1. Description**

Real-time Scheduling of the Covering Relation (area_isp_ip)

## **2. ** **Request Parameter**

| **Name**   | **Type** | **Compulsory or Not ** | **Description**                                                     |
| --------- | -------- | ------------ | ------------------------------------------------------------ |
| username  | String   | Yes            | JD User Name pin                                                |
| signature  | String   | Yes           | User Signature, verify user's identity information through md5 method to ensure information security.  md5=date+username+secret key SecretKey date: format is yyyymmddusername: JD user name pin secret key: example agreed between the Parties: such as current date 2016-10-23, user pin: jcloud_00, user secret key SecretKey: e7a31b1c5ea0efa9aa2f29c6559f7d61, then the signature is MD5(20161023jcloud_00e7a31b1c5ea0efa9aa2f29c6559f7d61) |
| domain    | String   | Yes           | Domain names to be queried, separate multiple domain names by commas, parameter example "www.a.com,www.b.com" |


## **3. Description of Returned Parameter Data**

| **Name** | **Description**                       |
| -------- | ------------------------------ |
| status   | Result status 0, refresh successful, others failure|
| msg      | Note Information                       |
|  data      |  Return Data                        |


## **4. ** **Calling Example**

- ### **Request Address**

http://opencdn.jcloud.com/api/area_isp_ip

- ### **Request Example**

```
http://opencdn.jcloud.com/api/area_isp_ip
{
    "username" :"test_user",
    "signature" :"d847267fc702273abf394dd0c3128d64",
    "domain" :"www.a.com,www.b.com"
 }
```

- ### **Return Instructions**

•        Json Format

```
 {
    "domain1":{ // The first queried domain name
    "isp1":{ // Operator
    "area1":[ip1,ip2,ip3......], // Region+ip, all the resolutions currently released need to be listed
    "area2":[ip4,ip5,ip6......]
    ......
    },
    "isp2":{
    "area1":[ip1,ip2,ip3......],
    ......
    },
    ......
    } "
    domain2":{
    "isp1":{
    "area1":[ip7,ip8,ip9......]
    ......
    } .
    .....
    }
}
```

- ### **Return Example**

```
{
    "status": 0,
    "msg": “Successful",
    "data": {
        "ne-www.a.com": {
            "cmcc": {
                "yunnan": [
                    "1.1.1.1"
                ],
                "sichuan": [
                    "2.2.2.2",
                    "3.3.3.3"
                ]
            }
        },
        "www.a.com": {
            "cmcc": {
               "guangxi": [
                    "4.4.4.4"
                ],
                 "beijing": [
                    "5.5.5.5"
                ]
            }
        }
    }
}
```

 
