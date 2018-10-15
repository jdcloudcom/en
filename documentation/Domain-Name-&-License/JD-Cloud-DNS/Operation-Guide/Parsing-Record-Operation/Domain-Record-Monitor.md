- ## **Website Monitoring Settings Details**

  **1. Monitoring Frequency**

  The monitoring frequency can be selected from 1 minute, 5 minutes, and 10 minutes.

  As the number of monitoring points increases, the increase in monitoring frequency will have a slight impact on the website.

  For the first time, it is recommended to use the default monitoring frequency of 1 minute/time.

   

  **2. Trigger the Alarm Several Times**

  The number of consecutively triggered alarms is the frequency at which the notification information is triggered after an exception is detected.

  You can choose once, twice, or three times.

  The default is twice. To avoid interference, it is recommended to set it to be twice.

   

  **3. Monitoring Task**

  Your URI can be filled in the path of the monitoring task.

  At the port of the monitoring task, you can the port you want to monitor.

   

  **4. Switching Rule**

  4.1 Do not make any changes to the domain name record

  If you choose not to make any changes to the domain name record, you will only receive the alarm information and will not perform specific operations based on the monitoring results.

  4.2 Forced suspension of the Resolution Record

  Selecting to force a pause in the resolution record will pause the exception record and send an alarm notification message.

  After the resolution record is paused, you can choose between automatic switch back and manual switch back.

  If an exception occurs, stop the recording and select to manually switch back. The Manual Recovery button will appear in the website monitoring interface. Click the button to restore the original state.

  4.3 Automatically switch to alternate address

  4.3.1 By selecting automatic switch to the alternate address, it will automatically switch to the alternate address when an exception occurs and will send an alarm notification message.

  4.3.2 After the switching is completed, you can choose between automatic switch back and manual switch back.

  4.3.3 If an exception occurs, switch to the alternate address and select to manually switch back. The Manual Recovery button will appear in the website monitoring interface. Click the button to restore the original state.

  4.3.4 There are two alternate addresses, alternate 1 and alternate 2. If an exception occurs, it will first switch to the alternate address 1, and if the alternate 1 is also abnormal, it will switch to the alternate address 2.

  4.3.5 If the alternate 1 is not filled in, only the alternate 2 is filled, it will promote the alternate 2 to the alternate 1 by default.

   

  **5. Notification Policy**

  The notification policy can select SMS, email, and message board for notification.

  The SMS and message board are checked by default.

  If there is a link below for sending SMS and email, it is the contact provided when registering JD Cloud.

   
