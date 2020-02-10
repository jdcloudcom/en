# Feature Introduction

JD Cloud VOD supports to use AWS native SDK to upload media files. By default, multipart upload is used, supporting a single file of 48.8TB (maximum) and breakpoint upload, aiming to make customers realize media file upload in a convenient and fast way.

# Preparatory Work

Please confirm that you have subscribed VOD service. If not, please refer to [Subscription Service](https://github.com/jdcloudcom/cn/blob/edit/documentation/Video-Service/Video-on-Demand/Getting-Started/Service-Provisioning.md).

# Upload Step
![](https://github.com/jdcloudcom/cn/blob/cn-Video-On-Demand/image/Video-on-Demand/AWS%E5%8E%9F%E7%94%9FSDK%E4%B8%8A%E4%BC%A0%E6%AD%A5%E9%AA%A4.png)

**Access VOD SDK to get upload address and upload credential information, with the following fields:**

<table>
<tr>
    <td>Variable Name</td>
    <td>Meaning</td>
</tr>
<tr>
    <td>videoId</td>
    <td>Media ID, used for refreshing upload address and credential after token expired </td>
</tr>
<tr>
    <td>uploadUrl</td>
    <td>Upload link, directly put and upload small files</td>
</tr>
<tr>
    <td>authToken</td>
    <td>Upload credential after Base64 coding</td>
</tr>                
</table>

**Use Base64 resolution upload credential (authToken) to get OSS upload address and authorization information**

After the authToken field is subject to Base64 decoding, the character string of JSON format will be gotten, with following fields:
<table>
<tr>
    <td>Variable Name</td>
    <td>Meaning</td>
</tr>
<tr>
    <td>accessKey</td>
    <td>VOD System ak</td>
</tr>
<tr>
    <td>secretKey</td>
    <td>VOD System sk</td>
</tr>
<tr>
    <td>sessionToken</td>
    <td>Authentication token</td>
</tr>
<tr>
    <td>expiration</td>
    <td>Expiration Time</td>   
</tr>
<tr>
    <td>endpoint</td>
    <td>OSS Region Address</td>
</tr>
<tr>
    <td>region</td>
    <td>OSS Region</td>
</tr>
<tr>
    <td>bucket</td>
    <td>OSS Bucket Name</td>
</tr>
<tr>
    <td>objectKey</td>
    <td>Media File OSS Position</td>
</tr>                
</table>

**Call AWS SDK to upload video files to specified location of specified bucket (use the resolved upload address and authorization information to initialize AWS client. Do not use your own information such as AccessKey).**

# Code Implementation
**Core codes can be implemented in 4 steps:**

1. Initialize VOD client with AKSK   
2. Get video uploading address and credential   
3. Resolve and use upload credential and address to initialize AWS client    
4. Upload local file

Use AWS SDK to upload files to the server, referring to the following version:
# JAVA Upload Example
**Installation Dependence**
```
<dependency>
    <groupId>com.amazonaws</groupId>  
    <artifactId>aws-java-sdk-s3</artifactId>  
    <version>1.11.136</version>  
</dependency>
```
**Multipart Upload**

Big files can be upload in multiparts and Multipart Upload is divided into the following 3 steps:  
1. Initiate a multipart upload task (InitiateMultipartUpload)  
Call ossClient.initiateMultipartUpload to return the globally-unique uploadId created by OSS.

2. Upload multiparts one by one or in a parallel manner (UploadPart)  
Call ossClient.uploadPart to upload multipart data.

Note:    
A. OSS will put the MD5 value of Part data received by the server ends in the Etag header and return the same to users.   
B. The range of Part number is 1 - 10,000. If it is out of the scope, 400 will be returned with the error code of TooManyParts.   
C. When uploading part every time, the stream shall be positioned to the location at the beginning of the upload block.   
D. Each time after uploading part, the return results of OSS is an UploadPartResult object. It is a combination containing Etag and PartNumber of the upload block.  
E. It will be used in the subsequent multipart upload steps, so we need to save it. In general, we save these UploadPartResult objects in the List.   

3. Complete multipart upload (CompleteMultipartUpload)     
After multipart upload is completed, call ossClient.completeMultipartUpload to combine all multiparts into a complete file.   
When executing the action, all valid part lists (including part number and part ETAG) need to be provided; after OSS received submitted part lists, it will verify the validity of each part one by one. After all data Parts have passed the verification, OSS will compose these parts into a complete Object.

**Complete Example**
```
/**
 * Created on January 6, 2020.
 *
 * @author Zhangxi19
 */
public class Upload {
    private static final Logger logger = LoggerFactory.getLogger(Upload .class);

    public static void main(String[] args) {
        //Via VOD sdk vodClient.createVideoUploadTask or vodClient.refreshVideoUploadTask, you can get upload credential authToken among results,
        // After base64 resolution, a specific upload credential can be obtained. The credential can be used for creating aws client and complete multipart upload
        String region = "region";
        String endpoint = "endpoint";
        String bucket = "bucket";
        String accessKey = "accessKey";
        String secretKey = "secretKey";
        String token = "token";
        String objectKey = "objectKey";
        String localFile = "localFile";
        multipartUpload(region, endpoint, accessKey, secretKey, token, bucket, objectKey, localFile);
    }

    public static void multipartUpload(String region, String endpoint, String accessKey, String secretKey, String token, String bucket, String objectKey, String localFile) {

        AmazonS3 ossClient = initAwsClient(region, endpoint, accessKey, secretKey, token, Protocol.HTTP);
        try {
            File partFile = new File(localFile);
            String md5 = Md5Utils.md5AsBase64(partFile);
            logger.info("md5={}", md5);
            // Initialized Multipart Upload
            InitiateMultipartUploadRequest partRequest = new InitiateMultipartUploadRequest(bucket, objectKey);
            ObjectMetadata objectMetadata = new ObjectMetadata();
            // Based on specific video source
            objectMetadata.setContentType("video/mp4");
            objectMetadata.setContentMD5(md5);
            partRequest.setObjectMetadata(objectMetadata);
            InitiateMultipartUploadResult initiateMultipartUpload = ossClient.initiateMultipartUpload(partRequest);
            String key = initiateMultipartUpload.getKey();
            String uploadId = initiateMultipartUpload.getUploadId();
            String bucketName = initiateMultipartUpload.getBucketName();

            logger.info("InitiateMultipartUploadResult,bucket={},key={},uploadId={}", bucket, key, uploadId);
            //Define multipart size according to actual demands
            final int partSize = 1024 * 1024 * 5;
            int partCount = (int) (partFile.length() / partSize);
            if (partFile.length() % partSize != 0) {
                partCount++;
            }
            // Create the Etag list of the object and retrieve the Etag of each multipart.
            List<PartETag> partETagList = new ArrayList<>();
            for (int i = 0; i < partCount; i++) {
                FileInputStream fis = new FileInputStream(partFile);
                long skipBytes = partSize * i;
                fis.skip(skipBytes);

                long size = Math.min(partSize, partFile.length() - skipBytes);
                logger.info("partSize={}", size);
                UploadPartRequest uploadPartRequest = new UploadPartRequest();
                uploadPartRequest.setBucketName(bucketName);
                uploadPartRequest.setKey(key);
                uploadPartRequest.setUploadId(uploadId);
                uploadPartRequest.setInputStream(fis);
                uploadPartRequest.setPartSize(size);
                uploadPartRequest.setPartNumber(i + 1);
                // Upload multipart and add the retrieved Etag to the list
                UploadPartResult uploadPartResult = ossClient.uploadPart(uploadPartRequest);
                PartETag partETag = uploadPartResult.getPartETag();
                partETagList.add(partETag);
                logger.info("uploadPartResult={}", JSON.toJSON(uploadPartResult));
                fis.close();
            }
            Collections.sort(partETagList, new Comparator<PartETag>() {
                public int compare(PartETag p1, PartETag p2) {
                    return p1.getPartNumber() - p2.getPartNumber();
                }
            });
            //Complete upload
            CompleteMultipartUploadRequest completeMultipartUploadRequest = new CompleteMultipartUploadRequest(bucket, objectKey, uploadId, partETagList);
            Map<String, String> customRequestHeaders = completeMultipartUploadRequest.getCustomRequestHeaders();
            CompleteMultipartUploadResult uploadResult = ossClient.completeMultipartUpload(completeMultipartUploadRequest);
            ossClient.shutdown();

            logger.info("CompleteMultipartUploadResult={},customRequestHeaders={}", JSON.toJSON(uploadResult), customRequestHeaders);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static AmazonS3 initAwsClient(String region, String endpoint, String accessKey, String secretKey, String token, com.amazonaws.Protocol protocol) {
        BasicSessionCredentials basicSessionCredentials = new BasicSessionCredentials(accessKey, secretKey, token);
        ClientConfiguration config = new ClientConfiguration();
        config.setProtocol(protocol);
        AwsClientBuilder.EndpointConfiguration endpointConfig = new AwsClientBuilder.EndpointConfiguration(endpoint, region);

        AWSCredentialsProvider awsCredentialsProvider = new AWSStaticCredentialsProvider(basicSessionCredentials);
        return AmazonS3Client.builder()
                .withEndpointConfiguration(endpointConfig)
                .withClientConfiguration(config)
                .withCredentials(awsCredentialsProvider)
                .disableChunkedEncoding()
                .withPathStyleAccessEnabled(true)
                .build();
    }
}
```
