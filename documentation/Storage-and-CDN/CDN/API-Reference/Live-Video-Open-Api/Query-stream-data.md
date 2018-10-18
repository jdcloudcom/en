# Query the Real-time Frame Rate and Bit Rate of Pushing Streaming

## 1 Description

Query the real-time (one-minute granularity) bit rate and frame rate information of a stream under the pushing streaming domain name (queryStreamData)

## 2 Request Parameter

| **Name**   | **Type** | **Compulsory or Not** | **Description**                                                     |
| ---------- | -------- | ------------ | ------------------------------------------------------------ |
| username   | String   | Yes           | JD User Name pin                                                |
| signature | String   | Yes           | User Signature, verify user's identity information through md5 method to ensure information security.  md5=date+username+secret key SecretKey date: format is yyyymmddusername: JD user name pin secret key: example agreed between the Parties: such as current date 2016-10-23, user pin: jcloud_00, user secret key SecretKey: e7a31b1c5ea0efa9aa2f29c6559f7d61, then the signature is MD5(20161023jcloud_00e7a31b1c5ea0efa9aa2f29c6559f7d61) |
| domain     | String   | Yes           | Currently only query on a single pushing streaming domain name is supported, parameter example: "publish.jcloud.com"     |
| app        | String   | Yes           | Currently only query on a single app is supported, and query on multiple apps simultaneously is not supported               |
| stream     | String   | Yes           | Currently only query on a single path stream is supported, and query on multiple streams simultaneously is not supported currently               |
| start_time | String   | No           | Time Format: yyyy-mm-dd   hh:mi  Reference Example: 2016-12-14 07:00; if the start time is not uploaded, the query time shall be the latest one hour by default |
| end_time   | String   | No           | Not a compulsory parameter; if no parameter is uploaded, it is current time by default                            |

 

## 3 Return Parameter

| **Name** | **Description**                                        |
| -------- | ----------------------------------------------- |
| status   | It means whether the API request is successful or not, 0 means successful, others means failure|
| msg      | Note information, e.g. the reasons why task sending fails, etc.                |
| data     | Domain Name Information Array                                    |

 

## 4  Call Example

- ### Request Address

http://opencdn.jcloud.com/api/live/queryStreamData

- ### Request Example

•        Json Format

http://opencdn.jcloud.com/api/live/queryStreamData
```
{
    "username" :"test_user",
    "signature" :"3a4eb9fc81c548bf6f2fea1b2b85f1df",
    "domain":"www.a.com",
    "start_time":"2018-05-16 16:56",
    "end_time":"2018-05-16 16:58",
    "app":"live",
    "stream":"test"
 }
```

- ### Return Parameter Description

•        Json Format
```
{
    "status": 0,
    "msg": "Successful",
    "data": {
        "domain": "DOMAIN",//Domain Name
        "app": "APP",//APP Name
        "starttime": "2018-05-16 16:56",
        "endtime": "2018-05-16 16:58",
        "data": [
            {
                "2018-05-16 16:57": {//Time
                    "steam1": {//Stream
                        "bit_rate": BIT_RATE,//Real-time Bit Rate Unit: kbps
                        "frame_rate": FRAME_RATE//Real-time Frame Rate
                    }
                }
            },
            {
                "2018-05-16 16:58": {//Time
                    "stream1": {//Stream
                        "bit_rate": BIT_RATE,//Real-time Bit Rate Unit: kbps
                        "frame_rate": FRAME_RATE//Real-time Frame Rate
                    }
                }
            },
     ]
    }
   }
```

- ### Return Example

•        Json Format
```
{
    "status": 0,
    "msg": "Successful",
    "data": {
        "domain": " www.a.com ",
        "app": "live",
        "starttime": "2018-05-16 16:56",
        "endtime": "2018-05-16 16:58",
        "data": [
            {
                "2018-05-16 16:57": {
                    "test": {
                        "bit_rate": 406,
                        "frame_rate": 25
                    }
                }
            },
            {
                "2018-05-16 16:58": {
                    "test": {
                        "bit_rate": 512,
                        "frame_rate":30
                    }
                }
            }
        ]
    }
}
```
