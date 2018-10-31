# **Query Prewarming Task**

## **1. Description**

Query the task information of prewarmed urls

## **2. ** **Request Parameter**

| **Name**   | **Type** | **Compulsory or Not ** | **Description**                                                     |
| --------- | -------- | ------------ | ------------------------------------------------------------ |
| username  | String   | Yes            | JD User Name pin                                                |
| signature  | String   | Yes           | User Signature, verify user's identity information through md5 method to ensure information security.  md5=date+username+secret key SecretKey date: format is yyyymmddusername: JD user name pin secret key: example agreed between the Parties: such as current date 2016-10-23, user pin: jcloud_00, user secret key SecretKey: e7a31b1c5ea0efa9aa2f29c6559f7d61, then the signature is MD5(20161023jcloud_00e7a31b1c5ea0efa9aa2f29c6559f7d61) |
| taskid    | String   | Yes           | Task id, parameter taskid returned when prewarming, 32 digits, e.g. 545ec2e2-e9e5-47b8-8f34-44c104a84fd3 |


## **3. Description of Returned Parameter Data**

| **Name** | **Description**                                     |
| -------- | -------------------------------------------- |
| status   | Result status 0, refreshing succeeded, 1 in progress, 2 prewarming failed|
| msg      | Note Information                                     |
| taskid   | Task id, the only uid used to query whether the prewarming is succeeded, 32 digits |


## **4. Call Example**

- ### **Request Address**

http://opencdn.jcloud.com/api/prefetchQuery

- ### **Request Example**

```
http://opencdn.jcloud.com/api/prefetchQuery
{
    "username":"jcloud_00",
    "signature":"d847267fc702273abf699dd0c3128d64",
    "taskid":"545ec2e2-e9e5-47b8-8f34-44c104a84fd3"
}
```

- ### **Return Example**

•        Json Format

```
{
  "status": 0,
  "data": {
    "taskid": "545ec2e2-e9e5-47b8-8f34-44c104a84fd3",
    "status": 1,
    "msg": “In Progress"
  }
}
```
