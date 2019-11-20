#Create Workflow

Preconditions: Make sure that you have created the data table in the ‘Data Warehouse’ of the ‘Data Compute’ and have uploaded the data. Operation results of the workflow will be output to the data warehouse. Therefore, result table should be created.

**Operation Steps:**

#### 1. Select the region of computing node;

#### 2. Click **Create Definition** to create the workflow:

![创建工作流1](../../../../../image/Data-Factory/create-work-flow-1.png)

#### 3. Set Spark Task:

Drag the module of SPARK to the central area, add the name and description of spark task, select the type, and finish the script. The script type supports sql, python and scala. After saving it, use mouse to connect the workflow.

![创建工作流1](../../../../../image/Data-Factory/create-work-flow-2.png)

Right-click the SPARK task. You can start and edit the task, view its logs, delete and retry it.

![创建工作流1](../../../../../image/Data-Factory/create-work-flow-3.png)

#### 4. Set the Task of Data Integration

Drag the Data Integration into the center of the screen, then edit menu will pop up. Data synchronization can be performed.

![创建工作流1](../../../../../image/Data-Factory/create-work-flow-4.png)

Click the ‘OK’ button to save it:

![创建工作流1](../../../../../image/Data-Factory/create-work-flow-5.png)

Right-click the mask of Data Integration. You can start and edit the task, view its logs, delete and retry it.

#### 5. elect **Set the** Tab page. Save the workflow and set execution policy as required:

![创建工作流1](../../../../../image/Data-Factory/create-work-flow-6.png)

#### 6. Set the alarm information:

![创建工作流1](../../../../../image/Data-Factory/create-work-flow-7.png)
