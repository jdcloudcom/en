## Feature Introduction  
  The reset image feature supports to modify the container image, run commands, run parameters, environment variables, working directories, startup items and probe of Pod.  
## Operation Description  
  1. Native Container Pod is in stop status.  
  2. The system disk will be initialized by resetting images and data in the system disk will be cleared by such operation. Please well make backup if you intended to keep such data.  
## Operation Guide  
  1. Open JD Cloud console, select [Elastic Compute] - [Native Container] - [Pod] enter Native Container Pod List page;   
  2. Selection More, click **Reset Image**, enter Reset Image Page.  
  3. Select a reset container; the image can select JD Cloud image or third-party image; support the command to modify the running, the running parameters, environment variables, working directory, startup items, probe, storage information; please refer to requirements of [CreatePod](https://docs.jdcloud.com/en/native-container/create-to-pod) for specific rules. Click "Save".  
  4. Edit if it is required to modify the selected container; select cancel reset if it is required to cancel.  
  5. Click **Confirm** after saving all containers required to be reset, then Pod enters in reset status, finally in the stop status. If it is required to enable, please manually enable Pod.  
