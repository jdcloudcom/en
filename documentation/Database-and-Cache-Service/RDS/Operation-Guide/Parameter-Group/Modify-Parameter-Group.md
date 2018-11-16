# Modify parameter group
When tuning parameters in a parameter group, modifying the parameters in the existing parameter group may not be expected. The function of modifying parameter group can be used to associate a new parameter group after tuning.

## Precautions

* Modify parameter group only under running instance

## Operation Steps
1. Login [Parameter group Console](https://rds-console.jdcloud.com/paramgroup/list)
2. Select the target instance requiring parameter group modification, click the target instance, enter the page of instance details, and click Action =》 Modify Parameter group on the top right corner of the page
3. Parameters are described in the pop-up box as follows:
    * Parameter group: List only the parameter group that matches the database type and version of the current instance
    * Click ***OK*** to finish parameter group modification
    * Click ***Cancel*** to give up parameter group modification

    ![截图](../../../../../image/RDS/1116_1.jpg)

4. After the parameter group is modified, instance restart may be required to take effect. Please confirm that the parameter group has taken effect. 

