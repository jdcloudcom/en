# SDK-Android

# Overview

You can use Android SDK to manage Object Storage Service; Android Source Code can be downloaded from https://github.com/aws/aws-sdk-android.

#  Actions

Because android sdk uses the chunk method for transmission, and puts chunk-signature on the body, oss does not support such case; the parameter (S3ClientOptions.builder.disableChunkedEncoding) supported in sdk has not been taken upon judgment, thus, hack in deeper level is required, it is required to inherit AWSS3V4Signer.java and replace original processRequestPayload (calculate the signature of payload and put it at the beginning of body) and calculateContentHash (the length includes the signature part), the code as follows:
```
package com.amazonaws.demo.s3transferutility;
 import com.amazonaws.AmazonClientException;
 import com.amazonaws.Request;
 import com.amazonaws.services.s3.Headers;
 import com.amazonaws.services.s3.internal.AWSS3V4Signer;
 import com.amazonaws.util.BinaryUtils;
 import java.io.IOException;
 import java.io.InputStream;
 public class JdAWSS3V4Signer extends AWSS3V4Signer {
     @Override
     protected void processRequestPayload(Request<?> request, HeaderSigningResult headerSigningResult) {
     }
  
     @Override
     protected String calculateContentHash(Request<?> request) {
         request.addHeader("x-amz-content-sha256", "required");
         final String contentLength =
                 request.getHeaders().get(Headers.CONTENT_LENGTH);
         final long originalContentLength;
         if (contentLength != null) {
             originalContentLength = Long.parseLong(contentLength);
         } else {
             /**
              * "Content-Length" header could be missing if the caller is
              * uploading a stream without setting Content-Length in
              * ObjectMetadata. Before using sigv4, we rely on HttpClient to
              * add this header by using BufferedHttpEntity when creating the
              * HttpRequest object. But now, we need this information
              * immediately for the signing process, so we have to cache the
              * stream here.
              */
             try {
                 originalContentLength = getContentLength(request);
             } catch (IOException e) {
                 throw new AmazonClientException(
                         "Cannot get the content-lenght of the request content.",
                         e);
             }
         }
         request.addHeader("x-amz-decoded-content-length",
                 Long.toString(originalContentLength));
         final InputStream payloadStream = getBinaryRequestPayloadStream(request);
         payloadStream.mark(-1);
         final String contentSha256 = BinaryUtils.toHex(hash(payloadStream));
         try {
             payloadStream.reset();
         } catch (final IOException e) {
             throw new AmazonClientException(
                     "Unable to reset stream after calculating AWS4 signature", e);
         }
         return contentSha256;
     }
  
     private long getContentLength(Request<?> request) throws IOException {
         InputStream content = request.getContent();
         if (!content.markSupported()) {
             throw new AmazonClientException("Failed to get content length");
         }
         final int DEFAULT_BYTE_LENGTH = 4096;
         long contentLength = 0;
         byte[] tmp = new byte[DEFAULT_BYTE_LENGTH];
         int read;
         content.mark(-1);
         while ((read = content.read(tmp)) != -1) {
             contentLength += read;
         }
         content.reset();
         return contentLength;
     }
 }
```

Then use SignerFactory.registerSigner("JdAWSS3V4Signer", JdAWSS3V4Signer.class) to replace the standard signature, the implementation code is as follows:
```
SignerFactory.registerSigner("JdAWSS3V4Signer", JdAWSS3V4Signer.class);
 System.setProperty(SDKGlobalConfiguration.ENABLE_S3_SIGV4_SYSTEM_PROPERTY, "true");
 ClientConfiguration config = new ClientConfiguration();
 config.setProtocol(Protocol.HTTP);
 config.setSignerOverride("JdAWSS3V4Signer");
 sS3Client = new AmazonS3Client(getCredProvider(context.getApplicationContext()), config);
 sS3Client.setEndpoint("http://s3.cn-north-1.jcloudcs.com");
 S3ClientOptions options = S3ClientOptions.builder()
         .disableChunkedEncoding()
         .setPayloadSigningEnabled(true)
         .build();
 sS3Client.setS3ClientOptions(options);
```
## Demo Download

Download link: http://s3-sdk-demo.oss.cn-north-1.jcloudcs.com/android-sdk/s3-android-demo.zip
