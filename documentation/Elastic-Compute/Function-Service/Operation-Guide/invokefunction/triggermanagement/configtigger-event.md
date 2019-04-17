# Event Format

A trigger passes an event to Function when it triggers a function; when an event is passed, it is passed in JSON format with a specific data structure. For different content format of configuration files set by different trigger parameters, this document lists the format templates for configuration files and explains the supported attributes. In addition, events triggered by different triggers have different formats for the event objects passed to the function interface.

## OSS Trigger

When Function Service is used as an event notification type for OSS, OSS will pass the request parameter to the request parameter of Function `event` through a fixed Mapping structure.

### Event Format


```
{
     "Records": [
        {
            "version": "0", 
            "id": "6a7e8feb-b491-4cf7-a9f1-bf3703467718",
            "time": "2006-01-02T15:04:05.999999999Z",
            "source": "oss",
            "base64OwnerPin": "NTk0MDM1MjYzMDE5",
            "resources": [
                "jrn:oss:cn-north-1:accountID:bucketname/objectname"
            ],
            "region": "cn-north-1",
            "detailType": "MessageReceived",
            "detail": { 
                "eventName":"event-type",  //Event Type
                "responseElements":{  
                    "x-amz-request-id":"OSS generated request ID"  //Request ID of the generated event
                },
                "s3":{  
                    "s3SchemaVersion":"1.0",  //Version number of the notification content, currently "1.1"
                    "configurationId":"ID found in the bucket notification configuration",  //ConfigurationId in the event notification configuration
                    "bucket":{  
                        "name":"bucket-name",  //Bucket Name
                        "ownerIdentity":{  
                            "principalId":"userId-of-the-bucket-owner"  //Bucket owner user ID
                        }
                     },
                    "object":{  
                        "key":"object-key",  //Object Name
                        "eTag":"object eTag",  //etag of Object, same as the content of Etag header returned from GetObject request
                        "size":"object size",  //size of Object
                        "type":"object type"  //type of Object 
                    }
                },
                "callBackVar": {  //Customized parameters in the NotificationConfiguration
                    "callBackVars": {                 
                        "var1":["value1","value3"],
                        "var2":["value2"]
                    }
                }
            }       
        }
    ]
}
```

For OSS trigger configuration details, please refer to [OSS Trigger](../triggermanagement/eventsourceservice/oss-tirgger.md). 

 

## API Gateway Trigger


### Event Format

#### Enter Format

When Function Service is used as the backend service of an API gateway, API Gateway will pass the request parameter to the request parameter of Function `event` through a fixed Mapping structure, and Function will obtain and process the required parameters through the following structure.

```
{
    "version":"0",
    "id":"6a7e8feb-b491-4cf7-a9f1-bf3703467718",
    "time":"2006-01-02T15:04:05.999999999Z",
    "source":"apigateway",
    "base64OwnerPin":"NTk0MDM1MjYzMDE5",
    "resources":[    
    ],
    "region":"cn-north-1",
    "detailType":"ApiGatewayReceived",
    "detail":{
        "path":"api request path",        //Request Path
        "httpMethod":"GET/POST/DELETE/PUT/PATCH",  
        "headers":{                 //Request Header
            "header":"headerValue"
        },
        "pathParameters":{      //Path Parameter
            "pathParam":"pathValue"
        },
        "queryParameters":{            //Search Parameter
            "queryParam":"queryValue"
        },
        "body":"string of request payload",
        "requestContext":{
            "stage": "test",             //Environment Alias 
            "apiId":"testsvc",
            "identity": {
                "accountId": "",        //userid
                "apiKey": "",           //ak
                "user": "",          //pin
                "authType": ""       //Type of Identity Verification Beta Exempt from Authentication for Beta/jdcloud authentication
            },
            "requestId":"c6af9ac6-7b61-11e6-9a41-93e8deadbeef",
            "sourceIp":"10.0.2.14"
        }
    }
} 

```
For API Gateway Trigger Configuration details, please refer to [API Gateway Trigger](../triggermanagement/eventsourceservice/apig-tigger.md). 

**Parameter Description**: The body content between the gateway and Function is not subject to Base64 coding.


#### Output Format

Function will normalize the output content to return it to the API Gateway in the JSON format as below:

```
{     
    "statusCode": httpStatusCode,     
    "headers": {"headerName":"headerValue",...},     
    "body": "..." 
 } 
```


