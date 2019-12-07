# Billing Rules

Data Compute currently supports one billing type:
 * Billing by Usage

## Storage Billing

Users will enjoy first 500GB data storage service for free each month in Data Compute. Datasheet and other data exceeding will be billed according to its size of data capacity on basis of billing period: hour(s).
Formula for billing: storage costs per hour = storage capacity * storage price as below:

|Storage|Tiered Unit Price|
|---|---|
|0GB ~ 100GB|RMB 0.0192/GB/Day|
|100GB ~ 1TB|RMB 0.0096/GB/Day|
|1TB ~ 10TB|RMB 0.0084/GB/Day|
|10TB ~ 100TB|RMB 0.0072/GB/Day|
|100TB ~ 1PB|RMB 0.006/GB/Day|
|1PB or above|Please contact us by ticket|


Description:

1) The storage billing covers Table, File, etc. Billing by tier is conducted as per its size of data capacity on basis of billing period: day(s).

2) Collect current data for storage used on basis of hour; calculate average value of user’s storage used on that day and then multiple by the unit price.

3) If actual storage used is less than 512MB, dcs will charge for RMB 0.01/day for this item

For example, if user's storage used is 50TB, charges for every day are as below: (100GB * RMB 0.0192/GB/day) + (900GB * RMB 0.0096/GB/day) + (9216GB * RMB 0.0084/GB/day) + (40960GB * RMB 0.0072/GB/day) = RMB 382.8/day 

The billing period is once per hour in general. For example, the bill for 00:00-01:00 generally is generated at 01:00.

The specific billing time of the system shall prevail. Costs will be automatically deducted from your account balance to settle the bill.

For example:
If a user successfully uploads 1000GB data on the Data Compute at 00:00, the bill amounting to 1000GB*1H*RMB 0.0008/GB/H=RMB 8 will be billed at 01:00.

If data is deleted, costs will be calculated accurately to hour according to specific storage duration. Detail bill can be viewed in the User Center.


## Computing Billing

### Shared Computing Resource

   If the shared computing resource is selected, the billing for each query task shall be calculated by two indicators, namely actual processing data size of computing and SQL complexity. Formula for billing: SQL computing costs=actual processing data size of computing * SQL complexity * SQL unit price

| Billing Item | Price | 
| ------ | ------ | 
| SQL Price (RMB/GB) | RMB 0.3 | 

## Description:
Actual processing data size of computing means data bulk actually scanned by a SQL query task.

(Note: most SQL statement will be filtered by partition and by column, so generally this value will be much less than the original data size)

Partition filter: for example: if the SQL statement includes where userid<"200000", userid is partition column, the billed data bulk will only include the actually read-write partition but exclude data of other partition. 

Column filter: for example: if the SQL statement submitted by the user is select name from class, only data bulk in the column name in class table will be calculated, excluding other columns. 

SQL = Join + Group By + Order By + Distinct + window functions + max(insert into-1, 1)

SQL complexity computing: 

      Number of SQL keywords <= 3, complexity is 1. 
      
      Number of SQL keywords <= 6, and >= 4, complexity is 1.5. 
      
      Number of SQL keywords <= 19, and >= 7, complexity is 2. 
      
      Number of SQL keywords >= 20, complexity is 4. 
      
For example: 

SQL statement entered by user is:

SELECT DISTINCT total1 FROM

(SELECT id1, COUNT(f1) AS total1 FROM in1 GROUP BYid1) tmp1 ORDER BY total1 DESC LIMIT 100;

Where number of SQL keywords is 4 and SQL complexity is 1.5, if the data actually scanned by the user is 100GB, the cost =100*1.5*0.3=RMB 45.

The billing time is within the first billing period at the end of computing task and the maximum billing time will not exceed 12 hours.

After successfully finishing the computing task, the system will sum up the read-write data bulk and SQL complexity of this computing task; costs will be automatically deducted from your account balance to settle the bill. For computing task failed, if it is business error, charge normally; if resource-level error, no charge.

### Reserved computing resource (please contact customer service to turn on)

When user steadily runs business on the Data Compute, it is recommended to adopt use mode of reserved computing resource to save more costs.
Formula for billing: cost of reserved computing resource=lease duration*number of configuration nodes*unit price. The price is as below:

| Node configuration | CPU (core) |  Memory (GB) | Unit price (RMB/node/day) |  
| ------ | ------ | ------ | ------ | 
| General Type | 1 | 4 | 5 |
| Large Memory Type | 1 | 8 | 8 |

Computing resource of Data Compute can be purchased by daily/monthly package and you can contact customer service to enjoy higher discount if purchase by quarterly/yearly package.

Users need to select lease duration, type and number of node configuration according to actual use demand. Costs will be deducted immediately upon purchase.
Instructions: daily package is divided on basis of 24H, namely it takes effect at the purchase time and expires upon 24H.
Monthly package is divided on basis of natural month, namely, if the effective date is January 15 for purchase of one month, then its period of validity is till February 15;
          Under special circumstance, if the effective date is January 31, then it will expire on February 28 or 29.

The computing resource of Data Compute in use can be renewed and expanded.

Renew means extend the period of validity as per the same specifications. Expansion means add number of nodes of same configuration within the period of validity

## Download Billing

If user down data from extranet, it will be billed as per the downloaded data size.
Formula for billing: each cost for extranet download = downloaded data bulk * download price
Where the price is as below:

| Billing Item | Price | 
| ------ | ------ | 
| Extranet download price (RMB /GB) | RMB 0.8 | 
