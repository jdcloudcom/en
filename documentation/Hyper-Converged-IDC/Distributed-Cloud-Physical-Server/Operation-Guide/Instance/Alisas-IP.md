# Alias IP Ranges

Business use: If your multiple services are running on the same distributed cloud physical server, and you want to assign a different IP address for each service, you can do so using alias IP range feature.

### Glossary
1. Main CIDR: Create a CIDR segment for subnet input, and name it as "Main CIDR".</br>
2. Secondary CIDR: Secondary CIDR (optional) can be added when creating a subnet, and currently only one secondary CIDR is supported to be added for assigning alias IP ranges only.</br>
3. Alias IP Ranges Assignment Source: Alias IP Ranges can be assigned from main CIDR or secondary CIDR.</br>

### Operation Steps
Enter the distributed cloud physical server creation page, add the link of "+ Add Alias IP Range" on the network part, and add alias IP range after clicking the link. The maximum of 50 alias IP ranges can be added for each instance. Details are shown in the figure below:<br/>

![添加别名IP范围](../../Image/create-cps-alisas-ip.png)
If the instance is created, you can continues to add alias IP ranges by clicking **Operation - Add Alias IP Range** bottom. The details are shown in the figure below:<br/>
![添加别名IP按钮操作](../../Image/add-alisas-ip.png)

