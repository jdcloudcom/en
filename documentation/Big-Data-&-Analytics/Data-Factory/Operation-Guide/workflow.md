# Workflow

Precondition: You need make sure that you have created the datasheet in the ‘Data Compute’ - ‘Data Warehouse’ and uploaded data. The result list shall be created because the workflow running result is output to the data repository.

**Operation Steps:**

#### 1. Choose the computing node region;

#### 2. Click **Create definition** to create the workflow:

![创建工作流1](../../../../image/Data-Factory/create-work-flow-1.png)

#### 3. Set the spark task:

Drag SPARK module to the center area; add spark task name, description, selection type and complemented script. Connect the workflow with the mouse upon saving when script type supports sql, python and scala.

![创建工作流1](../../../../image/Data-Factory/create-work-flow-2.png)

Click the SPARK task with the right key to start, edit, delete and retry the task and examine the log.

![创建工作流1](../../../../image/Data-Factory/create-work-flow-3.png)

#### 4. Set data integration task

Drag data integration to the center of screen; pop out the edit menu for data synchronization.

![创建工作流1](../../../../image/Data-Factory/create-work-flow-4.png)

Click "OK" key for save:

![创建工作流1](../../../../image/Data-Factory/create-work-flow-5.png)

Click the data integration task with the right key to start, edit, delete and retry the task and examine the log.

#### 5. Choose ‘set’ Tab page to save the workflow, and set the execution policy according to demands:

![创建工作流1](../../../../image/Data-Factory/create-work-flow-6.png)

#### 6. Set alarm information:

![创建工作流1](../../../../image/Data-Factory/create-work-flow-7.png)
