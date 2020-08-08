# Test Commands

## Command Format

<code>./redis-benchmark -h ${redis_url}  -n 1500000 -r 10000000 -d 50 -t ${cmd} -c ${client} -P 16 --threads 32</code>

See https://redis.io/topics/benchmarks for format instructions

## Test Range

The range of samples under this test is as follows:

- Test commands: get, set, lpush, mset(10 keys), sadd, etc.
- Data volume size: 50 - 512
- Client quantity range: 60 - 600
