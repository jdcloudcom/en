# Copy Parameter Set
As the requirements change, some parameter sets are no longer used, and those useless parameter sets can be delete manually.

## Precautions
* Copied Parameter Set can't modify the type and version of database
* Copied Parameter Set can sync the modified history of parameters from source Parameter Set.

## Operation Steps
1. Login [Parameter Set Console](https://rds-console.jdcloud.com/paramgroup/list)
2. On the Parameter Group List page, select the source parameter set to be copied and click ***Copy*** in column of ***Operation***.
3. Popup box for deletion confirmation is shown in the figure.
    * Name: It is allowed to repeat, while the length and characters of the name have certain limits, which shall be subject to the console. 
    * Description: The length and characters of the description have certain limits, which shall be subject to the console. 
    ![Screenshot](https://img1.jcloudcs.com/cms/604bf122-ce51-44f0-9835-c0a7fbf3428220180815094448.png)

4. Click ***OK*** to copy the parameter set successfully and return to the list page of the parameter set.
