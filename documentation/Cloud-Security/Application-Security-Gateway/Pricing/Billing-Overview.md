# Description of Billing Method
- Billing Rules

  JD Cloud provides two billing methods for different user demands, namely pay by configuration and monthly package. The Application Security Gateway currently adopts the billing method of monthly package.

  Monthly Package Billing

  Costs for months or years are paid in advance, and current purchased time period supports 1 month~9 months, 1 year, 2 years, and 3 years; costs are deducted at one time when creating the instance;

  - To guarantee your use rights, the Application Security Gateway monthly package cannot support deletion before expiration.

  - It adopts the pay-in-advance method; the expiration time of monthly package billing order is at 23:59:59 in the Nth natural month or natural year from the start time of the order;
    For example: the start time of the order is January 1, 2019 at 15:00:00, the purchase duration is 1 month, and the expiration time is February 1, 2019 at 23:59:59.

    

  ** Renewal Rules**

  Renewal is not supported temporarily. It is estimated that it can be done at the end of September.

  Expiration & Overdue Rules

  When the expiration time of your monthly package Application Security Gateway instance is earlier than or the same as the current time, the status of your virtual machine will be expired. Upon expiration, the service of the Application Security Gateway will be stopped and unavailable for use;

  Your Application Security Gateway and security protection data will be kept for 7 days from the time of stopping service and the system will recover the resources after 7 days, in which case the data cannot be retrieved.
