## **Create live acceleration domain**

**1. Description**

Create live acceleration domain, including creation of domain in pushing streaming mode, pulling streaming mode and mixing mode

**2. Request Parameter**

| Name           | Type   | Compulsory or not | Description                                                         |
| -------------- | ------ | -------- | ------------------------------------------------------------ |
| username       | String | Yes       | JD User Name pin                                                |
| signature      | String | Yes       | User signature, verify user's identity information through md5 method to ensure information security. </br>md5=date+username+secret key SecretKey; </br>date: format is yyyymmdd; username: JD user name pin; secret key: agreed between the Parties; </br>example: such as current date 2016-10-23, user pin: jcloud_00, user secret key SecretKey: e7a31b1c5ea0efa9aa2f29c6559f7d61, then the signature is MD5(20161023jcloud_00e7a31b1c5ea0efa9aa2f29c6559f7d61) |
| siteType | String | Yes | Live Business Mode Type, Pushing Streaming Mode (Streamer is pushed to CDN) uses "push", Pulling Streaming Mode (CDN is returned to customer origin server for broadcasting in pulling streaming) uses "push", Mixing Mode (One pushing streaming domain corresponds to statuses such as multiple broadcasting domains or multiple pulling streaming domains and forward pushing domain) uses "mix" |
|Domain | String | Yes | Accelerated Domain|
|protocol | String |No| Protocol, parameter can be all, rtmp, hdl (namely, http-flv), hls; all means not distinguish protocols, when protocol is all, the corresponding domain can be directly converted to rtmp, hls, flv|
|referDomain | String |No |Associated pushing streaming domain, pushing streaming mode, which is the compulsory field when creating broadcasting domain in the mixing mode, and is non-compulsory under other conditions|
|sourceType | String |No|Compulsory under the mixing mode and pulling streaming mode |
|source | String |No |Back-to-origin information configuration, upon ip back-to-origin, master means primary, slave means slave, ratio means weight, add-up of all the ratio configuration items shall be 1; upon domain back-to-origin, priority means priority |
|forwardDomain| String |No|Forward Pushing Domain |
 
**3. Return Parameter**

| **Name** | **Description**                                                  |
| -------- | --------------------------------------------------------- |
| status   | Result status, means whether the API request is successful or not, 0 means successful, others means failure |
| msg      | Notification Information |
| data     | Domain  |
| requestId| Create Task|
 
**4. Call Example**

 **Request Address**

http://opencdn.jcloud.com/api/live/createDomain

 **Request Example**

```
{
    "username":"jcloud_username",
    "signature":"xxxxxxxxx",
    "siteType":"push/pull/mix",//Business mode, pushing streaming mode, pulling streaming mode, mixing mode (pushing pulling streaming mode)
    "domainType":"push/pull",  //Domain type added this time, when business type is pull type, domainType only can be pull
    "domain":"newDomain.ex.com",//Domain needed to be added this time
    "protocol":"rtmp/hls/hdl/all",//If the created is pulling streaming domain, then it must be the compulsory field
    "referDomain":"xxxxx",//Associated pushing streaming domain, pushing streaming mode, which is the compulsory field when creating broadcasting domain in the mixing mode, and is non-compulsory under other conditions
    "sourceType":"ips/domain" , //ip or domain, compulsory under the mixing mode and pulling streaming mode
    "source":{   //Back-to-origin Information Configuration
        "ips": {
            "master": {//add-up of all the ratio configuration items shall be 1
                "1.1.1.1": {
                    "isp": "default",
                    "ratio": 0.25
                },
                "1.1.1.2": {
                    "isp": "CM",
                    "ratio": 0.49
                },
                "1.1.1.3": {
                    "isp": "CT",
                    "ratio": 0.43
                }
            },
            "slave": {
                "1.1.1.5": {
                    "isp": "default",
                    "ratio": 0.73
                },
                "1.1.1.6": {
                    "isp": "default",
                    "ratio": 0.76
                }
            }
        },
        "domain": {  //
            "a.jd.com": {"priority": 3},
            "c.jd.com": {"priority": 1}
         }
        }, 
      "forwardDomain":"forward.jcloud.com",
      "audioType":"audioType", //Only support AAC, which is non-compulsory field
      "videoType":"videoType"   //Only support H.264, which is non-compulsory field
}
```

- **Create pushing streaming domain under the mixing mode**
```
{
    "username":"jcloud_username",
    "signature":"xxxxxxxxx",
    "siteType":"mix",//mixing mode (pushing pulling streaming mode)
    "domainType":"push",  //Domain type added this time: pushing streaming domain
    "domain":"push.ex.com",//Pushing streaming domain needed to be added this time
    "forwardDomain":"forward.jcloud.com" //Configured forward pushing domain is allowed to be null
}
```

-  **Create pulling streaming domain under the mixing mode**
```
{
    "username":"jcloud_username",
    "signature":"xxxxxxxxx",
    "siteType":"mix",//mixing mode (pushing pulling streaming mode)
    "domainType":"pull",  //Domain type added this time
    "domain":"pull.ex.com",//Domain needed to be added this time
    "protocol":"rtmp",//If the created is pulling streaming domain, then it must be the compulsory field
    "referDomain":"push.ex.com",//Associated Pushing Streaming Domain
    "sourceType":"domain" , //ip or domain, compulsory under the mixing mode and pulling streaming mode
    "source":{   //Back-to-origin Information Configuration
         "domain": {  
            "origin1.jcloud.com": {"priority": 3},
            "origin2.jcloud.com": {"priority": 1}
         }
     }
}
```

- **Create pulling streaming domain under the pulling streaming mode**
```
{
    "username":"jcloud_username",
    "signature":"xxxxxxxxx",
    "siteType":"pull",//Mixing mode (pushing pulling streaming mode)
    "domainType":"pull",  //Domain type added this time
    "domain":"pullRtmp.ex.com",//Domain needed to be added this time
    "protocol":"rtmp",//If the created is pulling streaming domain, then it must be the compulsory field
    "sourceType":"domain" , //ip or domain, compulsory under the mixing mode and pulling streaming mode
    "source":{   //Back-to-origin Information Configuration
         "domain": {  
            "origin1.jcloud.com": {"priority": 3},
            "origin2.jcloud.com": {"priority": 1}
         }
     }
}
```

- **Create pushing streaming domain under the pushing streaming mode**
```
{
    "username":"jcloud_username",
    "signature":"xxxxxxxxx",
    "siteType":"push",//Pushing Streaming Mode
    "domainType":"push",  //Domain type added this time: pushing streaming domain
    "domain":"push1.ex.com",//Pushing streaming domain needed to be added this time
    "forwardDomain":"forward.jcloud.com" //Configured forward pushing domain is allowed to be null
}
```

- **Create pulling streaming domain under the pushing streaming mode**
```
{
    "username":"jcloud_username",
    "signature":"xxxxxxxxx",
    "siteType":"push",//Mixing mode (pushing pulling streaming mode)
    "domainType":"pull",  //Domain type added this time
    "domain":"pullHls.ex.com",//Domain needed to be added this time
    "protocol":"hls",//If the created is pulling streaming domain, then it must be the compulsory field
    "referDomain":"push1.ex.com"//Associated Pushing Streaming Domain
}
```

**Return Example**

Normal Response
```
{
    "status": 0,
    "msg": "",
    "requestId":"xxxxxxxxxxxx",
    "data": {
    }
}
```
Abnormal Response
```
{
    "status": 1 ,//Or other error code
    "msg": "Error Reasons",
    "requestId":"xxxxxxxxxxxx",
    "data": {
    }
}
```
