# OSS Trigger Example

By using function service, Object Storage Service OSS can map the event (for example: upload file to Bucket, delete file in Bucket) to Function, passing event parameter to Function handling function to call your functions.


This example describes how to configure OSS trigger to implement the downloading of files from Bucket in OSS Bucket trigger to temporary disk storage.

 
## Create OSS Bucket


1.   Before you create the trigger, please enable the OSS Object Storage Service; after logging in OSS Console, you shall create a Bucket named "donwloadfunction" in cn-north-1 region and set the "Access Permission" to "Private Read/Write".<br>
2.   Upload the local file test.txt to the newly created Bucket.<br>
3.   Completed.<br>

For detailed operation guide, refer to [Creating a Bucket](/documentation/Storage-and-CDN/Object-Storage-Service/Operation-Guide/Manage-Bucket/Create-Bucket-2.md).



 

## Create Function

 Note: The function and OSS Bucket need to be in the same region.
 
 Login the function service console, go to the "Overview" page or the "Function List" page in cn-north-1 region, and click "Create Function".

* Function template: Python 3.6 Download files from Object Storage Service OSS bucket
* Function name: downloadOSS (you can set your own function name)
* Function entry: Fill in according to the notification, index.handler by default
* Function code: Reference codes are as below. User AK, SK information is required to manually enter
  
```Python

import boto3


def handler(event, context):
  access_key = ‘user AK'   
  secret_key = ‘user SK'

  region = event['Records'][0]['region']
  bucket_name = event['Records'][0]['detail']['s3']['bucket']['name']
  object_name = event['Records'][0]['detail']['s3']['object']['key']

  endpoint = 'https://s3.{}.jdcloud-oss.com'.format(region)
  s3 = boto3.client(
    service_name='s3',
    aws_access_key_id=access_key,
    aws_secret_access_key=secret_key,
    endpoint_url=endpoint
  )

  # download file
  try:
    response = s3.get_object(Bucket=bucket_name, Key=object_name)
    if response['ResponseMetadata']['HTTPStatusCode'] != 200:
      print("download file failed")
      return "download file failed"
    stream = response['Body']
    chunk_size = 1024
    with open('/tmp/test', 'wb') as f:
      while True:
        data = stream.read(chunk_size)
        if not len(data):
          break
        print(data)
        f.write(data)
  except Exception as e:
    print(str(e))
    print("download file failed")
    return "download file failed"

  print("download file successfully")
  return "download file successfully"

```

* Function execution memory: 128MB
* Time-out period: 100 seconds
* Description, environment variable and advanced configuration: no need to fill in
* Trigger: No trigger is configured

Click "Complete" to complete function creation.



## Test Function

Before creating a trigger, you can configure test event to simulate the execution of a function through the console.

The OSS event source is passed as an entering parameter to the function in the form of event, and you can pass the event to the function to test whether the code is correct.

1. Create test event
  
  On the downloadOSS function details, select "Configure Test Event",
* Configure test event: Create a new test event
* Event template: OSS-event-template
* Event name: test ((You can set your own test event name)
* Modify this event template and enter the created OSSbucket parameter. See below:

```JSON
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
                "eventName":"event-type",
                "responseElements":{
                    "x-amz-request-id":"OSS generated request ID"
                },
                "s3":{
                    "s3SchemaVersion":"1.0",
                    "configurationId":"ID found in the bucket notification configuration",
                    "bucket":{
                        "name":"downloadfunction",
                        "ownerIdentity":{
                            "principalId":"userId-of-the-bucket-owner"
                        }
                     },
                    "object":{
                        "key":"test.txt",
                        "eTag":"object eTag",
                        "size":"object size",
                        "type":"object type"
                    }
                },
                "callBackVar": {
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

Click "Save" to complete test event creation.

2. Test function

Select the saved test event "test" in the "Please Select Test Event" drop-down list, and click "Test".


3. After successful execution, you can view the real-time function execution log in the Console to download the test.txt file from bucket: downloadfunction to the temporary disk of this function.
 

## Create OSS trigger

At the end of Console test, you can configure OSS: downloadfunction trigger for the function to trigger the running of function.

1. Select "Trigger" tab in the "OSSfunction" function details, and click "Create Trigger".

* Trigger type: OSS trigger
* Bucket: Select the created Object Storage Service OSS Bucket:"downloadfunction"
* Event type: s3:ObjectCreated:*
* Prefix: null
* Suffix: null

Complete creation.

2. In OSS Console, upload any file to "downloadfunction"Bucket and the Function is triggered to execute the downloading of the test.txt file in this bucket to temporary disk storage.

The above is the simple example of OSS trigger triggering Function.


