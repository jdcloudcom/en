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
   "statusCode":httpStatusCode,
   "headers":{"headerName":"headerValue", ...}, 
   "body":"..."
 } 
```

## Queue Service JQS Trigger

### Event Format

When the function service consumes a message in the queue service message queue, it will designate a queue by round robin and call the function asynchronously through an `event` that contains queue messages.

```
{
    "Records":[
        {
            "version":"0",
            "id":"9fd19a5b-ddff-41b8-9689-e539cfb5dc41",
            "time":"2019-10-28T15:00:19.45626304+08:00",
            "source":"jqs",
            "base64OwnerPin":"based64Pin",
            "resources":[
                "jqs-jrn"
            ],
            "region":"cn-north-1",
            "detailType":"jqspullReceived",
            "detail":{
                "messageId":"41783100ccd4ac4030b3b12061058618",
                "receiptHandle":"based64receiptHandle",
                "body":"test",
                "attributes":{
                    "ApproximateFirstReceiveTimestamp":"1572246000180643518",
                    "ApproximateReceiveCount":"1",
                    "SenderId":"senderpin",
                    "SentTimestamp":"1572245999697935359"
                },
                "messageAttributes":null,
                "md5OfBody":"098f6bcd4621d373cade4e832627b4f6"
            }
        }
    ]
}

```

For Queue Service JQS trigger configuration details, please refer to [Queue Service JQS Trigger](../triggermanagement/eventsourceservice/JQS-trigger.md). 


## Cloud Event Trigger

Cloud Event will pass the event request parameter to the request parameter `event` of Function through a fixed Mapping structure, and Function can get and process the required parameters through the following structure.


### Event Format

The following example is in the event format of system event

```
{
    "Records": [
        {
            "version":"0",
            "id":"2f30509d-3c5e-443e-9bd2-ebb9dda74e68",
            "time":"2019-12-20T03:17:29Z",
            "source":"events",
            "base64OwnerPin":"amNsb3VkX21vbml0b3I=",
            "resource":["bnti0hqm4n7mrlluj9cg"],
            "region":"cn-north-1",
            "detailType":"resourcesMonitor",
            "detail": {
                "version":"1.0",
                "id":"85bf4aa3-3fb3-4cbb-ba52-cab54edae769",
                "detailType":"resourcesMonitor",
                "source":"jcloud.monitor.alert",
                "pin":"jcloud_monitor",
                "time":"2019-12-20T11:17:29+0800",
                "region":"cn-north-1",
                "resources":["alarm-aqoz718971"],
                    "detail": {
                        "content":"content",
                        "resourceId":"mysql-fo32fberwl",
                        "ruleId":" ",
                        "serviceCode":"database",
                        "threshold":7.77,
                        "time":"2019-12-20T11:17:09+08:00",
                        "times":2723,
                        "value":11.43282585600461
                    }
            } 
        }
    ]
}

```


For Cloud Event trigger configuration details, please refer to [Cloud Event Trigger](../triggermanagement/eventsourceservice/cloudevent.md). 
