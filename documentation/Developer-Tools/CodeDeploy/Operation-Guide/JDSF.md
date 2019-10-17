## Use JD Distributed Service Framework

When creating applications, if **Yes** is selected for "Use JD Distributed Service Framework", then the registration center can be designated via CodeDeploy and deployment operation can be made.

**Create Application**

Select **Yes** in the option of "Use JD Distributed Service Framework".

**Create Deployment Group**

Specific information is as below:

- Deployment type: Support "Rolling Deployment" only
- Registration Center of JD Distributed Service Framework: It needs to designate the existing registration center. Please note that the Virtual Machines in the selected deployment targets and the registration center shall be under the same subnet

**Initiate Deployment**

When the deployment task is initializing, corresponding environment variable will be obtained according to the selected "Registration Center of JD Distributed Service Framework" and written to the global environment variables of deployment targets (Virtual Machines).
Environment variables are as follows:
- JDSF_CONSUL_HOST
- JDSF_CONSUL_PORT
- JDSF_REGISTRY_ADDRESS
