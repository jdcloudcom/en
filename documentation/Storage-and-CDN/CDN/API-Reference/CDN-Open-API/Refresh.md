# **Refresh Cache**

## **1. Description**

Refresh cache under url and the directory

## **2. Request Parameter**

| **Name**   | **Type** | **Compulsory or Not ** | **Description**                                                     |
| --------- | -------- | ------------ | ------------------------------------------------------------ |
| username  | String   | Yes            | JD User Name pin                                                |
| signature  | String   | Yes           | User Signature, verify user's identity information through md5 method to ensure information security.  md5=date+username+secret key SecretKey date: format is yyyymmddusername: JD user name pin secret key: example agreed between the Parties: such as current date 2016-10-23, user pin: jcloud_00, user secret key SecretKey: e7a31b1c5ea0efa9aa2f29c6559f7d61, then the signature is MD5(20161023jcloud_00e7a31b1c5ea0efa9aa2f29c6559f7d61) |
| instances | String   | Yes           | Support string or String[], separate multiple domain names by , mark, e.g. ["http://www.a.com/text1.css","http://www.a.com/text2.js"]Up to 100 urls and 5 directories can be refreshed for a single time |
| type      | String   | Yes           | file or dir, file is file, directory is dir                            |


## **3. Return Parameter** 

| **Name**   | **Description**                                                  |
| -------- | ----------------------------------------------- |
| status   | It means whether the API request is successful or not, 0 means successful, others means failure|
| msg      | Note Information                                        |
| taskid   | Task id, the only mark used to query whether the refreshing is succeeded, uid 32 digits |


## **4. Call Example**

- ### **Request Address**

http://opencdn.jcloud.com/api/refresh

- ### **Request Example**

```
http://opencdn.jcloud.com/api/refresh
{
    "username":"jcloud_00",
    "signature":"d847267fc702273abf699dd0c3128d64",
    "type":"file",
    "instances":["http://www.a.com/text1.css","http://www.a.com/text2.js"]
}
```

- ### **Return Example**

•        Json Format

```
{
  "status": 0,
  "msg": “Successful",
  "taskid": "93820486-226d-459b-b33f-5124b566cab7"//Task id, used when querying the refreshing tasks
}
```
