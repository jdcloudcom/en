<p style="text-indent: 2em;">JD Cloud released the JCS for Memcached Open Beta Test Version to provide users with high performance, memory-level Key-Value services base on the Memcached Protocol, and such services can increasing access speed while reducing the database load so as to improve database access performance.</p>
<p style="text-indent: 2em;">&nbsp;</p>
<p style="text-indent: 2em;">Memcached is a free and open source as well as high-performance distributed memory object storage cache system, used for dynamic Web application to reduce database load. It reduces the times of reading the database by caching data and objects in memory so as to improve the speed of database to drive the website.</p>
<p style="text-indent: 2em;"><br/></p>
<p style="text-indent: 2em;">The JCS for Memcached (hereinafter referred to as MC) is a memory-level Key-Value service based on high performance of Memcached protocol, which is suitable for high-speed caching scenarios. It provides a full set of services, including ready-to-use, rapid deployment, and easy operation and maintenance, greatly relieving pressure to backend memory and improving response speed of websites or applications.</p>
<p style="text-indent: 2em;"><br/></p>
<p style="text-indent: 0em; text-align: center;"><img src="//img1.jcloudcs.com/cms/3d0c45be-1f7c-41fe-a694-3ca0e648e8c320181114164056.jpg" title="" alt="mem1大.jpg"/><br/></p>
<p style="text-align: center;">Basic Architecture of JCS for Memcached</p>
<p><br/></p>
<p style="text-indent: 2em;"><strong>Fabulous for High-speed Cache and Reduction of Database Load</strong></p>
<p style="text-indent: 2em;"><br/></p>
<p style="text-indent: 2em;">On the basis of guaranteeing its high performance, currently only the standalone version is released for JCS for Memcached, which is used as the cache layer, without guaranteeing the persistence of data. Mainly the following features are provided:</p>
<ul style="list-style-type: disc;" class=" list-paddingleft-2"><li><p>Control service: Mainly used for processing request tasks from users and backend, including creation, deletion, query, configuration change, failover, capacity expansion and capacity reduction, configuration change, switch without password etc.</p>
<p><br/></p>
</li><li><p>Monitoring services: Collect Memcached instance information (information of resource usage, key statistics of database, usage of command, connection verification etc.) and information about host machines (information of resource usage, network traffic etc.), and provide users with frontend console display.</p>
<p><br/></p>
</li><li><p>Sentinel: The sentinel monitors whether the Memcached instance is alive. When the instance is down, the failover task is sent, and a new instance is automatically created.</p>
<p><br/></p>
</li><li><p>Log collection: Collection log information about operation of Memcached instances and other service modules.</p>
<p><br/></p>
</li></ul><p><br/></p>
<p style="text-indent: 2em;">Compared with the traditional self-built, JCS for Memcached has the following features:</p>
<p style="text-indent: 2em;"><br/></p>
<p style="text-indent: 2em;"><strong>Easy to Use and Smooth to Expand</strong></p>
<p style="text-indent: 2em;"><strong><br/></strong></p>
<p style="text-indent: 2em;">The user may easily deploy, run and expand JCS for Memcached, without machine installation, database deployment, operation and maintenance as well as others. The stand-alone instance type of JCS for Memcached supports the 1G, 2G, 4G, 8G, 16G and 32G memories. The user can make the selection according to the real usage conditions, upgrade on demand, increase resource usage ratio and reduce redundancy expense.</p>
<p style="text-indent: 2em;"><br/></p>
<p style="text-indent: 2em;"><strong>Security Protection  Overall Monitoring</strong></p>
<p style="text-indent: 2em;"><strong><br/></strong></p>
<p style="text-indent: 2em;">Subnet, IAM policy and other features to limit the access are provided, and instances run in Virtual Private Cloud (VPC), enhancing security and isolation. Features such as monitoring of resource running status and performance, as well as stability maintenance. It also provides early warning notification to reduce daily maintenance workload.</p>
<p><br/></p>
<p style="text-indent: 2em;" dir="ltr"><strong>The application scenario is widely applicable to enterprise users</strong></p>
<p style="text-indent: 2em;" dir="ltr"><strong><br/></strong></p>
<p style="text-indent: 2em;" dir="ltr">Relying on the above features of JCS for Memcached, the product is applicable to several different business scenarios, such as:</p>
<p style="text-indent: 2em;" dir="ltr"><br/></p>
<ul style="list-style-type: disc;" class=" list-paddingleft-2"><li><p style="text-indent: 2em;" dir="ltr"><strong>Large-scale Promotion Activity of E-commerce</strong></p>
</li></ul><p style="text-indent: 2em;" dir="ltr"><strong><br/></strong></p>
<p style="text-indent: 2em;" dir="ltr">The large-scale promotion and seckill system will be under greater overall access pressure at a certain moment. However, the moderate database is unable to host such read and write pressure. In such case, the JCS for Memcached can be used for carrying out rapid read and write, so as to increase access rate.</p>
<p style="text-align: center; text-indent: 0em;" dir="ltr"><img src="//img1.jcloudcs.com/cms/738cdfbf-89d2-4aab-8821-f79806b1441b20181114164718.jpg" title="" alt="mem2大.jpg"/><br/></p>
<ul style="list-style-type: disc;" class=" list-paddingleft-2"><li><p style="text-indent: 2em;"><strong>Game Data Caching</strong></p>
</li></ul><p style="text-indent: 2em;"><br/></p>
<p style="text-indent: 2em;">In the game industry, JCS for Memcached can be used as the cache layer, to save the non-role data, such as the billboard, etc. The high-performance feature can meet the scenario demand for rapid access data by the player. Without a backend system of complex design, the high concurrency can be coped with.</p>
<p style="text-align: center;"><img src="//img1.jcloudcs.com/cms/b42cfd34-07a0-4469-94d9-14e007a7c87d20181114164852.jpg" title="" alt="mem3大.jpg"/><br/></p>
<ul style="list-style-type: disc;" class=" list-paddingleft-2"><li><p style="text-indent: 2em;"><strong>Social App</strong></p>
<p style="text-indent: 2em;"><br/></p>
<p style="text-indent: 2em;"><br/></p>
<p style="text-indent: 2em;"><br/></p>
</li></ul><p style="text-indent: 2em;">The social App needs a lot of user information, friend information etc. If all of these functions are realized cross tables or by cross-database operation, great efficiency loss and system load will be introduced. JCS for Memcached can be used to cache these data. In such way, the access rate can be greatly improved.</p>
<p style="text-indent: 2em;"><br/></p>
<p style="text-indent: 0em; text-align: center;"><img src="//img1.jcloudcs.com/cms/208300f2-c33e-4ea8-95f1-8094c117fd4320181114165027.jpg" title="" alt="mem4大.jpg"/><br/></p>
<p style="text-indent: 2em;">JCS for Memcached, as a safe and reliable cache service with excellent performance, is applicable to several business scenarios of high speed cache, providing guarantee for improving access rate and making enterprises care more about their own business development. Welcome to try:https://www.jdcloud.com/cn/products/jcs-for-memcached。</p>
