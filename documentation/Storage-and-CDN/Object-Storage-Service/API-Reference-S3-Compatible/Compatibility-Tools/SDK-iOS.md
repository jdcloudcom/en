# SDK-iOS

## Overview

You can use IOS SDK to manage Object Storage Service; IOS Source Code can be downloaded from https://github.com/aws/aws-sdk-ios.

## Actions

Please download JD Cloud improved revision aws-sdk-ios: https://github.com/ZHCliang/aws-sdk-ios so that you can use SDK-Ios normally.

Dependent Podfile File introduced by CocoaPods is as follows:
```
# Uncomment the next line to define a global platform for your project
platform :ios, '11.0'
target 'S3UploadDemo' do
  # Uncomment the next line if you're using Swift or would like to use dynamic frameworks
  # use_frameworks!
  pod 'AWSCore', git: 'https://github.com/ZHCliang/aws-sdk-ios.git'
  pod 'AWSS3', git: 'https://github.com/ZHCliang/aws-sdk-ios.git'   # For file transfers
end
```

## Demo Download

Download link: http://s3-sdk-demo.oss.cn-north-1.jcloudcs.com/ios-sdk/S3UploadDemo-v1.zip
