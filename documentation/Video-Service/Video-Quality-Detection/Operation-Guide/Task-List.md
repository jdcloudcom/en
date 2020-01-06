# Detection Task List
Log in Video Quality Detection Console (by default, login the "Detection Task List" Page) and then you can view created detection task in the task list. Information and main functions of the page are as follows:
![](https://github.com/jdcloudcom/cn/blob/cn-Video-Quality-Detection/image/video-quality-detection/%E8%B4%A8%E6%A3%80%E6%96%B01.png)

1 [Create Detection Task], detection task creation entrance;  
2. [Task status filter], when tasks are searched, they can be filtered according to task statuses. The task statuses comprise preparing, succeeded, failed and detecting; the created task will automatically enter the preparing status; and succeeded and failed mean that the task detection is completed, with detection result available for view.  
3. [Time Filter], filter by time dimension is supported when tasks are searched;  
4. [Task Operation], comprise three parts of "detection result", "replication" and "deletion". The "detection result" can be clicked and viewed after the task detection is completed (the statuses include succeeded and failed); "replication" refers to replicate task address; and "deletion" refers to delete the detection task.   

## Create Detection Task
Click **Create Detection Task** to open the detection task creation window, enter URL and select detection template to create tasks.   
Note: A single task supports addition of several URLs, which are distinguished by line breaks. Detection of maximum 20 files is supported.
![](https://github.com/jdcloudcom/cn/blob/cn-Video-Quality-Detection/image/video-quality-detection/%E8%B4%A8%E6%A3%80%E6%96%B02.png)

## View Detection Result
After the task detection is completed, click **Detection Result** in [Task Operation] to view detection result details, as shown in the figure below. For the detected task, information such as detection value and start/end time can be viewed; and for the failed task, failure reasons will be displayed, such as "this file is not a video file" and "URL is unavailable".
![](https://github.com/jdcloudcom/cn/blob/cn-Video-Quality-Detection/image/video-quality-detection/%E8%B4%A8%E6%A3%803.png)

Detection principle: Defect level of each detection item can be calculated based on algorithm and detection item feature. By outputting comparison between detection item value and value range, detection results can be visually reflected.    
Value range and description of each detection item are as shown below:
![](https://github.com/jdcloudcom/cn/blob/cn-Video-Quality-Detection/image/video-quality-detection/%E8%B4%A8%E6%A3%804.png)

