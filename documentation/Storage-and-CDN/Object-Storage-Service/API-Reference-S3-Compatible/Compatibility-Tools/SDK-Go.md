# SDK-Go

## Overview

This document is compiled based on [AWS Go SDK](https://docs.aws.amazon.com/sdk-for-go/api/). JD Cloud object storage service supports the AWS S3 interface. For more information about compatible interfaces, see [Compatible Interface](../Compatibility-API/Compatibility-API-Overview.md).

## Environment Preparation
Please use Go 1.5 or a higher version. To install or update Golang, please access [Golang](https://golang.org/doc/install).

## Installation Mode

To install AWS SDK for Go, please run commands below

```
go get github.com/aws/aws-sdk-go
```

## Initialize Client

You can create S3Client to manage OSS resources such as bucket and file. To use Go SDK to initiate OSS request, you need to use your AccessKey and SecretKey to initiate a S3Client and modify the default configuration items of Config according to the needs.

The following example shows how to create a client. For more Go SDK samples, please access S3 Go Example Code](https://github.com/awsdocs/aws-doc-sdk-examples/tree/master/go/example_code/s3).

```
func main() {

    ak := "your accesskey"
    sk := "your secretkey"
    creds := credentials.NewStaticCredentials(ak, sk, "")
    _,err := creds.Get()

    config := &aws.Config{
        Region          :aws.String("cn-south-1"),
        Endpoint        :aws.String("s3.cn-south-1.jcloudcs.com"),
        DisableSSL      :aws.Bool(false),
        Credentials     :creds,
    }

    client := s3.New(session.New(config))
    
    //use s3 client to create bucket、put object....
    
}    
```
