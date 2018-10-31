# SDK-Java

## Installation

If you created a maven project, you just need to add a dependent package in pom.xml:
```
<dependency>  
    <groupId>com.amazonaws</groupId>  
    <artifactId>aws-java-sdk</artifactId>  
    <version>1.11.136</version>  
</dependency>
```

## Create a client

Here is an example of creating a client, for more information, please refer to http://docs.aws.amazon.com/zh_cn/sdk-for-java/v1/developer-guide/examples-s3.html   
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

## Examples
For more Java SDK samples, see [Java SDK examples of compatibility of JD Cloud with S3 ](https://github.com/jdcloud-cmw/oss/tree/master/s3-java-sdk)
