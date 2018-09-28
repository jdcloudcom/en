# Billing by Amount

Billing by amount refers to a billing method that charges based on the actual consumption of resources, using firstly and paying later.  
Billing by amount allows you to activate and release resources at any time, and you can buy resources on demand, not having to buy a large amount of resources in advance.  
Billing by amount is divided in 2 types: Pay By Configuration and Pay by consumption.

## Pay By Configuration
Pay By Configuration: Bill according to the configuration and use time of resources, and the time is accurate to second (billed by seconds). A bill is generated once for every hour and then the corresponding charges will be deducted.

For example:  
For an hour-settled cloud host that you purchased at 10:30:00, on August 2nd, 2018 and deleted at 8:25:20, on August 3rd, 2018, with a unit price of CNY 1 per hour;  
1. 10:00:00——11:00:00, 2018-8-2, during this period, your use time is 10:30:00-11:00:00，that is, 1800 seconds, so the cost is= (1800s/3600s)* CNY 1=CNY 0.5;  
2. 11:00:00, 2018-8-2——8:00:00, 2018-8-3, during this period, your use time of each hour is complete, and the cost of each hour is= CNY 1;   
3. 8:00:00, 2018-8-3——8:25:23, 2018-8-3, during this period, your use time is 8:00:00——8:25:20, that is, 1520seconds, so the cost is=(1520/3600)* CNY 1= CNY 0.42;  

## Pay by consumption
Pay by consumption: Bill according to the actual consumption of resources (such as traffic, daily peak, storage and so on), and the billing cycle is for a day. Usually the bill of consumption of the day before is generated before dawn every day.  
For an IP that is billed by consumption, assume that the consumption of traffic of the current day is 10GB, then it will charge based on10GB.

## Application Scenarios
Billing by amount is based on paying for how much is consumed. It is generally applicable to business scenarios with large fluctuations of resources demand which can not be accurately predicted, or temporary and sudden demand of resources;




