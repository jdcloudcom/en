## Feature Introduction  
  The reset image feature supports to modify the container image, run commands, run parameters, environment variables, working directories, and startup items of a container instance.  
## Operation Description  
  1.Native Container Instance is in stop status.  
  2. The system disk will be initialized by resetting images and data in the system disk will be cleared by such operation. Please well make backup if you intended to keep such data.  
## Operation Guide  
  1. Open JD Cloud Console, select [Elastic Compute] - [Native Container] - [Container Instance], enter Native Container Instance List Page.   
  2. Selection More, click **Reset Image**, enter Reset Image Page.  
  3. The image can select JD Cloud image or third-party image and support the command to modify the running, the running parameters, environment variables, working directory, and startup items; please refer to requirements of [Create Container Instance](https://docs.jdcloud.com/en/native-container/create-to-instance) for specific rules.  
  4. Click **Confirm**, then the container instance enters in reset status, finally in the stop status. If it is required to enable, please manually enable container instance.  
