# White List Setting 

1. Log in to [Redis Console](https://redis-console.jdcloud.com/redis)

2. Select the target instance and click **Instance Name** to enter the Details of the instance

3. Click **White List Setting** tag and enter the white list setting page

- The white list default value is 0.0.0.0/0, representing that all IPs can be accessed and users can modified them based on requirements

![白名单1](https://github.com/jdcloudcom/cn/blob/master/image/Redis/whitelist1.png)

- Click **Edit** button and enter the edition and modification page (Note: If an IP white list is set as 0.0.0.0/0, representing that all addresses are allowed to be accessed; all addresses are prohibited to be accessed only when the IP white list is set as 127.0.0.1.)

![白名单2](https://github.com/jdcloudcom/cn/blob/master/image/Redis/whitelist2.png)

Multiple IPs shall be separated by English comma when set to avoid replicated setting. After setting, click **Save** to take effect

