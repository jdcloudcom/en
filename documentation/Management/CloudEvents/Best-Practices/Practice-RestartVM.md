# Restart Virtual Machines Sending Alarms

## User demand: ##

Restart the Virtual Machine A when its memory exceeds 80%

## Precondition: ##
1. The user creates the Virtual Machine A
2. Alarm rules are set to the Virtual Machine A with memory greater than 80% in cn-north-1

## Scenario Figure ##

![](https://raw.githubusercontent.com/jdcloudcom/cn/zhangwenjie-only/image/CloudEvents/CE-application.jpg)

## Operation Process ##

1. Select event source type as **System Event**

2. Select event source as **Monitoring**

3. Select event type as **Resource Monitoring Alarm**

4. The event filtering field can be null

5. The subscription object selects the alarm rule for the Virtual Machine A with memory greater than 80%

![](https://raw.githubusercontent.com/jdcloudcom/cn/zhangwenjie-only/image/CloudEvents/bestpractice02.jpg)

6. Select destination as **Restart API of Virtual Machines**

7. Select the region as **cn-north-1**

8. Select **Virtual Machine A as the Virtual Machines**

9. Click **OK** to finish setting of event subscription rule.

![](https://raw.githubusercontent.com/jdcloudcom/cn/zhangwenjie-only/image/CloudEvents/bestpractice03.jpg)






