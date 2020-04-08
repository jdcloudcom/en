# Monitoring Alarm

Notification Service collects monitoring indicators in real time through Monitoring and displays monitoring information of subjects and subscriptions.

## Monitoring

Currently, Notification Service provides real-time monitoring for subjects and subscriptions. See Table 1 for the monitoring items.

Table 1: Monitoring Item List

| Monitoring Dimension           | Indicator Name            | Unit | 
| -------------------  | ------------------- | ---- | 
| Subject   | Number of Messages Released to Subject       | Piece   | 
| Subject | Size of Messages Released to Subject     | KB   | 
| Subject  | Total Messages Pushed to Subscription Terminal  | Piece   |
| Subject  | Total Messages Pushed to Subscription Terminal and Successfully Received  | Piece   | 
| Subject  | Total Messages Pushed to Subscription Terminal and Failing to be Received   | Piece   | 
| Subject  | Total Messages Pushed to Subscription Terminal with Unmatched Attribute     | Piece   | 
| Subscription (Subscription ID Screening) | Total Messages Pushed to Subscription Terminal     | Piece   | 
| Subscription (Subscription ID Screening)  | Messages Pushed to Subscription Terminal and Successfully Received     | Piece   | 
| Subscription (Subscription ID Screening)  | Messages Pushed to Subscription Terminal and Failing to be Received    | Piece   | 
| Subscription (Subscription ID Screening) | Messages Pushed to Subscription Terminal with Unmatched Attribute    | Piece   | 


 

## Alarm

You can create customized alarms for any monitoring item through cloud monitoring based on actual business requirements. For details on Monitoring, please refer to Monitoring [Set Monitoring Alarm for Resources](https://docs.jdcloud.com/en/monitoring/add-rule). When the monitoring item reaches the set threshold, we will send you an alarm message via SMS and email.

## Operation Steps

1. Log in [Notification Service Console](https://jns-console.jdcloud.com/topics).
2. On the "Subject" page, select the target subject and click **Subject Name** to go to the "Subject Details" page.
3. On the "Subject Details" page, click **Monitoring** to go to the "Monitoring Information" page.
4. Click **Set Alarm Rule** on the right side of the page to enter the "Alarm Rules" page.
5. On the "Alarm Rules" page, click **Add Alarm Rule** to enter the "Set Alarm Rule" page and add new rules according to the notification.
