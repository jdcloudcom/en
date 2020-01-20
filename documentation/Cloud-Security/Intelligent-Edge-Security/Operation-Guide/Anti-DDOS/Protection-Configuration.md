# Network Layer Protection

During network layer protection, you can configure accurate IAM rules to limit speed, filter by data package length, block access to specified region IP and block or release specified IP access requests, i.e., set IP black lists/white lists which are only effective to all domains configured.

**Operation Steps**

Configure network layer protection rules by referring to the following steps:

1. Log in JD Cloud Intelligent Edge Security Console.

2. Click **Network Layer Protection**.

3. Enable the network layer protection switch.
![网络层防护开关](/image/Intelligent-Edge-Security/网络层防护开关.png)

4. Click **Setting Rules** and set specific rules.

![网络层防护规则设置](/image/Intelligent-Edge-Security/网络层防护规则设置.png)

## Configuration Description

1. Maximum 429,672,956 source creation connections are supported per second;
2. Maximum 429,672,956 target creation connections are supported per second;
3. Maximum 1,500Byte package length filtering is supported;
2. Respectively 50 IP black lists/white lists can be configured;
2. IP black lists/white lists are the unified global settings, which shall come into force at the same time;
3. Black lists/white lists support configuration of IP or IP/mask and support configuration of masks /8, /16, /24 and /32;
4. Repeated configuration of black lists and white lists is not allowed. In other words, the same IP (segment) shall only serve as the black list or the white list;
5. If the white list and black list are in the inclusion relation, the white list shall have the higher priority. For example, if the black list is 100.10.10.1/24 and the white list is 100.10.10.1, then 100.10.10.1 shall come into force as the white list.
