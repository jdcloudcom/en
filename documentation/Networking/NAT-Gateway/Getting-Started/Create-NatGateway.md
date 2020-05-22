# Virtual Machines Use NAT Gateway

The best practice environment for SNAT scenario of NAT Gateway includes:

## Create VPC, Subnet and VM

2. 2 subnets (nat-subnet and private-subnet)

3. 2 route tables (nat-rt and private-rt)

4. 1 set of Virtual Machine (test-vm)

5. 1 Set of NAT Gateway (test-natgw)

## Create VPC, Subnet and Virtual Machines

1. Create a test VPC (test-vpc), create two test subnets (nat-subnet,private-subnet) in test-vpc, please refer to [VPC Configuration](../../Virtual-Private-Cloud/Operation-Guide/VPC-Configuration.md) and [Subnet Configuration](../../Virtual-Private-Cloud/Operation-Guide/Subnet-Configuration.md) for detailed steps

2. Create 1 test VM (test-vm) without Public IP in test private-subnet, and please refer to [Create Instance](../../../Elastic-Compute/Virtual-Machines/Operation-Guide/Instance/Create-Instance.md) for detailed steps

3. Create 2 routes tables (nat-rt and private-rt), wherein private-rt is associated with the subset private-subnet and nat-rt is associated with subset nat-subnet. please refer to [Route Table Configuration](../../Virtual-Private-Cloud/Operation-Guide/Route-Table-Configuration.md) for detailed steps

## Create NAT Gateway

1. Open VPC Console https://cns-console.jdcloud.com/host/vpc/list

2. Click **NAT Gateway** on the navigation bar on left side**

3. Click **Create** on NAT Gateway page**

4. Configure NAT Gateway according to the following information

| Configuration          | Description                                                         |
| :------------ | :----------------------------------------------------------- |
| Region and Availability Zone          |	Select the region of VPC that needs to be configured with the NAT Gateway and select the Availability Zone |
| Specification          |	Select NAT Gateway Specification. Specification of NAT Gateway will affect the maximum number of connections and the number of new connections per second of SNAT functionality, but will not affect data throughput. Please refer to [Product Specifications](../Introduction/Specifications.md) for details |
| Network          |Select the VPC and Subnet that need to be configured with NAT Gateway                     |
| NAT Gateway Public IP          |	Select NAT Gateway Public Network Bandwidth |
| Basic Information          |	Fill in NAT Gateway Name(test-natgw) and Description |

    Please note: A single subnet shall be created for NAT Gateway, which cannot be located in the same subnet created for Virtual Machines using NAT Gateway

5. After confirming that the information is correct, click **Buy Now**

6. After confirming the Order Information, tick **Read the NAT Gateway Service Protocol**, click **Instant Account Setup**

7. Return to NAT Gateway Page to confirm that the newly purchased NAT Gateway is displayed, and its status is in operation

## Configure Route Table

1. Open VPC Console https://cns-console.jdcloud.com/host/vpc/list

2. Click **Route Table** on the navigation bar on left side**

3. Select the Route Table(nat-rt) associated with the Subnet where NAT Gateway resides to enter Route Table Details

4. Select **Route Policy**, click **Edit**, add a route, the destination is **0.0.0.0/0**  The next hop type is **Internet**, the next hop is **Internet**,click **Save**  after confirmation

5. Select the Route Table (private-rt) associated with the subnet where Virtual Machines reside and enter Route Table Details

6. Select **Route Policy**, click **Edit**, add a route, the destination is **0.0.0.0/0**  The next hop type is **NAT Gateway**, the next hop is **NAT Gateway**, click **Save** after confirmation**

## Verify NAT Gateway Internet Connectivity

1. Confirm that one Virtual Machine without associated Public IP has been created in the subnet of Virtual Machines

2. Open VPC Console https://cns-console.jdcloud.com/host/compute/list

3. Click **Instance** on the navigation bar on left side**

4. Select the Virtual Machines to be tested, click **Remote Connection** in the right operation column, and log in the Virtual Machines

5. Run "ping www.jd.com" from the command line and confirm that ping works

## Realize NAT Gateway IAM via network ACL (optional)

1. Open VPC Console https://cns-console.jdcloud.com/host/vpc/list

2. Click **Network ACL** on the navigation bar on left side**

3. Designate VPC (test-vpc) where NAT Gateway resides, select **Create Network ACL** (nat-acl) and enter Network ACL Details

4. Select an associated subnet, designate the subnet (nat-subnet) where the NAT Gateway resides and click **OK**. In such case, the default rule, push rule and pop rule of Network ACL will refuse all traffics and discard all packets

5. Test whether Virtual Machines access Internet via NAT Gateway again and log in Virtual Machines via VNC remote connection

6. Run "ping www.jd.com" in the command line and confirm that ping cannot work

7. In such case, access to Internet by Virtual Machines is allowed only if ACL rules are modified

8. Select **Push Rule**, click **Edit Rule**, add a new rule with the priority level of 100, the type of **ALL ICMP**, the source IP of **0.0.0.0/0** and the policy of **Accept**, confirm the rule and click **Save

9. Select **Pop Rule**, click **Edit Rule**, add a new rule with the priority level of 100, the type of **ALL ICMP**, the destination IP of **0.0.0.0/0** and the policy of **Accept**, confirm the rule and click **Save

10. Test whether Virtual Machines access Internet via NAT Gateway again and log in Virtual Machines via VNC remote connection

11. Run "ping www.jd.com" in the command line and confirm that ping works

12. In such case, if Virtual Machines need to access other public network service via NAT Gateway, such as "curl www.jd.com:80", push and pop rules of http type shall be added and corresponding traffic access is allowed to be accepted


        Please note:
        
        1. Network ACL is not the required item for the best practice of NAT Gateway, which is configured only when IAM is required
        
        2. Network ACL rules are stateless. Even if inbound rules are set to allow access by designated IP Address, such access will not be responded if corresponding outbound rules are not set. Therefore, when access is allowed as per the white list configuration, push rules and pop rules shall be configured at the same time
        
