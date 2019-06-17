# **Set Protocol following back-to-origin**

## **1. Description**

After configuring protocol following back-to-origin, the protocol used by the back-to-origin server is the same as the protocol of the netizen resource request. When the netizen requests the resource using the http protocol, the CDN back-to-origin server uses http protocol to the resource; when the netizen requests the resource using the https protocol, the CDN back-to-origin server uses https protocol to the resource.

## **2. Request Parameters**

| **Name**   | **Type** | **Compulsory or not** | **Description**                                                     |
| ---------- | -------- | ------------ | ------------------------------------------------------------ |
| username   | String   | Yes           | JD User Name pin                                                |
| signature  | String   | Yes           | User signature, verify user's identity information through md5 method to ensure information security. </br>md5=date+username+secret key SecretKey; date: format is yyyymmdd; username: JD user name pin; secret key: agreed between the Parties; </br>example: such as current date 2016-10-23, user pin: jcloud_00, user secret key SecretKey: e7a31b1c5ea0efa9aa2f29c6559f7d61, then the signature is MD5(20161023jcloud_00e7a31b1c5ea0efa9aa2f29c6559f7d61)  |
| domain     | String   | Yes           | Accelerated domain, only support setting of single domain currently|
| value  | String   | Yes           |Whether to enable the protocol following back-to-origin configuration; "off" is disable, "on" is enable  |


## **3. Description of Returned Parameter Data**

| **Name** | **Description**                                                   |
| -------- | ---------------------------------------------------------- |
| status   | Result status 0 means succeeded, others mean failed                          |
| msg      | Notification Information                                                   |
| data     | Return Data                                                   |


## **4. Call Example**

 **Request Address**

Set protocol following back-to-origin address: https://opencdn.jdcloud.com/api/setFollowSourceProtocol

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
        "followProtocolStatus": "on"
    }
}

```


# **Search protocol following back-to-origin**

## **1. Description**

Search the status of the domain configuration function

## **2. Request Parameters**

| **Name**   | **Type** | **Compulsory or not** | **Description**                                                     |
| ---------- | -------- | ------------ | ------------------------------------------------------------ |
| username   | String   | Yes           | JD User Name pin                                                |
| signature  | String   | Yes           | User signature, verify user's identity information through md5 method to ensure information security. </br>md5=date+username+secret key SecretKey; date: format is yyyymmdd; username: JD user name pin; secret key: agreed between the Parties; </br>example: such as current date 2016-10-23, user pin: jcloud_00, user secret key SecretKey: e7a31b1c5ea0efa9aa2f29c6559f7d61, then the signature is MD5(20161023jcloud_00e7a31b1c5ea0efa9aa2f29c6559f7d61)  |
| domain     | String   | Yes           | Accelerated domain, only support search of single domain currently|


## **3. Description of Returned Parameter Data**

| **Name** | **Description**                                                   |
| -------- | ---------------------------------------------------------- |
| status   | Result status 0 means succeeded, others mean failed                          |
| msg      | Notification Information                                                   |
| data     | Return Data                                                   |
| domain  | Searched Accelerated Domain                         |
| requestId  | The Only Identifier of Request                 |
| followProtocolStatus | The status of protocol following back-to-origin, "off" is disabled, "on" is enabled        |

## **4. Call Example**

 **Request Address**

Search the protocol following back-to-origin address: https://opencdn.jcloud.com/api/queryFollowSourceProtocol

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
        "followProtocolStatus": "on"
    }
}


```
