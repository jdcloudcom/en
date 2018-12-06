# Python Connection
- step1: Download redis python client

 ```git clone https://github.com/andymccurdy/redis-py```
 
- step2: Write test case

```
#!/usr/bin/env python
#-*- coding: utf-8 -*-
import redis

# Here replaced as connection instance host and port
host = 'jredis-cn-north-1-prod-redis-xxxxxxxxxx.jdcloud.com'
port = 6379

# Here configure password
password = '*******'

# Specify AUTH information through password parameter when connecting
r = redis.StrictRedis(host=host, port=port, password=password)

# Database operations can be performed after being connected. Refer to https://github.com/andymccurdy/redis-py for detailed documents
r.set('foo', 'bar');
print r.get('foo')
```
