<p style="text-indent: 32px;background: white"><span style="font-family: 微软雅黑, &quot;Microsoft YaHei&quot;; color: rgb(102, 102, 102);">近日京东云安全团队检测到Kubernetes被披露存在多个漏洞。</span>
</p>
<p style="text-indent: 32px;background: white"><span style="color: rgb(102, 102, 102); font-family: 微软雅黑, &quot;Microsoft YaHei&quot;;">京东云安全团队建议您及时开展安全自查，如在受影响范围，请您及时进行更新修复，避免被外部攻击者入侵。</span>
</p>
<p style="text-indent: 32px;background: white"><span style=";font-family:&#39;Segoe UI&#39;,&#39;sans-serif&#39;;color:#666666">&nbsp;</span>
</p>
<p style="text-indent: 30px;background: white"><strong><span style="font-family: 宋体">漏洞描述</span>
</strong></p>
<p class="MsoListParagraph" style="margin-left: 58px;background: white"><span style="font-family: 微软雅黑, &quot;Microsoft YaHei&quot;; color: rgb(102, 102, 102);">l<span style="font-variant-numeric: normal; font-stretch: normal; font-size: 9px; line-height: normal;">&nbsp; </span>
CVE-2019-1002100：拥有补丁权限的恶意用户通过发送特定超长的“json-patch”补丁请求(例如kubectl patch -type json或&quot;Content-Type: application/json-patch+json&quot;)，会导致Kubernetes API服务器CPU资源耗尽而拒绝服务。</span>
</p>
<p class="MsoListParagraph" style="margin-left: 58px;background: white"><span style="font-family: 微软雅黑, &quot;Microsoft YaHei&quot;;"><span style="font-family: Wingdings; color: rgb(102, 102, 102);">l<span style="font-variant-numeric: normal; font-stretch: normal; font-size: 9px; line-height: normal; font-family: &quot;Times New Roman&quot;;">&nbsp; </span>
</span>
<span style="font-family: &quot;Segoe UI&quot;, sans-serif; color: rgb(102, 102, 102);">CVE-2019-1002101</span>
<span style="font-family: 宋体; color: rgb(102, 102, 102);">：为</span>
<span style="font-family: &quot;Segoe UI&quot;, sans-serif; color: rgb(102, 102, 102);"> kubectl cp </span>
<span style="font-family: 宋体; color: rgb(102, 102, 102);">命令存在的安全漏洞，攻击者可使用</span>
<span style="font-family: &quot;Segoe UI&quot;, sans-serif; color: rgb(102, 102, 102);"> kubectl cp </span>
<span style="font-family: 宋体; color: rgb(102, 102, 102);">命令替换或删除用户工作站上的文件，在用户计算机的任何路径上写入恶意文件。</span>
</span>
</p>
<p class="MsoListParagraph" style="margin-left: 58px;background: white"><span style="font-family: 微软雅黑, &quot;Microsoft YaHei&quot;;"><span style="font-family: Wingdings; color: rgb(102, 102, 102);">l<span style="font-variant-numeric: normal; font-stretch: normal; font-size: 9px; line-height: normal; font-family: &quot;Times New Roman&quot;;">&nbsp; </span>
</span>
<span style="font-family: &quot;Segoe UI&quot;, sans-serif; color: rgb(102, 102, 102);">CVE-2019-9946</span>
<span style="font-family: 宋体; color: rgb(102, 102, 102);">：为</span>
<span style="font-family: &quot;Segoe UI&quot;, sans-serif; color: rgb(102, 102, 102);"> Kubernetes CNI </span>
<span style="font-family: 宋体; color: rgb(102, 102, 102);">框架中的安全漏洞，</span>
<span style="font-family: &quot;Segoe UI&quot;, sans-serif; color: rgb(102, 102, 102);">0.7.5</span>
<span style="font-family: 宋体; color: rgb(102, 102, 102);">之前版本的</span>
<span style="font-family: &quot;Segoe UI&quot;, sans-serif; color: rgb(102, 102, 102);"> CNI </span>
<span style="font-family: 宋体; color: rgb(102, 102, 102);">插件端口映射和</span>
<span style="font-family: &quot;Segoe UI&quot;, sans-serif; color: rgb(102, 102, 102);"> Kubernetes </span>
<span style="font-family: 宋体; color: rgb(102, 102, 102);">之间的交互中发现了安全问题。由于</span>
<span style="font-family: &quot;Segoe UI&quot;, sans-serif; color: rgb(102, 102, 102);"> CNI </span>
<span style="font-family: 宋体; color: rgb(102, 102, 102);">端口映射插件默认嵌入到</span>
<span style="font-family: &quot;Segoe UI&quot;, sans-serif; color: rgb(102, 102, 102);"> Kubernetes </span>
<span style="font-family: 宋体; color: rgb(102, 102, 102);">组件中，因而只有升级至新版本的</span>
<span style="font-family: &quot;Segoe UI&quot;, sans-serif; color: rgb(102, 102, 102);"> Kubernetes </span>
<span style="font-family: 宋体; color: rgb(102, 102, 102);">才能解决此问题。</span>
</span>
</p>
<p style="text-indent: 30px;background: white"><strong><span style="font-family: 宋体">风险等级</span>
</strong></p>
<p style="text-indent: 30px;background: white"><span style=";font-family:宋体;color:#666666">&nbsp; <span style="color: rgb(102, 102, 102); font-family: 微软雅黑, &quot;Microsoft YaHei&quot;;">高风险</span>
</span>
</p>
<p style="text-indent: 30px;background: white"><strong><span style="font-family: 宋体">受影响范围</span>
</strong></p>
<p style="text-indent: 30px;background: white"><span style=";font-family:&#39;Segoe UI&#39;,&#39;sans-serif&#39;;color:#666666">&nbsp; &nbsp; </span>
<span style="font-family: 微软雅黑, &quot;Microsoft YaHei&quot;; color: rgb(102, 102, 102);">&nbsp; CVE-2019-1002100：Kubernetes v1.0.x-1.10.x、Kubernetes v1.11.0-1.11.7、Kubernetes v1.12.0-1.12.5、 &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;Kubernetes &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;v1.13.0-1.13.3</span>
</p>
<p style="text-indent: 30px;background: white"><span style="font-family: 微软雅黑, &quot;Microsoft YaHei&quot;;"><span style="font-family: &quot;Segoe UI&quot;, sans-serif; color: rgb(102, 102, 102);">&nbsp;&nbsp; CVE-2019-1002101</span>
<span style="font-family: 宋体; color: rgb(102, 102, 102);">：除</span>
<span style="font-family: &quot;Segoe UI&quot;, sans-serif; color: rgb(102, 102, 102);"> Kubernetes 1.11.9</span>
<span style="font-family: 宋体; color: rgb(102, 102, 102);">、</span>
<span style="font-family: &quot;Segoe UI&quot;, sans-serif; color: rgb(102, 102, 102);">1.12.7</span>
<span style="font-family: 宋体; color: rgb(102, 102, 102);">、</span>
<span style="font-family: &quot;Segoe UI&quot;, sans-serif; color: rgb(102, 102, 102);">1.13.5</span>
<span style="font-family: 宋体; color: rgb(102, 102, 102);">、</span>
<span style="font-family: &quot;Segoe UI&quot;, sans-serif; color: rgb(102, 102, 102);">1.14.0 </span>
<span style="font-family: 宋体; color: rgb(102, 102, 102);">或更新版本之外的其他版本</span>
</span>
</p>
<p style="text-indent: 30px;background: white"><span style="font-family: 微软雅黑, &quot;Microsoft YaHei&quot;;"><span style="font-family: &quot;Segoe UI&quot;, sans-serif; color: rgb(102, 102, 102);">&nbsp;&nbsp; CVE-2019-9946</span>
<span style="font-family: 宋体; color: rgb(102, 102, 102);">：除</span>
<span style="font-family: &quot;Segoe UI&quot;, sans-serif; color: rgb(102, 102, 102);"> Kubernetes 1.11.9</span>
<span style="font-family: 宋体; color: rgb(102, 102, 102);">、</span>
<span style="font-family: &quot;Segoe UI&quot;, sans-serif; color: rgb(102, 102, 102);">1.12.7</span>
<span style="font-family: 宋体; color: rgb(102, 102, 102);">、</span>
<span style="font-family: &quot;Segoe UI&quot;, sans-serif; color: rgb(102, 102, 102);">1.13.5</span>
<span style="font-family: 宋体; color: rgb(102, 102, 102);">、</span>
<span style="font-family: &quot;Segoe UI&quot;, sans-serif; color: rgb(102, 102, 102);">1.14.0 </span>
<span style="font-family: 宋体; color: rgb(102, 102, 102);">或更新版本之外的其他版本</span>
 <span style="font-family: 宋体; color: rgb(102, 102, 102);">，且</span>
