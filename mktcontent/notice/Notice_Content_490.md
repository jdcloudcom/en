<p style="text-indent: 28px"><span style="font-size: 16px; font-family: 微软雅黑,&#39;Microsoft YaHei&#39;;">Hello, recently JD Cloud Security Team has detected cases of UDP reflection DDoS attacks through RPCBind service on the Virtual Machine from hackers, resulting in explosion of user traffic</span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑,&#39;Microsoft YaHei&#39;;">&nbsp;</span>
</p>
<p style="text-indent: 28px"><span style="font-size: 16px; font-family: 微软雅黑,&#39;Microsoft YaHei&#39;;">In order to secure your business from being affected by vulnerabilities, JD Cloud security team recommends that you should conduct the security self-examination in a timely manner. If your business is in the affecting scope, please update and fix the problem in time to avoid attacks from an external attacker</span>
<span style="font-size:16px;font-family:宋体">. </span>
</p>
<p><span style="font-size:16px;font-family:宋体">&nbsp;</span>
</p>
<p><span style="font-family: 微软雅黑,&#39;Microsoft YaHei&#39;;"><strong><span style="font-size: 16px;">Vulnerability Details</span>
</strong></span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑,&#39;Microsoft YaHei&#39;;">&nbsp;&nbsp;&nbsp; RPCBind is a general RPC port mapping feature, associated with Port 111 by default, by which the RPC service number can be mapped to the network port number. Malicious attackers can scan 111UDP port in batches, and perform DDoS attacks with UDP reflection amplification. </span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑,&#39;Microsoft YaHei&#39;;">&nbsp;</span>
</p>
<p><span style="font-family: 微软雅黑,&#39;Microsoft YaHei&#39;;"><strong><span style="font-size: 16px; font-family: 宋体;">Risk Grade</span>
</strong></span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑,&#39;Microsoft YaHei&#39;;">High Risk</span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑,&#39;Microsoft YaHei&#39;;">&nbsp;</span>
</p>
<p><span style="font-family: 微软雅黑,&#39; Microsoft YaHei&#39;;"><strong><span style="font-size: 16px; font-family: 宋体;">Vulnerability Damage</span>
</strong></span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑,&#39;Microsoft YaHei&#39;;">&nbsp;&nbsp;&nbsp; If there is such vulnerability, the user’s machine may suffer reflection amplification attacks from remote malicious attackers, resulting in your bandwidth being maliciously utilized and attacking other machines, and possibly leading to unnecessary legal risks and economic losses. </span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑,&#39;Microsoft YaHei&#39;;">&nbsp;</span>
</p>
<p><span style="font-family: 微软雅黑,&#39; Microsoft YaHei&#39;;"><strong><span style="font-size: 16px; font-family: 宋体;">Repair Suggestion</span>
</strong></span>
</p>
<p><span style="font-family: 微软雅黑,&#39;Microsoft YaHei&#39;;"><strong><span style="font-size: 16px; font-family: 宋体;">It is recommended to conduct data backup and verification evaluation in advance before the change to avoid unavailability of business by the change</span>
</strong></span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑,&#39;Microsoft YaHei&#39;;">1. Directly disable the RPCBind service: if RPCBind is not used in the business, it can be disabled directly. </span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑,&#39;Microsoft YaHei&#39;;">Ubuntu:</span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑,&#39;Microsoft YaHei&#39;;">(1) Open the terminal and run the following commands, and disable the rpcbind service:</span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑,&#39;Microsoft YaHei&#39;;">sudo systemctl stop rpcbind &amp;&amp; systemctl disable rpcbind</span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑,&#39;Microsoft YaHei&#39;;">(2) Check if the rpcbind service is disabled:</span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑,&#39;Microsoft YaHei&#39;;">netstat -anp | grep rpcbind</span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑,&#39;Microsoft YaHei&#39;;">&nbsp;</span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑,&#39;Microsoft YaHei&#39;;">CentOS 7:</span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑,&#39;Microsoft YaHei&#39;;">(1) Open the terminal and run the following commands:</span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑,&#39;Microsoft YaHei&#39;;">systemctl stop rpcbind &amp;&amp; systemctl disable rpcbind</span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑,&#39;Microsoft YaHei&#39;;">(2) Check if the rpcbindservice is disabled:</span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑,&#39;Microsoft YaHei&#39;;">netstat -anp | grep rpcbind</span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑,&#39;Microsoft YaHei&#39;;">&nbsp;</span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑,&#39;Microsoft YaHei&#39;;">CentOS 6:</span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑,&#39;Microsoft YaHei&#39;;">(1) Open the terminal and run the following commands:</span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑,&#39;Microsoft YaHei&#39;;">/etc/init.d/rpcbind stop</span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑,&#39;Microsoft YaHei&#39;;">(2) Check if the rpcbindservice is disabled:</span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑,&#39;Microsoft YaHei&#39;;">netstat -anp | grep rpcbind</span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑,&#39;Microsoft YaHei&#39;;">&nbsp;</span>
</p>
<p><span style="font-family: 微软雅黑,&#39;Microsoft YaHei&#39;;"><strong><span style="font-size: 16px;">Reference Information</span>
</strong><strong><span style="font-size: 16px;"></span>
</strong></span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑,&#39;Microsoft YaHei&#39;;">(1)<a href="https://www.us-cert.gov/ncas/alerts/TA14-017A" target="_blank" title="https://www.us-cert.gov/ncas/alerts/TA14-017A">https://www.us-cert.gov/ncas/alerts/TA14-017A</a></span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑,&#39;Microsoft YaHei&#39;;">(2)<a href="http://netsecurity.51cto.com/art/201508/489005.htm" target="_blank" title="http://netsecurity.51cto.com/art/201508/489005.htm">http://netsecurity.51cto.com/art/201508/489005.htm</a></span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑,&#39;Microsoft YaHei&#39;;">(3)<a href="http://blog.nsfocus.net/portmapper-ddos-attack" target="_blank" title="http://blog.nsfocus.net/portmapper-ddos-attack">http://blog.nsfocus.net/portmapper-ddos-attack</a></span>
</p>
<p><br/></p>
