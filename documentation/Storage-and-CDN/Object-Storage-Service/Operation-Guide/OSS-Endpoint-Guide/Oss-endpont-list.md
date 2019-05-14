# OSS Access Domain and Region 

Region represents the region where the OSS data center locates and Endpoint represents the access domain (service domain) of OSS external service.

This document introduces the corresponding relationship between Region and Endpoint.

## OSS supports the Table of Comparisons of Regions and Endpoints 

Intranet and Internet of Endpoint in each region are configured as below:

|Region Chinese Name|Region English Name|Internet Endpoint|Internet supports HTTPS|Intranet Endpoint|Intranet supports HTTPS|
|:---------|:---------|:---------|:--------|:---------------|:--------|
|cn-north-1|cn-north-1|s3.cn-north-1.jdcloud-oss.com|Yes|s3-internal.cn-north-1.jdcloud-oss.com|Yes|
|cn-south-1|cn-south-1|s3.cn-south-1.jdcloud-oss.com|Yes|s3-internal.cn-south-1.jdcloud-oss.com|Yes|
|cn-east-2|cn-east-2|s3.cn-east-2.jdcloud-oss.com|Yes|s3-internal.cn-east-2.jdcloud-oss.com|Yes|
|cn-east-1|cn-east-1|s3.cn-east-1.jdcloud-oss.com|Yes|s3-internal.cn-east-1.jdcloud-oss.com|Yes|

**Description:** 

-   When you share a file link or do customized domain association (CNAME), we recommend to use a level-3 domain, i.e. in the form of `Bucket` + `Endpoint`. Take the Bucket named as oss-sample in the cn-north-1 region.
    Its level-3 domain is oss-sample.s3.cn-north-1.jdcloud-oss.com.
-   When you use SDK, please take `http://` or `https://` + `Endpoint` as the initialization parameter. Take Endpoint in cn-south-1 for example, we recommend to set the initialization parameter as
`http://s3.cn-south-1.jdcloud-oss.com` or `https://s3.cn-south-1.jdcloud-oss.com`, but not to take the level-3 domain
 (`https://bucket.s3.cn-south-1.jdcloud-oss.com`) as the initialization parameter.
-   Distinguish Intranet and Internet access domains For example: s3.cn-south-1.jdcloud-oss.com points to the Internet access address of cn-south-1 region. Intranet access address s3-internal.cn-south-1.jdcloud-oss.com points to the Intranet address of cn-south-1 region. When you use OSS in JD Cloud VPC, we suggest that you should use Intranet access domain to upload and download traffic for free.
- OSS Old Version Access Domain `oss.<Region>.jcloudcs.com` and `s3.<Region>.jcloudcs.com` will continue providing services, but we do not recommend you to use them.
