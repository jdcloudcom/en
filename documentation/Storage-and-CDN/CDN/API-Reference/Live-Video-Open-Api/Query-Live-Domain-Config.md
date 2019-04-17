# **Search domain configuration information**

## **1. Description**

Search configuration information under domain, only support search of single domain currently

## **2. Request Parameter**

| **Name**   | **Type** | **Compulsory or not** | **Description**                                                     |
| ---------- | -------- | ------------ | ------------------------------------------------------------ |
| username   | String   | Yes           | JD User Name pin                                                |
| signature | String   | Yes           | User Signature, verify user's identity information through md5 method to ensure information security.</br> md5=date+username+secret key SecretKey; date: format is yyyymmdd; username: JD user name pin secret key: agreed between the Parties;</br> example: such as current date 2016-10-23, user pin: jcloud_00, user secret key SecretKey: e7a31b1c5ea0efa9aa2f29c6559f7d61, then the signature is MD5(20161023jcloud_00e7a31b1c5ea0efa9aa2f29c6559f7d61) |
| domain     | String   | Yes           | Accelerated domain, only support search of configuration information of single domain currently|

## **3. Return Parameter**

| **Name**   | **Description** | 
| ---------- | -------- |
| status  | It means whether the API request is successful or not, 0 means successful, any other number means failure  | 
| msg  | Notification Information | 
| data | Return Data| 
| accessKeyType | Authentication type, where 0 represents without authentication and 1 represents with authentication | 
| audioType |Audio Format, aac by default | 
|blackIpList| IP Blacklist | 
|blackIpListEnable | Start IP blacklist or not, on means start, off means close  | 
|cname | Alias Record | 
|originDomain| Back-to-origin Domain | 
| protocolConvert|Forwarding Protocol  | 
|source | Back-to-origin of parameter contents, determine the Origin Server IP list or domain based on sourceType | 
| sourceType|Back-to-origin Type, domain back-to-origin or ip back-to-origin| 
|status | Domain status: offline means stop, online means running, configuring means in configuration| 
|videoType| Video Format, h264 by default | 
|type |Business Type, live means Cloud Live Video| 
| createTime | Time of Successful Creation of Domain | 
|forwardCustomVhost| Forward Pushing Domain| 
| sourceHost| Back-to-origin host | 
| archiveNo | ICP Filing Number | 
|referType | Referer Type, block means blacklist, allow means White List | 
|referList| Referer Parameter Contents | 
|referAllowEmpty | Allow the referer value to be null or allow irregular contents to access url resource or not, on means allow, off means forbid | 
| referAllowNull | Allow the header without referer to access url resource, on means allow, off means forbid | 
|accesskeyKey | Authentication Secret Key| 
|pushIpWhiteList | Pushing Streaming White List| 
|publishNormalTimeout | Pushing Streaming Interruption Time-out Period | 


## **4. Call Example**

- ### **Request Address**

https://opencdn.jcloud.com/api/live/queryDomainConfig

- ### **Request Example**

```
{
    "username": "user_test",
    "signature": "7a9beb5119e1cb439208e444193d39ec",
    "domain":"test.jcloud.com"
    
}
```

- ### **Return Example**
```
{
    "status": 0,
    "msg": "",
    "data": {
        "accessKeyType": 0,
        "audioType": "AAC",
        "allowApps": "",
        "backSourceType": "",
        "blackIpList": "",
        "blackIpListEnable": "off",
        "ignoreQueryString": "off",
        "cname": "test.jcloud.com.live-publish.galileo.jcloud-cdn.com",
        "originDomain": "",
        "protocolConvert": "rtmp>http-flv,rtmp>http-hls",
        "siteType": "1",
        "source": "",
        "sourceType": "ips",
        "status": "configuring",
        "videoType": "H.264",
        "type": "live",
        "createTime": "2018-07-30T19:59:41",
        "forwardCustomVhost": "",
        "sourceHost": "",
        "archiveNo": "J ICP B No.11041704-6",
        "referType": "block",
        "referList": "",
        "referAllowEmpty": "on",
        "referAllowNull": "on",
        "accesskeyKey": "",
        "pushIpWhiteList": "",
        "publishNormalTimeout": 0
    }
}
```
