# Mobile Application Direct Transmission OSS

## Introduction

This article mainly introduces how to implement mobile application direct transmission to OSS based on JD Cloud Object Storage Service OSS. As mobile APP developer, you can use OSS to process various data storage and distribution requirements so that you can focus more on your application logic.

The mobile application direct transmission service based on OSS shall have the following benefits:

 - Data Security: Use flexible pre-signed URL for data upload and download, which is more secure;
 - Low Cost: Data does not need to be transferred by APP Server; mobile APP is directly connected to OSS, only the control flow is connected to the application server;
 - Elastic Expansion: Bucket with unlimited expansion;
 - Data Processing: Be used with image processing and audio and video transcoding so as to facilitate flexible data processing;

## Principle Introduction

For client application, the access key is put into client code, which is easy to disclose your key information, and not convenient to control user access permissions. You can temporarily authorize your App to access your storage resources through pre-signed URL without disclosing your access key.

Pre-signed URL Introduction:

By default, all objects and storage buckets are private. If you want your users to be able to upload specific objects to your storage bucket without using your access key, you can use pre-signed URL. Upon creating pre-signed URL, you can specify storage bucket name, object name, HTTP method (such as PUT operations), and the period of validity. Identity verification information shall be provided in the manner of query character string parameter, the pre-signed URL will be invalid beyond the period of validity.

The development flow chart of mobile application direct transmission service is as follows:

![移动应用直传](../../../../image/Object-Storage-Service/OSS-104.png)

Process Description:

 - 1. Mobile application requests the application server for pre-signed URL;
 
 - 2. Application server generates pre-signed URL and returns it to the mobile application client;
 
 - 3. Mobile application uploads files to OSS using pre-signed URL;
 
 - 4. After transmission, OSS returns the message of successful upload;
 
 - 5. If user configured the upload callback notification, OSS will callback application server asynchronously;
 
 - 6. After reeving the callback message, the application server will return the message of successful callback.
 
## Application Server Example Code
 
You can deploy the following example code on the application server to generate a pre-signed URL, and you can adjust the example code according to your business logic. Before the mobile application requests OSS, it can request the application signature to return pre-signed URL, parameters (such as Bucket, Key, HTTP Method) related to pre-signed are required to be transmitted according to OSS access demands.

The example is prepared based on S3 JAVA SDK, the installation and use of SDK can refer to [JAVA SDK Installation]().

```
import java.net.URL;
import java.util.Date;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.HttpMethod;
import com.amazonaws.Protocol;
import com.amazonaws.SDKGlobalConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.S3ClientOptions;
import com.amazonaws.services.s3.model.GeneratePresignedUrlRequest;

public class PresignUrl {
    static AmazonS3 createS3Client(String accessKey, String secretKey, String endpoint) {
        System.setProperty(SDKGlobalConfiguration.ENABLE_S3_SIGV4_SYSTEM_PROPERTY, "true");
        AWSCredentials awsCredentials = new BasicAWSCredentials(accessKey,secretKey);
        ClientConfiguration config = new ClientConfiguration();
        config.setProtocol(Protocol.HTTP);
        AmazonS3 s3 = new AmazonS3Client(awsCredentials,config);
        s3.setEndpoint(endpoint);
        S3ClientOptions options = new S3ClientOptions();
        options.withChunkedEncodingDisabled(true); // Must have
        s3.setS3ClientOptions(options);
        return s3;
    }
    static public URL generatePresignUrl(String accessKey, String secretKey, String endpoint, String bucketName, String keyName, HttpMethod method, Date expiration) {
        AmazonS3 s3 = createS3Client(accessKey,secretKey,endpoint);
        GeneratePresignedUrlRequest request = new GeneratePresignedUrlRequest(bucketName, keyName)
                .withMethod(method)
                .withExpiration(expiration);
        return s3.generatePresignedUrl(request);
    }
    static public void main(String [ ]str) {
        final String accessKey = "<your accessKey>";
        final String secretKey = "<your secretKey>";
        final String endpoint = "<your endpoint>";
        final String bucketName = "<your bucketname>";
        final String keyName = "<your keyname>";
        final HttpMethod method = HttpMethod.PUT;  //Set HTTP method allowed by your PresignUrl here
        final Integer expireInSeconds = 100;  //Set valid time period of your PresignUrl here with the unit of second
        final Date expiration = new Date(System.currentTimeMillis() + expireInSeconds * 1000);

        URL url = generatePresignUrl(accessKey, secretKey, endpoint, bucketName, keyName, method, expiration);
        System.out.println("Pre-Signed URL: " + url);
    }
}
```

## Use Pre-signed URL

2. After generation of pre-signed URL, application server shall return the URL to the mobile application. The mobile application may use the pre-signed URL to access OSS, the URL can only be used within the specified period of validity, which only supports access to designated resources (Method, Bucket, Key designated generating the pre-signed URL) using designated HTTP Method.

Pre-signed URL Example:

```
http://testbucket.s3.cn-north-1.jcloudcs.com/testkey
?X-Amz-Algorithm=AWS4-HMAC-SHA256
&X-Amz-Date=20190117T061845Z
&X-Amz-SignedHeaders=host
&X-Amz-Expires=98
&X-Amz-Credential=59E6DC72927457BDEBF36A56EE616B07
%2F20190117%2Fcn-north-1%2Fs3%2Faws4_request
&X-Amz-Signature=cc379e30731236473de05dcb7a3ad1b275fb0d6af58ecfdbd06e2dd051dd57ed
```

Note: The pre-signed URL will not expose your AccessKey Secret.

Use Curl command to simulate uploading a file using pre-signed URL, the example command is as follows:

```
curl -X PUT -T testfile "http://testbucket.s3.cn-north-1.jcloudcs.com/testkey?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Date=20190117T044444Z&X-Amz-SignedHeaders=host&X-Amz-Expires=98&X-Amz-Credential=59E6DC72927457BDEBF36A56EE616B07%2F20190117%2Fcn-north-1%2Fs3%2Faws4_request&X-Amz-Signature=a21204debab7c0b0c4ba334e6a9f76d5b6ce3328591acc29890540ddee513dcf" -v
```

## Configure revoke notification

Because when the mobile application uploads data, it does not transfer data through the application server, but directly transmits to OSS. If the application server needs to know which files have been uploaded by the mobile application, it can be implemented by configuring revoke notification function. Please refer to [Revoke Notification]() for more information, you can specify that the revoke notification will be done timely when the storage bucket resource changes.

You can configure your application server as the callback server according to the following example. When the revoke notification is triggered, OSS will generate a message notification to the revoke URL. The event message is in JSON format and you can analyze the content you need from the event message.

```
import org.springframework.http.HttpHeaders;
import org.springframework.util.Base64Utils;
import org.springframework.web.bind.annotation.*;
import java.nio.charset.StandardCharsets;

@RestController
public class SubscriptionTest {

    //Messages Notification in Simple Format
    @RequestMapping("/notifications1")
    public String notifications1(@RequestBody String message
            , @RequestHeader HttpHeaders headers) {
		
        if (headers.get("x-jdcloud-message-type").get(0).equals("SubscriptionConfirmation")) {
			//For the verification of url during settings, message needs to be encoded by using base64 and returned
            return Base64Utils.encodeToString(message.getBytes(StandardCharsets.UTF_8));
        } else {
            //Message notification processes your code, http code 200 needs to be returned when processing is completed, and body shall not be verified
            return "";
        }
    }
}
```
