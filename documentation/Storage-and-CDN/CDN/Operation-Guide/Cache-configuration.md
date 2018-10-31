# **Cache Configuration**

It refers to that the user can set the cache time and cache priority level for different resource types such as images, page files, etc.

Click **Domain Name List**--Select Accelerated Domain Name--**Cache Configuration**

![image.png](https://img1.jcloudcs.com/cms/ce3b1a47-fe29-4d91-affc-01580f6dc87f20180205095621.png)

- Types can be configured according to the resources of "Directory Path" and "File Name Suffix", or enter the special file types in a customized way.

  

- The cache modes fall into no cache and customized cache. The dynamic file is recommended to set as no cache. The rest settings can be customized according to different business forms, such as the cache expiration time and cache policy priority level.

- Cache duration (minutes, hours, days, months, years, fill in integers, up to 2 years)

- Priority level (1-10) (Arrange the priority levels according to the order in case of conflicts; 1 means highest priority)

- Up to 10 cache rules can be configured. After configuring the cache rules, go to the [Refresh Cache](https://www.jdcloud.com/help/detail/2124/isCatalog/1) page to update the cache of files or paths.