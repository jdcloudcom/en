# Access OSS by using temporary secret key

## Application Scenarios
For client application, the access key is put into client code, which is easy to disclose your key information, and not convenient to control user access permissions. The similar scenario requiring temporary access can be done with STS. STS can appoint complex policies for restriction and only the minimum permission is provided.

STS of JD Cloud provides a temporary access authorization. Temporary AccessKey, SecretKey and Token can be gotten via STS. During the validity period, the temporary secret key is used or accessing OSS.

Relevant terms:
- STS: Security Token Service, providing temporary access authorization and temporary secret key upon STS request.
- Role: Represent the virtual concept of specific operation permissions, without independent login passwords and AccessKey.
- Temporary secret key: A group of temporary AccessKey, SecretKey and Token returned by requesting STS is the temporary secret key.

## Usage Process
The primary account A (AccountID: 111111111111) has a bucket named as test-app, and it is desired that its APP users can save data under this bucket. This scenario can be realized by accessing OSS with temporary secret keys. Specific processes are as follows:

**1. Create a role**

Create the test-role role for the account A and assign that the role can be substituted to the account A; add IAM Policy to test-role after creation; this Policy allows access to test-app bucket; for details, please refer to [Role Description](https://docs.jdcloud.com/en/iam/role).

The example of Policy is as shown below, and it is allowed that the role can upload Object to test-app bucket.
```
{
	"Version": 3,
	"Statement": [
		{
			"Effect": "Allow",
			"Action": [
				"oss:PutObject"
			],
			"Resource": [
				"jrn:oss:*:111111111111:test-app/*"
			]
		}
	]
}
```
**2. Create a sub-user**

Create IAM sub-user test-iam for the account A, and add IAM Policy to this user; this Policy allows substitution of the role test-role; for details, please refer to [Sub-user Description](https://docs.jdcloud.com/en/iam/sub-user);

The example of Policy is as shown below, and it is allowed that the user can play the role of test-role.
```
{
	"Version": 3,
	"Statement": [
		{
			"Effect": "Allow",
			"Action": [
				"sts:assumeRole"
			],
			"Resource": [
				"jrn:iam::111111111111:role/test-role"
			]
		}
	]
}
```
**3. Get temporary secret key**

Substitute the test-iam user with the test-role role, get temporary secret key and assign validity period; for details, please see [Role-User Role Play and Switch](https://docs.jdcloud.com/en/iam/role);

**4. Access OSS**

Access OSS by using temporary secret keys. The temporary key has permissions of test-role role and can normally access test-app bucket during validity period of secret key.

## Access Example
An example of Java SDK is as shown below, illustrating how to access OSS by using the temporary secret key.
- Get temporary secret key: Call AssumeRole APIs of STS to get AccessKey, secretKey and Token; in this example, temporary secret keys are gotten by initializing [jdcloud-sdk-java](https://docs.jdcloud.com/en/sdk/java).
- Access OSS by using temporary secret key: In this example, s3Client is initialized by using temporary secret keys and Object is uploaded.

```Java
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicSessionCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.auth.StaticCredentialsProvider;
import com.jdcloud.sdk.http.HttpRequestConfig;
import com.jdcloud.sdk.http.Protocol;
import com.jdcloud.sdk.service.sts.client.StsClient;
import com.jdcloud.sdk.service.sts.model.AssumeRoleInfo;
import com.jdcloud.sdk.service.sts.model.AssumeRoleRequest;
import com.jdcloud.sdk.service.sts.model.AssumeRoleResponse;
import com.jdcloud.sdk.service.sts.model.Credentials;

public class TokenExample {

    public static Credentials getToken() {
        //Initialize stsClient by using AK/SK of sub-user’s test-iam
        String accessKey = "your-ak";
        String secretKey = "your-sk";
        CredentialsProvider credentialsProvider = new StaticCredentialsProvider(accessKey, secretKey);
        StsClient stsClient = StsClient.builder()
                .credentialsProvider(credentialsProvider)
                .httpRequestConfig(new HttpRequestConfig.Builder().protocol(Protocol.HTTPS).build())
                .build();
        //Call AssumeRole API and substitute it to a role
        AssumeRoleInfo assumeRoleInfo = new AssumeRoleInfo()
                .roleJrn("your-roleJrn")
                .roleSessionName("your-session-name");
        AssumeRoleRequest assumeRoleRequest = new AssumeRoleRequest();
        assumeRoleRequest.setAssumeRoleInfo(assumeRoleInfo);
        AssumeRoleResponse response = stsClient.assumeRole(assumeRoleRequest);
        Credentials credentials = response.getResult().getCredentials();
        //Temporary secret key after returning substituted role
        return credentials;
    }

    public static void main(String [ ]str) {
        //Get temporary secret key
        Credentials credentials = getToken();
        //Initialize s3Client by using temporary secret key
        BasicSessionCredentials basicSessionCredentials = new BasicSessionCredentials(
                credentials.getAccessKey(), credentials.getSecretKey(),
                credentials.getSessionToken());

        String endpoint = "https://s3.<REGION>.jdcloud-oss.com";
        ClientConfiguration config = new ClientConfiguration();
        AwsClientBuilder.EndpointConfiguration endpointConfig =
                new AwsClientBuilder.EndpointConfiguration(endpoint, "<REGION>");

        AWSCredentialsProvider awsCredentialsProvider = new AWSStaticCredentialsProvider(basicSessionCredentials);

        AmazonS3 s3Client = AmazonS3Client.builder()
                .withEndpointConfiguration(endpointConfig)
                .withClientConfiguration(config)
                .withCredentials(awsCredentialsProvider)
                .disableChunkedEncoding()
                .withPathStyleAccessEnabled(true)
                .build();
        //Upload Object by using s3Client
        s3Client.putObject("your-bucket","your-key","this is test");
    }
}
```
