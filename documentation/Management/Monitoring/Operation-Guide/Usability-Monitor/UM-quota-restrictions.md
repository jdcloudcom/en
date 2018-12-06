## Availability Monitoring Restrictions and Quotas
This chapter mainly describes the management of site monitoring tasks, including the restrictions on creation, modification and others as well as the restrictions on quotas related to availability monitoring.

### Availability Monitoring Restrictions
 Restricted Item | Restrictions 
 -- | --
 Name of the Availability Monitoring Task |Only support Chinese, numbers, capital and lowercase letters, English underline “_” and line-through “-”, with the length of 1-32 characters.
 Detection Target | Currently it supports URL/IP, and RDS
 Detection Method | Currently it supports HTTP(s) and TELNET
 HTTP Request Head | Up to 20 pairs of keys and values can be supported, and the total length cannot exceed 1KB.
 Cookie | Up to 20 pairs of keys and values can be supported, and the total length cannot exceed 1KB.
 POST Content | Submission content is recommended to use English, and the total length cannot exceed 1KB.
 RDS Detection | When RDS is detected, the selected detection source shall be in the same subnet as RDS.

### Availability Monitoring Quotas
 Quota Items | Number of Quotas 
  -- | --
 Number of Site Monitoring Tasks | Up to 20 availability monitoring tasks can be created
 Number of Detection Source | At most 50 virtual machines of Linux system can be selected as the detection sources
