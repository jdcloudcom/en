# SDK-Python

## Overview

If you need to use Python to access Object Storage Service of JD Cloud, we can use the boto3 interface of the third party. It can be viewed as Python SDK conforming to AWS S3 API standards. About how to use boto3, please refer to https://boto3.readthedocs.io/en/latest/

## Install pip and boto3

Install pip: https://pip.pypa.io/en/stable/installing/
Before using aws sdk-python, you need to install boto3 package at first, commands are as follows (please confirm pip has been installed):
```
pip install boto3
```

## Create a client

Here is an example of creating a client, for more information, please refer to http://boto3.readthedocs.io/en/latest/reference/services/s3.html
```

import boto3  
        
ACCESS_KEY =‘your accesskey’  
SECRET_KEY = ‘your secretkey’  
s3 = boto3.client(  
    's3',  
    aws_access_key_id=ACCESS_KEY,  
    aws_secret_access_key=SECRET_KEY,  
    # An endpoint_url example is given below  
    endpoint_url='http://s3.cn-north-1.jcloudcs.com'  
    )  
#use s3 client to create bucket、put object....
```
