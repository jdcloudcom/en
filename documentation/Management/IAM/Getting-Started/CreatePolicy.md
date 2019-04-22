# What is a policy

Authorization policy refers to the JSON document with one or multiple permissions defined, developing policies shall follow the JSON syntax specification. By granting policies to the sub-users, groups, roles to control the access permissions of JD Cloud resources for the sub-users, groups and roles. In which, the access permission owned by the sub-user are the set of authorization policies added to the sub-user and the group it belongs to.

IAM supports two types of policies: system policies preset by JD Cloud and customized policies managed by users themselves.

- The system policy preset by JD Cloud is set by JD Cloud when the product line is connected, which are not allowed to be modified by users. You can directly use and grant it to a sub-user, group and role.
- As for customized policies managed by users themselves, users can create policies for specific action to specific resource by means of customized policy. You can also add restricted conditions to restrict source IP, specific access time, Virtual MFA Verification, etc. Users can edit this kind of policies by themselves or delete customized policies.


## Policy Creation

On the Authorization Policy Management list page, click the **Create** button to obtain three ways to create a customized policy. The first is the visual policy generator, the second is the JSON policy editor, and the third is to create policy by tag.

![创建策略](../../../../image/IAM/PolicyManagement/创建策略.jpg)

### Visual Policy Generator

The visual policy generator is designed to provide users with more friendly and convenient tools for policy creation. Users can visually select product lines, actions, resources and other information in turn. After clicking for confirmation, it will automatically generate policies in Json format for you.

- Enter the policy name and description.
- Selection of product line (Service Name). For more information, please refer to [Cloud Service Supporting IAM](https://docs.jdcloud.com/en/iam/support-services)
- Select Action
- Select Resources
- Once a set of product lines, resources, and actions are specified, you can click the Add button until you complete the entire policy.

**V2 Version Visual Policy Creation Page**

![V2版本可视化策略创建页面](../../../../image/IAM/PolicyManagement/可视化策略创建v2.jpg)

**V3 Version Visual Policy Creation Page**

![V3版本可视化策略创建页面](../../../../image/IAM/PolicyManagement/可视化策略创建v3.jpg)

### Create policy by tag

Create policy by tag is a feature of creating visual policy jointly provided by the tag service, by which users do not need to designate the operation and resource one by one.

 - For resource specification, the tag associated resources can be automatically obtained according to the specified tag. When the primary account needs to grant the permission of the newly created resource to the sub-user, there is no need to change the policy, it only needs to label the corresponding resource, the policy can take effect in time.
 - For operation specification, the operations can be specified in batches by selecting corresponding permission set according to the product line name.
 
 ![按标签创建策略页面](../../../../image/IAM/PolicyManagement/按标签创建策略页面.jpg)
 
### JSON Policy Generator

In the JSON policy generator, after entering the policy name and description, you can write JSON policies directly, or you can select a policy template before editing JSON documents.

![Json 选择模板](../../../../image/IAM/PolicyManagement/Json策略创建.jpg)
