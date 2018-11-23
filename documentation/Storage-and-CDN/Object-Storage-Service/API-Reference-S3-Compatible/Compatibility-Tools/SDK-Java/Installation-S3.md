# Install

## Preface

This document is compiled in accordance with [AWS Java SDK](http://docs.aws.amazon.com/zh_cn/sdk-for-java/v1/developer-guide/examples-s3.html).
JD Cloud object storage service supports the AWS S3 interface. For more information about compatible interfaces, see [Compatible Interface](../../../API-Reference-S3-Compatible/Compatibility-API/Compatibility-API-Overview.md).

## Environment Preparation

Please apply version JDK 6 or above.

## Installation Mode

### Add dependencies to the Maven project (recommended).
To apply S3 Java SDK to the Maven project, add corresponding dependencies to pom.xml. Take version `1.11.136` as an example. Add the following contents to `<dependencies>`.

```
<dependency>  
    <groupId>com.amazonaws</groupId>  
    <artifactId>aws-java-sdk</artifactId>  
    <version>1.11.136</version>  
</dependency>
```

### Import the JAR package into the Eclipse project.

Take version `1.11.136` as an example and the steps are as follows:

Load the [AWS Java SDK](https://sdk-for-java.amazonwebservices.com/latest/aws-java-sdk.zip) software development kit.

1. Unzip the SDK.

2. Copy the file aws-java-sdk-<versionId>.jar under the extracted folder and all the files under the lib folder into your project.

3. Select your project in the Eclipse, right click to select Properties > Java Build Path > Libraries > Add JARs.

Select all JAR files you copied in Step 3 and import them into Libraries.
