<p style="text-indent: 2em;"><span style="text-indent: 2em;">2018</span><span style="text-indent: 2em;">年7月25日——京东云推出了互联网中间件PaaS产品消息队列，并全面开放公测。京东云消息队列（JD Cloud Message Queue，简称JCQ）是京东云自主研发的分布式消息队列服务。产品能够提供消息发布订阅、消息查询和死信队列等一系列高可靠、高可用、高处理性能的消息云服务，实现千万级吞吐能力，保证消息至少发送一次,是云架构中不可或缺的核心产品。</span></p>
<p style="text-indent: 2em;"><span style="text-indent: 2em;"><br/></span></p>
<p style="text-indent: 0em; text-align: center;"><span style="text-indent: 2em;"><img src="//img1.jcloudcs.com/cms/151f1263-4775-45db-9a8a-75f9b759e43020180803114801.png" title="" alt="image.png"/></span></p>
<p style="text-indent: 0em;"><span style="text-indent: 2em;"><br/></span></p>
<p style="text-indent: 0em;"></p>
<p style="text-indent: 2em;"><strong>解决分布式系统消息收发的利器</strong></p>
<p style="text-indent: 0em;"><span style="text-indent: 2em;"></span><br/></p>
<p style="text-indent: 2em;">京东云消息队列 JCQ产品比其他开源产品具有更加多样的功能，更多协议的兼容，更加出色的性能。</p>
<p style="text-indent: 2em;"><br/></p>
<p style="text-align: center; text-indent: 0em;"><img src="//img1.jcloudcs.com/cms/f77feef5-4748-4b94-a316-92245b6a575e20180803114925.png" title="" alt="image.png"/></p>
<p style="text-align: center;">（京东云消息队列 JCQ 基础架构）</p>
<p><br/></p>
<p style="text-indent: 2em;"><span style="text-indent: 2em;">在功能上，消息队列 JCQ支持以主题订阅的形式进行消息的生产和消费，其他功能还包括消息查看、消息重试、死信队列和消费点位重置等</span></p>
<p style="text-indent: 2em;"><span style="text-indent: 2em;"><br/></span></p>
<p style="text-indent: 2em;"><span style="text-indent: 2em;">在协议上，支持HTTP协议和TCP协议的接入，提供SDK进行消息的生产消费。</span></p>
<p style="text-indent: 2em;"><span style="text-indent: 2em;"><br/></span></p>
<p style="text-indent: 2em;"><span style="text-indent: 2em;">在性能上，集群部署自动切换承诺服务可用性高达99.95%。同步写入和三副本备份，Raft算法引入保证数据的强一致性，支持数据可靠性99.999999%，持久化存储3天，且消息至少发送一次。</span></p>
<p style="text-indent: 2em;"><span style="text-indent: 2em;"><br/></span></p>
<p style="text-indent: 2em;"><span style="text-indent: 2em;">同时，京东云消息队列 JCQ还支持海量的消息堆积，低延时的消息消费，千万级别的消息吞吐性能</span><span style="text-indent: 2em;"><span style="font-size:14px;font-family:&#39;微软雅黑&#39;,sans-serif">。</span></span></p>
<p style="text-indent: 2em;"><span style="text-indent: 2em;"><span style="font-size:14px;font-family:&#39;微软雅黑&#39;,sans-serif"><br/></span></span></p>
<p style="text-indent: 2em;"><strong>应用场景广泛适用于企业级用户</strong></p>
<p style="text-indent: 2em;"><strong><br/></strong></p>
<p style="text-indent: 2em;"><span style="text-indent: 2em;">消息队列 JCQ对于有一定并发请求，复杂业务逻辑和要求消息传递可靠性的企业级用户都是不可或缺的产品，主要应用在系统解耦、削峰填谷、广播发送和可靠消息传递等应用场景中，是企业级互联网云架构中关键的中间件产品。</span></p>
<p style="text-indent: 2em;"><span style="text-indent: 2em;"><br/></span></p>
<p style="text-indent: 2em;"><span style="text-indent: 2em;">比较典型如，传统系统业务逻辑链条复杂冗长和繁多的业务系统交互困难，消息队列 JCQ可以很好的解决，做到业务系统的解耦。</span></p>
<p style="text-indent: 2em;"><span style="text-indent: 2em;"><br/></span></p>
<p style="text-indent: 0em; text-align: center;"><span style="text-indent: 2em;"><img src="//img1.jcloudcs.com/cms/30247d6d-c282-4b93-8e5a-f15bf3c1612520180803115220.png" title="" alt="image.png"/></span></p>
<p style="text-indent: 0em;"><span style="text-indent: 2em;"><br/></span></p>
<p style="text-indent: 2em;"><span style="text-indent: 2em;">以用户下单这个业务场景为例，订单系统需要通知库存系统。传统IT企业的做法是订单系统调用库存系统的接口，系统耦合，调用库存系统接口失败会导致下订单失败。</span></p>
<p style="text-indent: 2em;"><span style="text-indent: 2em;"><br/></span></p>
<p style="text-indent: 2em;"><span style="text-indent: 2em;">而引入消息队列后，用户下订单后，订单系统完成持久化处理，将消息写入消息队列，返回用户订单下单成功。库存系统订阅下订单的消息，采用拉取/推送的方式，获取下单信息，库存系统根据下单信息，进行库存操作。这样就实现订单系统与库存系统的系统解耦，大大简化了信息交互的难度和方式，减轻了接口的压力。</span></p>
<p style="text-indent: 2em;"><span style="text-indent: 2em;"><br/></span></p>
<p></p>
<p style="text-indent: 2em;">此外，对于现在流行的微服务架构，消息队列也可以承担服务调用的通道，实现异步调用。</p>
<p style="text-indent: 2em;"><br/></p>
<p style="text-indent: 2em;">通过京东云消息队列JCQ产品，用户不但享有强大的产品性能，还能利用多样的监控和预警方案，对产品的使用情况了如指掌。并且京东云消息队列JCQ产品提供按量付费的后付费措施，使得用户以最低的成本获得最大的弹性处理性能。</p>
<p style="text-indent: 2em;"><br/></p>
<p style="text-indent: 2em;">了解京东云消息队列JCQ产品更多内容，请点击： <a href="https://www.jdcloud.com/products/jcq">https://www.jdcloud.com/products/jcq</a></p>
<p style="text-indent: 2em;"><br/></p>
<p style="text-indent: 2em;"><span style="text-indent: 2em;"></span></p>
