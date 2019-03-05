# SDK Example

## Java Call Method

### 1. Introduce dependency

    <!-- 京东云SDK核心包 -->
    <dependency>
        <groupId>com.jdcloud.sdk</groupId>
        <artifactId>core</artifactId>
        <version>1.0.0</version>
    </dependency>
    <!-- 直播的SDK -->
    <dependency>
        <groupId>com.jdcloud.sdk</groupId>
        <artifactId>live</artifactId>
        <version>${version}</version>
    </dependency>
    
### 2. Call steps

#### Step 1. Set accessKey and secretKey

#### Step 2. Create Client

#### Step 3. Set request parameters

#### Step 4 Execute request to obtain response


#### The call example of searching single live domain details is as below

    import com.jdcloud.sdk.JdcloudSdkException;
    import com.jdcloud.sdk.auth.CredentialsProvider;
    import com.jdcloud.sdk.auth.StaticCredentialsProvider;
    import com.jdcloud.sdk.http.HttpRequestConfig;
    import com.jdcloud.sdk.http.Protocol;
    import com.jdcloud.sdk.service.live.client.LiveClient;
    import com.jdcloud.sdk.service.live.model.DescribeLiveDomainDetailRequest;
    import com.jdcloud.sdk.service.live.model.DescribeLiveDomainDetailResponse;
    import com.jdcloud.sdk.service.live.model.DescribeLiveDomainDetailResult;
     
     
    public class LiveOpenAPIExample {
        public static void main(String[] args) {
            //1. Set accessKey and secretKey
            String accessKeyId = "{accessKey}";
            String secretAccessKey = "{secretKey}";
            CredentialsProvider credentialsProvider = new StaticCredentialsProvider(accessKeyId, secretAccessKey);
     
            //2. Create XXXClient
            LiveClient liveClient = LiveClient.builder()
                    .credentialsProvider(credentialsProvider)
                    .httpRequestConfig(new HttpRequestConfig.Builder().protocol(Protocol.HTTPS).build()) //HTTPS by default
                    .build();
     
            //3. Set request parameters
            DescribeLiveDomainDetailRequest request = new DescribeLiveDomainDetailRequest();
            request.setPublishDomain("push.live.test.com");
     
            //4. Execute requests
            try {
                DescribeLiveDomainDetailResponse response = liveClient.describeLiveDomainDetail(request);
     
                //Return Business Error
                if (response.getError() != null) {
                    //Return business error when calling API. Wrong processing
                    System.out.println(response.getRequestId() + " failed: " + response.getError().getMessage());
                    return;
                }
                DescribeLiveDomainDetailResult result = response.getResult();
                // 5. Return result normally, use returned data for following processing
            } catch (JdcloudSdkException jse) {
                //Calling API failed. Wrong processing
            }
        }
    }
    

## Other Call Methods
&emsp;&emsp;GitHub [Access Address](https://github.com/jdcloud-api)