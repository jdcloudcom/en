# Failure to Create Cloud Physical Server

## Problem Description

The user cannot create an instance successfully when he enters the console page and clicks the “Create Instance”

## Possible Causes
### Processing Steps

1. Confirm that the selected area and the corresponding type are in stock.

Click the create button in the Cloud Physical Server console to view if the selected area and the corresponding model are optional on the create page.

2. Confirm whether the quota limit has not been exceeded.

There is a quota limit for each order (It is basically limited to 5 units, which will change with the operation activities, depending on the activity rules). If the limit is exceeded, an insufficient quota will be prompted.

3. Confirm whether actions are made too frequently.

When a user clicks on the “purchase” repeatedly, it may not be possible to create an instance successfully. At this point, you can either wait or manually clear the cache and recreate it.

4. The server purchase was successful but the creation of the server failed.

The server had resources at the time of purchase, but failed to call the OpenAPI interface when it was created and ultimately failed to create. At this point, you can submit information such as server number to the ticket, or call the customer service at 4006151212 to ask the customer service to assist in recreating the server.

5. If the above steps cannot help, you can try to describe the specific situation and  the server name id open ticket, or call customer service at 4006151212.
