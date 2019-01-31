# **Service Status Change**

## **1. Description**

Change service status of created domain, including stop, run, delete (stop; start; delete)

## **2. Request Parameter**

| **Name**  | **Type** | **Compulsory or not** | **Description**                                                     |
| --------- | -------- | ------------ | ------------------------------------------------------------ |
| username  | String   | Yes           | JD User Name pin                                                |
| signature | String   | Yes           | User signature, verify user's identity information through md5 method to ensure information security. </br>md5=date+username+secret key SecretKey; date: format is yyyymmdd; username: JD user name pin; secret key: agreed between the Parties; </br>example: such as current date 2016-10-23, user pin: jcloud_00, user secret key SecretKey: e7a31b1c5ea0efa9aa2f29c6559f7d61, then the signature is MD5(20161023jcloud_00e7a31b1c5ea0efa9aa2f29c6559f7d61) |
| domain    | String   | Yes           | Accelerated Domain                                                     |

## **3. Return Parameter**

| **Name** | **Description**                                                  |
| -------- | --------------------------------------------------------- |
| status   | Result status means whether the API request is successful or not, 0 means successful, others means failure |
| msg      | Notification information, e.g. the reasons why task sending fails, etc.                          |
| data     | Return Data                                                  |

## **4. Call Example**

- ### **Request Address**

Stop domain APIs address: http://opencdn.jcloud.com/api/live/stopDomain

Start domain APIs address: http://opencdn.jcloud.com/api/live/startDomain

Delete domain APIs address: http://opencdn.jcloud.com/api/live/deleteDomain

- ### **Request Example**

```
{
    "username":"test_user",
    "signature":"7a9beb5119e1cb439208e444193d39ec",
    "domain":"www.b.com"
}
 
```

- ### **Return Example**

```
{
    "status": 0,
    "msg": "Start Successfully",
    "data": null
}

```
