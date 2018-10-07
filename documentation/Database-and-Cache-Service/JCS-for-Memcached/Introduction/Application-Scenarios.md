# Application Scenarios
- Business of High Access Frequency

For example, social network, E-Commerce, game, advertisement etc. Data of extremely-high access frequency can be stored in JCS for Memcached, while the bottom data is stored in RDS.

- Large-scale Promotion Activity of E-commerce

The large-scale promotion and seckill system will be under great overall access pressure. However, the moderate database is unable to host such read and write pressure. In such case, the JCS for Memcached can be used for carrying out rapid read and write, so as to increase access rate.

- Game Data Scenario

In the single-region and single-server scenario, the JCS for Memcached can be used as a caching layer to save the non-role data, such as the billboard etc. The high-performance feature can meet the scenario demand for rapid access data by the regional-server player. Without a backend system of complex design, the high concurrency can be coped with.

- Social App

The social App needs a lot of user information, friend information etc. If all of these functions are realized cross tables or by cross-database operation, great efficiency loss and system load will be introduced. You can cache these data by using Memcached. In such way, the access rate can be greatly improved.
