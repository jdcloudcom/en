## Deployment Type

**Rolling Deployment**

The rolling deployment is a deployment method for replacing versions in order and routing the traffic. Taking checking the "Use of Load Balancer" as example, specifically:

1) Before launching, all machines in the deployment group will provide service by virtual of taking over traffic.

![Alt text](https://github.com/jdcloudcom/cn/blob/codedeploy/image/CodeDeploy/rollingdeploy1.png)

2) When the deployment is started, please select some machines from the selected group according to the "concurrency" configured and unregister such machines from the virtual server group list associated with the specified backend service of the Load Balancer. In other words, some machines are used for providing external service temporarily. The concurrency of 1 set is taken as example here.

![Alt text](https://github.com/jdcloudcom/cn/blob/codedeploy/image/CodeDeploy/rollingdeploy2.png)

3) The new version deployment is made to the machines which no longer take over the traffic.

![Alt text](https://github.com/jdcloudcom/cn/blob/codedeploy/image/CodeDeploy/rollingdeploy3.png)

4) After the deployment is successfully made, the machines with updated deployment versions will be registered in the virtual server group list associated with the backend service of the Load Balancer again.

![Alt text](https://github.com/jdcloudcom/cn/blob/codedeploy/image/CodeDeploy/rollingdeploy4.png)

5) Repeat the step 2-4 in order until all machines are deployed with new versions, take over traffic and provide services.

![Alt text](https://github.com/jdcloudcom/cn/blob/codedeploy/image/CodeDeploy/rollingdeploy5.png)


For the first deployment, the virtual server group will be automatically created in the name of deploy_R_${group id}_${random string} and will be associated with the backend service of specified Load Balancer.

As the backend service of a Load Balancer can only be associated with a virtual server group, the virtual server group associated with the backend service originally will be replaced by the virtual server group created by default at the time of first deployment, and then be kept and not be subject to any treatment.

For the first deployment:

1) Before launching, all machines in the deployment group can provide service by virtual of not taking over the traffic.

![Alt text](https://github.com/jdcloudcom/cn/blob/codedeploy/image/CodeDeploy/rollingdeploy6.png)

2) When the deployment is started, please select some machines from the selected group according to the "concurrency" configured and deploy the new version. The concurrency of 1 set is taken as example here.

![Alt text](https://github.com/jdcloudcom/cn/blob/codedeploy/image/CodeDeploy/rollingdeploy7.png)

3) After the deployment is successfully made, the virtual server group will be created in the name of deploy_R_${group id}_${random string} (in the specified Load Balancer instance), these machines will be registered in the virtual server group, and the virtual server group will be associated with the backend service of the specified Load Balancer.

![Alt text](https://github.com/jdcloudcom/cn/blob/codedeploy/image/CodeDeploy/rollingdeploy8.png)

4) Repeat the step 2-3 in order until all machines are deployed with new versions, take over traffic and provide services.

![Alt text](https://github.com/jdcloudcom/cn/blob/codedeploy/image/CodeDeploy/rollingdeploy9.png)

The specific steps of rolling deployment are as above. Another deployment type is specified as below:

**Blue and Green Deployment**

Blue and green deployment is an on-line deployment method insuring that the system service is not interrupted. Specifically:

1) Before launch, either the blue group or the green group (such as the blue group) will provide service externally via the Load Balancer by virtual of taking over traffic.

![Alt text](https://github.com/jdcloudcom/cn/blob/codedeploy/image/CodeDeploy/bluegreendeploy1.png)

2) When the deployment is started, the new version deployment is made to the group taking over no traffic (such as the green group). In such case, the blue group will still provide the service.

![Alt text](https://github.com/jdcloudcom/cn/blob/codedeploy/image/CodeDeploy/bluegreendeploy2.png)

3) When the green group deployment is made, please register the green group host in the virtual server group list associated with the backend service of a specified Load Balancer (in the name of deploy_G_${group id}_${random string}. and the virtual server group is automatically created).

At the same time, please delete the virtual server group in the name of deploy_B_${group id}_${random string} of the blue group. In other words, the traffic routing is changed from the blue group to the green group, and the green group rather than the blue group will provide service.

![Alt text](https://github.com/jdcloudcom/cn/blob/codedeploy/image/CodeDeploy/bluegreendeploy3.png)

Since then, the blue group will be updated to V4 for another deployment and take over traffic, while the green group will not take over traffic anymore.

Please note that the CodeDeploy can only be used for operating a specific virtual server group associated with the backend service of a specified Load Balancer in the deployment page created by you.

For the first deployment, the virtual server group will be automatically created in the name of deploy_B_${group id}_${random string} and will be associated with the backend service of specified Load Balancer:

1) Before launching, all machines in the deployment group (blue group and green group) can provide service by virtual of not taking over the traffic.

![Alt text](https://github.com/jdcloudcom/cn/blob/codedeploy/image/CodeDeploy/bluegreendeploy4.png)

2) When the deployment is started, machines in the blue group will carry out the new version deployment.

![Alt text](https://github.com/jdcloudcom/cn/blob/codedeploy/image/CodeDeploy/bluegreendeploy5.png)

3) After the deployment is successfully made, the virtual server group will be created in the name of deploy_B_${group id}_${random string} (in the specified Load Balancer instance), the blue group machines will be registered in the virtual server group, and the virtual server group will be associated with the backend service of the specified Load Balancer. To this extent, the blue group can provide service by virtue of taking over traffic. No operation is made by the green group.

![Alt text](https://github.com/jdcloudcom/cn/blob/codedeploy/image/CodeDeploy/bluegreendeploy6.png)


**Naming Rules for Automatically-created Virtual Server Group of Load Balancer**

deploy_R_${group id}_${random string}: Virtual Server Group at the Time of Rolling Deployment

deploy_B_${group id}_${random string}: Virtual Server Group Corresponding to the Blue Group in Case of Blue and Green Deployment

deploy_G_${group id}_${random string}: Virtual Server Group Corresponding to the Green Group in Case of Rolling Deployment

Descriptions for the variable therein are as follows:

| Variable      |    Explanation |
| :--------: | :--------:|
| ${group id}  | Deployment group ID, which can be viewed on the application details page |
| ${random string}  | Random Number |

**Please note that** when the Load Balancer adds the virtual server groups or adds Virtual Machines to the existing virtual server groups, the health check will be performed first before opening traffic. Therefore, there is a certain time interval, and the health check can be determined whether to be enabled according to the actual situation.
