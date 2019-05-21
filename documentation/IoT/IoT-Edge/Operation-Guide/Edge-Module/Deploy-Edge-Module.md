# Deployment of Edge Computing Module

You can deploy the edge computing module, through the Console for IoT Edge. Next, some descriptions are provided, with the official image detection module provided by us as an example.

## Preconditions

- Installation of the Edge system has been completed, and it is guaranteed that the edge node is online.
- The Object Storage Service business is subscribed and one Bucket for storing edge computing result data is created. In case of service disabled, please firstly enter the Console for [Object Storage Service](https://oss-console.jdcloud.com) to apply for enabling the service.

## Operation Steps

1. Log in [IoT Edge Console](https://iot-console.jdcloud.com/iotedge).

2. On the “Edge Computing List” Page， click **Create Deployment** to enter the “Create Deployment” page.

3. On the “Create Deployment - Step 1” page, choose the edge node ID to be deployed and click to add devices: Add the device used for collecting the edge computing module.

   ![新建部署第一步](../../../../../image/IoT/IoT-Edge/newdeploy0.png)

4. On the “Create Deployment - Step 2” page, please fill in it and choose the relevant configuration as per the notification on it

   ![新建部署第二步](../../../../../image/IoT/IoT-Edge/newdeploy1.png)

   Where:

   Name of deployment module: You can name the module

   Choose the edge computing module: Choose the computing module used for deployment, and only the image detection module is provided during the beta

   Selection module version: Select the module version number

   AI model: Please select the AI model used for the computing module.

5. Click **Immediately Deploy**, the page will automatically redirect to “Edge Computing List” page, on which you can view the edge node newly deployed.

   

## Related References

- [Create the edge computing node](../../Getting-Started/Create-Edgenode.md)
- [Install the Edge system](../../Getting-Started/Install-Edge-System.md)
- [Check the edge computing result](../Edge-Module/View-Module-Result.md)
                                 
