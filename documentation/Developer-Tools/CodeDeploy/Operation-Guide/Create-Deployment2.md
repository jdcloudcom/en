## Create Deployment

The "Create Deployment" page can be accessed via options below:

- Deployment description: Optional, it is the description information for this deployment
- Deployment source: Multiple deployment sources are supported, including "URL Upload", "My CodeBuild" and "My Object Storage Service". When the "URL Upload" is selected, the URL address and MD5 shall be filled; when the "CodeBuild" is selected, the project name of CodeBuild and SN of successful construction shall be selected; and when the "Object Storage Service" is selected, the Object Storage Service Bucket and directory shall be selected.
- File type: Select the package type
- Deployment operation command: You are allowed to pack the operating commands into a code package or fill them in the page.

   - Enter deployment operation command: A convenient and easy-to-use form is provided to meet basic demands of most users, please select the "Form Completion" function and fill in specific operation commands. At the same time, to cope with complex operation commands, yaml files can be filled. For writing specifications, please refer to "Operation Guide-AppSec"
  
     - Deployment path: At most five pairs of sources and destinations are supported. For details, please refer to "Operation Guide-source and destination in AppSec File"
     - Executing account: Refer to the account used when executing the deployment operation. This account shall be the existing account of the system. Otherwise, the account cannot be deployed.
     - Time-out period: The time-out period for script execution is in second. The maximum value is 10 s.
     - Stop script: Refer to the script used for stopping a program in case of rollback and deployment update
     - Start script: Refer to the script used for starting a program in case of rollback and deployment update
     - Check script: Refer to the script used for checking deployment results upon completion of the deployment The return value 0 means successful, while the return value other than 0 means failed
     
   - Use AppSec of code root directory: The AppSec file containing the deployment operation command, in the name of appsec.yaml, is added in the code root directory. For writing specifications, please refer to "Operation Guide-AppSec File"

![Alt text](https://github.com/jdcloudcom/cn/blob/codedeploy/image/CodeDeploy/operation15.png)


After filling in the deployment task information, please click **Deployment** to trigger deployment.
