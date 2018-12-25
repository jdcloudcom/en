# Getting Started Overview

　　The Resource Orchestration service is a delivery mode used for deploying resources and applications by using the template as the standard. With such service, all resources are created and configured automatically by starting the orchestration engine via the orchestration template, so as to achieve the purpose of automatic deployment, operation and maintenance of resources and applications. The user is only required to describe the cloud resources (such as the Virtual Machine, the Cloud Disk Service, and the Cloud Database Instances) according to the resource orchestration template specification of JD Cloud, start the template via the orchestration engine and configure related resources.

　　The Resource Orchestration template is a text file which can be read and easily compiled by the user.
# Create Resource Stack

## **Preconditions** 

- Register a JD Cloud account, activate and verify the same, to respectively access JD Cloud registration, JD Cloud Login and Real-name Verification.
- If you need to create the billing instances paid by configuration, you need to keep your balance above RMB 50. If the balance is less than the limit, please recharge your account.
- For information about regions and availability zones, please refer to the region and the availability zones.

## **Operation Steps**

### I. Select a template

1. Turn on the console, select **Management-Resource Orchestration-Resource Stack**, select the region in which the resource stack is intended to be created, and click **Create Resource Stack**. The regions such as cn-north-1, cn-south-1, cn-east-1 and cn-east-2 are supported.

 ![创建资源栈](https://raw.githubusercontent.com/jdcloudcom/cn/edit/image/Resource-Orchestration/resource001.png)
 
2. Select a template type, **Example Template** or **My Template**. The “Example Template” is a reference text file with the standard resource delivery mode officially provided by JD Cloud. The Getting Started will be showed by taking examples with the “Example Template”.
Select the template source, “vpc_subnet_(vpc_subnet)”. The template content will be automatically produced and click **Next**.

![创建资源栈-选择模板](https://raw.githubusercontent.com/jdcloudcom/cn/edit/image/Resource-Orchestration/resource002.png)

### II. Complete configuration information

![创建资源栈-填写配置信息](https://raw.githubusercontent.com/jdcloudcom/cn/edit/image/Resource-Orchestration/resource003.png)

### III. Review audit information

![创建资源栈-查看审核信息](https://raw.githubusercontent.com/jdcloudcom/cn/edit/image/Resource-Orchestration/resource004.png)

### IV. Resource Stack Created

![创建资源栈-资源栈创建成功](https://raw.githubusercontent.com/jdcloudcom/cn/edit/image/Resource-Orchestration/resource005.png)
### V. View Resource Stacks Created in the Resource Stack List

![资源栈列表](https://raw.githubusercontent.com/jdcloudcom/cn/edit/image/Resource-Orchestration/resource006.png)

# View Resource Stack Information

1. Turn on the console, select **Management-Resource Orchestration-Resource Stack** Management and select **Resource Stack Management

2. We can view general conditions, resources, events and templates of resource stacks in the details of resource stack.
