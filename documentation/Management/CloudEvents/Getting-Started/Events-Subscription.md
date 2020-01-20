# Event Subscription

## Basic Information Setting

1. Enter the required subscription rule name

2. Enter the required description for subscription rule according to demands

## Event Source Setting

1. Select event source type and select system event

2. Select the event source as Monitoring

3. Select event type as Resource Monitoring Alarm

4. Event filter is not a required item. Please select **Resource Monitoring Type - All Types

5. The subscription subject selects all objects or part of alarm rules

## Event Destination Setting

1. Select **Restart API of Virtual Machines

2. Select one Virtual Machine from the designated region

Click **OK** to finish subscription rule setting. Upon completion of setting, subscription will be enabled by default.

When the alarm rule selected by the subscription object sends an alarm, the designated Virtual Machines will be restarted. If the alarm is not reset, the Virtual Machines will be continuously restarted.

![](https://raw.githubusercontent.com/jdcloudcom/cn/zhangwenjie-only/image/CloudEvents/createCE01.jpg)


