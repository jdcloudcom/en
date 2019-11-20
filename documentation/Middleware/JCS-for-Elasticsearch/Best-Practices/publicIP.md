## : Public Network Access
JCS for Elasticsearch does not support public network access to ES instance. If you need to provide external services through direct external access APIs, you can use machine + reverse proxy + security group to set a white list to provide external services.

### Operation Description
1. Log in JD Cloud [Virtual Machine Console](https://cns-console.jdcloud.com/host/compute/list) to create a Virtual Machine being in the same VPC with JCS for Elasticsearch Cluster Instance, and [Associate EIP](https://docs.jdcloud.com/cn/virtual-machines/associate-elastic-ip).</br>
2. Install reverse proxy nginx on Virtual Machines, and configure the address to forward to es Instance. Take the Virtual Machine of CentOS7 System as an example to illustrate how to install nginx and configure reverse proxy. For detailed configuration parameters, please refer to [nginx Document](http://nginx.org/en/docs/configure.html).</br>

```
# yum update      //Update the library and necessary supports

# wget http://nginx.org/download/nginx-1.13.6.tar.gz    //Download nginx

# tar -zvxf nginx-1.13.6.tar.gz     //Decompress

# cd nginx-1.13.6   

# ./configure

# make && make install    //The executable files shall be installed at /usr/sbin/nginx (default configuration)

# cd /usr/local/nginx/sbin/

# ./nginx                     //Enable nginx to configure the file location /usr/local/nginx/conf/nginx.conf
```


3. Go to [Endpoint Security Group](https://cns-console.jdcloud.com/host/netSecurity/list)


Create security group and associate Virtual Machine [Associate Virtual Machines](https://docs.jdcloud.com/cn/virtual-machines/associate-security-group)

The Security Group of Virtual Machine is all prohibited by default, so the white list of [Input Traffic Rules](https://docs.jdcloud.com/cn/virtual-machines/configurate-inbound-rules) and [Output Traffic Rules](https://docs.jdcloud.com/cn/virtual-machines/configurate-outbound-rules) need to be set in the Security Group Details. Upon completion, you can access the JCS for Elasticsearch cluster instance through the machine as an agent.

![查询1](https://github.com/jdcloudcom/cn/blob/Elasticsearch/image/Internet-Middleware/JCS%20for%20Elasticsearch/public1.png)

![查询1](https://github.com/jdcloudcom/cn/blob/Elasticsearch/image/Internet-Middleware/JCS%20for%20Elasticsearch/public2.png)
