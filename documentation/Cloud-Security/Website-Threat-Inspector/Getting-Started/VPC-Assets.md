# Scan JD Cloud & AI's Intranet Assets

​	For public cloud assets you deployed on JD Cloud & AI, you can implement VPC intranet asset scan by deploying a VPC subnet probe, which can satisfy your requirement for controlling the intranet asset risk state.

## 1. VPC Probe Deployment Region

​	At present, the intranet probe can be deployed in North China (Beijing), East China (Shanghai) and South China (Guangzhou), excluding East China (Suqian) at the moment.

## 2. Operation Steps:

### (1) Add VPC scan probe to be deployed

Log in the Console, select **Asset Management** on the left and click **VPC Asset Management

![](../../../../image/Website-Threat-Inspector/wts-vpc-assets-11.png)

You can conduct retrieval management of VPC intranet probe on the Deploy Intranet Probe page

- Probe retrieval

  By screening the asset location, probe version information, deployment status and other dimensions, you can visually find the deployment situation of subnet probe in each region under current user pin.

| Retrieval Dimension | Retrieval Item                                                 |
| -------- | ------------------------------------------------------ |
| Region     | North China (Beijing), East China (Shanghai), South China (Guangzhou)               |
| Version      | All Version, V1.0                                       |
| Status     | All Status, On-line, Off-line, Deploying, Deployment Failed, Uninstalling, Not Deployed |

### (2) Select VPC scan specification as required

- Deploy subnet probe

  Select the deployment region and subnet name, and click **Deploy** to deploy the probe.

![](../../../../image/Website-Threat-Inspector/wts-vpc-assets-12.png)

- Select deployment instance type

  The intranet probe to be deployed will be deployed in the Native Container instance. You can select the specification for availability zone and container instance as required in the selected regional subnet.

| Select Availability Zone | Optional Item                  |
| ---------- | ------------------------- |
| Availability Zone     | Availability Zone A, Availability Zone B, Availability Zone C |

- Specification of Native Container

| Native Container Specification Selection | Subnet Includes Available IP Size                 |
| ---------------- | ---------------------------------- |
| g.n2.medium      | Available IP size included in subnet is less than 256        |
| g.n2.xlarge      | Available IP size included in subnet is between 256~1024 |
| g.n2.2xlarge     | Available IP size included in subnet is between 1024~4096  |
| g.n2.4xlarge     | Available IP size included in subnet is more than 4096     |

Note: After the intranet scan probe is successfully created, do not delete the container __threatscanner_detect_nc__ created in Elastic Compute -> Native Container and the hard disk __threatscanner_detect_disk__ created in Elastic Compute -> Cloud Disk Service.

- Instructions to Deployment Expense of VPC Scanning Probe

> You can deploy relevant scanning probes for segments of VPC scanning assets according to real conditions of asset service of VPC intranet. The scanning probes, based on the container instance, are deployed in your tenant environment. Therefore, you need to separately pay relevant expenses of resource consumption of container instance.

> Container calculation instances of scanning probes adopt the **Pay by Consumption** method. If your intranet assets are scanned and discovered and the segment assets are not changed, you can download the scanning probes to save the cost.

> However, intranet ip assets in the segment are subject to the vpc asset list. Once there are any additional assets or changes in the segment, you need to configure the scanning probe to discover and detect the assets. To guarantee that intranet IP assets are obtained in time and accurately, you are suggested to keep the online deployment status of scanning probe.



![](../../../../image/Website-Threat-Inspector/wts-vpc-assets-13.png)

![](../../../../image/Website-Threat-Inspector/wts-vpc-assets-14.png)