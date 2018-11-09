# Query List of Blocked Streams

## 1 Description

Query list of blocked streams within a certain time (queryForbidden)

## 2 Request Parameter

| Name      | Type   | Compulsory or Not | Description                                                         |
| ---------- | ------ | -------- | ------------------------------------------------------------ |
| username   | String | Yes       | JD user name pin                                                |
| signature  | String | Yes       | User signature, verify user's identity information through md5 method to ensure information security.  md5=Date+username+secret key SecretKey date: format is yyyymmddusername: JD user name pin secret key: example agreed between the Parties: such as current date 2016-10-23, user pin:   jcloud_00, user secret key SecretKey: e7a31b1c5ea0efa9aa2f29c6559f7d61, then the signature is MD5(20161023jcloud_00e7a31b1c5ea0efa9aa2f29c6559f7d61) |
| domain     | String | Yes       | Blocked streaming domain name, only support single domain name currently                                   |
| app        | String | No       | Release point, currently support to query single release point but not support to query multiple points at the same time. When only a domain name is entered without entering an app, the inquiry results shall be all blocked streams under this domain name |
| stream     | String | No       | Stream name, support to query multiple stream names, which is separated by English letters, e.g. stream1, stream2; an app must be entered while a stream name is entered |
| start_time | String | No       | Query start time, time format: yyyy-mm-dd hh:mi; it is today by default if no start time is entered; if there is a start time but no end time, it is from start time to current time by default; if there is no start time but an end time, take the 0 o’clock of the end time in a day unit as the start time, e.g. if the end time is 20180529 14:29, then the start time is 20180529 00:00 |
| end_time   | String | No       | Query end time, time format: yyyy-mm-dd hh:mi;                   |
| pageNumber | int    | No       | Query the paging page number, 1 by default if not uploaded                                    |
| pageSize   | int    | No       | Query the paging number, 10 by default if not uploaded                                   |

 

## 3   Return Parameter

| **Name**  | **Description**                                         |
| --------- | ------------------------------------------------ |
| status   | It means whether the API request is successful or not, 0 means successful, others means failure|
| msg       | Notification Information                                         |
| data     | Domain Name Information Array                                    |
| total     | Total Number of Blocked Streams under the Domain Name                               |
| streams   | List of Blocked Streams                                       |
| app       | Blocked Apps                                          |
| stream    | Blocked Streams                                       |
| type      | Blocking Type [1: Permanently Blocked, 2: Temporarily Blocked]               |
| typeDes   | Description of Blocking Type                                     |
| startTime | Query Start Time                                     |
| endTime   | Query End Time                                     |
| time      | Blocked Duration if Temporarily Blocked                             |

## 4 Call Example

- ### Request Address

http://opencdn.jcloud.com/api/live/queryForbidden

- ### Request Example

http://opencdn.jcloud.com/api/live/queryForbidden
```
{
    "username" :"jd_cdntest",
    "signature" :"5fdd933ad652298f9f0fd4c87883e283",
    "domain" :"wshplay-113.live.com",
    "app":"live",
    "stream":"shitest1",
    "pageNumber":1,
    "pageSize":"100",
    "start_time" :"2018-05-31 00:05",
    "end_time" :"2018-06-01 21:49"
 }
```
- ### Return Example

* json Format
```
{
    "status": 0,
    "msg": "Successful",
    "data": {
        "total": 1,
        "streams": [
            {
                "app": "live",
                "stream": "shitest1",
                "type": 2,
                "typeDes": "Temporarily Blocked",
                "startTime": "2018-06-01 15:41:23",
                "endTime": "2018-06-01 15:46:23",
                "time": 5
            }
        ]
    }
}
```
