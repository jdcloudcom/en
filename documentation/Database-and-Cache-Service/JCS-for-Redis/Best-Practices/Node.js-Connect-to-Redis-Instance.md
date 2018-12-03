# Node.js connection

- step1: Download and install Redis client of Node.js

```
git clone https://github.com/NodeRedis/node_redisnpm install redis
```

- step2: Call sample code

```
//Connect JCS for Redis
var redis = require("redis"),
  port = 6379,
  host = 'jredis-cn-north-1-prod-redis-xxxxxxxxxx.jdcloud.com',
  password = '********',
  opts = {no_ready_check:true},//Setting Item: Since once the ready_check is opened, info command will be sent to check if redis is available, Jmiss AP does not currently support the info command. Configure the item to be true, or the AP will close the connection.
  client = redis.createClient(port, host, opts);

// AUTH
client.auth(password, redis.print)

// Write data
client.set("key", "OK");

// Obtain data, return String
client.get("key", function (err, reply) {
    console.log(reply.toString());
});

// If pass in a Buffer, it will return a Buffer
client.get(new Buffer("key"), function (err, reply) {
    console.log(reply.toString());
});
client.quit();
```
