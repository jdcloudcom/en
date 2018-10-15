# PHP Connection
- step1: Download php redis client, reference address: https://github.com/phpredis/phpredis

- step2: Write test case

```
<?php
  /* Here replaced as connection instance host and port */
  $host = "jredis-hb1-prod-957e3a3d-0d76-45d4-a896-706173208db2.jmiss.jcloud.com";
  $port = 6379;
  /* Here replaced as cluster token */
  $token = "B69B341E5C669082EFCF2E405C626379";

  $redis = new Redis();
  if ($redis->connect($host, $port) == false) {
    die($redis->getLastError());
  }
  /* Use token as AUTH password */
  if ($redis->auth($token) == false) {
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
