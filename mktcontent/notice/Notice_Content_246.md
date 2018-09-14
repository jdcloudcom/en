<p>您好，近日京东云安全团队监测到Ghostscript远程命令执行漏洞。为避免您的业务受影响，建议您及时开展安全自查，如在受影响范围，请您及时进行更新修复，避免被外部攻击者入侵。</p>
<p><br/></p>
<p><strong>【漏洞详情】</strong></p>
<p>Ghostscript是Adobe PostScript和PDF的解释语言。该漏洞同时影响使用了 GhostScript 的通用图片处理库，如 ImageMagick、Python PIL及使用到使用到GhostScript的web应用。</p>
<p><br/></p>
<p><strong>【风险等级】</strong></p>
<p>严重</p>
<p><br/></p>
<p><strong>【修复建议】</strong></p>
<p>1.卸载ghostscript。</p>
<p>2.针对使用ImageMagick的用户</p>
<p>修改/etc/ImageMagick/policy.xml ，在<policymap>部分添加配置:</policymap></p>
<pre class="brush:html;toolbar:false">&nbsp;&lt;policymap&gt;
&nbsp;&nbsp;&lt;policy&nbsp;domain=&quot;coder&quot;&nbsp;rights=&quot;none&quot;&nbsp;pattern=&quot;PS&quot;&nbsp;&gt;&nbsp;&lt;/policy&nbsp;&gt;
&nbsp;&nbsp;&lt;policy&nbsp;domain=&quot;coder&quot;&nbsp;rights=&quot;none&quot;&nbsp;pattern=&quot;EPS&quot;&gt;&nbsp;&lt;/policy&nbsp;&gt;
&nbsp;&nbsp;&lt;policy&nbsp;domain=&quot;coder&quot;&nbsp;rights=&quot;none&quot;&nbsp;pattern=&quot;PDF&quot;&gt;&nbsp;&lt;/policy&nbsp;&gt;
&nbsp;&nbsp;&lt;policy&nbsp;domain=&quot;coder&quot;&nbsp;rights=&quot;none&quot;&nbsp;pattern=&quot;XPS&quot;&gt;&nbsp;&lt;/policy&nbsp;&gt;
&lt;/policymap&gt;</pre><p><policymap><br/></policymap></p>
<p><strong>【参考信息】</strong></p>
<p>参考资料：<a href="http://openwall.com/lists/oss-security/2018/08/21/2" target="_blank" title="http://openwall.com/lists/oss-security/2018/08/21/2">http://openwall.com/lists/oss-security/2018/08/21/2</a></p>
<p><br/></p>
