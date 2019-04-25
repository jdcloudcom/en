<p>您好，近日 Jenkins官方发布最新安全通告，通报了多个安全漏洞，其中包含一个高危的Jenkins未授权任意文件读取漏洞(CVE-2018-1999002)，该漏洞可能导致服务器敏感文件被攻击者获取，从而对服务器造成进一步危害。</p>
<p>为避免您的业务受影响，京东云安全团队建议您及时开展安全自查，如在受影响范围，请您及时进行更新修复，避免被外部攻击者入侵。</p>
<p><strong>【漏洞详情】</strong></p>
<p>Jenkins使用的Stapler Web框架中存在任意文件读取漏洞。攻击者可以在未经过身份验证的情形下构造恶意请求，从而可以读取Jenkins文件系统中的任意文件。</p>
<p><strong>【风险等级】</strong></p>
<p>高危</p>
<p><strong>【影响版本】</strong></p>
<p>目前已知受影响版本如下：</p>
<p>Jenkins weekly 2.132及此前所有版本</p>
<p>Jenkins LTS 2.121.1及此前所有版本</p>
<p><strong>【修复建议】</strong></p>
<p>建议变更前提前做好数据备份和验证评估，避免变更引起业务不可用。</p>
<p>升级Jenkins weekly至2.133版本。</p>
<p>升级Jenkins LTS至2.121.2版本。</p>
<p>新版本下载地址：<a href="https://jenkins.io/download/" target="_blank" title="https://jenkins.io/download/">https://jenkins.io/download/</a></p>
<p><strong>【参考信息】</strong></p>
<p>官方通告：<a href="https://jenkins.io/security/advisory/2018-07-18/" target="_blank" title="https://jenkins.io/security/advisory/2018-07-18/">https://jenkins.io/security/advisory/2018-07-18/</a></p>
