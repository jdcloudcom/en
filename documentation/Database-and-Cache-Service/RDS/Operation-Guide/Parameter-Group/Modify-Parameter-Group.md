# Modify Parameters
The default value of all the parameters in the parameter list is the optimized value by JD Cloud. The parameter running value and the default value in the parameter list of the new parameter set are consistent. The default running value can meet the needs of most application scenarios. Users can modify the parameter running value as required according to their own service scenarios.

## Precautions
    * The running value of the parameters must be within parameter value ranges.
    * If the parameters to be modified with no need for restart, the modified parameters will be automatically bound to the database instance after modification.
    * Parameter groups can be associated with multiple different instances.

## Operation Steps
1. Login [Parameter Set Console](https://rds-console.jdcloud.com/paramgroup/list)
2. Select the parameter set whose parameters requiring to be modified, click the target parameter set, and enter the detailed page of the parameter set.
3. Select the Tab page of ***Parameter*** and introduce the meaning of each field in the parameter list:
    * Parameter Name: The parameter name of each parameter is unique.
    * Parameter Run Value: The value at which the current parameter is valid.
    * Parameter Default Value: The parameter value recommended by JD Cloud.
    * Parameter Value Ranges: The ranges or lists where parameter can be modified.
    * Restart or Not: It indicates whether the parameters can come into effect with restart and parameter set associating after the parameter running value is modified.
4. Click ***Edit Parameter ***, and the column of parameter run values in the parameter list becomes editable. At this time, the parameter run value can be modified into an ideal value within the modifiable range.
5. Click ***Save***, and a pop-up box for parameter modification value will appear after all the parameter running values ​​have been modified. The parameter list containing the modified parameter running values will be list in the pop-up box.

    ![Screen Shot](../../../image/RDS/modify-parameter.png)

6. Click ***OK*** to complete the modification of the parameters and return to the parameter list page after confirmation.
7. Select the Tab page of ***Cloud Database***, and it can be seen that the values in the column of ***Parameter Set in Effect*** is changed from ***In Effect*** to ***Synchronizing***, indicating the modified parameters just made are synchronized to the database instance; if the status is changed from ***Synchronizing*** to ***In Effect***, it indicates that the modified parameters have been applied to the database instance.
