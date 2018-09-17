#Create Workflow

Preconditions: Make sure that you have created the data table in the ‘Data Warehouse’ of the ‘Data Computing Service’ and have uploaded the data. Operation results of the workflow will be output to the data warehouse. Therefore, result table should be created.

**Operation Steps:**

1.        Select the region of computing node;

2.        Click ‘Create Definition’ to create the workflow:

![Create Workflow 1](../../../../../image/Data-Factory/create-step1.png)

3.        Set Spark Task:

Drag the module of SPARK to the central area; add the name and description of spark task; select the type; finish the script. The script type supports sql, python and scala. After saving it, use mouse to connect the workflow.

![Create Workflow 2](../../../../../image/Data-Factory/create-step2.png)

![Create Workflow 3](../../../../../image/Data-Factory/create-step3.png)

Right-click the SPARK task. You can start and edit the task, view its logs, delete and retry it.

4.        Set the Task of Data Integration

Drag the data integration into the center of the screen, then edit menu will pop up. Data synchronization can be performed.

![Create Workflow 4](../../../../../image/Data-Factory/create-step4.png)

Click the ‘OK’ button to save it:

![Create Workflow 5](../../../../../image/Data-Factory/create-step5.png)

Right-click the mask of data integration. You can start and edit the task, view its logs, delete and retry it.

5.        Select ‘Set the’ Tab page. Save the workflow and set execution policy as required:

![Create Workflow 6](../../../../../image/Data-Factory/create-step6.png)

6.        Set the alarm information:

![Create Workflow 7](../../../../../image/Data-Factory/create-step7.png)
