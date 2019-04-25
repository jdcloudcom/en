<p style="text-indent: 2em;">京东云发布缓存Memcached公测版，为用户提供基于Memcached协议的高性能、内存级的Key-Value服务，显著提高访问的速度，同时减低了数据库的负载，从而提升数据库的访问性能。</p>
<p style="text-indent: 2em;">&nbsp;</p>
<p style="text-indent: 2em;">Memcached 是一个自由开源的、高性能的分布式内存对象缓存系统，用于动态Web应用以减轻数据库负载。它通过在内存中缓存数据和对象来减少读取数据库的次数，从而提高数据库驱动网站的速度。</p>
<p style="text-indent: 2em;"><br/></p>
<p style="text-indent: 2em;">京东云缓存Memcached （JCS for Memcached，简称MC）是基于Memcached协议的高性能、内存级的Key-Value服务，适用于高速缓存的场景，提供即开即用、快速部署、轻松运维的全套服务，极大缓解对后端存储的压力，提高网站或应用的响应速度。</p>
<p style="text-indent: 2em;"><br/></p>
<p style="text-indent: 0em; text-align: center;"><img src="//img1.jcloudcs.com/cms/3d0c45be-1f7c-41fe-a694-3ca0e648e8c320181114164056.jpg" title="" alt="mem1大.jpg"/><br/></p>
<p style="text-align: center;">京东云缓存Memcached基础架构</p>
<p><br/></p>
<p style="text-indent: 2em;"><strong>高速缓存，减轻数据库负担的神器</strong></p>
<p style="text-indent: 2em;"><br/></p>
<p style="text-indent: 2em;">京东云缓存Memcached在保障高性能的基础上现仅推出单机版，作缓存层使用，不保证数据的持久性，主要提供以下产品功能：</p>
<ul style="list-style-type: disc;" class=" list-paddingleft-2"><li><p>控制服务：主要用于处理来自用户和后端的请求任务如：创建、删除、查询、配置变更、failover、扩容缩容、配置修改、免密切换等任务。</p>
<p><br/></p>
</li><li><p>监控服务：收集Memcached实例信息（资源使用、数据库键统计、命令使用、连接认证等信息）和宿主机信息（资源使用和网络流量等信息），并为用户提供前端控制台显示。</p>
<p><br/></p>
</li><li><p>哨兵：哨兵监控Memcached实例是否存活，当发现实例down掉后，发送failover任务，自动创建新实例。</p>
<p><br/></p>
</li><li><p>日志收集：收集Memcached实例运行及其他服务模块的日志信息。</p>
<p><br/></p>
</li></ul><p><br/></p>
<p style="text-indent: 2em;">京东云缓存Memcached相比于传统自建有以下特点：</p>
<p style="text-indent: 2em;"><br/></p>
<p style="text-indent: 2em;"><strong>简单易用 平滑扩容</strong></p>
<p style="text-indent: 2em;"><strong><br/></strong></p>
<p style="text-indent: 2em;">用户可轻松部署、运行和扩展缓存Memcached，无需机器安装和数据库部署运维等工作，缓存Memcached单机版实例规格支持1G、2G、4G、8G、16G、32G内存，用户可根据实际使用情况按需选择，按需升级，提高资源利用率，降低冗余费用。</p>
<p style="text-indent: 2em;"><br/></p>
<p style="text-indent: 2em;"><strong>安全防护 全面监控</strong></p>
<p style="text-indent: 2em;"><strong><br/></strong></p>
<p style="text-indent: 2em;">提供了子网、访问控制策略等限制访问的功能，实例运行在私有网络（VPC）中，增强了安全性和隔离性。提供资源的运行状况和性能的监控、稳定性维护等功能；提前预警通知，降低日常维护工作量。</p>
<p><br/></p>
<p style="text-indent: 2em;" dir="ltr"><strong>应用场景广泛适用于企业级用户</strong></p>
<p style="text-indent: 2em;" dir="ltr"><strong><br/></strong></p>
<p style="text-indent: 2em;" dir="ltr">依托京东云缓存Memcached以上特性，产品满足多种不同的业务场景，比如：</p>
<p style="text-indent: 2em;" dir="ltr"><br/></p>
<ul style="list-style-type: disc;" class=" list-paddingleft-2"><li><p style="text-indent: 2em;" dir="ltr"><strong>电商大型促销活动</strong></p>
</li></ul><p style="text-indent: 2em;" dir="ltr"><strong><br/></strong></p>
<p style="text-indent: 2em;" dir="ltr">大型促销秒杀系统，系统整体会在某一时刻访问压力变大。一般的数据库无法承载这样的读取压力，可选用京东云缓存Memcached来进行快速读写，提高访问速率。</p>
<p style="text-align: center; text-indent: 0em;" dir="ltr"><img src="//img1.jcloudcs.com/cms/738cdfbf-89d2-4aab-8821-f79806b1441b20181114164718.jpg" title="" alt="mem2大.jpg"/><br/></p>
<ul style="list-style-type: disc;" class=" list-paddingleft-2"><li><p style="text-indent: 2em;"><strong>游戏数据缓存</strong></p>
</li></ul><p style="text-indent: 2em;"><br/></p>
<p style="text-indent: 2em;">游戏行业中，京东云缓存Memcached可以作为缓存层，存储非角色类数据，如排行榜等。高性能的特性满足玩家需要快速访问数据的场景需求，无需设计复杂的后端系统来应对高并发量。</p>
<p style="text-align: center;"><img src="//img1.jcloudcs.com/cms/b42cfd34-07a0-4469-94d9-14e007a7c87d20181114164852.jpg" title="" alt="mem3大.jpg"/><br/></p>
<ul style="list-style-type: disc;" class=" list-paddingleft-2"><li><p style="text-indent: 2em;"><strong>社交应用</strong></p>
<p style="text-indent: 2em;"><br/></p>
<p style="text-indent: 2em;"><br/></p>
<p style="text-indent: 2em;"><br/></p>
</li></ul><p style="text-indent: 2em;">社交应用需要引用大量的用户信息、好友信息等，如果这些功能全部直接跨表或跨库操作数据库，会带来极大的效率损耗和系统负载。使用京东云缓存Memcached将这类数据全部缓存下来，可以极大程度提高访问速率。</p>
<p style="text-indent: 2em;"><br/></p>
<p style="text-indent: 0em; text-align: center;"><img src="//img1.jcloudcs.com/cms/208300f2-c33e-4ea8-95f1-8094c117fd4320181114165027.jpg" title="" alt="mem4大.jpg"/><br/></p>
<p style="text-indent: 2em;">京东云缓存Memcached作为性能优秀、安全可靠的缓存服务，适用于高速缓存的多种业务场景，为提高访问速率提供保障，让企业更专注自身业务发展。欢迎试用：https://www.jdcloud.com/cn/products/jcs-for-memcached。</p>
