# Transmission Acceleration

Transmission Acceleration provides the acceleration service through JD Cloud’s CDN distributed edge site, and can realize rapid, easy and safe remote file transmission between a client and a Bucket. When you specify that transmission acceleration is enabled for a Bucket, the system will assign you an accelerated domain, which you can use for uploading and downloading.

To use transmission acceleration, please [Enable the CDN Service](https://docs.jdcloud.com/en/cdn/open-cdn-service) in advance.

## Rule Description

**Transmission acceleration only supports the following acceleration modes:**

- Dynamic acceleration: Through dynamic acceleration technologies such as route optimization and transmission optimization, it solves the problems of slow response, packet loss and service instability caused by factors such as cross-operator and network instability. It is suitable for uploading and downloading scenarios in a poor network environment.

- Back-to-origin acceleration: Accelerated distribution of files is achieved through the content in the buffer source station of CDN edge nodes. It provides low-cost, high-performance and extensible Internet content distribution services and is suitable for the customer scenarios of repeated downloading of the same content.

**After you enable transmission acceleration, OSS will assign you the following accelerated domain:**

- Dynamic accelerated domain: \<BUCKET\>.s3-accelerate.\<REGION\>.jdcloud-oss.com

- Back-to-origin Accelerated Domain: \<BUCKET\>.s3-accelerate-cache.\<REGION\>.jdcloud-oss.com

**Note:**

- For the fees incurred by the used transmission acceleration function, please view the [CDN Billing Overview](https://docs.jdcloud.com/en/cdn/billing-overview).

- After acceleration is enabled, OSS will enable acceleration for you asynchronously. The accelerated domain name will take effect within 24 hours. During the enabling process, modifying the acceleration status is not supported. If you need to disable transmission acceleration, please do that after it takes effect.

- If you need to enable CDN acceleration with customized domains, please go to the CDN Console to conduct configuration. Please refer to [Create the Domain](https://docs.jdcloud.com/en/cdn/create-domain).

## Configuration Acceleration

Object Storage Service supports the setting of transmission acceleration management through Console configuration. For setting steps, please refer to the following contents. To set transmission acceleration with APIs, please refer to [Put Bucket accelerate](../../API-Reference-S3-Compatible/Compatibility-API/Operations-On-Bucket/PUT-Bucket-accelerate.md).

1. Log in to the Console->Object Storage Service->Space Management->Enter into a Bucket->Space Setting->Transmission Acceleration. Under the page, you can view the transmission acceleration setting of the current Bucket.

![accelerate-1](../../../../../image/Object-Storage-Service/OSS-164.png)

2. You can view the accelerated domain of the Bucket, after clicking **Enable**.

3. To set special acceleration rules, please go to the CDN Console for setting. Please refer to the [CDN Console Overview](https://docs.jdcloud.com/en/cdn/console-introduction).

## Use the accelerated domain

Use Curl command to simulate uploading a file using accelerated domain, the example command is as follows:

```
curl -X PUT -T local_file  https://examplebucket.s3-accelerate.cn-north-1.jdcloud-oss.com/test
```

