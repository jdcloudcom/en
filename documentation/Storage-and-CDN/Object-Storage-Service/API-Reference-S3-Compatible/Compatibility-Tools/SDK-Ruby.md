# SDK-Ruby

## Overview

This document is prepared on the basis of [AWS Ruby SDK](https://docs.aws.amazon.com/zh_cn/sdk-for-ruby/v3/developer-guide/welcome.html). JD Cloud object storage service supports the AWS S3 interface. For more information about compatible interfaces, see [Compatible Interface](../Compatibility-API/Compatibility-API-Overview.md).

## Environment Preparation

Please use Ruby 1.9 or above versions. To install or update Ruby, please access [Ruby](http://www.ruby-lang.org/en/).

## SDK Installation
To install AWS SDK for Ruby, please run the commands below:
```
gem install aws-sdk-s3 -V
```

## Initialization

You can initialize S3 instances to manage OSS resources such as buckets and files. To send OSS requests with Ruby SDK, you need to use your AccessKey and SecretKey to initialize one S3 instance and modify default configuration items such as Endpoint and Region according to demands.

```Ruby
require 'aws-sdk-s3'

endpoint = 'https://s3.<REGION>.jdcloud-oss.com'
region = '<REGION>'
cred = Aws::Credentials.new('<your-ak>','<your-sk>')

#Initialize Client
s3C = Aws::S3::Client.new(
  credentials: cred,
  endpoint: endpoint,
  region: region
)

#Initialize Resource
s3R = Aws::S3::Resource.new(
  credentials: cred,
  endpoint: endpoint,
  region: region
)
```

## Use Example

Some use examples are shown below, and for more instructions, please refer to [Class: Aws::S3::Client](https://docs.aws.amazon.com/sdk-for-ruby/v3/api/Aws/S3/Client.html).

### Creating a Bucket
Initialize Client instances and create buckets by using the same:
```Ruby
require 'aws-sdk-s3'

endpoint = 'https://s3.cn-north-1.jdcloud-oss.com'
region = 'cn-north-1'
cred = Aws::Credentials.new('<your-ak>','<your-sk>')

#Initialize Client instance
s3C = Aws::S3::Client.new(
  credentials: cred,
  endpoint: endpoint,
  region: region
)

#Create Bucket
bucket = 'bucket-ruby-test'
s3C.create_bucket(bucket: bucket)
```

### File Upload
Initialize Resource instances and upload files by using the same (support files larger than 5G):
```Ruby
require 'aws-sdk-s3'

endpoint = 'https://s3.cn-north-1.jdcloud-oss.com'
region = 'cn-north-1'
cred = Aws::Credentials.new('<your-ak>','<your-sk>')

#Initialize Resource
s3R = Aws::S3::Resource.new(
  credentials: cred,
  endpoint: endpoint,
  region: region
)

#Upload File
file = 'local-file'
bucket = 'bucket-ruby-test'
obj = s3R.bucket(bucket).object(File.basename(file))
obj.upload_file(file)
```
