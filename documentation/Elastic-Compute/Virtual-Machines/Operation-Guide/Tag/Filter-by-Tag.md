# Filter by Tag
After you bind a tag to a resource, you can use the tag to quickly filter the instance by two methods described in this document.

## Operation Steps

Filter resources by tag through the console:

1. Access [Virtual Machines Console](https://cns-console.jdcloud.com/host/compute/list) and enter the instance list page. Or access [JD Cloud Console](https://console.jdcloud.com) Click navigation bar on the left **Elastic Compute** - **Virtual Machines** to enter the instance list page.
2. Select a region.
3. Click **Tag Filter** icon, enter key/ value, and it supports fuzzy search. Ticking a tag key indicates that you need to filter out the Virtual Machines bound with this tag key (possibly with multiple tag values). Ticking the tag key/value (Key-Value) indicates that you need to filter out the Virtual Machines bound with this key-value pair (Key-Value). The relationship among different keys is logic AND, and relationship among different values of the same key is logic OR. If "Owner (Key)", "Purpose: Test (Key-Value)" and "Purpose: Development (Key-Value)" are ticked, it means that you need to filter out the VMs bound with the tag "Owner" with the "Purpose" of test or development.
4. Click **Filter** to filter the VMs according to the ticks.

In addition, the tag can take effect at the same time with other search conditions and currently, ID, name and private IP are available for search conditions. To ensure a good user experience and higher query efficiency, it is recommended to provide filtering/ search information as detailed as possible for a single filtering/ search.



