# **Create Accelerated Domain**

## **1. Description**

Enable Accelerated Domain(createDomain)

## **2. Request Parameters**

| Name           | Type   | Compulsory or not | Description                                                         |
| -------------- | ------ | -------- | ------------------------------------------------------------ |
| username       | String | Yes       | JD User Name pin                                                |
| signature      | String | Yes       |User signature, verify user's identity information through md5 method to ensure information security. </br>md5=date+username+secret key SecretKey; date: format is yyyymmdd; username: JD user name pin; secret key: agreed between the Parties; </br>example: such as current date 2016-10-23, user pin: jcloud_00, user secret key SecretKey: e7a31b1c5ea0efa9aa2f29c6559f7d61, then the signature is MD5(20161023jcloud_00e7a31b1c5ea0efa9aa2f29c6559f7d61) |
| domain         | String | Yes | Accelerated Domain                                                     |
| type           | String | Yes       | Type of domain service resources, currently only supports web means static small files, download means large file acceleration, vod means video acceleration (types not supported currently: dynamic means dynamic acceleration, live domain creation refers to live open api) |
| sourceType     | String | Yes       | ips: IP list, domain: domain, oss: oss back-to-origin                      |
| source         | String | Yes       | 1. Determine the Origin Server IP List or domain based on sourceType. </br>2. IP and domain back-to-origin must be in json format. ip back-to-origin example: "[{'ip': '1.1.1.1', 'priority': 'master', 'ratio': 0.6}, {'ip': '2.2.2.2', 'priority': 'master', 'ratio': 0.4}, {'ip': '3.3.3.3', 'priority': 'slave', 'ratio': 0.3}, {'ip': '4.4.4.4', 'priority': 'slave', 'ratio': 0.7}]", when ip is backed to origin, priority represents master and slave IP, master represents master, slave represents slave; domain back-to-origin example: "[{'domain':'www.a.com','priority':'1'},{'domain':'www.b.com','priority':'2'}]", when domain is backed to origin, priority represents the priority of domain, 1-5 represent the priority from high to low; OSS back-to-origin "oss.jcloud.com".</br>3. IP/domain is backed to origin, customized ports can be set, such as "[{'ip':'1.1.1.1:8080','priority': 'master'}]" |
| backSourceType | String | Yes       | Back-to-origin type, can only be http (port 80 back-to-origin) or https (port 443 back-to-origin), http by default |
| dailyBandWidth | String | Yes       | Business daily bandwidth at the peak                                             |

## **3. Return Parameters**

| **Name** | **Description**                                                  |
| -------- | --------------------------------------------------------- |
| status   | Result status, means whether the API request is successful or not, 0 means successful, others means failure |
| msg      | Notification Information                                                  |
| data     | Domain                                                      |

## **4. Call Example**

- ### **Request Address**

https://opencdn.jcloud.com/api/createDomain

- ### **Request Example**

curl Request Example:
```
curl -H "Content-type: application/json" -X POST -d '{"username":" testuser ","signature":"914a3f412fd9bc1eec14bb5eb104d253","domain" :"www.a.com","type" :"web","sourceType" :"ips","source" :"[{'ip':'1.1.1.1','priority':'master'},{'ip':'2.2.2.2','priority':'master'},{'ip':'3.3.3.3','priority':'slave'}]","backSourceType" :"http","dailyBandWidth" :200}' https://opencdn.jcloud.com/api/createDomain
```
* json Format
```
{
    "username" :"testuser",
    "signature" :"914a3f412fd9bc1eec14bb5eb104d253",
    "domain" :"www.a.com",
    "type" :"web",
    "sourceType" :"ips",
    "source" :"[{'ip':'1.1.1.1','priority':'master'},{'ip':'2.2.2.2','priority':'master'},{'ip':'3.3.3.3','priority':'slave'}]",
    "backSourceType" :"http",
    "dailyBandWidth" :200
 }
```
- ### **Return Example**

* json Format

```
{
  "status": 0,
  "msg": "Succeeded",
  "data": "www.a.com "
}
```

 
