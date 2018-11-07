# Modify parameter set
When tuning parameters in a parameter set, modifying the parameters in the existing parameter set may not be expected. The function of modifying parameter set can be used to associate a new parameter set after tuning.

## Precautions

* Modify parameter set only under running instance

## Operation Steps
1. Login [Parameter Set Console](https://rds-console.jdcloud.com/paramgroup/list)
2. Select the target instance requiring parameter set modification, click the target instance, enter the page of instance details, and click Action =》 Modify Parameter Set on the top right corner of the page
3. Parameters are described in the pop-up box as follows:
    * Parameter set: List only the parameter set that matches the database type and version of the current instance
    * Click ***OK*** to finish parameter set modification
    * Click ***Cancel*** to give up parameter set modification

    ![截图](../../../../../image/RDS/modify-instance-parameter-group.jpg)

4. After the parameter set is modified, instance restart may be required to take effect. Please confirm that the parameter set has taken effect. 
