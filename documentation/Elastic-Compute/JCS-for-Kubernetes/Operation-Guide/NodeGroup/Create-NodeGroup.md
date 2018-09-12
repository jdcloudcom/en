
# Create Working Node Group

**Steps of Create Working Node Group:**

 1. Open the Console and Select Elastic Compute>>Kubernetes Service>>Cluster Service>>Work Node Group; Click the Button of Create
 2. Select the Cluster and All Available Clusters in the Current Region Will Be Listed in the Pull-down List;
 3. Image: Only the working node image customized by JD Cloud is supported.
 4. Specification: According to the specific business conditions, select different types and specifications of VM that support the specifications of the second generation VM. It is acceptable to refer to the instance specifications and types.
 5. Quantity: The default quantity is 3. You can click the button of increase or decrease or you can input the quantity according to the requirements. Maximum quantity of working nodes is limited by current region’s VM quota and the quantity of Private IP distributable by the working node CIDR.
 6. Name: The default name is nodegroup1, which cannot be empty and supports only Chinese text, numbers, uppercase and lowercase letters, English text with underline “_” and hyphen “-”, and should not exceed 32 characters. Working node groups under the same cluster cannot be in an identical name.
 7. The followings are the advanced options without mandatory demand

Description: Description should consist of no more than 256 characters

System disk: The default capacity of the local disk is 100G, which can not be modified.

Tags: Set tags to work nodes; the key is composed of prefix and name. The prefix does not exceed 253 characters, and the name and value do not exceed 63 characters; the prefix is made up of DNS subdomains, and the key values must start with letters and numbers, supporting “-”“ _ ”“. ”, uppercase letters, lowercase letters and numbers; up to 5 sets of tags.

  8. After completing relevant settings, click OK to enter the Elastic Compute>>Kubernetes Service>>Cluster Service>>Working Node Group for the sake of viewing the created working node group.