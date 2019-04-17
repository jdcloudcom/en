# Filter by Tag
After resources are associated with tags, you can use tags to quickly filter resources through two methods described in the Document.

## Operation Steps

Filter resources by tag through the console:

1. Access [Public IP Console](https://cns-console.jdcloud.com/host/pip/list) to enter Public IP List page. Or access [JD Cloud Console](https://console.jdcloud.com) and click **VPC** - **Elastic IP** at the navigation bar on the left to enter Public IP List page.
2. Select regions.
3. Click **Tag Filter**, which fuzzy search by entering key-value is supported, checking a tag Key indicates the public IP associated with the tag Key (there may be multiple tag Values) will be filtered. Checking a tag key-value indicates the public IP associated with the Key-Value pair will be filtered. The relationship between different Keys is Logical AND while that between same Keys with different Values is Logical OR. If "Owner (Key)", "Usage: Test (Key-Value)" and "Usage: Development (Key-Value)" are checked, it indicates that the public IP associated with tags of "Owner" and the "Usage" with value of Test or Development will be filtered.
4. Click **Filter** to filter public IP according to what you have checked.

In addition, tag supports to take effect with other search conditions at the same time, which search conditions currently support IP address, IP ID. In order to ensure good user experience and higher search efficiency, we recommend you try to provide detailed filter/search information for a single filter/search.



