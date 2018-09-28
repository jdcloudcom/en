# Instruction on the Pay-As-You-Go billing
## What is Pay-As-You-Go?

For Pay-As-You-Go, users can apply for the resources based on consumption need, and it will be charged according to the configuration and consumption of resources.  
Pay-As-You-Go is divided into 2 types which refers to billing by configuration and billing by consumption;  
There are two kinds of settlement cycles for Pay-As-You-Go which refers to hour-settled and day-settled. The billing cycle in the documentation of each product shall prevail. When a settlement cycle is formed, the bill is generated and then the corresponding charge is deducted immediately. If the balance of the account is insufficient, the customer's account will be in overdue condition, and the services of corresponding resources will be stopped due to overdue condition. If the overdue amount is not paid, the corresponding resources will be released immediately.

## What will happen to the Pay-As-You-Go resources when they expire?
For the Pay-As-You-Go resources, when the bill is generated but the reaming amount of the customer’s account is not enough to pay for the bill, the services of corresponding resources will be stopped due to overdue payment; if the overdue payment is not paid, the corresponding resources will be released immediately.
The mechanism for handling amount overdue condition is as follows:

| Period | Mechanism for Handling |  
| --------   | ---------  | 
| Generate the bill of Pay-As-You-Go resources| 1. Generate the bill of resources according to the billing cycle, and then deduct the corresponding charge; <br> 2. If the account balance is insufficient to complete the deduction, the account changes into the overdue condition. The system will push notifications to the user of the stopping of cloud resources service due to overdue condition. |   
| Service stopping period due to overdue condition | In case of overdue condition, the customer enters the service stopping period due to overdue condition (Usually, the service stopping period due to overdue condition lasts for 7 days which is different from different products. The service stopping rules of each specific product shall prevail) <br>1. The services of the resources that the customer are using but in overdue condition will be forced to stop; <br>2. The service configuration and resources that have been stopped will be retained until the end of the service stopping period. During the service stopping period, if users pay the fees in accordance with requirements, the corresponding resources will automatically restart the service; <br>3. In the service stopping period, if not paying the fees, 4, 6 days after the service stopping, the system will push notifications to the user of the releasing of cloud resources due to overdue condition. |  
| Resources releasing due to overdue condition |If the user’s overdue period exceeds the service stopping period due to overdue condition, it starts to release the resources in overdue condition; <br>1. The resources billed by configuration will be released; <br>2. For the resources billed by consumption, IP will be released, and the user data of CDN, video live and cloud storage will be released; <br>3. The system will push notifications to the user of the releasing of resources. |



