<p>Recently, JD Cloud Security team has monitored that some security researchers disclosed a high-risk vulnerability in remote code execution for the full series of version of ECShop. </p>
<p><br/></p>
<p><strong>Vulnerability Details</strong></p>
<p>The template variable of display function in user.php file of ECShop is controllable, resulting in injection. </p>
<p><br/></p>
<p><strong>Risk Level</strong></p>
<p>Severe</p>
<p><br/></p>
<p><strong>Influence Scope</strong></p>
<p>The full series version of ECShop is composed of 2.x, 3.0.x, 3.6.x etc. </p>
<p><br/></p>
<p><strong>Repairing Suggestion</strong></p>
<p>Forced data type conversion is strongly recommended before the official patch update</p>
<p>Modify include/lib_insert.php cast $arr[id] and $arr[num] into int type as the following example: </p>
<pre class="brush:xml;toolbar:false">$arr[id]=intval($arr[id])
&nbsp;&nbsp;&nbsp;&nbsp;$arr[num]=intval($arr[num])</pre><p><br/></p>
