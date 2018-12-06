# PHP Connection
- step1: Download php redis client, reference address: https://github.com/phpredis/phpredis

- step2: Write test case

```
<?php
  /* Here replaced as connection instance host and port */
  $host = "jredis-cn-north-1-prod-redis-xxxxxxxxxx.jdcloud.com";
  $port = 6379;
  /* Here replaced as cluster password */
  $password = "********";

  $redis = new Redis();
  if ($redis->connect($host, $port) == false) {
    die($redis->getLastError());
  }
  /* Use password as AUTH password */
  if ($redis->auth($password) == false) {
    die($redis->getLastError());
  }
  /* Database operations can be performed after verification. Refer to https://github.com/phpredis/phpredis for detailed documents */
  if ($redis->set("foo", "bar") == false) {
    die($redis->getLastError());
  }
  $value = $redis->get("foo");
  echo $value;
?>
```
