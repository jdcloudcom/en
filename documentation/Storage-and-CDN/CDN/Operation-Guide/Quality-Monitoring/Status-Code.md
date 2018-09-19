# **Status Code**

Obtain status code information based on the user access log and collect statistics as one of the monitoring indicators of the user request status.

Log in to [CDN Console](https://cdn-console.jdcloud.com/statuscode), click **Quality Monitoring**--**Status Code** on the left menu bar to enter the status code page. The details are as follows:

![image.png](https://img1.jcloudcs.com/cms/30ba8afb-1831-4920-b69e-252470d64ad520180119140545.png)

- The status code is displayed in a minimum granularity of 5 minutes. Parameters:

OK(206，200)

Not-Modified(304)

Not-Found(404)

Redirect(301,302)

Permission(403,401)

Server Error(500.501,502,503,504)

Other(0)

- Time range: today, yesterday, last 2 days, last 7 days, this week, last week, last 30 days, this month, user customized time range (Data of up to the last 30 days can be viewed, and can be refined to the hour and minute.)
- Domain name: Support all current domain names or selected domain names of customers, provide domain name fuzzy search, extensive domain name search function, and select, invert, cancel, etc.