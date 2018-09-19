
# Guide Overview

**Initial setup**
**Register JD Cloud account**
If you have already got a JD Cloud account, skip this step to continue.
If you don’t have a JD Cloud account, you may register in official website of JD Cloud; please refer to register JD Cloud. If you have finished registering, you are required to activate the account, which is as follows. image.png

Account authentication

To use the container service normally, you are required to get account authentication for your account.

Go to the real-name verification page to select the individual or corporate authentication type. Please refer to real-name verification.


**Create VPC (mandatory)**

1. Open console, select Network>>VPC to go to the VPC List page;

2. Select create region that the VPC belongs to and click “Create” button;

3. Region Selection: In this step, you can still select the region for creation of VPC; if quota in region you selected is filled, then you may increase quota by open ticket;

4 Set name for VPC: Name can not be empty, which only supports Chinese text, numbers, uppercase and lowercase letters, English text with underline “_” and hyphen “-”, and should exceed 32 characters.

5. Set CIDR for VPC: Set up the border of VPC. CIDR shall only be the intranet segments, with choices ranging from 10.0.0.0 (mask 16-28), 172.16.0.0~172.31.0.0 (mask 16-28), to 192.168.0.0 (mask 16-28). CIDR can also be the non-preset type. In this case, the VPC border will operate in auto scaling with the applied subnet segments. Users with good understanding of network knowledge are recommended for VPC of non-preset CIDR type.

6. Set VPC description: The description can be blank, only supports Chinese, numbers, uppercase and lowercase letters, English underscore “_”, and cannot exceed 256 characters;

7. Click **OK** and then you can go to “Console” to check the VPC you created;


**Create Subnet (mandatory)**

1. Open console and select Network>>VPC>>Subnet to go to the Subnet List page;

2. Select the region that the subnet created belongs to and click “Create” button;

3. Region Selection: In this step, you can still select the region for creation of subnet; if quota in region you selected is filled, then you may increase quota by open ticket;

4. Select the VPC belonged to and in which shall the subnet be created.

5. Create Subnet: Support create multiple subnets simultaneously; enter subnet name, subnet CIDR, route table associated, description and other information.

6. CIDR of the subnet can only be intranet segment with optional range of 10.0.0.0 (mask16~28), 172.16.0.0~172.31.0.0 (mask16~28), 192.168.0.0 (mask16~28).

7. There can not be overlap between CIDRs of multiple subnets; if belonging VPC has preset CIDR, then the CIDR of subnet shall not exceed the border of VPC.

8. Set subnet name: Name can not be empty, which only supports Chinese text, numbers, uppercase and lowercase letters, English text with underline “_” and hyphen “-”, and should exceed 32 characters.

9. Select route table associated to subnet; each subnet can and must associate to one route table.

10. Set subnet description: Description can not be blank, and only supports Chinese, numbers, capital and lowercase letters and English underline “_” and line-through “-”, and can not exceed 256 characters;

11. Click **OK**to go to “Console” and view the subnet created;


**Create security group (optional)**

Security group provide instance-level network Identity and Access management. You are required to add rules to security group so that they can be used to realize some access; for example, allow SSH to be connected to instance from your local IP address. To facilitate your use, JD Cloud provide three defaulted security groups for each VPC, including defaulted full open security group, defaulted open Linux 22 port and defaulted open Windows 3389 port to facilitate your fast selecting;

1. Enter JD Cloud console and select Elastic Compute>>Container service>>Security Group page; click **Create** to pop up the Create box;

TimLine Screenshot 20171228152929.png

2. At first you are required to select the region that security group located in and VPC and the security group can only use the container which is in the same VPC. You can Create security group for the VPC that is already created and can click “Create a new VPC” button to jump to the new VPC page to create new VPC. 50 security groups in maximum can be created in a single VPC and if the quantity of security groups in the VPC selected reach 50, you shall be reminded that “Security group quota of the VPC resources selected has reached 50,” and you are required to select other VPC again.

3. After that, enter security group name and description to describe the additional description of security group rules, for example, “80, 443 entry ports have been opened”; it is suggested that you use the customer scenario or function of the security group as the name of the security group, for example “Web server cluster_open 80 port”.

4. Create security group all drop all entry flow and export flow by default.



Determine the region that the instance belongs to.
The complete isolation between different regions of JD Cloud ensures the greatest degree of stability and fault tolerance across different regions. It currently covers four regions: cn-north-1, cn-south-1, cn-east-1 and cn-east-2. At present, the container is available in cn-north-1 and cn-east-2 and we shall add more service regions gradually in future to meet your business requirement.
When choosing a region, you had better consider the following points:


The deploy relation between instance and other JD Cloud products.

Cloud products from different regions are not allowed to communicate through intranet by default.

The instances can not access to each other cross-regions intranet by default and cloud database and cloud cache etc. can not be accessed cross-regions by default.

As for instance associate EIP, security group, it only supports binding public IP and security group in same region; as for instance binding cloud disk, it only supports binding cloud disk service in the same availability zone.

The above-mentioned intranet interconnection refers to the interconnection of resources under the same account, and the intranet of resources under different accounts is completely isolated.



Select instance configuration

It is recommended that you use Pay By Configuration billing instances for performance testing to find instance type and other resource configurations that match your business volume before deploying the business formally. You may refer to

Instance settings recommendation.