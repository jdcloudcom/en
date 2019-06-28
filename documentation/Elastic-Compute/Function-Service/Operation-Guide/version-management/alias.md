# Alias



Alias points to a particular function version. You can call functions of this version with alias. You can use alias to serve all kinds of environment requests and associate the trigger with the alias. When releasing a new version or rolling back, you only need to point the alias to the corresponding function version without modifying the trigger to complete function iteration.

## Create Alias

1. The user logs in Function Service, go to the "Function List" page.

2. Select the function to be configured in "Function List", click the function name to enter the function details.

3. Select the function version on the function detail page, click "Operation"-"Create Alias". Then the "Create Alias" window pops up.

4. Enter configuration information (see Table 1) of the function alias to be created on the "Create Alias" interface, * is a compulsory item.

5. Click "OK" to complete alias creation.

Table 1: Function Alias Configuration Information Table

| Configuration Information  | Description                                                         |
| --------- | ------------------------------------------------------------ |
| * Alias Name | It can contain only letters, digits, underline and line-through; start and end with letters/numbers; the length shall be no more than 16 characters |
| * Corresponding Version |  Associate a function version from existing function versions                                 |
|  Description      | A maximum of 1,000 English letters, digits, spaces, commas, English full stops and Chinese characters are supported.   |


**Description:**

The created alias name cannot be modified.

A maximum of 10 aliases can be created under single function.
 

## Delete Alias

On the function details, select the function alias, click "Operation" - "Delete Alias", and pop up "Delete Notification", Click "OK" after confirming that it is correct to delete the function alias.

Deleting alias will only delete the alias itself and will not delete the function version pointed by the alias. The trigger associated with this alias must be removed before the alias is deleted.
