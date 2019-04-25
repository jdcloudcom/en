<p style="text-indent: 28px"><span style="font-size: 16px; font-family: 微软雅黑, &#39;Microsoft YaHei&#39;;">您好，近日京东云安全团队检测到多起黑客利用云主机上的RPCBind服务进行UDP反射DDoS攻击导致用户流量暴增的案例</span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑, &#39;Microsoft YaHei&#39;;">&nbsp;</span>
</p>
<p style="text-indent: 28px"><span style="font-size: 16px; font-family: 微软雅黑, &#39;Microsoft YaHei&#39;;">为保障您的业务安全，不受漏洞影响，京东云安全团队建议您及时开展安全自查，如在受影响范围，请您及时进行更新修复，避免被外部攻击者入侵</span>
<span style="font-size:16px;font-family:宋体">。</span>
</p>
<p><span style="font-size:16px;font-family:宋体">&nbsp;</span>
</p>
<p><span style="font-family: 微软雅黑, &#39;Microsoft YaHei&#39;;"><strong><span style="font-size: 16px;">【漏洞详情】</span>
</strong></span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑, &#39;Microsoft YaHei&#39;;">&nbsp;&nbsp;&nbsp; RPCBind是一种通用的RPC端口映射功能，默认绑定在端口111上，可以将RPC服务号映射到网络端口号。恶意攻击者可以批量扫描111UDP端口，利用UDP反射放大来进行DDoS攻击。</span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑, &#39;Microsoft YaHei&#39;;">&nbsp;</span>
</p>
<p><span style="font-family: 微软雅黑, &#39;Microsoft YaHei&#39;;"><strong><span style="font-size: 16px; font-family: 宋体;">【风险等级】</span>
</strong></span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑, &#39;Microsoft YaHei&#39;;">高危</span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑, &#39;Microsoft YaHei&#39;;">&nbsp;</span>
</p>
<p><span style="font-family: 微软雅黑, &#39;Microsoft YaHei&#39;;"><strong><span style="font-size: 16px; font-family: 宋体;">【漏洞危害】</span>
</strong></span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑, &#39;Microsoft YaHei&#39;;">&nbsp;&nbsp;&nbsp; 若存在该漏洞，用户主机可能被远程恶意攻击者利用进行反射放大攻击，导致您的带宽被恶意利用，对其他主机发起攻击，可能引起不必要的法律风险和经济损失。</span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑, &#39;Microsoft YaHei&#39;;">&nbsp;</span>
</p>
<p><span style="font-family: 微软雅黑, &#39;Microsoft YaHei&#39;;"><strong><span style="font-size: 16px; font-family: 宋体;">【修复建议】</span>
</strong></span>
</p>
<p><span style="font-family: 微软雅黑, &#39;Microsoft YaHei&#39;;"><strong><span style="font-size: 16px; font-family: 宋体;">建议变更前提前做好数据备份和验证评估，避免变更引起业务不可用</span>
</strong></span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑, &#39;Microsoft YaHei&#39;;">1. 直接关闭RPCBind服务：如果业务中并没有使用RPCBind，可直接关闭。</span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑, &#39;Microsoft YaHei&#39;;">Ubuntu：</span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑, &#39;Microsoft YaHei&#39;;">(1) 打开终端，运行如下命令，关闭rpcbind服务：</span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑, &#39;Microsoft YaHei&#39;;">sudo systemctl stop rpcbind &amp;&amp; systemctl disable rpcbind</span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑, &#39;Microsoft YaHei&#39;;">(2) 检查rpcbind服务是否关闭:</span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑, &#39;Microsoft YaHei&#39;;">netstat -anp | grep rpcbind</span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑, &#39;Microsoft YaHei&#39;;">&nbsp;</span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑, &#39;Microsoft YaHei&#39;;">CentOS 7：</span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑, &#39;Microsoft YaHei&#39;;">(1) 打开终端，运行如下命令：</span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑, &#39;Microsoft YaHei&#39;;">systemctl stop rpcbind &amp;&amp; systemctl disable rpcbind</span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑, &#39;Microsoft YaHei&#39;;">(2) 检查rpcbind服务是否关闭：</span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑, &#39;Microsoft YaHei&#39;;">netstat -anp | grep rpcbind</span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑, &#39;Microsoft YaHei&#39;;">&nbsp;</span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑, &#39;Microsoft YaHei&#39;;">CentOS 6：</span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑, &#39;Microsoft YaHei&#39;;">(1) 打开终端，运行如下命令：</span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑, &#39;Microsoft YaHei&#39;;">/etc/init.d/rpcbind stop</span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑, &#39;Microsoft YaHei&#39;;">(2) 检查rpcbind服务是否关闭：</span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑, &#39;Microsoft YaHei&#39;;">netstat -anp | grep rpcbind</span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑, &#39;Microsoft YaHei&#39;;">&nbsp;</span>
</p>
<p><span style="font-family: 微软雅黑, &#39;Microsoft YaHei&#39;;"><strong><span style="font-size: 16px;">【参考信息】</span>
</strong><strong><span style="font-size: 16px;"></span>
</strong></span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑, &#39;Microsoft YaHei&#39;;">（1）<a href="https://www.us-cert.gov/ncas/alerts/TA14-017A" target="_blank" title="https://www.us-cert.gov/ncas/alerts/TA14-017A">https://www.us-cert.gov/ncas/alerts/TA14-017A</a></span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑, &#39;Microsoft YaHei&#39;;">（2）<a href="http://netsecurity.51cto.com/art/201508/489005.htm" target="_blank" title="http://netsecurity.51cto.com/art/201508/489005.htm">http://netsecurity.51cto.com/art/201508/489005.htm</a></span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑, &#39;Microsoft YaHei&#39;;">（3）<a href="http://blog.nsfocus.net/portmapper-ddos-attack" target="_blank" title="http://blog.nsfocus.net/portmapper-ddos-attack">http://blog.nsfocus.net/portmapper-ddos-attack</a></span>
</p>
<p><br/></p>
