# Change Instance Configuration

In case that current configuration of JDW instances cannot meet business requirements, you can change such configuration in accordance with your needs. JDW instances support upgrade of node specifications and extension of node counts.

## Note

- Where there will be flashover, master-slave switch and so on in the process of change configuration, it is recommended to do this operation during the low peak of the business and ensure that the application has a retry mechanism.
- The time required for change configuration is related to the size of data and the number of nodes, which usually can be finished in a few minutes to several hours.

## Operation Steps

1. Log in the [JDW Console](https://jdw-console.jdcloud.com/list).

2. Click **Change Configuration** on the Instance List page or Instance Details page to open the "Change Configuration" popup.

3. The change configuration supports to upgrade the node specification and expand the node number.

   - Upgrade Node Specification

     ![image-20191226144738092](../../../../../image/JCS-for-Greenplum/jdw-015.png)
     
     Change Method: Select **Upgrade Node Specification**
   
     Node Specification: Select a specification higher than the current configuration.
   
     Cost: When the payment type is Pay By Configuration, the cost is that of the instance after the configuration change; when the payment type is Monthly Package, the cost is the difference to be paid after the configuration change.
   
   - Expand Node Number

     ![image-20191226150310512](../../../../../image/JCS-for-Greenplum/jdw-016.png)
   
     Expand Method: Select **Expand Node Number**.
     
     Add Node Number: For the Segment node number to be added in the current instance, at least 2 nodes shall be added to one configuration change, and the total number of nodes of the instance shall not exceed 16.
     
     Cost: When the payment type is Pay By Configuration, the cost is that of the instance after the configuration change; when the payment type is Monthly Package, the cost is the difference to be paid after the configuration change.
   
4. After clicking **OK**, start to execute the change configuration, and change the state of the instance to "Configuration Changing", waiting for the completion of configuration change
   
   
   
   

