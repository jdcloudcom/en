## PHP Reference 
**I. Install PHP Environment**  

PHP is required to be PHP 5.5 and above versions. If you have already installed one that meets this requirement, you may skip this step.  

**Install PHP by Ubuntu/Debian**  

Take Ubuntu 18.04 for example. In Ubuntu 16.04, you need to replace apt in the following command with apt-get. In Debian, you need to first switch the user to root user and remove sudo in the following command.  

```
sudo apt update
sudo apt install php7.0-fpm php7.0-cli php7.0-common php7.0-mbstring php7.0-json php7.0-curl
sudo systemctl enable php7.0-fpm
sudo systemctl start php7.0-fpm
```

**Install PHP by CentOS/RedHut/fedora**  

Because CentOS/RedHut does not officially provide support for PHP 5.5 and above versions, this part will use a third-party source. In case of any problem such as inability to download, update or version inconformity, please try to install PHP by compiling. All contents provided in the third-party source are irrelevant with JD Cloud.  

**CentOS/RHEL 7.x：**  

```
sudo rpm -Uvh https://dl.fedoraproject.org/pub/epel/epel-release-latest-7.noarch.rpsudom
sudo rpm -Uvh https://mirror.webtatic.com/yum/el7/webtatic-release.rpm
sudo yum makecache
sudo yum install  php70w php70w-fpm php70w-cli php70w-common php70w-devel php70w-mbstring  php70w-json php70w-curl
sudo  systemctl  php-fpm start
```

**CentOS/RHEL 6.x:**  

```
sudo rpm -Uvh https://mirror.webtatic.com/yum/el6/latest.rpm
sudo yum makecache
sudo yum install php70w php70w-fpm php70w-cli php70w-common php70w-devel php70w-mbstring  php70w-json php70w-curl
sudo systemctl php-fpm start
```

**fedora：**  

```
sudo rpm -Uvh https://dl.fedoraproject.org/pub/epel/epel-release-latest-7.noarch.rpm
sudo rpm -Uvh https://mirror.webtatic.com/yum/el7/webtatic-release.rpm 
sudo yum makecache
sudo yum install php70w php70w-fpm php70w-cli php70w-common php70w-devel php70w-mbstring  php70w-json php70w-curl
sudo systemctl php-fpm start
```

**Install by source code**  

In the following operations, it is recommended using root user for execution. Take CentOS 7 for example, Ubuntu/Debian user should replace yum with apt.  
1. Download compiling environment dependence  
```
yum install gcc gcc-c++ libxml2-devel wget make openssl openssl-devel curl
```

