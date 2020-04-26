# Creation of Distributed Cloud Physical Server is failed

## Problem Description

The user cannot create an instance successfully when logging in the Console page of Distributed Cloud Physical Server and clicking **Create Instance**.

## Possible Reason
### Processing Steps

1. Confirm that the selected node and the corresponding type are in stock.

Click **Create** in the Distributed Cloud Physical Server Console to view if the selected node and the corresponding model are optional on the Create Page.

2. Confirm whether the quota limit has not been exceeded.

There is a quota limit for each order (It is basically limited to 5 units, which will change with the operation activities, depending on the activity rules). If the limit is exceeded, an insufficient quota will be prompted.

3. Confirm whether operations are made too frequently.

When a user clicks **Purchase** repeatedly, it may not be possible to create an instance successfully. At this point, you can either wait or manually clear the cache and recreate it.

4. The server purchase was successful but the creation of the server failed.

The server had resources at the time of purchase, but finally its creation failed. At this point, you can submit information such as server number to the ticket, or call the customer service at 4006151212 to ask the customer service to assist in recreating the server.

5. If the above steps cannot help, you can try to describe the specific situation and the server name id open ticket, or call customer service at 4006151212.
