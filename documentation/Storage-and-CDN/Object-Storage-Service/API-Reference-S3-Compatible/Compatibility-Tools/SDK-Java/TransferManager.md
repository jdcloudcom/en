# TransferManager

## Overview
You can upload, download and get transmission progress by using AWS SDK for Java [TransferManager](https://docs.aws.amazon.com/AWSJavaSDK/latest/javadoc/index.html?com/amazonaws/services/s3/transfer/TransferManager.html). For more specific instructions, please refer to [AWS SDK for Java/TransferManager](https://docs.aws.amazon.com/zh_cn/sdk-for-java/v1/developer-guide/examples-s3-transfermanager.html?shortFooter=true).

## Initialize TransferManager

Please initialize the TransferManager instance before transmitting TransferManager, with examples as follows:

```Java
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
import com.amazonaws.services.s3.transfer.TransferManager;
import com.amazonaws.services.s3.transfer.TransferManagerBuilder;

public class S3SdkTest{
    public static void main(String[ ] args)  {
        final String accessKey = "<your accesskey>";
        final String secretKey = "<your secretkey>";
        final String endpoint = "https://s3.<REGION>.jdcloud-oss.com";
        ClientConfiguration config = new ClientConfiguration();
 
        AwsClientBuilder.EndpointConfiguration endpointConfig =
                new AwsClientBuilder.EndpointConfiguration(endpoint, "<REGION>");
 
        AWSCredentials awsCredentials = new BasicAWSCredentials(accessKey,secretKey);
        AWSCredentialsProvider awsCredentialsProvider = new AWSStaticCredentialsProvider(awsCredentials);
        //Initialize s3 instance
        AmazonS3 s3 = AmazonS3Client.builder()
                .withEndpointConfiguration(endpointConfig)
                .withClientConfiguration(config)
                .withCredentials(awsCredentialsProvider)
                .disableChunkedEncoding()
                .withPathStyleAccessEnabled(true)
                .build();
        //Initialize TransferManager instance
        TransferManager xfer_mgr = TransferManagerBuilder.standard()
                .withS3Client(s3)
                .build();
        
        //Upload and download...... with xfer_mgr
    }
}
```

## Upload
TransferManager can upload a single file or the entire directory to the bucket.
### Upload a single file
```Java
String bucket_name = "your-bucket";
String key_name = "your-key";
String file_path = "your-path";

File f = new File(file_path);

try {
    //Upload files (support files larger than 5G)
    Upload xfer = xfer_mgr.upload(bucket_name, key_name, f);
    //Check transmission status
    XferMgrProgress.showTransferProgress(xfer);
    //Wait to transmission completion
    XferMgrProgress.waitForCompletion(xfer);
} catch (AmazonServiceException e) {
    System.err.println(e.getErrorMessage());
    System.exit(1);
}
```

### Upload Directory
```Java
String bucket_name = "your-bucket";
String key_prefix = "your-prefix";
String dir_path = "your-path";

try {
    //Upload all files under the directory dir_path (including subdirectories)
    MultipleFileUpload xfer = xfer_mgr.uploadDirectory(bucket_name,
            key_prefix, new File(dir_path), true);
    //Check transmission status
    XferMgrProgress.showMultiUploadProgress(xfer);
    //Wait to transmission completion
    XferMgrProgress.waitForCompletion(xfer);
} catch (AmazonServiceException e) {
    System.err.println(e.getErrorMessage());
    System.exit(1);
}
```

## Download
TransferManager can download a single object or the entire directory to the local directory.
### Download a single object
```Java
String bucket_name = "your-bucket";
String key_name = "your-key";
String file_path = "your-path";

File f = new File(file_path);

try {
    Download xfer = xfer_mgr.download(bucket_name, key_name, f);
    //Check transmission status
    XferMgrProgress.showTransferProgress(xfer);
    //Wait to transmission completion
    XferMgrProgress.waitForCompletion(xfer);
} catch (AmazonServiceException e) {
    System.err.println(e.getErrorMessage());
    System.exit(1);
}
```
### Download Directory
```Java
String bucket_name = "your-bucket";
String key_prefix = "your-prefix";
String dir_path = "your-path";

try {
    MultipleFileDownload xfer = xfer_mgr.downloadDirectory(
            bucket_name, key_prefix, new File(dir_path));
    //Check transmission status
    XferMgrProgress.showTransferProgress(xfer);
    //Wait to transmission completion
    XferMgrProgress.waitForCompletion(xfer);
} catch (AmazonServiceException e) {
    System.err.println(e.getErrorMessage());
    System.exit(1);
}
```

## Get Transmission Progress
XferMgrProgress provides static methods such as waitForCompletion, showTransferProgress, showMultiUploadProgress, etc. For specific examples, please refer to: [XferMgrProgress.java](https://github.com/awsdocs/aws-doc-sdk-examples/blob/master/java/example_code/s3/src/main/java/aws/example/s3/XferMgrProgress.java)
