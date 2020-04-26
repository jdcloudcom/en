## Reinstall System

### Function Description

The Distributed Cloud Physical Server supports reinstalling the system function. User may select only to reinstall the system disk or select to format the data disk simultaneously.

### Operation Steps

##### Preconditions

User can only reinstall the system when the Distributed Cloud Physical Server is in "Stopped" status.

- Enter the Distributed Cloud Physical Server List Page, select a target instance whose status is "Stopped". Click **Reinstall System** or click **Instance Name** to log in the details and then click **Operation** - **Reinstall Operating System**.<br/>

- In the "Reinstall System" popup, select the image type, operating system, system version type, machine name, password, password confirmation, whether to format data disk, whether to enable user data function, and then click **OK** after selection to complete the operations. Note:<br/>
  1. System reinstallation is for the initialization/changing operating system of the system disk;<br/>
  2. This operation will clear the system disk data of the Cloud Physical Server, so please back up; JD Cloud & AI will take no liability for any data loss due to failure of backup;<br/>
  3. The data disk data will also be cleared simultaneously if selected to be formatted. It is necessary to load again the attached data disk in system reinstallation.
