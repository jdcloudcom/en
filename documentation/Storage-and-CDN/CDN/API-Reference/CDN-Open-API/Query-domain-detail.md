# **Query Domain Name Details**

## **1. Description**

Query the Details of Accelerated Domain Name(queryDomainDetail)

## **2. Request Parameter**

| **Name**   | **Type** | **Compulsory or Not** | **Description**                                                     |
| --------- | -------- | ------------ | ------------------------------------------------------------ |
| username  | String   | Yes            | JD User Name pin                                                |
| signature  | String   | Yes           | User Signature, verify user's identity information through md5 method to ensure information security.  md5=date+username+secret key SecretKey date: format is yyyymmddusername: JD user name pin secret key: example agreed between the Parties: such as current date 2016-10-23, user pin: jcloud_00, user secret key SecretKey: e7a31b1c5ea0efa9aa2f29c6559f7d61, then the signature is MD5(20161023jcloud_00e7a31b1c5ea0efa9aa2f29c6559f7d61) |
| domain         | String   | Yes           | Accelerated Domain Name                                                     |

 

## **3. Return Parameter**

| **Name**       | **Description**                                                     |
| -------------- | ------------------------------------------------------------ |
| status         | Result status, means whether the API request is succeeded, 0 means succeeded, others means failed    |
| msg            | Note information, e.g. the reasons why task sending is failed, etc.                             |
| data           | Domain Name Information Array                                                 |
| domain         | Accelerated Domain Name                                                     |
| type           | Types of the domain name service resources, currently only supports web mode    static small files, download means large file acceleration, vod means video acceleration   (Types not supported currently: dynamic means dynamic acceleration, live means live streaming acceleration) |
| sourceType     | ips: IP list, domain: Domain name, oss:oss back-to-origin                       |
| source         | Back-to-origin information, ips and domain  return json character string; oss returns domain name             |
| backSourceType | Back-to-origin type, can only be http (port 80 back-to-origin) or https (port 443 back-to-origin), http by default |
| status         | Domain Name Status, Such As Deploying, Reviewing, Running, Stopped, Blocked and Other Information |
| dailyBandWidth | Daily Peak Bandwidth |
| archiveNo      | ICP Filing No. |


 

## **4. Call Example**

- ### **Request Address**

http://opencdn.jcloud.com/api/queryDomainDetail

- ### **Request Example**

curl Request Example:

```
 curl -H “Content-type: application/json” -X POST -d ‘{“username”:“test_user”,“signature”:“914a3f412fd9bc1eec14bb5eb104d253”,“domain” :“www.a.com”}’ http://opencdn.jcloud.com/api/queryDomainDetail
```

•        Json Format

```
http://opencdn.jcloud.com/api/queryDomainDetail
{
    "username" :"test_user",
    "signature" :"d847267fc702273abf394dd0c3128d64",
    "domain" :"www.a.com"
    
 }
```

- ### **Return Example**

•        Json Format

```
{
    "status": 0,
    "msg": "Successful",
    "data": {
        "backSourceType": "http",
        "sourceType": "domain",
        "source": "[{\"priority\":2,\"domain\":\"source2.test1.a.com \"},  {\"priority\":1,\"domain\":\"source1. test1.a.com \"}]",
        "status": "Deploying",
        "archiveNo": "J ICP B No.11041704-6",
        "domain": "test1.a.com",
        "dailyBandWidth": 200,
        "type": "Image Small File",
        "cname": "test1.a.com.s.galileo.jcloud-cdn.com"
    }
}
```

 