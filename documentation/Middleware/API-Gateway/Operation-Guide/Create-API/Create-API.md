# Create API

API group is the basic service net of gateway and implements the opening, but each API group includes specific API. The API creation process is the process that API provider defines the API.

To create an API, completing the definition of the following information is required:

* 	Basic information of API: region, group, name, description, subpath.

* Call information: query parameters, request header, request body type, request body format, response body type, and normal return format.


## Operation Steps:

1. Find the group which requires to create the API in the page of API group list.

 ![API Group Management](../../../../../image/Internet-Middleware/API-Gateway/apigroup-1.png)
 
Click the operations on this group row **Manage API**, enter the page of “API list”

 ![API list ](../../../../../image/Internet-Middleware/API-Gateway/apigroup-apilist.png)


2. In the page of “API list”, click **New API** to enter the page of API creation.

![Create new API](../../../../../image/Internet-Middleware/API-Gateway/apigroup-addapi.png)
 
  
3. After filling the API information, click the “Save”, then the new creation is completed.

4. At present, the system supports API import, click **Import API** in the API list page and select API files, then the importing is completed. Please note that the imported API files should comply with the Code swagger 2.0 Specific code refers to:
[Code swagger 2.0](http://editor.swagger.io/)  
