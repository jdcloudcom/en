<p style="text-indent: 2em;"><span style="text-indent: 2em;">On Jul. 25, 2018- JD Cloud has launched the internet Middleware PaaS Product Message Queue for beta testing. JCQ is the distributed message queue service independently developed by JD Cloud. The product can provide a series of message cloud services with high reliability, availability and processing performance, such as message release and subscription, message search and Dead Message Queue, realize a ten million-level throughput capacity, and make sure the message can be sent for at least once. It is the indispensable core product of cloud structure.</span></p>

<p style="text-indent: 2em;"><span style="text-indent: 2em;"><br/></span></p>
<p style="text-indent: 0em; text-align: center;"><span style="text-indent: 2em;"><img src="//img1.jcloudcs.com/cms/151f1263-4775-45db-9a8a-75f9b759e43020180803114801.png" title="" alt="image.png"/></span></p>
<p style="text-indent: 0em;"><span style="text-indent: 2em;"><br/></span></p>
<p style="text-indent: 0em;"></p>

<strong>The edge tool to solve distributed system messaging</strong>

<p style="text-indent: 2em;"><span style="text-indent: 2em;">The JCQ products have more diverse functions, more protocol compatibility, and better performance than other open source products.</span></p>
<p style="text-indent: 2em;"><br/></p>
<p style="text-align: center; text-indent: 0em;"><img src="//img1.jcloudcs.com/cms/f77feef5-4748-4b94-a316-92245b6a575e20180803114925.png" title="" alt="image.png"/></p>

(JCQ basic structure)

<p style="text-indent: 2em;"><span style="text-indent: 2em;">Functionally, JCQ supports the production and consumption of messages in the form of topic subscription. Other functions include message viewing, message retry, Dead Message Queue, and consumption point reset.</span></p>

<p style="text-indent: 2em;"><span style="text-indent: 2em;">In terms of protocol, access of HTTP protocol and TCP protocol is supported, and SDK is provided for the message production and consumption.</span></p>

<p style="text-indent: 2em;"><span style="text-indent: 2em;">In terms of performance, the service availability promised for the cluster deployment and automatic failover is up to 99.95%. With synchronous writing and three-copy backup, Raft algorithm is introduced to guarantee the strong consistency of data and support the data reliability to reach 99.999999%, with the persistent storage reaching three days and messages sent for at least once.</span></p>

<p style="text-indent: 2em;"><span style="text-indent: 2em;">Meanwhile, JCQ products support accumulation of mass messages, low-delay message consumption and throughput of messages at ten million-level.</span></p>

<strong>The application scene is widely applied to enterprise users</strong>

<p style="text-indent: 2em;"><span style="text-indent: 2em;">JCQ is an indispensable product for enterprise users with certain concurrent requests and complex business logic and demanding reliability of message delivery. It is mainly used in application scenarios such as system decoupling, peak clipping, broadcast transmission and reliable messaging. It is a key Middleware product in the enterprise-level Internet cloud architecture.</span></p>

<p style="text-indent: 2em;"><span style="text-indent: 2em;">For example, the traditional system business logic chain is complex and lengthy and the business system is difficult to interact. JCQ can be well solved to decouple the business system.</span></p>

<p style="text-indent: 2em;"><span style="text-indent: 2em;"><br/></span></p>
<p style="text-indent: 0em; text-align: center;"><span style="text-indent: 2em;"><img src="//img1.jcloudcs.com/cms/30247d6d-c282-4b93-8e5a-f15bf3c1612520180803115220.png" title="" alt="image.png"/></span></p>
<p style="text-indent: 0em;"><span style="text-indent: 2em;"><br/></span></p>

<p style="text-indent: 2em;"><span style="text-indent: 2em;">Taking the business scenario of order placing as an example, the order system needs to notify the inventory system. For a traditional IT enterprise, the order system calls the interface of the inventory system. But system coupling or failure to call the inventory system interface will result in failure in order placing.</span></p>

<p style="text-indent: 2em;"><span style="text-indent: 2em;">After JCQ is introduced and an order is placed by users, the order system would complete the persistence process and write the message to JCQ, and return the successful order of the user. For the ordering message subscribed in the inventory system, the pull/push method is used to obtain the order information, by which the inventory system would perform the inventory operation. In this way, the system decoupling between the order system and the inventory system is realized, which greatly simplifies the difficulty and manner of information interaction and reduces the pressure on the interface.</span></p>

<p style="text-indent: 2em;"><span style="text-indent: 2em;">In addition, for the current popular microservice architecture, JCQ can act as the channel of the service call to realize asynchronous calls.</span></p>

<p style="text-indent: 2em;"><span style="text-indent: 2em;">JCQ products not only bring high product performance to users, but also offer diversified monitoring and warning plans, to help users know every detail of product use. Besides, JCQ products support Pay-As-You-Go, so that users can get the highest elastic handling performance at the lowest price.</span></p>

<p style="text-indent: 2em;"><span style="text-indent: 2em;">To learn more about JCQ, please click: </span></p>
 <a href="https://www.jdcloud.com/products/jcq">https://www.jdcloud.com/products/jcq</a></p>
<p style="text-indent: 2em;"><br/></p>
<p style="text-indent: 2em;"><span style="text-indent: 2em;"></span></p>
