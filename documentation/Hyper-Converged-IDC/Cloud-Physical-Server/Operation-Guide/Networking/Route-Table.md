# Route Table

## Product Overview

The route table consists of a series of routing rules. Now, only default routing rules are provided.<br/>
After VPC is created, the system will automatically create a default route table for you. You can neither create default routes nor delete them.<br/>

The route table consists of a series of route policies and the route policies consist of route target ends, next hop types and next hop addresses. The next hop types support the option below: Internet, for public network access. Now, modification to operation of next hop type is not supported.<br/>

## Default Route Table

When the virtual VPC is created by the user, the automatically created route table is the default route table and cannot be deleted. The default two route policies cannot be deleted or edited.<br/>

## Route Policies

The default route tables will automatically produce default route rules. Each of the three default route policies comprise three parameters and the automatically created route rules are as follows:<br/>

Target end: Target segment description.<br/>
Next hop type: The next hop type supports "Internet".<br/>
Next hop: Specify the next hop address of the specifically redirected route.<br/>

<table>
    <tr>
      <th>Target End</th>
      <th>Type of Next Hop</th>
      <th>Next Hop</th>
    </tr>
    <tr>
      <td>local</td>
      <td>local</td>
      <td>local</td>
    </tr>
    <tr>
      <td>0.0.0.0</td>
      <td>Internet</td>
      <td>Internet</td>
    </tr>
  </table>

The default local route rule refer to interconnection to VPC Intranet, and the route rules are [local, local, local] which cannot be deleted or modified.<br/>
0.0.0.0/0 is the default. If the traffic needs to access the public network, the rule is [0.0.0.0/0, Internet,Internet]. Now, the operation is not supported.<br/>

## Route Table Management

**Route Table List**

Turn on the Console, click **Cloud Physical Server**->**Route Table** in turn at the left navigation bar and log in the Route Table List Page, as shown in the picture below:<br/>
![路由列表](../../Image/route-table-list.png)

Click **Route Table Name** and view route table detail and route policy, as shown in the picture below:<br/>
![路由策略](../../Image/route-table-describe.png)





