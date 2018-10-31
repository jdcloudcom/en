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
  host = 'jredis-hb1-prod-957e3a3d-0d76-45d4-a896-706173208db2.jmiss.jcloud.com',
  token = 'B69B341E5C669082EFCF2E405C626379',
  opts = {no_ready_check:true},//Setting Item: Since once the ready_check is opened, info command will be sent to check if redis is available, Jmiss AP does not currently support the info command. Configure the item to be true, or the AP will close the connection.
  client = redis.createClient(port, host, opts);

// AUTH
client.auth(token, redis.print)

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
