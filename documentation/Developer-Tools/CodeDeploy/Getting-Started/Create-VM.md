## Create VM Instance

Create VM instance in the region: cn-north-1 with specific information as below:

- Creation method: Create customized instance
- Image: Official CentOS CentOS 7.4 64-bit
- Specification: General 1c4g
- Storage: Default option
- Network: Select the existed VPC and subnet and select the default security group to allow all traffic
- Bandwidth: Need to purchase EIP
- Basic information: Fill in machine name and password. The machine name to be filled in here shall be: codedeploy-demo01

![Alt text](https://github.com/jdcloudcom/cn/blob/codedeploy/image/CodeDeploy/starting1.png)
![Alt text](https://github.com/jdcloudcom/cn/blob/codedeploy/image/CodeDeploy/starting2.png)


Click **Buy Now** to Create VM instance as per the selected Specification.

![Alt text](https://github.com/jdcloudcom/cn/blob/codedeploy/image/CodeDeploy/starting3.png)


Next, install Agent for deployment in this Virtual Machine by root user:

```
# cn-north-1
wget -c http://devops-hb.oss-internal.cn-north-1.jcloudcs.com/ifrit/ifrit-agent-external-v0.01.403.a81f9eb.20181127121007.bin -O installer && sh installer -- -a zero-agent  /usr/local/share/jdcloud/ifrit && rm -f installer
```

The execution results are as follows:

![Alt text](https://github.com/jdcloudcom/cn/blob/codedeploy/image/CodeDeploy/starting7.png)

Next, install JDK

```
yum -y install java-1.7.0-openjdk*
```

Execute java -version visibility:

![Alt text](https://github.com/jdcloudcom/cn/blob/codedeploy/image/CodeDeploy/starting11.png)
