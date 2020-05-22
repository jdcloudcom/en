# Task management
Log in MPS Console and log in the "Task Management" Page by default. Now, the Console only support snapshot task management. The transcoding task can be realized via OpenAPI.   
You can view created snapshot task in the Task Management Page. Information and main functions of the page are as follows:
![](https://github.com/jdcloudcom/cn/blob/cn-Media-Processing-Service/image/Media-Processing-Service/mps-1.png)

1. [Create Task], create snapshot task entrance;  
2. [Task Search], support snapshot task search by task id;    
3. [Task Status Filter], when tasks are searched, they can be filtered according to task statuses. The task statuses comprise preparing, snapshotting, completed and failed; the created task will automatically enter the preparing status; snapshotting is the executing task status; and the statuses, completed and failed, mean that the task is completed.    
4. [Task Operation], view task details.   

## Create Task
Click **Create Task** to open the task creation page. Complete the following information for new tasks:       
![](https://github.com/jdcloudcom/cn/blob/cn-Media-Processing-Service/image/Media-Processing-Service/mps-2.png)     
1. [Select Region], select storage regions of the source file and the output file (the source file and the output file for media processing must be in the same storage region);      
2. [Output bucket], fill in the bucket of source file; the bucket name shall consist of lowercase letters, numbers and line-through (-), shall be started and ended with lowercase letters or numbers and shall contain 3-63 characters in length;     
3. [Enter Path], complete source file path and pay attention to complete the complete path, such as test/video.mp4. The path cannot be started with a slash (/) or contain a backslash (\) or double slashes (//).         
4. [Output bucket], fill in the target storage bucket of source file; the bucket name shall consist of lowercase letters, numbers and line-through (-), shall be started and ended with lowercase letters or numbers and shall contain 3-63 character in length;    
5. [Output Path], it is not a required field; fill in the path of output file; to guarantee uniqueness of output file, the output path shall consist of the customized part + default rules, with details as follows:    
   Snapshots: mps/Year/Month/Day/Source File Name/Task id. Snapshot S/N. Suffix;     
   CSS Sprite: mps/Year/Month/Day/Source File Name/Task id-sprite. Suffix;     
   The "mps/Year/Month/Day/Source File Name" can be customized. If the output path is not filled in, it will be designated according to default rules.     
6. [Snapshot Template], select desired snapshot templates from the template library, supporting a variety of snapshots and CSS Sprites, and only one snapshot template can be selected to one single task.       

## Task View
Click **View** in **Task List-Operation** to view task details, including information such as region, input bucket, input path, output bucket, output path and snapshot template.    
![](https://github.com/jdcloudcom/cn/blob/cn-Media-Processing-Service/image/Media-Processing-Service/mps-3.png)
