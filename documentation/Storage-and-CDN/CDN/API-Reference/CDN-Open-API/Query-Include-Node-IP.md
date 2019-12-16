# **Search whether the IP is that of a manufacturer or not**

 ## **1. Description**

 Search if the IP is that of JD Cloud node

 ## **2. Request Parameters**

 | **Name**   | **Type** | **Compulsory or not** | **Description**                                                     |
| ---------- | -------- | ------------ | ------------------------------------------------------------ |
| username   | String   | Yes           | JD User Name pin                                                |
| signature  | String   | Yes           | User signature, verify user's identity information through md5 method to ensure information security. </br>md5=date+username+secret key SecretKey; date: format is yyyymmdd; username: JD user name pin; secret key: agreed between the Parties; </br>example: such as current date 2016-10-23, user pin: jcloud_00, user secret key SecretKey: e7a31b1c5ea0efa9aa2f29c6559f7d61, then the signature is MD5(20161023jcloud_00e7a31b1c5ea0efa9aa2f29c6559f7d61)|
| ips     | String   | Yes           | ip to be searched, with multiple ips separated by commas, parameter example "1.1.1.1,2.2.2.2", with IPV6 search supported|
| ipType  | String   | No           | Value Range [ipv6,ipv4], the IP Type is not distinguished by default when not uploaded.    |

 ## **3. Return Parameters**

 | **Name**   | **Description** | 
| ---------- | -------- |
| status  | It means whether the API request is successful or not, 0 means successful, any other number means failure  | 
| msg  | Notification Information | 
| data | Return Data| 

 ## **4. Call Example**

 - ### **Request Address**

 https://opencdn.jcloud.com/api/include_node_ip

 - ### **Request Example**

 ```
{
    "username":"user_test",
    "signature":"ca4c56f85e3582f4d814cc77949c82a7",
    "ips":"1.1.1.1,2.2.2.2"
}
```

 - ### **Return Example**

 ```
{
    "code": 0,
    "message": "",
    "codeDesc": "Success",
    "data": {
        "last_update_time": TS, // Time Stamp 
        "list": [
            {
                "ip": "2.2.2.2",// ip
                "platform": "yes",// Owned or not
                "country_code": "1",// Country
                "prov_code": "123"// Province
                "city_code ": "123"// City
                "isp_code ": "21"// Operator
            },
            {
                "ip": "1.1.1.1",
                "platform": "no",
                "country_code": "1",// Country
                "prov_code": "123"// Province
                "city_code ": "123"// City
                "isp_code ": "21"// Operator
            }
        ]
    }
}
 ```
