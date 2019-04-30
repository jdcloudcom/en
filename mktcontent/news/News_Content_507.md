<p style="text-indent: 2em;">据KBV研究公司发布的报告《全球Serverless架构市场》显示，全球Serverless架构市场的规模预计到2024年将达到140亿美元，在这段预测期内将以23.4%的年复合增长率增长。从开发的角度看，更低的运营成本和更高的流程灵活性促进了Serverless架构的实施。Serverless涵盖了很多技术，FaaS（函数即服务）就是其中的核心组件。</p>
<p style="text-indent: 2em;"><br/></p>
<p style="text-align: center;"><img src="//img1.jcloudcs.com/cms/6801f560-fc01-4c39-a276-88b61f5edb9820190430155634.jpg" title="" alt="云计算迈向纵深，京东云开启Serverless架构应用——函数服务.jpg"/></p>
<p style="text-indent: 2em;"><br/></p>
<p style="text-indent: 2em;">近日，京东云推出Serverless FaaS服务--函数服务（Function Service），一项事件驱动的计算服务（公测初期支持OSS对象存储和API网关事件源）。通过函数服务提供的计算资源，用户只需编写业务函数代码并设置运行条件，即可弹性、可靠地运行代码，快速构建任何类型的应用与服务，且只需为代码实际消耗的资源付费。</p>
<p style="text-indent: 2em;"><br/></p>
<p style="text-indent: 2em;">TIPS：</p>
<p style="text-indent: 2em;">Serverless所提供的接口，简化了云计算的编程，其代表了程序员生产力的跨越式变革，一如编程语言从汇编时代演变为高级语言时代。——《简化云端编程：伯克利视角下的 Serverless计算》</p>
<p style="text-indent: 2em;"><br/></p>
<p style="text-indent: 2em;">FaaS可以看成PaaS的最新发展，FaaS将原有的计算能力进行进一步抽离，无需关心底层服务器等基础设施，只需关注业务本身，使得整体业务实现了轻量化。FaaS作为 Serverless 架构中的计算组件，将各个其他产品或服务粘合起来，并实现业务逻辑，所有的工作都在函数内完成。与传统容器相比FaaS是完全自动的运行，服务会根据事件堆积自行并发，轻松应对业务的高峰低谷，且只有代码被运行才占用计算资源并收取费用。它是云计算服务向纵深发展的表现。</p>
<p style="text-indent: 2em;"><br/></p>
<p style="text-indent: 2em;">函数服务作为Serverless架构中的核心组件，可应用于各类Serverless架构：移动应用后台、实时文件处理、Web应用、物联网应用后台、实时流处理、AI数据提取分析等。典型如：</p>
<p><br/></p>
<p style="text-indent: 2em;">通过对象存储回调通知事件触发函数执行。例如：在多媒体内容分析处理场景下，文件上传到OSS的Bucket中，应用程序可通过创建Function函数自动处理（提取、转码、缩放等）用户的多媒体文件，并将处理后的结果保存到指定OSS的Bucket中。</p>
<p style="text-indent: 2em;"><br/></p>
<p style="text-indent: 2em;">通过API网关和函数服务构建Web客户端、移动客户端的后端服务，降低系统投入，快速构建应用与服务。</p>
<p style="text-indent: 2em;">Serverless具有零运维、弹性伸缩、按需计费等特点。通过京东云提供的海量计算资源，函数服务拥有近乎无限的弹性扩展计算能力，开发者只需关注核心代码本身，即能够轻松快速迭代、部署，更有效的利用计算资源，极大降低运营和开发成本。</p>
<p><br/></p>
