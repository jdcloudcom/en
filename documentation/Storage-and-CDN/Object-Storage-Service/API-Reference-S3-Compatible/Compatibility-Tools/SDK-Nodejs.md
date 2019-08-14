# SDK-Node.js 

## Overview

This document is based on AWS Node.js SDK. JD Cloud Object Storage Service is compatible to AWS S3 interface. For the details of compatible interface, please view [Compatible Interface](https://docs.jdcloud.com/en/object-storage-service/compatibility-api-overview).

## Development Preparation

###  Introduce npm

You need to install the environment dependence before development: [npm Address](https://www.npmjs.com/).

### Obtain SDK

The preferred method for installing SDK for Node.js is to use the Node.js program package manager npm. To execute this operation, please enter the content in the command line.

```
npm install aws-sdk

```
**Description**

If you get an error message as below during the installation:

```
npm WARN deprecated node-uuid@1.4.8: Use uuid module instead
```
Please enter the following command in the command line:

```
npm uninstall --save node-uuid
npm install --save uuid
```

### Development Environment

The use of SDK requires your running environment to include nodejs and npm. We recommend that the nodejs adopts 7.0 version and above.
After installation of npm, you also need to install npm dependent package and execute npm install in the SDK decompression directory.
Go to [Console AccessKey Management](https://uc.jdcloud.com/account/accesskey) to obtain your items of AccessKeyId and AccessKeySecret.

**Description:**

For the meaning of the names shown in this document, such as AccessKeyId, AccessKeySecret and Bucket, please refer to [OSS-Core Concepts](https://docs.jdcloud.com/en/object-storage-service/core-concepts).

# Create client

**JD Cloud OSS is compatible to most of AWS S3 APIs.**

When using a development tool package in Node.js, you can use `require` to add the development tool package to the application program.

### 1. Introduce the whole development tool package


```JavaScript

var AWS = require('aws-sdk');

```

**If you only use JD Cloud OSS, we suggest that you should use a method of only introducing Object Storage Service, from this, the code quantity transmitted via network and the memory overhead of codes will be significantly reduced.**

### 2. Only introduce Object Storage Service

**The Object Storage Service only including the development tool package is shown as below.**

```JavaScript

// Import the AWS SDK
var AWS = require('aws-sdk');
var s3 = new AWS.S3({apiVersion: '2006-03-01'});
s3.endpoint = "https://s3.cn-north-1.jdcloud-oss.com"
s3.config.update({
  accessKeyId: "your_accessKeyId",
  secretAccessKey: "your_secretAccessKey",
  s3ForcePathStyle: true,
  signatureVersion: "v4"
})

```

# Quick Start
 **Description**
 You must subscribe JD Cloud Object Storage Service in OSS Console before using SDK to create Bucket. For the subscription process, please refer to [Getting Started-Subscribe Object Storage Service](https://docs.jdcloud.com/en/object-storage-service/sign-up-service-1).
 You can also create Bucket via the Console. Refer to [Getting Started-Create Bucket](https://docs.jdcloud.com/en/object-storage-service/create-bucket-1).

### Creating Bucket

```JavaScript

// Create Client
var AWS = require('aws-sdk');
// Import the AWS SDK only for S3
var s3 = new AWS.S3({apiVersion: '2006-03-01'});
s3.endpoint = "https://s3.cn-north-1.jdcloud-oss.com"
s3.config.update({
  accessKeyId: "XXXXXXXXXXXXXXXXXXXXXXXXXX",
  secretAccessKey: "yyyyyyyyyyyyyyyyyyyyyyyyyyy",
  s3ForcePathStyle: true,
  signatureVersion: "v4"
})


// Create Bucket
var newBuket = {
  Bucket: 'myAPPname'
}

s3.createBucket(newBuket, function (err, data) {
    if (err) console.log(err, err.stack) // an error occurred
    else {
      console.log(data)
    }
  }
)

```


**For more examples, please refer to [Class in API Reference](https://docs.aws.amazon.com/AWSJavaScriptSDK/latest/AWS/S3.html ).**
