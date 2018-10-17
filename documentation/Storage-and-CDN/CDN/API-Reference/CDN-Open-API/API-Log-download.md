# **Log Download**

## **1. Description**

Query Log Download Link (downloadUrlInterval)

## **2. Request Parameter**

| **Name**  | **Type** | **Compulsory or Not ** | **Description**                                                     |
| ---------- | -------- | ------------ | ------------------------------------------------------------ |
| username   | String   | Yes           | JD User Name pin                                                |
| signature | String   | Yes           | User Signature, verify user's identity information through md5 method to ensure information security.  md5=date+username+secret key SecretKey date: format is yyyymmddusername: JD user name pin secret key: example agreed between the Parties: such as current date 2016-10-23, user pin: jcloud_00, user secret key SecretKey: e7a31b1c5ea0efa9aa2f29c6559f7d61, then the signature is MD5(20161023jcloud_00e7a31b1c5ea0efa9aa2f29c6559f7d61) |
| domain     | String   | Yes           | Domain name which requires log downloading, support download of multiple domain names, parameter example "www.a.com,www.b.com" |
| start_time | String   | Yes            | Time Format: yyyy-mm-dd hh:mi Reference Example 2016-12-14 07:00       |
| end_time   | String   | No           | Not a compulsory parameter; if no parameter is uploaded, it is current time by default                            |
| interval   | String   | No           | HOUR (download by hour), DAY (download by day), if there is no uploading or the uploading is wrong, it will download by hour. Notes: HOUR (download by hour) is .log file, DAY (download by day) is .zip file. |


## **3. Description of Returned Parameter Data**

| **Name** | **Description**                                        |
| -------- | ---------------------------------------------------------- |
| status   | Result status 0 means successful, others means failure                          |
| msg      | Note Information                                                   |
| data     | Return Data                                                   |
| urls      | All links of log, if query for one day, return 24 data, one url for each hour |
| url      | Log Download URL, it is limited by timeliness, it shall be downloaded in 2 hours, it needs to make a new request when time out |


## **4. Call Example**

 **Request Address**

http://opencdn.jcloud.com/api/downloadUrlInterval

 **Request Example**

- Curl Format

```
curl -H "Content-type:application/json" -X POST -d '{"username":"test_user","signature":"d847267fc702273abf394dd0c3128d64","domain":"www.a.com,www.b.com","start_time":"2017-10-19 00:00","end_time":"2017-10-19 23:59","interval":"DAY"}' http://opencdn.jcloud.com/api/downloadUrlInterval
```

* Json Format

```
http://opencdn.jcloud.com/api/downloadUrlInterval
{
    "username" :"test_user",
    "signature" :"d847267fc702273abf394dd0c3128d64",
    "domain" :" www.a.com,www.b.com ",
    "start_time" :"2017-10-19 00:00",
    "end_time" :"2017-10-19 23:59",
    "interval" :"DAY",//Download by day
 }
```

 **Return Instructions**

 **Json Format**
 
```
{
"status": 0,//0 means this request succeeded
"data": [
{
"domain": "DOMAIN",//Queried domain name, do not include http://
"urls": [
[
"URL"//Log URL 
],
],
},
]
}
```

**Return Example**

```
{
    "status": 0,
    "msg": "Successful",
    "data": [
        {
            "domain": "www.a.com",
            "urls": [
                "http://oss.cn-north-1.jcloudcs.com/cdnuserlog/www.a.com/20171019.zip?Expires=1508753731&AccessKey=ImtdrS1VXMdkph&Signature=2br%2B5KwRY5Nk5YvLp7%2BfAwsQVAM%10D"
            ]
        },
        {
            "domain": " www.b.com ",
            "urls": [
                "http://oss.cn-north-1.jcloudcs.com/cdnuserlog/www.b.com/20171019.zip?Expires=1508753731&AccessKey=ImtsrS1VXMfeikph&Signature=HdM1weVHJbHuS%2FEiZm82o9GrZSY%6D"
            ]
        }
    ]
}
```