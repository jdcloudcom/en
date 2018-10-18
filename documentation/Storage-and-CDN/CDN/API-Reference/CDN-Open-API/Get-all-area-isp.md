# **Get all Regions+Operators**

## **1. Description**

Get all Regions+Operators (region_name)

## **2. Request Parameter**

| **Name**  | **Type** | **Compulsory or Not ** | **Description**                                                     |
| --------- | -------- | ------------ | ------------------------------------------------------------ |
| username  | String   | Yes           | JD User Name pin                                                |
| signature | String   | Yes           | User Signature, verify user's identity information through md5 method to ensure information security.  md5=date+username+secret key SecretKey date: format is yyyymmddusername: JD user name pin secret key: example agreed between the Parties: such as current date 2016-10-23, user pin: jcloud_00, user secret key SecretKey: e7a31b1c5ea0efa9aa2f29c6559f7d61, then the signature is MD5(20161023jcloud_00e7a31b1c5ea0efa9aa2f29c6559f7d61) |


## **3. Description of Returned Parameter Data**

| **Name** | **Description**                       |
| -------- | ------------------------------ |
| status   | Result status 0, refresh successful, others failure|
| msg      | Note Information                                                   |
| data     | Return Data                       |


## **4. Call Example**

- ### **Request Address**

http://opencdn.jcloud.com/api/region_name

- ### **Request Example**

```
http://opencdn.jcloud.com/api/region_name
{
    "username" :"test_user",
    "signature" :"dbc1c1302d0a1baa48a256cbfc840317"
 }
```

- ### **Return Instructions**

•        Json Format

```
{
"status": 0,//0 means this request succeeded
"data":{
"mainLandChina":[//Main Land China
{
region,//Region
name//Region Name
}
]
"operators":[//Operator
region,//Operator
name//Operator Name
]
 "overseas": [  //Overseas
 region,//Overseas Region
name//Overseas Region Name
]

}
}
```

- ### **Return Example**

```
{
    "status": 0,
    "msg": "Successful",
    "data": {
        "mainLandChina": [
            {
                "region": "anhui",
                "name": "Anhui"
            }
  {
                "region": "zhejiang",
                "name": "Zhejiang"
            }
        ],
              "operators": [
            {
                "region": "cmcc",
                "name": "Mobile"
            },
            {
                "region": "cnc",
                "name": "Unicom"
            }
            {
                "region": "huashu",
                "name": "Wasu"
            }
        ],
        "overseas": [
            {
                "region": "gangaotai",
                "name": "China Hong Kong, Macao and Taiwan"
            },
            {
                "region": "world",
                "name": "Abroad"
            }
        ]
    }
}
```