# Probe Deployment Questions

### 1. Why is the VPC Intranet probe deployment off-line after completion?
![](../../../../image/Website-Threat-Inspector/WTS-VPC-ip-00lixian.jpg)


- After probe deployment is completed, if the deployment status is off-line, you need to do the following operations:

  - Go to "Cloud Service - Native Container" to associate EIP
    ![](../../../../image/Website-Threat-Inspector/wts-VPC-ip-01docker.png)

  - Find the container instance created by Website Threat Inspector
    ![](../../../../image/Website-Threat-Inspector/wts-VPC-ip-02a.png)

  - Associate EIP in "Actions - More"
    ![](../../../../image/Website-Threat-Inspector/wts-VPC-ip-03binda.png)

- If you find that no EIP is available, you need to apply for an EIP

  - Application Method: "Cloud Service - Virtual Private Cloud - EIP"
    ![](../../../../image/Website-Threat-Inspector/wts-VPC-ip-01a.png)

  - There is no requirement for the specific EIP application method and you can select monthly package or payment by traffic or any other method as needed.
