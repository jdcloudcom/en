# Alias IP Range

Business Use: If your multiple services are running on the same Distributed Cloud Physical Server and you want to assign a different IP address for each service, you can do so using the function of alias IP range.

### Glossary
  1. Primary CIDR: "Primary CIDR" is a CIDR segment entered in subnet creation.</br>
  2. Secondary CIDR: Secondary CIDR (optional) can be added in subnet creation and currently only one secondary CIDR can be added for assigning alias IP range only.</br>
  3. Alias IP range assignment source: Alias IP Range can be assigned either from primary CIDR or secondary CIDR.</br>

### Operation Steps
- Enter the Distributed Cloud Physical Server Creation Page - Network and Bandwidth Setting - click **+Add Alias IP Range", and then you can add an alias IP range. A maximum of 50 can be added for each instance primary network interface and secondary network interface.<br/>

- After the instance creation, enter the instance list, select a target instance, and click **More** - **Add Alias IP Range**, or click **Instance Name** and log in the details, and then click **Operation** - **Add Alias IP Range** to complete the addition. The popup information is as follows:<br/>
  1. Target Network Interface Name: Select the required target network interface.<br/>
  2. VPC name: Display the VPC name of this instance by default.<br/>
  3、VPC CIDR: Display the VPC CIDR of this instance by default.<br/>
  4. Alias IP range: Select the required subnet range first and then manually enter the alias IP range; the alias IP range cannot be null; the format shall be: 10.0.1.1/24 or /32.<br/>
  
- After addition, enter the instance details - "Network Interface Details" to manage the alias IP range. The network interface details include basic information of network interface and alias IP range information. If this instance network interface is a single one, only the primary network interface information is displayed; if this instance network interface is a double one, the primary network interface and secondary network interface information are displayed.<br/>
  1. In the primary network interface information, alias IP range list associated with the primary network interface is displayed and the alias IP range can be deleted. In addition, elastic IPs associated with private IPs of this instance primary network interfaces (other than primary IPs) are displayed and "Disassociate Resource" is supported.<br/>
  2. In the secondary network interface information, alias IP range list associated with the secondary network interface is displayed and the alias IP range can be deleted. In addition, elastic IPs associated with private IPs of this instance secondary network interfaces (other than primary IPs) are displayed and "Disassociate Resource" is supported.<br/>
  

