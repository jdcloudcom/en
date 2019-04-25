<p style="text-indent: 32px;background: white"><span style="font-family: 微软雅黑, &quot;Microsoft YaHei&quot;; color: rgb(55, 61, 65); font-size: 14px;">您好，近日京东云安全团队检测到&nbsp;Apache HTTP Server 组件被披露存在本地提权漏洞（漏洞编号：CVE-2019-0211）被披露存在多个漏洞，攻击者可利用该漏洞上传恶意 CGI 脚本造成目标系统的提升root权限攻击</span>
</p>
<p style="text-indent: 32px;background: white"><span style="color: rgb(102, 102, 102); font-family: 微软雅黑, &quot;Microsoft YaHei&quot;; font-size: 14px;">京东云安全团队建议您及时开展安全自查，如在受影响范围，请您及时进行更新修复，避免被外部攻击者入侵。</span>
</p>
<p style="text-indent: 32px;background: white"><span style="font-size: 16px;"><strong style="font-family: 微软雅黑, &quot;Microsoft YaHei&quot;; text-indent: 30px;">漏洞描述</strong></span>
</p>
<p style="background: white"><span style="font-family: 微软雅黑, &quot;Microsoft YaHei&quot;; font-size: 12px; color: rgb(55, 61, 65);">&nbsp; &nbsp; &nbsp; &nbsp;Apache HTTP Server 版本 2.4.17～2.4.38 ，以权限较低的子进程或线程中执行代码时，可以通过操纵 scoreboard 来进行权限提升至父进程的权限（通常是 &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;root），非Unix系统不受漏洞影响。</span>
</p>
<p style="text-indent: 30px;background: white"><span style="font-family: 微软雅黑, &quot;Microsoft YaHei&quot;; font-size: 16px;"><strong><span style="font-family: 微软雅黑, &quot;Microsoft YaHei&quot;;">风险等级</span>
</strong></span>
</p>
<p style="text-indent: 30px;background: white"><span style="color: rgb(102, 102, 102); font-family: 微软雅黑, &quot;Microsoft YaHei&quot;; font-size: 14px;">高风险</span>
</p>
<p style="text-indent: 30px;background: white"><span style="font-family: 微软雅黑, &quot;Microsoft YaHei&quot;; font-size: 16px;"><strong><span style="font-family: 微软雅黑, &quot;Microsoft YaHei&quot;;">受影响范围</span>
</strong></span>
</p>
<p style="text-indent: 30px;background: white"><span style="font-family: 微软雅黑, &quot;Microsoft YaHei&quot;; font-size: 12px; color: rgb(55, 61, 65);">Unix系统下Apache HTTP Server 版本 2.4.17～2.4.38</span>
</p>
<p style="text-indent: 30px;background: white"><span style="font-family: 微软雅黑, &quot;Microsoft YaHei&quot;; font-size: 16px;"><strong><span style="font-family: 微软雅黑, &quot;Microsoft YaHei&quot;;">安全建议</span>
</strong></span>
</p>
<p style="text-indent: 30px;background: white"><span style="font-family: 微软雅黑, &quot;Microsoft YaHei&quot;; font-size: 14px;"><span style="font-family: 微软雅黑, &quot;Microsoft YaHei&quot;; color: rgb(102, 102, 102);">升级</span>
<span style="font-family: 微软雅黑, &quot;Microsoft YaHei&quot;; color: rgb(55, 61, 65);">Apache HTTP Server 版本 2.4.39及以上</span>
</span>
</p>
<p style="text-indent: 30px;background: white"><span style="font-family: 微软雅黑, &quot;Microsoft YaHei&quot;; font-size: 16px;"><strong><span style="font-family: 微软雅黑, &quot;Microsoft YaHei&quot;;">参考链接</span>
</strong></span>
</p>
<p><span style="font-size:14px;font-family: &#39;Calibri&#39;,&#39;sans-serif&#39;"><span style=";font-family:&#39;microsoft yahei&#39;,&#39;serif&#39;;color:#00B7D3;background:white">&nbsp; &nbsp; &nbsp; &nbsp;<a href="https://httpd.apache.org/security/vulnerabilities_24.html#CVE-2019-0211" target="_self">https://httpd.apache.org/security/vulnerabilities_24.html#CVE-2019-0211</a></span>
</span>
</p>
<p><br/></p>
