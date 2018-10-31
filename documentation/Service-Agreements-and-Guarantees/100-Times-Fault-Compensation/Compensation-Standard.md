## Compensation Standard
I. Virtual Machine
* Failure time = failure resolution time-failure start time.

* Virtual machine in monthly package is compensated in the way of service time compensation, i.e. 100 times/set of the failure time.

* The virtual machine pay by configuration is compensated in the form of coupon, the payout amount = the average hourly cost in the first 24 hours of the failure / 60 × failure time × 100.

Instructions:

* If the use time of virtual machine pay by configuration is less than 24 hours, the cost shall be calculated based on the actual use time; and the failure time shall be calculated by minutes;

* Total amount of compensation shall not exceed the total amount of cash paid for a single virtual machine.

II. Load Balancer
* Failure time = failure resolution time-failure start time.

* Load Balancer in monthly package is compensated in the way of service time compensation, i.e. 100 times/set of the failure time.

* Load Balancer pay by configuration is compensated in the form of coupon, the payout amount of a single case = the average hourly cost in the 24 hours before the failure / 60 × failure time × 100.

Instructions:

* If the use time of Load Balancer pay by configuration is less than 24 hours, the cost shall be calculated based on the average of actual use time; and the failure time shall be calculated by minutes;

* Total amount of compensation shall not exceed the total amount of cash paid for a single Load Balancer;

* Load Balancer only compensates the Load Balancer itself, and does not compensate for the virtual machine under the Load Balancer.

III. Cloud Database
* Failure time = failure resolution time-failure start time.

* Cloud database in monthly package is compensated in the way of service time compensation, i.e. 100 times/set of the failure time.

* Cloud database pay by configuration is compensated in the form of coupon, the payout amount =  the average hourly cost in the first 24 hours of the failure / 60 × failure time × 100.

Instructions:

* If the use time of cloud database pay by quantity is less than 24 hours, the cost shall be calculated based on the average of actual use time;

* The failure time shall be calculated by minutes;

*Total amount of compensation shall not exceed the total amount of cash paid for a single cloud database;

IV. Cloud Storage
* Failure time = failure resolution time-failure start time.

* Failure compensation for cloud storage is compensated in the form of coupon, no refund of converted cash.

* The payout amount of a single Bucket = the average hourly cost in the first 24 hours of the failure × 100. Total amount of compensation shall not exceed the total amount of cash paid for the cloud database.

Instructions:

* If the use time of user is less than 24 hours, the cost shall be calculated based on the average of actual use time; and the failure time shall be calculated by minutes;

V. Cloud Disk Service
* Failure time = failure resolution time-failure start time.

* Cloud Disk Service in monthly package is compensated in the way of service time compensation, i.e. 100 times/set of the failure time.

* Cloud Disk Service pay by configuration is compensated in the form of coupon, the payout amount = the average hourly cost in the first 24 hours of the failure / 60 × failure time × 100.

Instructions:

* If the use time of Cloud Disk Service pay by configuration is less than 24 hours, the cost shall be calculated based on the average of actual use time;

* The failure time shall be calculated by minutes;

* Total amount of compensation for a single Cloud Disk Service shall not exceed the total amount of cash paid for a single Cloud Disk Service.

VI. JCS for Redis
* Failure time = failure resolution time-failure start time.

* JCS for Redis in monthly package is compensated in the way of service time compensation, i.e. 100 times/case of the failure time.

* JCS for Redis pay by configuration is compensated in the form of coupon, the payout amount = the average hourly cost in the first 24 hours of the failure / 60 × failure time × 100.

Instructions:

* If the use time of JCS for Redis pay by configuration is less than 24 hours, the cost shall be calculated based on the average of actual use time, the failure time shall be calculated as per minute;

* Total amount of compensation shall not exceed the total amount of cash paid for a single JCS for Redis.

VII. Digivoice
* Failure time = failure resolution time-failure start time. Calculate the failure time in minute, and calculate the failure time as one minute when the failure time is less than one minute. For example, if the failure time is 1 minute and 01 second, calculate as per 2 minutes.

* Platform failure of JD Cloud digivoice big data is compensated by 100 times:

* The way of compensation is to extend the use time of big data service, extension time = failure time * 100.
