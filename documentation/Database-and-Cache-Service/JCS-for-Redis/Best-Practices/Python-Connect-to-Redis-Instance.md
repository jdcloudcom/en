# Python Connection
- step1: Download redis python client

 ```git clone https://github.com/andymccurdy/redis-py```
 
- step2: Write test case

```
#!/usr/bin/env python
#-*- coding: utf-8 -*-
import redis

# Here replaced as connection instance host and port
host = 'jredis-hb1-prod-957e3a3d-0d76-45d4-a896-706173208db2.jmiss.jcloud.com'
port = 6379

# Here configure token
token = 'B69B341E5C669082EFCF2E405C626379'

# Specify AUTH information through password parameter when connecting
r = redis.StrictRedis(host=host, port=port, password=token)

# Database operations can be performed after being connected. Refer to https://github.com/andymccurdy/redis-py for detailed documents
r.set('foo', 'bar');
print r.get('foo')
```
