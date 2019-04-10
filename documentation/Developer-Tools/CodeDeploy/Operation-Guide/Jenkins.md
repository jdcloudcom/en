## Jenkins Plug-ins

**Install Plug-ins**

In Jenkins, you can install a CodeDeploy plug-in through uploading a plug-in.

A user can first download the plug-in to the local memory. The download link is: https://jdcloud-codedeploy.oss.cn-north-1.jcloudcs.com/codedeploy-plugin.hpi

After that, click **Advanced** in Jenkins plug-in management, click **Select File** in **Upload Plug-in**, and then select the downloaded plug-in for installation.

**Use Plug-ins**

Precondition:

- Jenkins can be linked to the public network
- There have been application and deployment group in CodeDeploy
- JD Cloud Console AKSK is known
- Comply with CodeDeploy specifications, namely, there is a jdcloud-codedeploy.yml file in the code root directory

In Jenkins, enter **Operations after Construction** and fill in the following contents:

- Application name: The application name existing in CodeDeploy
- Deployment group name: The deployment group name existing in CodeDeploy
- Region: The region where the application in the CodeDeploy locates
- Package path: The directory designated in the working space is in conformance with the CodeDeploy specifications. Please ensure the jdcloud-codedeploy.yml file is at the top of this directory
- Include file: Include file in working space
- Exclude file: Exclude file in working space
- Proxy host: Proxy host DNS
- Proxy port: Proxy host port
- AccessKey: Used for JD Cloud Access and Secret Key initiating deployment task
- SecretKey: Used for JD Cloud Access and Secret Key initiating deployment task
- Trigger deployment: Whether to automatically trigger CodeDeploy to deploy the latest compilation result
- Wait for deployment result: Whether wait for deployment results
- Use JD Cloud Storage: If this option is selected, the output after Jenkins construction will be automatically stored in the designated space and directory of the Object Storage Service for deployment
- Obtain deployment package based on URL: If this option is selected, contents of the designated URL will be deployed


