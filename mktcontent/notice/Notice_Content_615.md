<p><span style="text-indent: 28px; font-family: 微软雅黑, &quot;Microsoft YaHei&quot;;">您好，近日京东云安全团队检测到Ubuntu包管理软件Snap组件被披露存在 本地提权漏洞（漏洞编号：CVE-2019-7304），利用该漏洞，攻击者在主机本地从普通用户权限提升到Root权限。（京东云镜像不受该漏洞影响）。</span>
</p>
<p style="text-indent: 28px"><span style="font-family: 微软雅黑, &quot;Microsoft YaHei&quot;;"><span style="font-size: 16px; font-family: 宋体;">&nbsp;</span>
<span style="font-family: 宋体;">京东云安全团队建议您及时开展安全自查，如在受影响范围，请您及时进行更新修复，避免被外部攻击者入侵。</span>
</span>
</p>
<p style="text-indent: 28px"><span style="font-size: 16px; font-family: 微软雅黑, &quot;Microsoft YaHei&quot;;">&nbsp;</span>
</p>
<p><span style="font-family: 微软雅黑, &quot;Microsoft YaHei&quot;;"><strong><span style="font-size: 16px; font-family: 宋体;">【漏洞详情】</span>
</strong></span>
</p>
<p><span style="font-family: 微软雅黑, &quot;Microsoft YaHei&quot;;">&nbsp; 利用该漏洞可以让普通用户伪装成root用户向snapd提供的REST API发送请求。攻击者利用精心构造的安装脚本或Ubuntu SSO可以让并不具有sudo权限的普通用户获得执行sudo的权限，从而获得提升到root用户权限的能力，达到本地提权的效果。</span>
</p>
<p><span style="font-family: 微软雅黑, &quot;Microsoft YaHei&quot;;"><strong><span style="font-size: 16px; font-family: 宋体;">【风险等级】</span>
</strong></span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑, &quot;Microsoft YaHei&quot;;">中危</span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑, &quot;Microsoft YaHei&quot;;">&nbsp;</span>
</p>
<p><span style="font-family: 微软雅黑, &quot;Microsoft YaHei&quot;;"><strong><span style="font-size: 16px; font-family: 宋体;">【受影响版本】</span>
</strong></span>
</p>
<p><span style="font-family: 微软雅黑, &quot;Microsoft YaHei&quot;;">Snap&nbsp;2.28到2.37版本受影响。&nbsp; &nbsp;&nbsp;&nbsp;</span>
</p>
<p><span style="font-family: 微软雅黑, &quot;Microsoft YaHei&quot;;">Snap会安装在部分Ubuntu版本系统中，目前已知以下版本受影响：&nbsp; &nbsp; &nbsp;</span>
</p>
<p><span style="font-family: 微软雅黑, &quot;Microsoft YaHei&quot;;">Ubuntu 18.04 LTS</span>
</p>
<p><span style="font-family: 微软雅黑, &quot;Microsoft YaHei&quot;;">Ubuntu 16.04 LTS&nbsp; &nbsp; &nbsp;</span>
</p>
<p><span style="font-family: 微软雅黑, &quot;Microsoft YaHei&quot;;">Ubuntu 14.04 LTS</span>
</p>
<p><span style="font-family: 微软雅黑, &quot;Microsoft YaHei&quot;;"><strong><span style="font-size: 16px;"><strong style="font-family: 微软雅黑, &quot;Microsoft YaHei&quot;; white-space: normal;"><span style="font-family: 宋体;">【排查方法】</span>
</strong></span>
</strong><strong><span style="font-size: 16px;"></span>
</strong></span>
</p>
<p style="text-indent:32px"><span style="font-family: 微软雅黑, &quot;Microsoft YaHei&quot;;">通过运行“snap verison&quot;或&quot;snap --version”命令，检查当前snapd版本是否为&nbsp;2.37.1 版本或更高版本，如果是，则不受影响。</span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑, &quot;Microsoft YaHei&quot;;">&nbsp;</span>
</p>
<p><span style="font-family: 微软雅黑, &quot;Microsoft YaHei&quot;;"><strong><span style="font-size: 16px; font-family: 宋体;"><strong style="font-family: 微软雅黑, &quot;Microsoft YaHei&quot;; white-space: normal;"><strong><span style="font-family: 宋体;">【修复建议】</span>
</strong></strong></span>
</strong></span>
</p>
<p><span style="font-family: 微软雅黑, &quot;Microsoft YaHei&quot;;">目前漏洞细节已经披露，官方也在2.37.1中予以修复。Ubuntu用户可以通过apt update &amp;&amp; apt-get install snap ,将snap升级至最新版本予以修复。</span>
</p>
<p><span style="font-family: 微软雅黑, &quot;Microsoft YaHei&quot;;">&nbsp;<strong>参考连接：</strong>&nbsp; &nbsp;&nbsp;</span>
</p>
<p><span style="font-family: 微软雅黑, &quot;Microsoft YaHei&quot;;">&nbsp;[1]官方通告：</span>
<a href="https://usn.ubuntu.com/3887-1/" target="_blank" style="font-family: 微软雅黑, &quot;Microsoft YaHei&quot;; text-decoration: underline;"><span style="font-family: 微软雅黑, &quot;Microsoft YaHei&quot;;">https://usn.ubuntu.com/3887-1/</span>
</a><span style="font-family: 微软雅黑, &quot;Microsoft YaHei&quot;;">&nbsp; &nbsp;&nbsp;</span>
</p>
<p><span style="font-family: 微软雅黑, &quot;Microsoft YaHei&quot;;">&nbsp;[2]漏洞细节：</span>
<a href="https://shenaniganslabs.io/2019/02/13/Dirty-Sock.html" target="_blank" style="font-family: 微软雅黑, &quot;Microsoft YaHei&quot;; text-decoration: underline;"><span style="font-family: 微软雅黑, &quot;Microsoft YaHei&quot;;">https://shenaniganslabs.io/2019/02/13/Dirty-Sock.html</span>
</a><span style="font-family: 微软雅黑, &quot;Microsoft YaHei&quot;;">&nbsp;</span>
</p>
<p><span style="font-size: 16px; font-family: 微软雅黑, &quot;Microsoft YaHei&quot;;">&nbsp;</span>
</p>
<p style="text-align:right;background:white"><span style="color: rgb(102, 102, 102); font-family: 微软雅黑, &quot;Microsoft YaHei&quot;;">京东云安全团队</span>
</p>
<p><br/></p>
