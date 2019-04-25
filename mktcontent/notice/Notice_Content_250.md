<p>近日京东云安全团队监测到监测到有安全研究人员披露了一个ECShop全系列版本远程代码执行高危漏洞。</p>
<p><br/></p>
<p><strong>【漏洞详情】</strong></p>
<p>ECShop的user.php文件中的display函数的模版变量可控，导致注入。</p>
<p><br/></p>
<p><strong>【风险等级】</strong></p>
<p>严重</p>
<p><br/></p>
<p><strong>【影响范围】</strong></p>
<p>ECShop全系列版本，包括2.x,3.0.x,3.6.x等</p>
<p><br/></p>
<p><strong>【修复建议】</strong></p>
<p>官方补丁更新之前建议强转数据类型</p>
<p>修改include/lib_insert.php，将$arr[id]和$arr[num]强制转换成int型，如下示例：</p>
<pre class="brush:xml;toolbar:false">$arr[id]=intval($arr[id])
&nbsp;&nbsp;&nbsp;&nbsp;$arr[num]=intval($arr[num])</pre><p><br/></p>
