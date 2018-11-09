The primary account is the owner of resources, actually pays for resource, and has full control over resources. The subaccount does not own any resources, and has no access to resource by default. A subaccount can access a specific resource through the console or API only when it is authorized by the primary account.

The primary account authorizes the subaccount by adding an authorization policy to the subaccount (or the group it belongs to). The resource access rights owned by the subaccount are the set of authorization policies added to the subaccount and the group it belongs to.

The authorization policy (Policy) is a JSON document that describes one or more permissions. The primary account authorizes the subaccount or group by creating a policy and adding the policy to the subaccount or group.

This document describes how to view policy content and authorization in the console, create policies, add a policy to subaccounts and groups, and remove a policy from the subaccount and group permissions.

# View policy
Log in the console and enter Identity and Access Management > Authorization Policy Management to view all system policies and customized policies.
The number of times a policy is referenced is the number of entities that the policy has been added to, including subaccounts and groups. You are not allowed to modify or delete system policies; however, you can create, modify, or delete your customized policies.
![View Policy 1](https://github.com/jdcloudcom/cn/blob/edit/image/IAM/Strategy%20Management/%E6%9F%A5%E7%9C%8B%E7%AD%96%E7%95%A51.jpg)
Click the policy name to enter the policy details page. In the basic information, two ways can be used to view policy information.
The first is a visualization policy that lists all the resources and actions authorized in the policy document.
The second is a JSON format document.
In the authorization policy record, you can view the record of addition and dissolution of the authorization policy of subaccounts or groups.
![View Policy 2](https://github.com/jdcloudcom/cn/blob/edit/image/IAM/Strategy%20Management/%E6%9F%A5%E7%9C%8B%E7%AD%96%E7%95%A52.jpg)
![View Policy 3](https://github.com/jdcloudcom/cn/blob/edit/image/IAM/Strategy%20Management/%E6%9F%A5%E7%9C%8B%E7%AD%96%E7%95%A53.jpg)
![View Policy 4](https://github.com/jdcloudcom/cn/blob/edit/image/IAM/Strategy%20Management/%E6%9F%A5%E7%9C%8B%E7%AD%96%E7%95%A54.jpg)

# Create a policy
On the Authorization Policy Management list page, click the **Create** to obtain two ways to create a customized policy. The first is the facilitation policy generator, and the second is the JSON policy editor.
![Create Policy](https://github.com/jdcloudcom/cn/blob/edit/image/IAM/Strategy%20Management/%E5%88%9B%E5%BB%BA%E7%AD%96%E7%95%A5.jpg)

# Facilitation policy generator
In the facilitation policy generator, you can visually select resource types, resource IDs and operating permissions to generate one or more sets of permissions.
![Facilitation Policy Generator](https://github.com/jdcloudcom/cn/blob/edit/image/IAM/Strategy%20Management/%E4%BE%BF%E5%88%A9%E5%8C%96%E7%AD%96%E7%95%A5%E7%94%9F%E6%88%90%E5%99%A8.jpg)

For example, select to authorize the virtual machine, and then click Add Resources, and select the virtual machine instance that needs to be authorized in the window shown below:

 - To authorize all virtual machine resources (including all regions) under the primary account, including newly purchased resources in the future, check the selection box a and confirm;
 - To authorize the virtual machine resources purchased in the current region, check b, click the selection arrow and confirm;
 - To authorize some resources in the current region, check c according to the requirements, click the selection arrow and confirm;

Note: After the region is switched, resources need to be reselected.
![重新选择资源](https://github.com/jdcloudcom/cn/blob/edit/image/IAM/Strategy%20Management/%E9%87%8D%E6%96%B0%E9%80%89%E6%8B%A9%E8%B5%84%E6%BA%90.png)

After completing a set of resource permission configuration, you can continue to add permissions until you complete the policy setting.
![继续添加权限](https://github.com/jdcloudcom/cn/blob/edit/image/IAM/Strategy%20Management/%E7%BB%A7%E7%BB%AD%E6%B7%BB%E5%8A%A0%E6%9D%83%E9%99%90.jpg)

Click the **Next** button, fill in the policy name and description, and then the policy can be generated.
![生成策略](https://github.com/jdcloudcom/cn/blob/edit/image/IAM/Strategy%20Management/%E7%94%9F%E6%88%90%E7%AD%96%E7%95%A5.jpg)

# JSON policy generator
In the JSON policy generator, you can write JSON policies directly, or you can select a policy template before editing JSON documents.
![Json 选择模板](https://github.com/jdcloudcom/cn/blob/edit/image/IAM/Strategy%20Management/Json%20%E9%80%89%E6%8B%A9%E6%A8%A1%E6%9D%BF.jpg)

Click the **Select Template** button to select a system policy or customized policy as the template.
![Json 选择模板2](https://github.com/jdcloudcom/cn/blob/edit/image/IAM/Strategy%20Management/Json%20%E9%80%89%E6%8B%A9%E6%A8%A1%E6%9D%BF2.jpg)

If you need to add other permissions on the selected policy template, you can click Add Permission to complete it in a convenient way.
![添加其他权限](https://github.com/jdcloudcom/cn/blob/edit/image/IAM/Strategy%20Management/Json%20%E6%B7%BB%E5%8A%A0%E6%9D%83%E9%99%90.png)
Finally, a customized policy can be generated after the policy name and description have been perfected by editing the generated JSON policy according to the authorization requirements.

# Add or remove the authorization policies of subaccounts (groups)
On the User Management page, you can add authorization to a subaccount.
![为子账号添加授权](https://github.com/jdcloudcom/cn/blob/edit/image/IAM/Strategy%20Management/%E4%B8%BA%E5%AD%90%E8%B4%A6%E5%8F%B7%E6%B7%BB%E5%8A%A0%E6%8E%88%E6%9D%83.jpg)
![为子账号添加授权](https://github.com/jdcloudcom/cn/blob/edit/image/IAM/Strategy%20Management/%E4%B8%BA%E5%AD%90%E8%B4%A6%E5%8F%B7%E6%B7%BB%E5%8A%A0%E6%8E%88%E6%9D%832.png)

On the User Details > User Authorization Policy page, you can add or remove the authorization of a subaccount.
![添加或解除子账号的授权](https://github.com/jdcloudcom/cn/blob/edit/image/IAM/Strategy%20Management/%E5%8A%A0%20%E6%88%96%20%E8%A7%A3%E9%99%A4%20%E5%AD%90%E8%B4%A6%E5%8F%B7%E7%9A%84%E6%8E%88%E6%9D%83.jpg)

On the User Group Management page, you can add authorization to a group.
![为群组添加授权](https://github.com/jdcloudcom/cn/blob/edit/image/IAM/Strategy%20Management/%E4%B8%BA%E7%BE%A4%E7%BB%84%E6%B7%BB%E5%8A%A0%E6%8E%88%E6%9D%83.jpg)

On the Group Details > Group Authorization Policy Management page, you can add or remove the authorization of a group.
![添加或解除群组的授权](https://github.com/jdcloudcom/cn/blob/edit/image/IAM/Strategy%20Management/%E6%B7%BB%E5%8A%A0%20%E6%88%96%20%E8%A7%A3%E9%99%A4%20%E7%BE%A4%E7%BB%84%E7%9A%84%E6%8E%88%E6%9D%83.jpg)

