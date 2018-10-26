# Quit Blocked Streaming

## 1  Description

Quit Blocked Streaming, this streamer is permitted to push streaming again (permitStream)

## 2 Request Parameter

| Name      | Type   | Compulsory or Not | Description                                                         |
| ------------- | ------ | -------- | ------------------------------------------------------------ |
| username      | String | Yes       | JD user name pin                                                |
| signature     | String | Yes       | User signature, verify user's identity information through md5 method to ensure information security.  md5=Date+username+secret key SecretKey date: format is yyyymmddusername: JD user name pin secret key: example agreed between the Parties: such as current date 2016-10-23, user pin:   jcloud_00, user secret key SecretKey: e7a31b1c5ea0efa9aa2f29c6559f7d61, then the signature is MD5(20161023jcloud_00e7a31b1c5ea0efa9aa2f29c6559f7d61) |
| domain        | String | Yes       | Blocked streaming domain name, only support single domain name currently                                   |
| deleteStreams | Array  | Yes       | Unblocked stream name, need to specify the app where the stream name is on, take an example as below: "[{‘app’:‘App1’,‘stream’:‘stream1’},{‘app’:‘App2’,‘stream’:‘stream2’}]" |

## 3 Return Parameter

| **Name** | **Description**                                        |
| -------- | ----------------------------------------------- |
| status   | It means whether the API request is successful or not, 0 means successful, others means failure|
| msg      | Note Information                                        |
| data     | Domain Name                                            |

## 4  Call Example

- ###    Request Address

http://opencdn.jcloud.com/api/live/permitStream

- ### Request Example

http://opencdn.jcloud.com/api/live/permitStream

```
{
    "username" :"jd_cdntest",
    "signature" :"914a3f412fd9bc1eec14bb5eb104d253",
    "domain" :"a.live.com",
    "deleteStreams" :[{'app':'App1','stream':'stream1'},{'app':'App2','stream':'stream2'}]
 }
```
 

- ###  Return Example

* Json Format
```
{
  "status": 0,
  "msg": "Successful",
  "data": "a.live.com"
}
```
