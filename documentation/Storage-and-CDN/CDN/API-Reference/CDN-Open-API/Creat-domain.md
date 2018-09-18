## **Enable Accelerated Domain Name**

## **1. Description**

Enable Accelerated Domain Name (createDomain)

**2. Request Parameter**

| Name   | Type | Compulsory or Not | Description                                                         |
| -------------- | ------ | -------- | ------------------------------------------------------------ |
| username       | String | Yes            | JD User Name pin                                               |
| signature  | String   | Yes           | User Signature, verify user's identity information through md5 method to ensure information security.  md5=date+username+secret key SecretKey date: format is yyyymmddusername: JD user name pin secret key: example agreed between the Parties: such as current date 2016-10-23, user pin: jcloud_00, user secret key SecretKey: e7a31b1c5ea0efa9aa2f29c6559f7d61, then the signature is MD5(20161023jcloud_00e7a31b1c5ea0efa9aa2f29c6559f7d61) |
| domain         | String   | Yes           | Accelerated Domain Name                                                     |
| type      | String   | Yes           | Type of Domain Name Service resources, currently only supports web means static small files, download means large file acceleration, vod means video acceleration (types not supported currently: dynamic means dynamic acceleration, live means live streaming acceleration) |
| sourceType     | String   | Yes           | ips: IP list, domain: Domain name, oss: oss back-to-origin                       |
| sourceType     | String   | Yes           | Determine the Origin Server IP list or domain name based on sourceType                       | IP and domain back-to-origin must be in Json Format. ip back-to-origin example: "[{'ip':'1.1.1.1','priority':'master'},{'ip':'2.2.2.2','priority':'master'},{'ip':'3.3.3.3','priority':'slave’}]", when ip is backed to origin, priority represents master-slave IP, master represents master, slave represents slave, domain back-to-origin example: "[{'domain':'www.a.com','priority':'1'},{'domain':'www.b.com','priority':'2’}]", when domain is backed to origin, priority represents domain name priority, 1-5 represents OSS back-to-origin in priority from high to low "oss.jcloud.com" |
| backSourceType | String   | Yes           | Back-to-origin type, can only be http (port 80 back-to-origin) or https (port 443 back-to-origin), http by default |
| dailyBandWidth | String | Yes       |Business Daily Bandwidth at the peak                                             |

 

**3. Return Parameter**

| **Name**   | **Description**                                                  |
| -------- | --------------------------------------------------------- |
| status   | Result status means whether the API request is successful or not, 0 means successful, others means failure|
| msg      | Note Information                       |
| data     | Domain Name                                                      |

 

**4. Call Example**

- ### **Request Address**

http://opencdn.jcloud.com/api/createDomain

- ### **Request Example**

curl Request Example:

```
curl -H "Content-type: application/json" -X POST -d '{"username":" testuser ","signature":"914a3f412fd9bc1eec14bb5eb104d253","domain" :"www.a.com","type" :"web","sourceType" :"ips","source" :"[{'ip':'1.1.1.1','priority':'master'},{'ip':'2.2.2.2','priority':'master'},{'ip':'3.3.3.3','priority':'slave'}]","backSourceType" :"http","dailyBandWidth" :200}' http://opencdn.jcloud.com/api/createDomain
```

•        Json Format

```
{
    "username" :"testuser",
    "signature" :"914a3f412fd9bc1eec14bb5eb104d253",
    "domain" :"www.a.com",
    "type" :"web",
    "sourceType" :"ips",
    "source" :"[{'ip':'1.1.1.1','priority':'master'},{'ip':'2.2.2.2','priority':'master'},      {'ip':'3.3.3.3','priority':'slave'}]",
    "backSourceType" :"http",
    "dailyBandWidth" :200,
 }
```

-  **Return Example**

  •        Json Format

  

```
{
  "status": 0,
  "msg": “Successful",
  "data": "www.a.com "
}
```

 