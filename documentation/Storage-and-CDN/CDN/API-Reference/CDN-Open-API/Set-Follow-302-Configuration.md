# **: Set back-to-origin following 302**

## **1. Description**

When the user requests the resource and the CDN node is not cached, the node returns the back-to-origin request and the origin server returns the 302 status code and the redirection address; the CDN node directly requests the resource from the jump address without returning 302 to the user.

## **2. Request Parameters**

| **Name**   | **Type** | **Compulsory or not** | **Description**                                                     |
| ---------- | -------- | ------------ | ------------------------------------------------------------ |
| username   | String   | Yes           | JD User Name pin                                                |
| signature  | String   | Yes           | User signature, verify user's identity information through md5 method to ensure information security. </br>md5=date+username+secret key SecretKey; date: format is yyyymmdd; username: JD user name pin; secret key: agreed between the Parties; </br>example: such as current date 2016-10-23, user pin: jcloud_00, user secret key SecretKey: e7a31b1c5ea0efa9aa2f29c6559f7d61, then the signature is MD5(20161023jcloud_00e7a31b1c5ea0efa9aa2f29c6559f7d61)  |
| domain     | String   | Yes           | Accelerated domain, only support setting of single domain currently|
| value  | String   | Yes           |Whether to enable the back-to-origin following 302 configuration; "off" is disable, "on" is enable  |


## **3. Description of Returned Parameter Data**

| **Name** | **Description**                                                   |
| -------- | ---------------------------------------------------------- |
| status   | Result status 0 means succeeded, others mean failed                          |
| msg      | Notification Information                                                   |
| data     | Return Data                                                   |


## **4. Call Example**

 **Request Address**

Set back-to-origin following 302: https://opencdn.jcloud.com/api/setFollow302Redirect

 **Request Example**

* json Format

```
{
    "username" :"test_user",
    "signature" :"d847267fc702273abf394dd0c3128d64",
    "domain" :"www.a.com",
    "value" :"on"
 }
```

**Return Example**

```
{
    "status": 0,
    "msg": "Succeeded",
    "data": {
        "domain": "www.a.com",
        "requestId": "144791ff-3d4b-4850-a7d1-75907006290a",
        "follow302": "on"
    }
}

```



# **Search back-to-origin following 302**

## **1. Description**

Search the status of accelerated domain configuration back-to-origin following 302.

## **2. Request Parameters**

| **Name**   | **Type** | **Compulsory or not** | **Description**                                                     |
| ---------- | -------- | ------------ | ------------------------------------------------------------ |
| username   | String   | Yes           | JD User Name pin                                                |
| signature  | String   | Yes           | User signature, verify user's identity information through md5 method to ensure information security. </br>md5=date+username+secret key SecretKey; date: format is yyyymmdd; username: JD user name pin; secret key: agreed between the Parties; </br>example: such as current date 2016-10-23, user pin: jcloud_00, user secret key SecretKey: e7a31b1c5ea0efa9aa2f29c6559f7d61, then the signature is MD5(20161023jcloud_00e7a31b1c5ea0efa9aa2f29c6559f7d61)  |
| domain     | String   | Yes           | Accelerated domain, only support setting of single domain currently|


## **3. Description of Returned Parameter Data**

| **Name** | **Description**                                                   |
| -------- | ---------------------------------------------------------- |
| status   | Result status 0 means succeeded, others mean failed                          |
| msg      | Notification Information                                                   |
| data     | Return Data                                                   |
| domain   | Searched Accelerated Domain                         |
| requestId | The Only Identifier of Request                                                   |
| follow302  | The status of back-to-origin following 302, "off" is disabled, "on" is enabled        |

## **4. Call Example**

 **Request Address**

Search back-to-origin following 302 address: https://opencdn.jcloud.com/api/queryFollow302Redirect

 **Request Example**

* json Format

```
{
    "username" :"test_user",
    "signature" :"d847267fc702273abf394dd0c3128d64",
    "domain" :"www.a.com"
 }
```

**Return Example**

```
{
    "status": 0,
    "msg": "Succeeded",
    "data": {
        "domain": "www.a.com",
        "requestId": "144791ff-3d4b-4850-a7d1-75907006290a",
        "follow302": "on"
    }
}

```
