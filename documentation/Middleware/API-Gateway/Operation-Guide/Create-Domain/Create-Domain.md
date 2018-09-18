# Customize Domain Names

API gateway offers the domain name association based on API group. The API gateway locates to an unique API group through the domain name, and then determines the unique API through the Path+HTTPMethod. The independent domain name requires to satisfy with following points:
- The independent domain name is analyzed to secondary domain name of this group by CNAME and then associate. Analyze and then associate, otherwise impossible to be associated.
- One domain name can only be associated to one group.
- Each group supports to associate 5 domains at most. For increase, please apply via work order.
- The domain name can be associated successfully only after recorded.
- The customized domain names support online environment only, other environments (test, pre-publish) not.



## Process of Adding New Customized Domain Name
### Operation Steps:
#### STEP1: enter the page of API group details, click customize domain name **Tab**.

![Domain list](https://github.com/jdcloudcom/en/blob/edit/image/Internet-Middleware/API-Gateway/zdyym-list.png)

#### STEP2: Click **Add New Domain name** to add a new one. Currently each group supports to associate 5 customized domain names at most.

![Domain list](https://github.com/jdcloudcom/en/blob/edit/image/Internet-Middleware/API-Gateway/zdyym-add.png)




