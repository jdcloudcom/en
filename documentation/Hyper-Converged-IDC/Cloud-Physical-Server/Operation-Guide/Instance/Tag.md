# Tag

The tag function can help users identify instances for the convenience of managing resources. Each tag comprises a "key" and a "value", e.g.: "User Department: Basic R&D Department", the "User Department" is the "key" of the tag, and the "Basic R&D Department" is the value of the "key". Each resource is allowed to be associated with 10 tags with different keys.

### Use Restrictions

1. Each instance is allowed to associate 10 tags at most.<br/>
2. The maximum length of Key is 127 characters.<br/>
3. The maximum length of Value is 255 characters.<br/>
4. Tag Key-Value cannot use prefix jrn:.<br/>
5. Tags only support Chinese, numbers, uppercase and lowercase letters, blank and specials _.:/=+-@, and cannot start with blank and shall be case sensitive.<br/>
6. When an instance is associated to a tag, only one corresponding Value is allowed for the same Key and the value recently associated with the same Key will replace the previously associated value.<br/>
7. When disassociating a tag, if the tag has no associated resources after disassociation, then the tag will be automatically deleted.<br/>

### Features

##### Support Tag Filter

1. Access the Cloud Physical Server Console, go to the instance list page, and click **Tag icon**. Support entering Key-Value to conduct fuzzy search;<br/>
2. Check a Key, indicating that instances associated with this Key (there may be multiple Values) need to be filtered. Check a Key-Value, indicating that instances associated with this key-value pair (Key-Value) need to be filtered. It is logic and relationship between different keys, and logic or relationship between different values of the same key.<br/>
3. Click **Filter** to filter instances according to what you have checked.

##### Edit Tag

##### Associate tag for instance to be created

1. Access the Cloud Physical Server Console and log in the Instance List page.<br/>
2. Select the node at which your instance is to be created, click **Create**, log in the Instance Purchase page, and click **+Add** in "Tag" in "Advanced Configuration" to add a tag for your instance.<br/>
3. Add the corresponding information in the newly added "Tag Key" and "Tag Value" input boxes for adding a tag or select a corresponding tag from existing tags by directly dropping down the tags or from tags after fuzzy matching based on your input. If label parameters are invalid, please modify correspondingly according to the prompt below the tag boxes.<br/>
4. After completing information in the "Tag" part, please click **Buy Now** to create resources. After creation, you can view the association relationship between the tag and the resources via the Instance List page/Details, or click **Tag Filter** on the top of the Instance List to filter instances.<br/>
Note: When adding Tag Key-Value, please trigger your operations by pressing Enter or selecting with mouse after you manually enter new contents to ensure that the contents can be saved and displayed in the current input box.<br/>

##### Edit tags after the instance is created

Precondition: Instance status is "Running" or "Stopped".<br/>
1. Access the Cloud Physical Server Console, go to the instance list page, and click **Operation** - **More** - **Edit Tag**, or click **Instance Name** to go to the details, and then click **Operation** - **More** - **Edit Tag**.<br/>
2. In the "Edit Tag" popup, the current tag displays the tags that the instance currently associated with by default. If there are 10 tags in the current instance, then **Add** button will be disabled.<br/>
3. You can pull down and select the corresponding tag Key-Value and add tags directly according to the current tags or according to the fuzzy matching based on input, and click "Add" to display it in the current tag.<br/>
4. Click "OK" to complete the tag editing according to the display situation in the current tag.<br/>
5. After completion of "Edit Tag", you can view whether the edit is succeeded through Instance List page/Details page, or click **Tag Filter** icon at the top of Instance List to filter the instances. Please note if the list page does not display tag information items, you can select to display the tag via Edit Columns.
