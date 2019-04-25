<p style="white-space: normal; text-indent: 32px;"><span style="font-family: 微软雅黑, &quot;Microsoft YaHei&quot;;">您好，近日京东云安全团队检测到</span>
<span style="font-family: 微软雅黑, &quot;Microsoft YaHei&quot;;">SoIr组件远程命令执行漏洞(CVE-2019-0192)，该漏洞可导致攻击者在受攻击主机上执行命令或进一步操作。由于漏洞存在一定影响&nbsp;</span>
</p>
<p style="white-space: normal; text-indent: 32px;"><span style="font-family: 微软雅黑, &quot;Microsoft YaHei&quot;;">&nbsp;&nbsp;</span>
<span style="font-family: 微软雅黑, &quot;Microsoft YaHei&quot;;">京东云安全团队建议您及时开展安全自查，如在受影响范围，请您及时进行更新修复，避免被外部攻击者入侵。</span>
</p>
<p style="white-space: normal; text-indent: 32px;"><br/></p>
<p><strong><span style="font-family:宋体">漏洞描述</span>
</strong></p>
<p>&nbsp;</p>
<p><span style="font-family:宋体">该漏洞类型为</span>
RCE( remote code execution)<span style="font-family:宋体">，该漏洞出现在</span>
ConfigAPI<span style="font-family:宋体">允许通过</span>
HTTP POST<span style="font-family:宋体">请求配置</span>
Solr<span style="font-family:宋体">的</span>
JMX<span style="font-family:宋体">服务器</span>
</p>
<p><span style="font-family:宋体">在</span>
SoIr<span style="font-family:宋体">通过</span>
jmx.serviceUrl<span style="font-family:宋体">反序列化不受信任的数据导致远程命令执行。威胁主机安全。</span>
</p>
<p>&nbsp;</p>
<p><strong><span style="font-family:宋体">漏洞评级</span>
</strong></p>
<p>&nbsp;</p>
<p><span style="font-family:宋体">高危</span>
</p>
<p><strong>&nbsp;</strong></p>
<p><strong><span style="font-family:宋体">受影响范围</span>
</strong></p>
<p>Solr<span style="font-family:宋体">版本：</span>
</p>
<p>5.0.0~5.5.5&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</p>
<p>6.0.0~6.6.5</p>
<p>&nbsp;</p>
<p><strong><span style="font-family:宋体">安全建议</span>
</strong></p>
<p>1.<span style="font-family:宋体">升级到</span>
Apache Solr 7.0<span style="font-family:宋体">或更高版本</span>
</p>
<p>2.<span style="font-family:宋体">无法升级的情况下，通过使用系统属性</span>
disable.configEdit = true<span style="font-family:宋体">运行</span>
Solr<span style="font-family:宋体">，禁用</span>
ConfigAPI<span style="font-family:宋体">（如果未使用）</span>
</p>
<p>3.<span style="font-family:宋体">配置访问白名单，确保可信的访问流量进入</span>
/<span style="font-family:宋体">退出运行</span>
Solr <span style="font-family:宋体">的主机</span>
 </p>
<p>&nbsp;</p>
<p><strong><span style="font-family:宋体">参考链接</span>
</strong></p>
<p><a href="https://issues.apache.org/jira/browse/SOLR-13301">https://issues.apache.org/jira/browse/SOLR-13301</a></p>
<p><a href="https://wiki.apache.org/solr/SolrSecurity">https://wiki.apache.org/solr/SolrSecurity</a></p>
<p style="white-space: normal; text-indent: 32px;"><br/></p>
<p><br/></p>
