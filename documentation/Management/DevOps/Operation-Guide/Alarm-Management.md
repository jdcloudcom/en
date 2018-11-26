# Alarm Management

The alarm management mainly includes two modules: Alarm history and alarm block, so as to realize the operations on the alarm events, including query, ACK and block.

**Alarm History**: Record all alarm events that occur, including monitoring objects, alarm time, number of alarms, rules, recovery, etc., and allow users to view alarm configurations and query figures, perform ack and manual repair operations.

- An alarm event is a record
- Repair: Manual “recovery" of alarm events that cannot be recovered (such as changing monitoring items) is not really fault repair.
- ACK: Record the operation time and the operator, indicating that the operator knows the alarm and will repair it. For this fault event, the alarm notification will not be sent.
- Click **>** following the operation bar to view: Alarm group, alarm number (number of sent alarms/maximum number of alarms), whether to block, cause of alarm recovery, current value of monitoring items, NS type, monitoring type, Tags, alarm rules, alarm modes and other information

![image](https://github.com/jdcloudcom/cn/blob/DevOps-guhezhu1/image/DevOps/Operation-Guide50.JPG)

**Alarm Block**: You can set block for some known and unprocessed alarm events.

The alarm history will still be recorded for the shielded alarms. However, the alarm notification will not be sent during the blocking period.

1. Block by NS: Block all alarms of the selected NS

2. Block by rules: Only block the alarms of the selected rules; you can set to block the alarms of some NS

![image](https://github.com/jdcloudcom/cn/blob/DevOps-guhezhu1/image/DevOps/Operation-Guide51.jpg)
