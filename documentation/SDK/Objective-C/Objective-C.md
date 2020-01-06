# JDCloud Objective-C Open API SDK

## Introduction

&emsp;&emsp; Welcome to use JD Cloud iOS SDK (programmed with Objective-C). You can access various services provided by JD Cloud without complex programming by using JD Cloud iOS SDK.    
&emsp;&emsp; We recommend you view OpenAPI Getting Started first prior to using SDK so that you can easily understand the meaning of some concepts and parameters in the SDK. Please see program notes or API documents of specific product line under [OpenAPI&SDK](https://www.jdcloud.com/help/faq?act=3) for understanding the specific parameters and meaning of each API.

## Environment Preparation & Compilation

* This code is programmed with XCode 10.1, and XCode is required to be installed for clock-in projects.

## Call Method

* pod is not uploaded now. Therefore, please manually quote the source code into your project for compiling.

* Please view the file of  `JDCloudOCSDKVmTests.m` under the folder of `JDCloudOCSDKVmTests` of the project for application method. A simple call example is as follow:

```Objective-C

-(void)testRequestSync{
    /// init Credential
    Credential * credential = [[Credential alloc]initWithAccessKeyId:@"your jdcloud ak" secretAccessKey:@"your jdcloud sk"];
    
    /// if use internal service create this object and set client sdkEnvironment property
    SDKEnvironment* sdkEnvironment = [[SDKEnvironment alloc]initWithEndPoint:@"apigw-internal.cn-north-1.jcloudcs.com"];

    /// init client if use default environment please write like this "VmClient* vmClient = [[VmClient alloc] initWithCredential:credential]"
    VmClient* vmClient = [[VmClient alloc] initWithCredential:credential sdkEnvironment:sdkEnvironment];

    /// if set debug true  it will write debug log
    [GlobalConfig setDebug:true];

    // set httpRequestProtocol if use internal set http else do not need to set this property , default value is https
    vmClient.httpRequestProtocol = @"http";

    // create request param
    VmDescribeInstancesRequest* describeInstancesRequest = [[VmDescribeInstancesRequest alloc]initWithRegion:@"cn-north-1"];
    
    // call sync method , if you want call async method see "JDCloudOCSDKVmTests/JDCloudOCSDKVmTests.m"
    NSDictionary* result = [vmClient describeInstancesSyncWithRequest:describeInstancesRequest];

    //get response data, the result key please see client notice
    VmDescribeInstancesResponse* response = [result objectForKey:@"describeInstancesResponse"];
    NSLog(@"Total Entry: %@",[[response result] totalCount]);
}
  
```

## Note

* If the setting of an additional header is required, for example, the API with MFA operation protection enabled is required to be called, and passing x-jdcloud-security-token is required, the following method shall be followed:

```

    [vmClient addCustomerHeaderWithKey:@"x-jdcloud-security-token" value:@"xxx"]

```

* If you need to set an access point or configure time-out, please refer to the following examples:

```
    
    Credential * credential = [[Credential alloc]initWithAccessKeyId:@"ak" secretAccessKey:@"sk"];
    // set request host
    SDKEnvironment* sdkEnvironment = [[SDKEnvironment alloc]initWithEndPoint:@"apigw-internal.cn-north-1.jcloudcs.com"];
    VmClient* vmClient = [[VmClient alloc] initWithCredential:credential sdkEnvironment:sdkEnvironment];
    [GlobalConfig setDebug:true];
    VmDescribeInstancesRequest* describeInstancesRequest = [[VmDescribeInstancesRequest alloc]initWithRegion:@"cn-north-1"];
    vmClient.httpRequestProtocol = @"http";
    dispatch_semaphore_t semaphore = dispatch_semaphore_create(0);
    [vmClient describeInstancesAsyncWithRequest:describeInstancesRequest completionHandler:^(int statusCode, VmDescribeInstancesResponse * _Nullable describeInstancesResponse, NSData * _Nullable responseData, NSError * _Nullable error) {
        NSLog(@"Total Entry: %@",[[describeInstancesResponse result] totalCount]);
        dispatch_semaphore_signal(semaphore);
    }];
    dispatch_semaphore_wait(semaphore, DISPATCH_TIME_FOREVER);

```
 


 
