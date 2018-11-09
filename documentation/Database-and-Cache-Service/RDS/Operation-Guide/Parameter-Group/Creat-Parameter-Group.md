# Create Parameter Set
A parameter set is required to be specified for launch configuration of the database engine when the MySQL/Percona/MariaDB service is created. The system will initialize a set of parameter list default by the system according to the database type and version selected at the time of creation. Refer to [Modify Parameter](Modify-Parameter-Group.md) for customizing the parameter run values.

## Precautions
* 20 parameter sets at most can be created in each region.
* The default parameter lists for parameter sets of different database types and versions are different.
* The database type and version of the JCS for MySQL/Percona/MariaDB service and its bound parameter set must be consistent.

## Operation Steps
1. Login [Parameter Set Console](https://rds-console.jdcloud.com/paramgroup/list)
2. On the list page of parameter set, click ***Create*** and a pop-up box of ***Create Parameter Set*** will appear.
3. The pop-up box parameters are as follows
    * Database Type: Select the database type to which the parameter set belongs. The parameter set cannot be applied to database instances with different database types.
    * Database Version: Select the database version to which the parameter set belongs. The parameter set cannot be applied to database instances with different database versions.
    * Name: It is allowed to repeat, while the length and characters of the name have certain limits, which shall be subject to the console.
    * Description: The length and characters of the description have certain limits, which shall be subject to the console.

4. Click ***OK*** to create the parameter set successfully and return to the list page of the parameter set.
