# Initialization

You can create S3Client to manage OSS resources such as bucket and file. To use Java SDK to initiate OSS request, you need to use your AccessKey and SecretKey to initiate a S3Client and modify the default configuration items of ClientConfig according to the needs.

## Determine Endpoint

Please read “Basic Concept” - [Access to the domain name](https://docs.jdcloud.com/cn/object-storage-service/regions-and-endpoints) to learn about relevant concepts of Endpoint.

## Configure the Secret Key

A pair of valid Access Keys (including Access KeyId and Access KeySecretID) to perform signature verification for accessing JD Cloud OSS. They can be acquired through the following steps:

[Register a JD Cloud Account](https://uc.jdcloud.com/reg?returnUrl=http%3A%2F%2Fwww.jdcloud.com%2Findex)

[Apply for AccessKey](https://uc.jdcloud.com/accesskey/index)

After acquiring the AccessKeyId and secretAccessKeyId, you can perform initialization as per the following steps.

## Create S3Client
The following example shows how to create a client. For more Java SDK samples, please access to [JD Cloud Compatible with S3 Java SDK Samples](https://github.com/jdcloud-cmw/oss/tree/master/s3-java-sdk)
```
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.Protocol;
import com.amazonaws.SDKGlobalConfiguration;
 
public class S3SdkTest{
    public static void main(String[] args)  {
        final String accessKey = "your accesskey";
        final String secretKey = "your secretkey";
        final String endpoint = "https://s3.cn-north-1.jcloudcs.com";
        System.setProperty(SDKGlobalConfiguration.ENABLE_S3_SIGV4_SYSTEM_PROPERTY, "true");
        ClientConfiguration config = new ClientConfiguration();
 
        AwsClientBuilder.EndpointConfiguration endpointConfig =
                new AwsClientBuilder.EndpointConfiguration(endpoint, "cn-north-1");
 
        AWSCredentials awsCredentials = new BasicAWSCredentials(accessKey,secretKey);
        AWSCredentialsProvider awsCredentialsProvider = new AWSStaticCredentialsProvider(awsCredentials);
 
        AmazonS3 s3 = AmazonS3Client.builder()
                .withEndpointConfiguration(endpointConfig)
                .withClientConfiguration(config)
                .withCredentials(awsCredentialsProvider)
                .disableChunkedEncoding()
                .withPathStyleAccessEnabled(true)
                .build();
    }
}
```


