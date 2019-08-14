## Business Application Log Collection
### I. Collect through the Console

Precondition:

1. The user’s business applications have been deployed on JD Cloud Virtual Machines.

2. The corresponding log set and log subject have been created

Note:

It is required to install agent on Virtual Machines requiring collection, after completely creating create collection configuration.

Operation Steps:

1. Enter the Log Subject List Page, select the log subject with the "Collection Configuration" status as "Unconfigured", click **Collection Configuration** in operation column to enter the collection configuration page.

2. Click **Add Collection Configuration** to enter the adding collection configuration page.

3. Complete collection configuration information

- Select "Business Application" as log resource,
- Select whether collection is enabled according to requirements, if disabled, enter the collection configuration page to edit the collection status when it needs to be enabled, if enabled, collect immediately after the collection configuration is created successfully.
Fill in Log Path. The path is the storage path where the user business application generates logs on the Virtual Machines, and the directory prefix supports wildcard symbols, the question mark and the asterisk. The Linux file path shall start with /, for example, /var/log/db/db.log etc. The log collection of Windows Virtual Machines isn’t supported for the time being. The log text code is in UTF8.
- Select the Virtual Machines requiring collection.

4. Click **Save**, to complete creation of Collection Configuration. When using features of log retrieval and log dump, make sure the collection status is open.

5. Install the log collection agent on the Virtual Machines that has been selected as the collection instance. [Agent Installation Tutorial](https://docs.jdcloud.com/en/log-service/agentinstall).

6. After the log collection agent is successfully installed, the log data in Virtual Machines can be collected.

### II. Report log data through log data report API

View log data report API document for details.
