# SDK-PHP

## Installation

There are many ways to install AWS SDK-php, we recommend one of the simplest:

a. Download software packages from the address http://docs.aws.amazon.com/aws-sdk-php/v3/download/aws.zip;

b. Unzip aws.zip to a directory, such as ’C:\mydir\;

c. You just need to add the following statements when using sdk-php
```
require 'C:\mydir\aws\aws-autoloader.php';
```
For more installation methods of sdk-php, you can refer to documents at http://docs.aws.amazon.com/aws-sdk-php/v3/guide/getting-started/installation.html

## Create a client

We still help you get started by creating a client, for more methods, please refer to http://docs.aws.amazon.com/aws-sdk-php/v3/guide/getting-started/index.html
```
<?php    
require 'C:\mydir\aws\aws-autoloader.php';    
use Aws\S3\S3Client;    
    
$s3 = new S3Client([    
    'version'=>'latest',    
    'region'=>'cn-north-1',    
    'endpoint' => 'http://s3.cn-north-1.jcloudcs.com',    
    'signature_version' => 'v4',    
     'credentials' => [    
       'key'    => 'your accesskey',    
       'secret' => 'your secretkey',    
          ],    
     ]);     
//use s3 client to create bucket、put object....    
?>
```
