# Set Blocked Streams

## 1  Description

When streamer pushes illegal contents, the streamer shall be blocked from pushing streaming (forbidStream)

## 2 Request Parameter

| Name      | Type   | Compulsory or Not | Description                                                         |
| --------- | ------ | -------- | ------------------------------------------------------------ |
| username  | String | Yes       | JD User Name Pin                                                |
| signature | String | Yes       | User signature, verify user's identity information through md5 method to ensure information security.  md5=Date+username+secret key SecretKey date: The format is yyyymmddusername: JD user name pin secret key: example agreed between the Parties: such as current date 2016-10-23, user pin:   jcloud_00, user secret key SecretKey: e7a31b1c5ea0efa9aa2f29c6559f7d61, then the signature is MD5(20161023jcloud_00e7a31b1c5ea0efa9aa2f29c6559f7d61) |
| domain    | String | Yes       | blocked streaming domain name, only support single domain name currently                                   |
| app       | String | Yes       | Blocked pushing streaming app                                                |
| stream    | String | Yes       | Blocked streaming name, multiple streams may be blocked simultaneously                                  |
| type      | int    | Yes       | Blocking Type [1: Permanently Blocked, 2: Temporarily Blocked]                           |
| time      | long   | Yes       | Blocking duration (unit: minute), and if permanently blocked, the time is 0              |

 

## 3  Return Parameter

| **Name** | **Description**                                         |
| -------- | ------------------------------------------------ |
| status   | It means whether the API request is successful or not, 0 means successful, others means failure, |
| msg      | Notification Information                                         |
| data     | Domain Name                                             |

 

## 4 Call Example

- ###   Request Address

http://opencdn.jcloud.com/api/live/forbidStream

- ###   Request Example

http://opencdn.jcloud.com/api/live/forbidStream

```
{
    "username" :" test_user ",
    "signature" :"d00f58f89e8cd55dc080aec0d8051845",
    "domain" :"www.a.com",
    "app" :"live",
    "stream": "test17",
    "type" :2,
    "time" :60
 }
```
- ###  Return Example

* Json Format
```
{
  "status": 0,
  "msg": "Successful",
  "data": "www.a.com "
}
```
