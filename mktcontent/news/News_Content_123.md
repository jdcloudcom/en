<p style="text-indent: 2em;"><span style="text-indent: 2em;">对于云上用户，采用负载均衡实现业务流量分发、保障服务高可用是普遍使用的方案。通常用户会将业务服务器部署在负载均衡的后端，由负载均衡直接承载访问流量，因此负载均衡产品很大程度决定了对外服务的能力。</span></p>
<p style="text-indent: 2em;"><span style="text-indent: 2em;"><br/></span></p>
<p style="text-align: center; text-indent: 0em;"><span style="text-indent: 2em;"><img src="//img1.jcloudcs.com/cms/4e6ef427-e90b-41a1-bf9e-d0fb9f1332e120180809104506.jpg" title="" alt="12.jpg"/></span></p>
<p style="text-indent: 2em;"><br/></p>
<p style="text-indent: 2em;">近日，京东云正式发布新版负载均衡产品。此次迭代更新，主要从功能增强和结构调整两个维度进行，实现产品功能、稳定性、可靠性等方面的大幅度提升。</p>
<p style="text-indent: 2em;"><br/></p>
<p style="text-indent: 2em;">功能上，此次升级增加了支持高可用组与容器作为业务分发对象；增加管理空闲超时时间配置；增加后端服务实例健康检查结果展示功能；增加支持HTTP请求头字段能力等<span style="color: rgb(51, 51, 51); font-family: -apple-system-font, BlinkMacSystemFont, &quot;Helvetica Neue&quot;, &quot;PingFang SC&quot;, &quot;Hiragino Sans GB&quot;, &quot;Microsoft YaHei UI&quot;, &quot;Microsoft YaHei&quot;, Arial, sans-serif; font-size: 15px; letter-spacing: 0.544px; text-align: justify; background-color: rgb(255, 255, 255);">。</span></p>
<p style="text-indent: 2em;"><span style="color: rgb(51, 51, 51); font-family: -apple-system-font, BlinkMacSystemFont, &quot;Helvetica Neue&quot;, &quot;PingFang SC&quot;, &quot;Hiragino Sans GB&quot;, &quot;Microsoft YaHei UI&quot;, &quot;Microsoft YaHei&quot;, Arial, sans-serif; font-size: 15px; letter-spacing: 0.544px; text-align: justify; background-color: rgb(255, 255, 255);"><br/></span></p>
<p style="text-indent: 2em;"><span style="text-indent: 2em;">结构上，</span><span style="text-indent: 2em;">新版负载均衡将原有的监听规则拆分为监听器与后端服务两个模块</span><span style="text-indent: 2em;">，以便结构清晰以及复用后端服务。监听器用于定义监听的协议类型与端口等客户端业务请求区分规则；后端服务模块用于定义服务端的协议类型与端口，并挂接高可用组或者虚拟服务器组。</span></p>
<p style="text-indent: 2em;"><span style="text-indent: 2em;"><br/></span></p>
<p style="text-indent: 2em;"><strong>三重高可用机制，业务稳定再加码</strong></p>
<p><br/></p>
<p style="text-indent: 2em;"><span style="text-indent: 2em;">基于京东云强大的高可用组服务</span><span style="text-indent: 2em;">，升级后的负载均衡实现了三重高可用机制，并支持弹性扩容。</span></p>
<p style="text-indent: 2em;"><span style="text-indent: 2em;"><br/></span></p>
<section><p style="text-indent: 2em;">在负载均衡高可用方面，京东云负载均衡采用集群部署，提供双活模式（单可用区下至少提供2个资源实例），如一个负载均衡服务故障，可将流量自动转发至另一个负载均衡服务，业务侧无感知。</p>
<p style="text-indent: 2em;"><br/></p>
<p style="text-indent: 2em;"><span style="text-indent: 2em;">对于支持多可用区的地域，还可</span><span style="text-indent: 2em;">将负载均衡创建在不同的可用区</span><span style="text-indent: 2em;">，避免由于单一可用区故障引起的系统故障，提高系统可靠性，为用户提供更高的可用性保障。</span></p>
<p style="text-indent: 2em;"><span style="text-indent: 2em;"><br/></span></p>
<p style="text-indent: 2em;"><span style="text-indent: 2em;">在后端服务器高可用方面，绑定高可用组后，负载均衡可根据业务流量和设备负载情况</span><span style="text-indent: 2em;">动态调整服务器数量</span><span style="text-indent: 2em;">，实现资源的合理分配，保证业务正常运行。</span><span style="text-indent: 2em;">高可用组会将后端服务器分布到不同机架、不同可用区下</span><span style="text-indent: 2em;">，避免由于单一机架、可用区故障引起的系统故障。</span></p>
<p style="text-indent: 2em;"><span style="text-indent: 2em;"><br/></span></p>
<p style="text-indent: 0em; text-align: center;"><span style="text-indent: 2em;"><img src="//img1.jcloudcs.com/cms/700b4418-ea63-4d01-b859-5db8f21ec2e520180809104813.jpg" title="" alt="fuzai2g.jpg"/></span></p>
<p style="text-indent: 0em;"><br/></p>
<p style="text-indent: 2em;"><strong>后端服务独立，功能丰富再升级</strong></p>
<p><strong style="margin: 0px; padding: 0px; max-width: 100%; box-sizing: border-box; word-wrap: break-word !important;"><br/></strong></p>
<p style="text-indent: 2em;"><span style="text-indent: 2em;">新版负载均衡会</span><span style="text-indent: 2em;">检查后端服务资源池中实例的健康状态</span><span style="text-indent: 2em;">，自动隔离、挂载后端提供服务的实例，保障业务正常运行。</span></p>
<p style="text-indent: 2em;"><span style="text-indent: 2em;"><br/></span></p>
<p style="text-indent: 2em;">后端服务的独立，使不同的监听器可以使用相同的后端服务，这在一些业务场景（如同时提供HTTP/HTTPs访问的网站服务）下可直接创建基于80、443端口的两个监听器并使用相同的后端服务。</p>
<p style="text-indent: 2em;"><br/></p>
<p style="text-indent: 2em;">在协议、调度算法方面，负载均衡支持TCP/HTTP（S）协议的监听，支持加权轮询、加权最小连接数、源IP转发3种调度算法，可根据业务需求自行选择。同时，为满足用户定制化需求，开放了多项功能参数配置，包括监听器的空闲连接超时、会话保持、HTTP头字段（IP、端口、协议）透传至后端服务器等。</p>
<p style="text-indent: 2em;"><br/></p>
<p style="text-indent: 2em;"><span style="text-indent: 2em;">值得一提的是，新版负载均衡</span><span style="text-indent: 2em;">支持绑定容器作为后端服务器</span><span style="text-indent: 2em;">，通过均衡负载可有效提升容器服务的性能、稳定性、可靠性，同时也支持将云主机和容器作为后端服务器进行混合部署。</span></p>
<p style="text-indent: 2em;"><span style="text-indent: 2em;"><br/></span></p>
<p style="text-indent: 2em;"><span style="text-indent: 2em;"><img src="//img1.jcloudcs.com/cms/744354d6-e982-4085-a06f-df266cef18c220180809104831.jpg" title="" alt="fuzai3g.jpg"/></span></p>
<p><br/></p>
<p style="text-indent: 2em;"><span style="text-indent: 2em;">此外， 升级后的负载均衡支持绑定安全组，可自主设置流量的进/出策略，同时公网IP自带抗DDoS攻击能力，提供安全性保障。负载均衡资源配额也进一步提升，以满足大规模业务部署的需求。</span></p>
<p style="text-indent: 2em;"><span style="text-indent: 2em;"><br/></span></p>
<p style="text-indent: 2em;"><span style="text-indent: 2em;">此次更新迭代后，京东云负载均衡为灵活调整负载规模实现高可用、应对突发大流量、分析真实客户来源、实现高安全性需求等业务场景提供了更强有力的支撑。</span></p>
</section>