<span style="font-family: &quot;Segoe UI&quot;, sans-serif; color: rgb(102, 102, 102);"> Kubernetes </span>
<span style="font-family: 宋体; color: rgb(102, 102, 102);">与使用了 &nbsp; &nbsp;端口映射插件的</span>
<span style="font-family: &quot;Segoe UI&quot;, sans-serif; color: rgb(102, 102, 102);">CNI</span>
<span style="font-family: 宋体; color: rgb(102, 102, 102);">配置配对</span>
</span>
</p>
<p style="text-indent: 30px;background: white"><strong><span style="font-family: 宋体">安全建议</span>
</strong></p>
<p style="text-indent: 30px;background: white"><span style="font-family: 微软雅黑, &quot;Microsoft YaHei&quot;; color: rgb(102, 102, 102);">升级Kubernetes至安全版本。</span>
</p>
<p style="text-indent: 30px;background: white"><strong><span style="font-family: 宋体">参考链接</span>
</strong></p>
<p style="text-indent: 28px">&nbsp; &nbsp; &nbsp; 1.https://github.com/kubernetes/kubernetes/issues/74534</p>
<p style="text-indent: 28px">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;2.https://discuss.kubernetes.io/t/announce-security-release-of-kubernetes-kubectl-potential-directory-traversal-releases-1-11- &nbsp; &nbsp; &nbsp; &nbsp; 9-1-12-7- &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 1-13-5-and-1-14-0-cve-2019-1002101/5712</p>
<p style="text-indent: 28px">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 3.&nbsp;https://mp.weixin.qq.com/s/JIxSKbVTZn1v2kqgRPCljg</p>
<p>&nbsp;</p>
