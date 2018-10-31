# php client: PECL
## Client Introduction:
http://pecl.php.net/support.php?spm=a2c4g.11186623.2.5.uh6Uqi
## Client Version Introduction:
http://pecl.php.net/package/memcached?spm=a2c4g.11186623.2.6.5EavrO
## Install SASL relevant environment:
<code>yum install -y cyrus-sasl-plain cyrus-sasl cyrus-sasl-devel cyrus-sasl-lib </code>
## Install PECL:
```
wget http://pecl.php.net/get/memcached-2.2.0.tgz
tar zxvf memcached-2.2.0.tgz
cd memcached-2.2.0
phpize
./configure --with-libmemcached-dir=/usr/local/libmemcached --enable-memcached-sasl
make && make install
```
## Add php external module: modify php.ini file (under /etc directory in default), add:
```
extension=memcached.so 
memcached.use_sasl = 1
```
## php Code Example 1 (access with password):
```
<?php
$memcached = new Memcached;
$memcached->addServer('ip', port); 
$memcached->setOption(Memcached::OPT_BINARY_PROTOCOL, true);
$memcached->setSaslAuthData('username', 'port'); 
$memcached->set("key", "value");
echo 'key: ',$memcached->get("key");
$memcached->delete("key",0);
$memcached->quit();
```
## php Code Example 2 (access without password):
```
<?php
$memcached = new Memcached;
$memcached->addServer('ip', port); 
$memcached->set("key", "value");
echo 'key: ',$memcached->get("key");
$memcached->delete("key",0);
$memcached->quit();
?>
```
