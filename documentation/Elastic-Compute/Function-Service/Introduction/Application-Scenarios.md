# Application Scenarios

When constructing applications on Function Service, and the core components are Function and event sources. Event source is the JD Cloud service for releasing events, and Function is the customized code for processing events.

**Multimedia content analysis and processing** –OSS Object Storage Service is one of JD Cloud event sources supported by Function Service, which supports multiple types of events and invokes your Function, which can trigger associated analysis processing function by uploading events to objects. For example: for the use, you can use your applications to upload multimedia files, such applications store these files in OSS Bucket. Your application can automatically process (extract, transcode, scale, and so on) a user’s multimedia files by creating Function, then save the processed results to specified OSS Bucket.

 ![OSS场景](https://github.com/jdcloudcom/en/blob/function/image/Elastic-Compute/functionservice/funcEn-01%20.png)
 
**Serverless backend service** –When creating a website, you can host the back-end logic on Function. Invoke Function over HTTP, and use the API gateway as the HTTP terminal node. Invoke API through a Web client, API Gateway routes the request to Function to invoke the function, which completes the user site backend logic processing.

 ![APIG场景](https://github.com/jdcloudcom/en/blob/function/image/Elastic-Compute/functionservice/funcEn-02.png)
