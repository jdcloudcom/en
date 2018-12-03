# C/C++Connection

Here's an example of c/c++ being connected to Jmiss-Redis:

- step1: Download and install c client used for connecting c/c++ to JCS for Redis

```
 git clone https://github.com/redis/hiredis.git 
 cd hiredis 
 make 
 sudo make install 
 ldconfig
```

- step2: Write test code

```
 #include <stdio.h>
 #include <stdlib.h>
 #include <string.h>
 #include <hiredis.h>
 int main(int argc, char **argv) {
     unsigned int j;
     redisContext *c;
     redisReply *reply;
     if (argc < 3) {
         printf("Usage: example jredis-cn-north-1-prod-redis-xxxxxxxxxx.jdcloud.com 6379 password\n");
         exit(0);
     }
     const char *hostname = argv[1];
     const int port = atoi(argv[2]);
     const char *password = argv[3];
     struct timeval timeout = { 1, 500000 }; // 1.5 seconds

     c = redisConnectWithTimeout(hostname, port, timeout);
     if (c == NULL || c->err) {
         if (c) {
            printf("Connection error: %s\n", c->errstr);
            redisFree(c);
         } else {
            printf("Connection error: can't allocate redis context\n");
         }
         exit(1);
     }

     /* AUTH */
     reply = redisCommand(c, "AUTH %s", password);
     printf("AUTH: %s\n", reply->str);
     freeReplyObject(reply);

     /* PING server */
     reply = redisCommand(c,"PING");
     printf("PING: %s\n", reply->str);
     freeReplyObject(reply);

     /* Set a key */
     reply = redisCommand(c,"SET %s %s", "foo", "hello world");
     printf("SET: %s\n", reply->str);
     freeReplyObject(reply);

     /* Set a key using binary safe API */
     reply = redisCommand(c,"SET %b %b", "bar", (size_t) 3, "hello", (size_t) 5);
     printf("SET (binary API): %s\n", reply->str);
     freeReplyObject(reply);

     /* Try a GET and two INCR */
     reply = redisCommand(c,"GET foo");
     printf("GET foo: %s\n", reply->str);
     freeReplyObject(reply);
     reply = redisCommand(c,"INCR counter");
     printf("INCR counter: %lld\n", reply->integer);
     freeReplyObject(reply);

     /* again ... */
     reply = redisCommand(c,"INCR counter");
     printf("INCR counter: %lld\n", reply->integer);
     freeReplyObject(reply);

     /* Create a list of numbers, from 0 to 9 */
     reply = redisCommand(c,"DEL mylist");
     freeReplyObject(reply);
     for (j = 0; j < 10; j++) {
         char buf[64];
         snprintf(buf,64,"%d",j);
         reply = redisCommand(c,"LPUSH mylist element-%s", buf);
         freeReplyObject(reply);
     }

     /* Let's check what we have inside the list */
     reply = redisCommand(c,"LRANGE mylist 0 -1");
     if (reply->type == REDIS_REPLY_ARRAY) {
         for (j = 0; j < reply->elements; j++) {
            printf("%u) %s\n", j, reply->element[j]->str);
         }
     }
     freeReplyObject(reply);
     /* Disconnects and frees the context */
     redisFree(c);
     return 0;
 }
 ```
 
step3: Compile

<code>gcc -o example -g example.c -I /usr/local/include/hiredis –lhiredis</code>

step4: Run test case

```
./example jredis-cn-north-1-prod-redis-xxxxxxxxxx.jdcloud.com 6379 password
AUTH: OK
PING: PONG
SET: OK
SET (binary API): OK
GET foo: hello world
INCR counter: 3
INCR counter: 4
0) element-9
1) element-8
2) element-7
3) element-6
4) element-5
5) element-4
6) element-3
7) element-2
8) element-1
9) element-0
```
