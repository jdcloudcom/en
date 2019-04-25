<p style=";margin-bottom:0;line-height:24px;background:white"><span style="font-size:14px;font-family:&#39;microsoft yahei&#39;,&#39;serif&#39;;color:#373D41">2018</span>
<span style="font-size:14px;color:#373D41">年</span>
<span style="font-size:14px;font-family:&#39;microsoft yahei&#39;,&#39;serif&#39;;color:#373D41">12</span>
<span style="font-size:14px;color:#373D41">月</span>
<span style="font-size:14px;font-family:&#39;microsoft yahei&#39;,&#39;serif&#39;;color:#373D41">10</span>
<span style="font-size:14px;color:#373D41">日，京东云安全团队监测</span>
<span style="font-size:14px;font-family:&#39;microsoft yahei&#39;,&#39;serif&#39;;color:#373D41">ThinkPHP</span>
<span style="font-size:14px;color:#373D41">官方发布安全更新，披露了一个高危安全漏洞，攻击者可以低成本远程执行命令，受影响的版本为：</span>
<span style="font-size:14px;font-family:&#39;microsoft yahei&#39;,&#39;serif&#39;;color:#373D41">5.0</span>
<span style="font-size:14px;color:#373D41">和</span>
<span style="font-size:14px;font-family:&#39;microsoft yahei&#39;,&#39;serif&#39;;color:#373D41">5.1</span>
<span style="font-size:14px;color:#373D41">。</span>
</p>
<p style=";margin-bottom:0;line-height:24px;background:white"><span style="font-size:14px;font-family:&#39;microsoft yahei&#39;,&#39;serif&#39;;color:#373D41">&nbsp;</span>
</p>
<p style=";margin-bottom:0;line-height:24px;background:white"><strong><span style="font-size: 14px;font-family: 宋体;color: rgb(102, 102, 102)">【漏洞详情】</span>
</strong></p>
<p style=";margin-bottom:0;line-height:24px;background:white"><span style="font-size:14px;color:#373D41">由于</span>
<span style="font-size: 14px;font-family:&#39;microsoft yahei&#39;,&#39;serif&#39;;color:#373D41"> ThinkPHP </span>
<span style="font-size:14px;color:#373D41">框架对控制器名没有进行足够严格的检测，导致在没有开启强制路由的情况下，攻击者可以在服务端执行任意恶意代码。</span>
</p>
<p style=";margin-bottom:0;line-height:24px;background:white"><span style="font-size:14px;font-family:&#39;microsoft yahei&#39;,&#39;serif&#39;;color:#373D41">&nbsp;</span>
</p>
<p style=";margin-bottom:0;line-height:24px;background:white"><strong><span style="font-size: 14px;font-family: 宋体;color: rgb(102, 102, 102)">【风险等级】</span>
</strong></p>
<p style=";margin-bottom:0;line-height:24px;background:white"><span style="font-size:14px;color:#373D41">严重</span>
</p>
<p style=";margin-bottom:0;line-height:24px;background:white"><span style="font-size:14px;font-family:&#39;microsoft yahei&#39;,&#39;serif&#39;;color:#373D41">&nbsp;</span>
</p>
<p style=";margin-bottom:0;line-height:24px;background:white"><strong><span style="font-size:14px;font-family:宋体;color:#373D41">【影响范围】</span>
</strong></p>
<p style=";margin-bottom:0;line-height:24px;background:white"><span style="font-size:14px;font-family:&#39;microsoft yahei&#39;,&#39;serif&#39;;color:#373D41">ThinkPHP 5.0</span>
<span style="font-size:14px;color:#373D41">系列</span>
<span style="font-size:14px;font-family:&#39;microsoft yahei&#39;,&#39;serif&#39;;color:#373D41"> &lt; 5.0.23</span>
</p>
<p style=";margin-bottom:0;line-height:24px;background:white"><span style="font-size:14px;font-family:&#39;microsoft yahei&#39;,&#39;serif&#39;;color:#373D41">ThinkPHP 5.1</span>
<span style="font-size:14px;color:#373D41">系列</span>
<span style="font-size:14px;font-family:&#39;microsoft yahei&#39;,&#39;serif&#39;;color:#373D41"> &lt; 5.1.31</span>
</p>
<p style=";margin-bottom:0;line-height:24px;background:white"><span style="font-size:14px;font-family:&#39;microsoft yahei&#39;,&#39;serif&#39;;color:#373D41">&nbsp;</span>
</p>
<p style=";margin-bottom:0;line-height:24px;background:white"><strong><span style="font-size:14px;font-family:宋体;color:#373D41">【修复建议】</span>
</strong></p>
<p style=";margin-bottom:0;line-height:24px;background:white"><span style="font-size:14px;color:#373D41">升级</span>
<span style="font-size: 14px;font-family:&#39;microsoft yahei&#39;,&#39;serif&#39;;color:#373D41">ThinkPHP</span>
<span style="font-size:14px;color:#373D41">至安全版本</span>
</p>
<p style=";margin-bottom:0;line-height:24px;background:white"><span style="font-size:14px;font-family:&#39;microsoft yahei&#39;,&#39;serif&#39;;color:#373D41">&nbsp;</span>
</p>
<p style=";margin-bottom:0;line-height:24px;background:white"><strong><span style="font-size:14px;font-family:宋体;color:#373D41">【缓解建议】</span>
</strong></p>
<p style=";margin-bottom:0;line-height:24px;background:white"><span style="font-size:14px;color:#373D41">如果暂时无法更新到最新版本，请开启强制路由并添加相应未定义路由，或者参考</span>
<span style="font-size:14px;font-family:&#39;microsoft yahei&#39;,&#39;serif&#39;;color:#373D41"> commit </span>
<span style="font-size:14px;color:#373D41">的修改增加相关代码。</span>
</p>
<p style=";margin-bottom:0;line-height:24px;background:white"><span style="font-size:14px;font-family:&#39;microsoft yahei&#39;,&#39;serif&#39;;color:#373D41">&nbsp;</span>
</p>
<p style=";margin-bottom:0;line-height:24px;background:white"><strong><span style="font-size:14px;font-family:宋体;color:#373D41">【参考链接】</span>
</strong></p>
<p style=";margin-bottom:0;line-height:24px;background:white"><a href="https://blog.thinkphp.cn/869075" target="_blank"><span style="font-size:14px;font-family:&#39;microsoft yahei&#39;,&#39;serif&#39;;color:#00B7D3">https://blog.thinkphp.cn/869075</span>
</a></p>
<p><br/></p>
