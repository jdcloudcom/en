# Resize

The RDS instance is able to dynamically adjust instance CPU, memory and disk size. During the configuration adjustment, RDS instance can be normally used. After completion of adjustment, there is only a flash. Then, please re-connect the application.

- MySQL、Percona、MariaDB
  - Expansion is supported only, while shrink is not supported
  - Expansion of primary instance is supported only, while expansion of read-only instance is not supported
- SQL Server
  - Expansion and shrinkage are supported at the same time
  - To guarantee system stability, the disk size shall be greater than or equal to the original size after adjustment
  
## Operation Steps
1. There are to entries, including
    * List page: Select the target instance requiring rebooting and click **More** -> **Upgrade Configuration/Resize** in the Actions column
    * Instance Details: Enter the Instance Details, click **Operation** -> **Upgrade Configuration/Resize** on the upper right corner
2. Select the adjusted configuration and click **OK** to make the adjustment
    
![调整配置](../../../image/RDS/Modify-Instance-Spec.png)
