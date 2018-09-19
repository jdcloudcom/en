# Resource Bill
## What is resource bill?
Resource bill is to show the summery of monthly consumption based on the resources dimension which is divided into 2 types according to the payment method:
1. Pay-In-Advance: Show the resource consumption of each transaction;
2. Pay-As-You-Go: Show the information on the consumption of the Pay-As-You-Go resources in the current month, including the total consumption amount, the amount of payment by cash, the amount of payment by coupon and the amount of overdue payment; among which: The daily-settled resources shall be used from the last day of last month to the penultimate day of the current month, and the hourly-settled resources shall be used from the last hour of last month to the penultimate hour of the current month.

For example:
Pay-In-Advance Resources

 >- Assume that we are querying the Pay-In-Advance resources of August and it shows the Pay-In-Advance resources purchased from August 1st-August 31st. 
  
Pay-As-You-Go Resources

  >- Daily-settled resources： Assume that we are querying the daily-settled Pay-As-You-Go resources of August and it shows the daily-settled Pay-As-You-Go resources consumed from July 31st-August 30th.
  >- Hourly-settled resources： Assume that we are querying the hourly-settled Pay-As-You-Go resources of August and it shows the hourly-settled Pay-As-You-Go resources consumed from 23:00, July 31st-23:00, August 31st.
  
In case that the settlement of the Pay-As-You-Go resources is delayed, the time mention above will be not completely accurate.
>- Assume that the hour-settled resources after 22:00, August 31st is delayed to be settled in September, then, in the resources bill of August, it shows the hour-settled Pay-As-You-Go resources between 23:00, July 31st-22:00, August 31st.

## How to view resources bill?
In JD cloud console, click on **expense**-**consumption records**-**resources bill** to view;
![file-list](https://github.com/jdcloudcom/cn/blob/edit/image/billing/%E8%B5%84%E6%BA%90%E8%B4%A6%E5%8D%951.png)
![file-list](https://github.com/jdcloudcom/cn/blob/edit/image/billing/%E8%B5%84%E6%BA%90%E8%B4%A6%E5%8D%956.png)

### How to view Pay-As-You-Go resources bill?
You can select the Pay-As-You-Go and account period in the options;
![file-list](https://github.com/jdcloudcom/cn/blob/edit/image/billing/%E8%B5%84%E6%BA%90%E8%B4%A6%E5%8D%957.png)
Click the Details button to view the detailed consumption of resources during the selected account period;
![file-list](https://github.com/jdcloudcom/cn/blob/edit/image/billing/%E8%B5%84%E6%BA%90%E8%B4%A6%E5%8D%954.png)
### How to view Pay-In-Advance resources bill
You can select the Pay-In-Advance and account period in the options;
![file-list](https://github.com/jdcloudcom/cn/blob/edit/image/billing/%E8%B5%84%E6%BA%90%E8%B4%A6%E5%8D%955.png)
