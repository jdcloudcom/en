# Create Elastic IP

JD Cloud & AI supports the independent creation of Elastic IPs, including creation of Standard Elastic IP and Edge Elastic IP.

## Create Standard Elastic IP

### Procedures
Step 1: Log in to the console of JD Cloud & AI and enter the Console Navigation Page.

Step 2: Select Cloud - **Virtual Private Cloud- Elastic IP** at the navigation bar on the left side of the console to enter the Elastic IP List Page.

Step 3: Confirm the region where the users need to create Elastic IP, select the corresponding region tag on the Elastic IP List Page, and click **Create** to enter the Create Elastic IP Page.

	Description
	After entering Create Elastic IP Page, switching the region to create Elastic IP is also provided.

Step 4: On the Create Elastic IP Page, select the type of Billing by Bandwidth for the Elastic IP to be created.

	Description
	Currently, the Standard Elastic IP supports monthly package, pay by configuration, and pay by consumption.

Step 5: On the Create Elastic IP Page, select the IP provider type and bandwidth limit of the Elastic IP to be created.

	Description
	If an Edge Elastic IP isn’t supported in this region, the Standard Elastic IP will be selected by default; if an Edge Elastic IP is supported in this region, please select a Standard Elastic IP at the IP type.
	ISP Line Types of Standard Elastic IP: Beijing, cn-south-1, cn-east-2, and cn-east-1 only support Elastic IPs of BGP type.

Step 6: If the Monthly Package billing is selected, the purchase duration shall be determined.

	Description
	Currently, the Purchase Duration of the Monthly Package includes 1-9 months, 1 year, 2 years, and 3 years.

Step 7: Designate the number of Elastic IP to be created, the upper number limit subject to the quota of Elastic IP.

Step 8: After confirming the correctness of the selected configuration, click **Buy Now** to go to the order confirmation Page. Upon payment, return to the Elastic IP List Page to view the creation of Elastic IP.

## Create Edge Elastic IP

### Operation Steps

Step 1: Log in to the console of JD Cloud and enter the Console Navigation Page.

Step 2: Select **Network**-**VPC**-**Elastic IP** at the navigation bar on the left side of the Console to enter the Elastic IP List Page.

Step 3: Confirm the region where you need to create an elastic IP, select the corresponding region tag on the Elastic IP List Page, and click **Apply** to enter the Create Elastic IP Page.

	Description
	After entering Create Elastic IP Page, the function of switching the region for which Elastic IP is created may also be realized by switching region tag.

Step 4: On the Create Elastic IP Page, select the type of billing by bandwidth for the elastic IP to be created.

	Description
	Currently, the Edge Elastic IP supports two types of billing, i.e. monthly package and pay by configuration.

Step 5: On the Create Elastic IP Page, select the IP type, ISP line and bandwidth of the elastic IP to be created.

     Description
     ISP lines of Edge Elastic IPs are separately defined according to different regions and different edge zones.
     Please select the appropriate Edge Elastic IP ISP line according to the ISP line access area, resource association range, operator service type and other information required by the business.

Step 6: If the monthly package billing type is selected, the purchase duration must be selected.

	Description
	Currently, the purchase duration of the monthly package includes 1-9 months, 1 year, 2 years, and 3 years.

Step 7: Designate the count of elastic IPs to be created, with the cap subject to the quota of elastic IP.

Step 8: After the above steps, click **Buy Now** to go to the Order Confirmation and Payment pages. Upon payment, return to the Elastic IP List Page to view the creation of Elastic IP.
