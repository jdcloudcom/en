# Specifications

Memcached Single-node Specification|	Max. Connections
:---|:--
1 core 1G	|10000
1 core 2G  |10000
1 core 4G	|10000
1 core 8G	|10000
1 core 16G	|10000
1 core 32G	|10000

- The cluster instance is composed of n single-node specifications, with maximum connections of 1000 x n

# Specification and Performance

- Testing environment: Three high-performance Virtual Machines and result sums
- Testing tool: mcperf
- Testing command (case):

<code>src/mcperf -s 10.0.8.42 -p 11211 --linger=0 --timeout=10 --conn-rate=2000 --call-rate=2000 --num-calls=500 --num-conns=1000 --sizes=d256</code>

Description: The size of testing data is 1~1,024byte

- Testing result:

Specification	| TPS(req/s)	
:---|:--
1-Core 1G|	9~17W
1-Core 2G	|9~17W
1-Core 4G	|9~18W
1-Core 8G	|9~20W
1-Core 16G	|9~20W
1-Core 32G	|9~20W

- The cluster instances are composed of N single node specifications, with the performance equaling the performance of a single node specification ×N
