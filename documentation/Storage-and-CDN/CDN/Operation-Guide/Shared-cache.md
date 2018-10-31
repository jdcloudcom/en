**Shared Cache**

Applicable to the cache policy that multiple domain names share one primary domain names; you can add these domain names into a group and enable shared cache function, namely the domain names in the group will share the same cache policy, and reduce back-to-source thereby. For example, the domain name a.com and b.com share the cache policy of a.com; after setting the shared cache, when the user requests b.com, the cache policy of a.com will be returned.

1. Log in to [CDN Console](https://cdn-console.jdcloud.com/overview), open [Domain Name Management](https://cdn-console.jdcloud.com/domainlist), select “[Domain Name Group List](https://cdn-console.jdcloud.com/domainlist?activeName=group)”, and click “Add Domain Name Group” to create a new domain name group.![image.png](https://img1.jcloudcs.com/cms/4091df29-08bc-4beb-80c6-019459f39a1120180403173118.png)

2. Create a new domain name group, you may select the domain name list that needs to share the cache, and set the domain name of which the cache policy is to be shared, namely the primary domain name.

![image.png](https://img1.jcloudcs.com/cms/bf8ba981-0bc3-4334-999b-87918607155c20180426161612.png)

- The extensive domain name, i.e. *.a.com, can also share the cache if it is not used for setting up the domain group. The shared cache configuration can be independently opened in “[Cache Configuration](https://cdn-console.jdcloud.com/detail/cache?id=wshtest.jcloud.com)”, i.e. all sub-domains under *.a.com can request the cache policy under *.a.com, and extensive domain name can also share the cache with other domains when setting up the domain group as an independent one.

![image.png](https://img1.jcloudcs.com/cms/29343df3-6ad9-4753-8746-30c58aba175b20180403183817.png)