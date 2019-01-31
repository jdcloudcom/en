## Initiate Deployment

On the "Application" page, you can view the deployment group created in the previous step through the "Deployment Group" page.

![Alt text](https://github.com/jdcloudcom/cn/blob/edit/image/CodeDeploy/starting9.png)

For a single deployment group, its supported operations include Initiate Deployment, Deployment History, Edit and Delete.

Click **Initiate Deployment** and access "Create Deployment" page, and there are options as below:

- Deployment description: Optional, it is the description information for this deployment
- Deployment source: Support multiple sources. Please select URL to upload it
- URL address: Please fill http://ftp.cuhk.edu.hk/pub/packages/apache.org/tomcat/tomcat-7/v7.0.92/bin/apache-tomcat-7.0.92.tar.gz
- File type: Please select .tar.gz
- Deployment operating command: Please select **Enter Deployment Operating Command** and use the "Form" function to fill in specific operating commands. The operations are as below:

![Alt text](https://github.com/jdcloudcom/cn/blob/edit/image/CodeDeploy/starting17.png)

Start script: /home/apache-tomcat-7.0.92/bin/startup.sh

After filling in the deployment task information, please click **Initiate Deployment** to trigger deployment operation and redirect to the "Deployment Details" page.
