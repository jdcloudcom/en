<p style="text-indent: 2em;">1月25日，京东云宣布，京东云云数据库 RDS 在所有地域正式支持 MySQL 8.0版本。MySQL 8.0 是目前 MySQL 社区的最新版本，相比较 MySQL 5.7，支持了更多新功能，对原有功能做了重大更新和优化，同时在性能方面也有显著的提升。此次京东云首发MySQL 8.0版本，不仅证明了京东云技术团队的研发实力和创新能力，同时也表现了京东云希望通过更加优质的云计算服务回馈用户，并助力用户运用新技术不断创新，实现更多的商业价值。</p>
<p style="text-indent: 2em;"><br/></p>
<p style="text-indent: 2em;">MySQL 8.0版本的主要优势和功能包括：</p>
<p style="text-indent: 2em;"><br/></p>
<p style="text-indent: 2em;"><strong>文档存储</strong></p>
<p style="text-indent: 2em;"><br/></p>
<p style="text-indent: 2em;">MySQL 8.0 支持的这个新特性可以说是一个里程碑式的。 如果你正在开发一个文档服务，现在一个数据库就可以同时满足你的需求。</p>
<p style="text-indent: 2em;"><br/></p>
<p style="text-indent: 2em;"><strong>性能</strong></p>
<p style="text-indent: 2em;"><br/></p>
<p style="text-indent: 2em;">MySQL 8.0 针对读写工作负载、I/O-bound 工作负载和高竞争“热点”工作负载场景做了性能优化，提升了复制性能。并且提供了资源组功能，针对特定的用户线程，可以运行于指定的硬件 CPU 上，从而实现性能优化的目的。索引性能方面，支持了降序索引，当我们读取一张表中某个索引的值并且需要降序输出，不再需要调用 order by 命令。</p>
<p style="text-indent: 2em;"><br/></p>
<p style="text-indent: 2em;">我们来看看下面这个由 MySQL 官网提供的性能测试图：</p>
<p style="text-indent: 2em;"><br/></p>
<p style="text-align: center; text-indent: 0em;"><img src="//img1.jcloudcs.com/cms/fee5f0c8-ab65-4df7-a820-7a24343ad36620190125114534.jpg" title="" alt="sql1d.jpg"/><br/></p>
<p style="text-align: center;"><strong>MySQL 8.0 Sysbench Benchmark: IO Bound Read Only (Point Selects)</strong></p>
<p><strong><br/></strong></p>
<p style="text-align: center;"><strong><img src="//img1.jcloudcs.com/cms/0a52cad7-89f1-48d1-82c9-c1be11255f1d20190125114640.jpg" title="" alt="sql2d.jpg"/></strong><br/></p>
<p style="text-align: center;"><strong>MySQL 8.0 Sysbench Benchmark: Read Write (update nokey)</strong></p>
<p><br/></p>
<p><br/></p>
<p style="text-indent: 2em;"><strong>安全</strong></p>
<p style="text-indent: 2em;"><br/></p>
<p style="text-indent: 2em;">MySQL 8.0版本支持 SQL 角色，可以通过角色来进行权限控制。并且将OpenSSL 作为默认的 TLS/SSL 库。支持自定义数据库密码的轮转策略，包括密码过期时间，密码强度等，加强用户密码安全保护。</p>
<p style="text-indent: 2em;"><br/></p>
<p style="text-indent: 2em;"><strong>可靠性</strong></p>
<p style="text-indent: 2em;"><br/></p>
<p style="text-indent: 2em;">MySQL 8.0版本支持原子，崩溃安全的数据定义语言（DDL），而且从原先的两个数据字典变成一个数据字典。</p>
<p style="text-indent: 2em;"><br/></p>
<p style="text-indent: 2em;"><strong>管理性</strong></p>
<p style="text-indent: 2em;"><br/></p>
<p style="text-indent: 2em;">支持不可见索引。相比较 MySQL 5.7 版本的处理方式，列名重命名（SQL DDL）功能在MySQL 8.0 版本做了优化。</p>
<p style="text-indent: 2em;"><br/></p>
<p style="text-indent: 2em;"><strong>提供了更强大的JSON支持</strong></p>
<p style="text-indent: 2em;"><br/></p>
<p style="text-indent: 2em;">MySQL8.0版本提供了更强大的JSON支持，可以通过 JSON_TABLE() 函数可以将 JSON 格式的数据转变为关系型表格存储。支持 -&gt;&gt; 运算符，等同于调用 JSON_UNQUOTE(JSON_EXTRACT())。支持两个新的聚合函数 &nbsp;JSON_ARRAYAGG() 和JSON_OBJECTAGG()。提供了实用的工具 JSON_PRETTY()、JSON_STORAGE_SIZE() 和JSON_STORAGE_FREE()，其中JSON_PRETTY() 可以将 JSON 对象以一种简单易读的方式打印显示。针对 JSON 对象的值，支持部分就地更新，并且在排序上做了优化，从而提供更高的性能。</p>
<p style="text-indent: 2em;"><br/></p>
<p style="text-indent: 2em;"><strong>GIS</strong></p>
<p style="text-indent: 2em;"><br/></p>
<p style="text-indent: 2em;">支持空间数据类型、索引和函数，可支持 5108 种不同的空间参照系统，包括 4628 种投影（平面图）、479 种地球地理（椭圆）表示，以及 1 种笛卡尔通用抽象平面。</p>
<p style="text-indent: 2em;"><br/></p>
<p style="text-indent: 2em;"><strong>窗函数+公用表表达式</strong></p>
<p style="text-indent: 2em;"><br/></p>
<p style="text-indent: 2em;">MySQL8.0版本支持了窗函数特性和公用表表达式，其中窗函数可以降低代码编写复杂度，提高生产效率。公用表表达式（with 查询）降低了查询复杂度。</p>
<p style="text-indent: 2em;"><br/></p>
<p style="text-indent: 2em;">京东云一直以来致力于通过多年的业务实践和技术积淀来帮助和完善客户“云”上业务的发展和体验。通过一站式服务，帮助客户实现业务轻松上云，并提供全方位安全防护，保障业务数据安全，向全社会提供安全、专业、稳定、便捷的云计算服务。</p>
<p style="text-indent: 2em;"><br/></p>
<p style="text-indent: 2em;">更多产品详情，请点击：<a href="https://www.jdcloud.com/cn/products/jcs-for-mysql">https://www.jdcloud.com/cn/products/jcs-for-mysql</a></p>
<p><br/></p>
