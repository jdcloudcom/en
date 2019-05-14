# SDK-.NET

## Overview

This document is based on [AWS .NET SDK](https://aws.amazon.com/en/sdk-for-net/). JD Cloud object storage service supports the AWS S3 interface. For more information about compatible interfaces,
see [Compatible Interface](../Compatibility-API/Compatibility-API-Overview.md).

## Environment Preparation

Please use the .NET Framework 3.5 or platform of higher version for development.

## Installation Mode

To install the AWS SDK for .NET, please refer to the installation [AWS-SDK Assembly](https://docs.aws.amazon.com/en_us/sdk-for-net/v3/developer-guide/net-dg-install -assemblies.html?shortFooter=true).

## Initialize Client

You can create S3Client to manage OSS resources such as bucket and file. To launch an OSS request using the .NET SDK, you need to initialize an S3Client with your AccessKey and SecretKey and modify the default configuration items of Config as needed.

The following is an example of creating a client. For more .NET SDK examples, please access [S3 .NET Example Code](https://docs.aws.amazon.com/en_us/sdk-for-net/v3/developer-guide/ S3-apis-intro.html?shortFooter=true).

```C#
using Amazon.S3;

namespace Amazon.Samples.S3
{
    public class Test
    {
        const string accessKeyId = "<yourAccessKeyId>";
        const string accessKeySecret = "<yourAccessKeySecret>";
        const string endpoint = "s3.cn-north-1.jdcloud-oss.com";
        
        private static IAmazonS3 s3Client;
        
        public static void Main()
        {
            var s3ClientConfig = new AmazonS3Config
            {
                ServiceURL = endpoint,
                SignatureVersion = "4",
                UseHttp = true,
            };
            s3Client = new AmazonS3Client(accessKeyId, accessKeySecret, s3ClientConfig);
           
            //use s3 client to create bucket、put object....
        }
    }
}
```


