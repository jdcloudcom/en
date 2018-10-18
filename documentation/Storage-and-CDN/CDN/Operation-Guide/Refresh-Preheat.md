# **Refresh and Prewarm**

**1. Console—Location Description**

Log in to the CDN console and select **Refresh Cache** on the left menu bar.                                              

 ![image.png](https://img1.jcloudcs.com/cms/b4021e8c-827e-4331-9617-301ea758423020180117163325.png)

**2. Query Task Status**

Through the task status, the success rate and failure rate of each refresh or prewarm task in real time can clearly queried. For the failed task, you can retry. After retrying, create a new task to view the result and status.

**![image.png](https://img1.jcloudcs.com/cms/3c752f53-54cd-4919-a95d-33f70b30c5dc20180205101014.png)**

- Task ID is created based on Unix timestamp; task status and result can be queried in real time through task ID

- Retry mechanism, task can be re-distributed when the task fails, and the re-distributed task will create a new task ID for tracking due to time change.

  

**3. URL Refresh**

* Each URL shall start with <http://> or <https://>. For the URL refresh, if it is webiste URL, then it is the website home page that get refreshed; if it is whole site refresh, please perform it under the directory refresh, and end with /
* Multiple URLs shall be separated with carriage return
* Up to 100 URLs can be refreshed for a single time; up to 2000 URLs can be refreshed per day (including prewarm)
* It takes approximately 5 minutes for the refresh task to take effect.

 

**4. Directory Refresh**

* Each path shall start with <http://> or <https://>, and end with /
* Multiple paths shall be separated with carriage return
* Up to 5 directories can be refreshed for a single time; up to 50 directories can be refreshed per day
* It takes approximately 5 minutes for the refresh task to take effect.

 

**5. URL Prewarm**

* Each URL shall start with <http://> or <https://
* Multiple URLs shall be separated with carriage return
* Up to 100 URLs can be refreshed for a single time; up to 2000 URLs can be refreshed per day (including prewarm)
* It takes approximately 5 minutes for the refresh task to take effect.
