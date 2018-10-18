# Billing Rules

According to different user requirements, JD Cloud provides two types of **Monthly Package **(Pay-in-Advance) and ** Pay by Configuration**(Pay-as-You-Go) based on the configurations

## Monthly Package
Monthly package refers to purchase resource according to designated duration, charging according to the resource configuration you have purchased and the duration, it adopts the method of pay in advance. E.g., you can pay for resource of one month, multiple months or multiple years at a time. In the duration you have purchased, you can use the resource all the time and need not to pay any more, unless you need to change your configuration or renew after expiration;

Example:

If you have purchased cloud resource for 6 months at 10:00:00 on August 2, 2018, with the unit price of RMB 56, you need to pay RMB 336=6*56 and you can use this resource till 23:59:59 on February 2, 2019;

### Applicable Scenarios
When you have a relatively stable business scenario and need to use the cloud resource for a long time, we recommend you purchase resource according to Monthly Package method which can greatly save your cost;

## Pay By Configuration
The billing method of charging according to actual used resource amount adopts the method of Pay-AS-You-Go, allowing you to activate and release resources at any time, you can purchase resource according to your requirement and need not to purchase a large amount of resource in advance.
Pay by configuration billing refers to charge according to the configuration of resources and the using duration which has an accuracy of second (billing as per second) and charge and withhold as per hour.

Example:
If you purchased virtual machine billing based on hour at 10:30:00 on August 2, 2018, it will charge you with the unit price of RMB 1 after you delete the resource at 8:25:20 on August 3, 2018;

1. August 2, 2018, 10:00:00-11:00:00, your using duration is 10:30:00-11:00:00, i.e., 1,800 seconds, you will be charged (1800 seconds/3600 seconds)*RMB 1=RMB 0.5

2. August 2, 2018, 11:00:00 -August 3, 2018 8:00:00, the using duration for each hour is 1 hour, the charge per hour=RMB 1;

3. August 3, 2018, 8:00:00-8:25:23, your using duration is 8:00:00-8:25:20, i.e., 1,520 seconds, your charge will be (1520/3600)*RMB 1=RMB 0.42;

### Applicable Scenarios
In Pay By Configuration, you will pay as you go, it is generally applicable to business scenarios that have large fluctuations and cannot accurately predict resource demand, or you have temporary and sudden resource demand
