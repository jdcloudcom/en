# Copy Parameter Group 
As the requirements change, some parameter groups are no longer used, and those useless parameter groups can be delete manually.

## Precautions
* Copied Parameter group can't modify the type and version of database
* Copied Parameter group can sync the modified history of parameters from source Parameter group.

## Operation Steps
1. Login [Parameter group Console](https://rds-console.jdcloud.com/paramgroup/list)
2. On the Parameter Group List page, select the source parameter group to be copied and click ***Copy*** in column of ***Operation***.
3. Popup box for deletion confirmation is shown in the figure.
    * Name: It is allowed to repeat, while the length and characters of the name have certain limits, which shall be subject to the console. 
    * Description: The length and characters of the description have certain limits, which shall be subject to the console. 

    ![image] (../../../../../1109_18.jpg)

4. Click ***OK*** to copy the parameter group successfully and return to the list page of the parameter group.
