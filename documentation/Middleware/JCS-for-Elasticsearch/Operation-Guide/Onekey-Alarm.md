## One-click Alarm
The one-click alarm service enables users to quickly establish an alarm system. The one-click alarm switch is enabled by default, acting on all JCS for Elasticsearch clusters under the current account. The alarm policies enabled by default are as follows:</br>
- If the statistical cycle is 1 minute, and the maximum value of the cluster status is equal to 2 for 5 consecutive cycles, the alarm system will alarm.</br>
- If the statistical cycle is 1 minute, and the maximum value of the node disk utilization rate is greater than or equal to 75% for 10 consecutive cycles, the alarm system will alarm.</br>
- If the statistical cycle is 1 minute, and the maximum value of the node HeapMemory utilization rate is greater than or equal to 85% for 10 consecutive cycles, the alarm system will alarm.</br>

### Operation Steps
1.**Enable One-click Alarm. **Visit [One-click Alarm Page on Monitoring Console](https://cms-console.jdcloud.com/alarm/oneclick) and turn on the enabling switch for JCS for Elasticsearch service.</br>
2.**Modify Policy. **If the built-in default policies cannot satisfy your demands, you can click **Modify** to open the Alarm Rules Modification page, modify and add trigger conditions, notification policies and other information as per your demands.