2. Download and prepare PHP source code  
Take PHP 7.0.33 for example. For more versions, you can search on [PHP Official Website](https://www.php.net/downloads.php)  
```
# You can replace this link with the version you need
wget https://www.php.net/distributions/php-7.0.33.tar.gz
tar zxvf php-7.0.33.tar.gz
```

3. Compile and install PHP  
```
cd php-7.0.33
./configure --enable-fpm --enable-json --enable-mbstring --with-openssl
make && make install
```



**II. Install SDK Dependence**  
Use Composer.phar for installation (recommended)  
1. Download Composer.phar  
You can view [Composer Official Website](https://getcomposer.org/download/) to get the latest version of Composer.phar  
The following is an example of Version 1.9.1  

```
wget https://getcomposer.org/download/1.9.1/composer.phar
chmod a+x composer.phar
```
2. Create SDK dependence file  
Use editor to create a file named composer.json in the current directory. And enter the following contents  
```
{"require": {
	"php" : ">=5.5",
	"jdcloud-api/jdcloud-sdk-php" : ">=4.0.0"
}}
```  
or enter the following contents directly in your terminal  
```
cat << _EOF_ >composer.json
{"require": {
	"php" : ">=5.5",
	"jdcloud-api/jdcloud-sdk-php" : ">=4.0.0"
}}
_EOF_
```
3. Install SDK  
Execute the following command in the current path (ensure it is under the same directory as composer.json  
```
php composer.phar install
```
4. Quote SDK in your project  
Add the following contents at the beginning of your project  
```
<?php
	require 'vendor/autoload.php';
	use Jdcloud\Credentials\Credentials;
	use Jdcloud\Result;
	use Jdcloud\Sms\SmsClient;

	...
```

**III. Use System Composer Installation**  
1. Install Composer  
Take Ubuntu 18.04 for example, you need to first install Composer  
``` bash
sudo apt install composer
```

2. Create SDK dependence file  
Use editor to create a file named composer.json in your project directory. And enter the following contents  
```
{"require": {
	"php" : ">=5.5",
	"jdcloud-api/jdcloud-sdk-php" : ">=4.0.0"
}}
```  
or enter the following contents directly in your terminal  
```  
cat << _EOF_ >composer.json
{"require": {
	"php" : ">=5.5",
	"jdcloud-api/jdcloud-sdk-php" : ">=4.0.0"
}}
_EOF_
```  
3. Install SDK  
Execute the following command in the current path (ensure it is under the same directory as composer.json  
```
composer install
```
4. Quote SDK in your project  
Add the following contents at the beginning of your project  
```
<?php
	require 'vendor/autoload.php';
	use Jdcloud\Credentials\Credentials;
	use Jdcloud\Result;
	use Jdcloud\Sms\SmsClient;

	...
```
And then use it now!  

**IV. PHP Code Example**  

The following example is for reference only, you need to modify partial codes according to your actual business scenario  

```
<?php
require 'vendor/autoload.php';
useJdcloudCredentialsCredentials;
useJdcloudResult;
useJdcloudSmsSmsClient;

function testSmsBatchSend() {
    $sms = new SmsClient([
        'credentials' => new Credentials('AK', 'SK'),
        'version' => 'latest',
        'scheme' => 'https'
    ]);
    try {
        $res = $sms->batchSend([
            'regionId' => 'cn-north-1',
            'templateId' => 'template id',
            'signId' => 'signature Id',
            'phoneList' => ['mobile phone number 1', 'mobile phone number 2'],
            'params' => ['data value corresponding to SMS template variable']
        ]);
        print_r($res);
        print ("Request Id: " . $res['requestId'] . "\n");
        print_r($res['result']);
    }
    catch(JdcloudExceptionJdcloudException $e) {
        print ("Detail Message: " . $e->getMessage() . "\n");
        print ("Request Id: " . $e->getJdcloudRequestId() . "\n");
        print ("Error Type: " . $e->getJdcloudErrorType() . "\n");
        print ("Error Code: " . $e->getJdcloudErrorCode() . "\n");
        print ("Error Detail Status: " . $e->getJdcloudErrorStatus() . "\n");
        print ("Error Detail Message: " . $e->getJdcloudErrorMessage() . "\n");
    }
}
$sms = testSmsBatchSend();
?>
```

**V. Other use methods**  

**Debug your PHP code in local environment**  
Use SDK in local environment, you may need a certificate to complete debugging. Please modify your partial code to enable the certificate. Certificate download link: https://sms.s3.cn-north-1.jdcloud-oss.com/sms_sdk_example/ca-bundle.crt    

```
...
$sms = new SmsClient([
        'credentials' => new Credentials('AK', 'SK'),
        'version' => 'latest',
        'scheme' => 'https',
    	'http' => ['verify' => 'ca-bundle.crt']
    ]);
...
```

**Use SDK in a machine having no terminal access**  
You can use it by uploading all contents in the following package to your server. Before use, please modify the contents in SmsSdkExample.php to satisfy your business demand and confirm that the PHP version in your server is 5.5 and above.  

SDK data package download link:  
https://sms.s3.cn-north-1.jdcloud-oss.com/sms_sdk_example/smsSdkExample-php.zip  
