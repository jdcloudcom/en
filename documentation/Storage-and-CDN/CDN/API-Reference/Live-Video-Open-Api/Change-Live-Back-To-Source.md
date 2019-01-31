# **Back-to-origin Policy Change**

## **1. Description**

Change back-to-origin policy information under pulling streaming mode

## **2. Request Parameter**

| **Name**       | **Type** | **Compulsory or not** | **Description**                                                     |
| -------------- | -------- | ------------ | ------------------------------------------------------------ |
| username       | String   | Yes           | JD User Name pin                                                |
| signature      | String   | Yes           | User signature, verify user's identity information through md5 method to ensure information security. </br>md5=date+username+secret key SecretKey; date: format is yyyymmdd; username: JD user name pin; secret key: agreed between the Parties; </br>example: such as current date 2016-10-23, user pin: jcloud_00, user secret key SecretKey: e7a31b1c5ea0efa9aa2f29c6559f7d61, then the signature is MD5(20161023jcloud_00e7a31b1c5ea0efa9aa2f29c6559f7d61) |
| domain         | String   | Yes           | Accelerated Domain  |
| sourceType     | String   | Yes           |Back-to-origin Type, ips: IP back-to-origin; domain: domain back-to-origin|
| source         | String   | Yes           | Determine the Origin Server IP list or domain based on sourceType </br>IP back-to-origin is divided into primary IP and backup IP, when primary IP or backup IP is multiple ips, the weight ratio of each back-to-origin ip is assigned averagely, customized setting of ip weight is not supported now, ratio may not be transmitted or the value is null, 10 back-to-origin IPs are added at most; </br>back-to-origin domain is prioritized, priority represents priority, 5 back-to-origin domains may be added at most   |

## **3. Return Parameter**

| **Name** | **Description**                                                  |
| -------- | --------------------------------------------------------- |
| status   | Result status means whether the API request is successful or not, 0 means successful, others means failure |
| msg      | Notification Information                                                  |
| data     | Return Data                                                  |

## **4. Call Example**

- ### **Request Address**

http://opencdn.jcloud.com/api/live/setBacksource

- ### **Request Example**

```
{
  "username": "jd_cdn",
  "signature": "7a9beb5119e1cb439208e444193d39ec",
  "domain":"a.jcloud.com",
  "sourceType":"ips",
  "source":{
  "ips": {
    "master": {
      "1.1.1.1": {
        "ratio": “”
      }
    }
  },
  "domain": {
    "a.baidu.com": {
      "priority": 1
    },
    "c.jd.com": {
      "priority": 2
    }
     }
    }
}

```

- ### **Return Example**

* json Format

```
{
    "status": 0,
    "msg": "",
    "data": {
        "sourceType": "ips",
        "source": {
            "ips": {
                "master": {
                    "1.1.1.1": {
                        "ratio": 1
                        }
                    }
                },
                "domain": {
                    " a.baidu.com ": {
                        "priority": 1
                    },
                    "c.jd.com": {
                        "priority": 2
                    }
                }
            }
        }
    }

```

 
