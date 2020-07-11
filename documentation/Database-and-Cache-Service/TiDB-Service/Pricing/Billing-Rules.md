# Billing Rules

JD Cloud provides two billing methods according to different user demands, including the **"Pay by Monthly Package"** based on configuration (Pay-In-Advance) and the **"Pay by Configuration"** (Pa-As-You-Go)

## Monthly Package
Billing by Monthly Package refers to purchase resources as per designated period, collect fee as per configuration and period of resource purchased and adopt the pay-in-advance method; For example, if resource cost is paid for one month, months or years at one time, the service is always available during the period purchased, without additional cost, unless the configuration is changed or the resource expires and is renewed;

Examples :

If you purchase any cloud resource for 6 months on 10:00:00 at August 2, 2018 at the monthly price of RMB 56, you need to pay RMB 336=6*RMB 56 and you can use the resource till 23:59:59 on February 2, 2019;

### Application Scenario
In case that you have stable business scenarios and need to use cloud resources for a long term, it is recommended to purchase resources with the Monthly Package method, which can greatly save your cost;

## Pay by Configuration
On the basis of billing method of paying by resources used actually the pay-as-you-go billing method is adopted. You are allowed to initialize and release any resource whenever. You can purchase resources on demand, without purchase a large number of resources in advance.
In the pay-by-configuration mode, bill is produced and deduction is made by hours on the basis of configuration and service time of resources, with time accurate to the second level (charged by seconds).

Examples :
You have purchased Virtual Machines which is charged by hours at 10:30:00 on August 2, 2018, which can be used till 8:25:20 on August 3, 2018 and then deleted, and the unit price per hour is RMB 1;

1、2018-8-2 10: 00:00-11:00:00, during this period, the service time is from 10:30:00 to 1:00:00, i.e., 1,800 seconds, and the cost is (1,800 seconds/3,600 seconds) *RMB 1 = RMB 0.5

2、2018-8-2 11:00:00-2018-8-3 8:00:00, during this period, the service time 1 hour per hour and the cost per hour is RMB 1;

3、2018-8-3 8:00:00-2018-8-3 8:25:23, during this period, the service time is from 8:00:00 to 8:25:20, i.e., 1,520 seconds, and the cost is (1,520/3,600)*RMB 1= RMB 0.42;

### Application Scenario
Pay-by-configuration refers to pay the charge according to the actual usage, generally applicable to business scenarios with high fluctuation and without ability to precisely predict resource demands or temporary or sudden resource demands;
