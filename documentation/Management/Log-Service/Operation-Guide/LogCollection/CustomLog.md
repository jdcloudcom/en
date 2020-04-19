## Business Application Log Collection
### I. Collect through the Console

**Note:**

**No log collection agent is required to be manually installed by user, and the virtual machine selected at addition of collection configuration will automatically install the log collection agent. Confirmation of collection configuration will be deemed to have accepted JD Cloud & AI Log Service’s automatic installation of log collection agent into corresponding virtual machines. Users who have manually installed the collection agent will not be affected and can still report log data in a normal manner.**

Precondition:

1. The user’s business applications have been deployed on JD Cloud Virtual Machines.

2. Corresponding log set, log topic and collection configuration have been created.

Operation Steps:

1. Enter the Log Subject List Page, select the log subject with the "Collection Configuration" status as "Unconfigured", click **Collection Configuration** in operation column to enter the collection configuration page.

2. Click **Add Collection Configuration** to enter the adding collection configuration page.

3. Complete collection configuration information

- Select "Business Application" as log resource,
- Select whether collection is enabled according to requirements, if disabled, enter the collection configuration page to edit the collection status when it needs to be enabled, if enabled, collect immediately after the collection configuration is created successfully.
Fill in Log Path. The path is the storage path where the user business application generates logs on the Virtual Machines, and the directory prefix supports wildcard symbols, the question mark and the asterisk. The Linux file path shall start with /, for example, /var/log/db/db.log etc. The log collection of Windows Virtual Machines isn’t supported for the time being. The log text code is in UTF8.
- Select the Virtual Machine to be collected. Log Service will automatically install log collection agent into the selected Virtual Machine.

4. Click **Save**, to complete creation of Collection Configuration. When using features of log retrieval and log dump, make sure the collection status is open.

5. The latest log data will be uploaded to Log Service about 5 minutes after setting.


