## Filter by Tag
Filter resources by tag through the console:
1. Access [JCS for Elasticsearch Console](https://es-console.jdcloud.com/clusters), and enter the instance list page. Or, access [JD Cloud Console](https://console.jdcloud.com) and enter the instance list page by clicking [Middleware]-[JCS for Elasticsearch] on the left navigation bar.</br>
2. Select regions.</br>
3. Click **Tag Filter**; it supports fuzzy search by entering the Key-Value. Checking a tag Key indicates that you need to filter the ES clusters associated to this tag Key (possibly with multiple tag values). Checking the tag Key-Value indicates that you need to filter the ES clusters associated to this Key-Value pair. It is logic and relationship between different keys, and logic or relationship between different values; if “Everyone (Key)” “Purpose: Test (Key-Value)” and “Purpose: Development (Key-Value)” are checked, it means that you need to filter the ES clusters with the tag "Everyone" associated and “Purpose" as test or development.</br>
4. Click **Filter** to filter the ES clusters according to the checks.</br>

In addition, the tags support to be valid at the same time with other search conditions. The search condition currently supports searching by name, and in order to ensure a good user experience and higher query efficiency, it is suggested to provide as much detailed filter/search information as possible in a single filter/search.
