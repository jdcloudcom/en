# Video Snapshot

Video snapshot supports video media files perform video snapshot operations in accordance with certain rules. This function can contain such customer scenario as generating previews for video, or making video cover by snapshots. The following is the example to use OpenAPI Java SDK to create code conversion task:

## Environment Preparation

Add dependencies to the Maven project:

```
<dependency>
    <groupId>com.jdcloud.sdk</groupId>
    <artifactId>core</artifactId>
    <version>1.0.0</version>
</dependency>
<dependency>
    <groupId>com.jdcloud.sdk</groupId>
    <artifactId>mps</artifactId>
    <version>0.3.6</version>
</dependency>
```

For more environment preparation information, please refer to [OpenAPI Java SDK Introduction](https://docs.jdcloud.com/cn/sdk/java)

## Video Transcoding

```
package com.jdcloud.mps.client;

import com.jdcloud.sdk.auth.StaticCredentialsProvider;
import com.jdcloud.sdk.http.HttpRequestConfig;
import com.jdcloud.sdk.http.Protocol;
import com.jdcloud.sdk.service.mps.client.MpsClient;
import com.jdcloud.sdk.service.mps.model.*;

public class MpsClientExample {
    public static void main(String[] args) {
        // The following parameters are all compulsory
        String region = "cn-north-1"; // cn-north-1/cn-south-1/cn-east-1/cn-east-2
        String sourceBucketName = ""; // Source bucket
        String sourceObjectKey = ""; // Files to be snapshotted in the source bucket
        String destBucketName = ""; // Target bucket where the snapshots are put
        String accessKey = ""; // User AccessKey
        String secretKey = ""; // User SecretKey
   
        MpsClient client = MpsClient.builder()
                .credentialsProvider(new StaticCredentialsProvider(accessKey, secretKey))
                .httpRequestConfig(new HttpRequestConfig.Builder().protocol(Protocol.HTTP).build())
                .build();
   
        // Create task
        ThumbnailTaskSource createSource = new ThumbnailTaskSource().bucket(sourceBucketName).key(sourceObjectKey);
        ThumbnailTaskTarget createTarget = new ThumbnailTaskTarget().destBucket(destBucketName);
        
        // Set Snapshot Rules; may not be set by default
        ThumbnailTaskRule rule = new ThumbnailTaskRule();
        rule.setCount(1); // Snapshot quantity, not optional when mode=single. default:1
        rule.setStartTimeInSecond(1); // The start time (second) of the snapshot in the video, default: 0
        rule.setEndTimeInSecond(10); // The end time (second) of the snapshot in the video, default:-1(represents the video duration)
        rule.setKeyFrame(true); // Whether to enable key frame snapshot, default: true
        rule.setMode("multi"); // Snapshot Mode  Single Snapshot: single  Multiple Snapshots: multi  Average: average default: single
        CreateThumbnailTaskRequest createRequest = new CreateThumbnailTaskRequest().source(createSource).target(createTarget).rule(rule).regionId(region);
        CreateThumbnailTaskResult createResult = client.createThumbnailTask(createRequest).getResult();
   
        // Acquire Task
        GetThumbnailTaskRequest getRequest = new GetThumbnailTaskRequest().taskId(createResult.getTaskID()).regionId(region);
        GetThumbnailTaskResult getResult = client.getThumbnailTask(getRequest).getResult();
   
        // Task List
        ListThumbnailTaskRequest listRequest = new ListThumbnailTaskRequest().regionId(region);
        ListThumbnailTaskResult listResult = client.listThumbnailTask(listRequest).getResult();
    }
}
```
