# Description of Snapshot Billing Mode



## Billing Rules

The billing mode of pay by consumption is provided for Cloud Disk Snapshot. The billing rules are as follows:

- Snapshot is billed based on actual data volume in each region, and a bill will be generated for snapshot every day for each region; The actual data volume of each snapshot is the total changed data volume from the last snapshot to this snapshot in the snapshot source disk, or the actual data volume of this snapshot in the snapshot source disk for the first snapshot.

- The calculation method in bills for snapshot data volume is: to take samples for snapshot data volume every hour in one day and take the average volume of sampled data in the day as the snapshot data volume of the day.

- The minimum billing period is one day, and shall be calculated as one day in case of less than one day.

- Cloud Disk Snapshot will create a virtual snapshot resource ID in each region, representing all Cloud Disk Snapshots in the region with the prefix of "snapfee-". Snapshot bills in each region will be recorded in the virtual snapshot resource ID of the region.

- When the snapshot is created, please make sure that your account balance is not less than RMB 50. If the account balance is less than RMB 50, the snapshot cannot be successfully created and shall be available as normal after the balance is recharged to RMB 50 and more.

- Monthly package billing method and renewal are not supported for Cloud Disk Snapshot.

  



## Expiration and Arrearage Rules

When your account (including cash balance and valid coupon) cannot offset the Cloud Disk Snapshot bill, the system will determine that the Cloud Disk Snapshot in the region is in arrears and all your snapshots in the region will become in arrears;

When your Cloud Disk Snapshot is in arrears, you will be unable to create Cloud Disk Snapshot anymore;

When your Cloud Disk Snapshot is in arrears, you will be notified by email and SMS. Please be sure to check your notices and recharge in time to avoid unnecessary losses;

When the duration from the creation time of Cloud Disk Snapshot to the arrearage start time is more than 3 days, the snapshots will be reserved for 7 days from the arrearage start time in this region, and 7 days later, the system will withdraw the resource and data cannot be retrieved; if the duration is less than 3 days, the time of reserving data after the stopping of the service is equal to the use duration of Cloud Disk Snapshot (from the creation time to the arrearage time). After that, the system will withdraw the resource and data cannot be retrieved;

After you pay the arrears, Cloud Disk Snapshot will recover the normal billing status, and the accumulation of the Cloud Disk Snapshot use duration will continue;



## Expiration and Arrearage Reminder

**Arrearage and Service Suspension Notice**

JD Cloud & AI will push arrearage and service suspension notice to you after you are in arrears.

**Release Warning Notice**

JD Cloud & AI will push the release warning notice to you on the 4th and 6th days after your Cloud Disk Snapshot (excluding the Cloud Disk Snapshot with the use duration of less than 3 days) is in arrears.

The above notices will be sent to you by SMS, email and mail. Please pay attention.