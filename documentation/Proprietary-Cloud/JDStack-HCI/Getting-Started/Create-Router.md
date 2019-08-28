# Create Route

Access the navigation bar on the left side and click **Basic Cloud**>**Network Resource**>**Route Management** menu to enter the route list page, as shown in Figure: Route List page.

Figure: Route List page

![Create-Router-1](../../../../image/JDStack-HCI/Create-Router-1.png)

On this page, click **Create** to pop up the create route page, as shown in Figure: Create Route page.

Figure: Create Route page

![Create-Router-2](../../../../image/JDStack-HCI/Create-Router-2.png)

On this page, enter the route name and click **OK**; after creation succeeded, you can see the route created on the route list page, as shown in Figure: Route List page.

Figure: Route List page

![Create-Router-3](../../../../image/JDStack-HCI/Create-Router-3.png)



## Connect Route to Subnet

Subnet accesses Internet by connecting router.

On the Figure: Route List page, click **Route Name** newly created to enter the route details and then switch to the "Route Connection" details, as shown in Figure: Router Connection Details.

Figure: Router Connection Details

![Create-Router-4](../../../../image/JDStack-HCI/Create-Router-4.png)

On this page, click **Add** to pop up the "Add Router Connection" page, as shown in Figure: Add Router Connection page.

Figure: Add Router Connection page

![Create-Router-5](../../../../image/JDStack-HCI/Create-Router-5.png)

On this page, select the created network vpc and subnet and click **OK**; after connection succeeded, you can see the Subnet connected on the router connection list page, as shown in Figure: Router Connection Details.

Figure: Router Connection Details page

![Create-Router-6](../../../../image/JDStack-HCI/Create-Router-6.png)



## Route Sets Gateway

On the Figure: Route List page, click **Set Gateway** in the operation list to pop up the "Set Gateway" page, as shown in Figure: Set Gateway page.

Figure: Set Gateway page

![Create-Router-7](../../../../image/JDStack-HCI/Create-Router-7.png)

On this page, select external network and click **OK**; after setting succeeded, you can see the external network set on the route list page to complete the gateway setting. As shown in Figure: Router List page.

Figure: Router List page

![Create-Router-8](../../../../image/JDStack-HCI/Create-Router-8.png)

After the Subnet connects to the router and a gateway address of the Subnet is set on the router, when the router assigned with an external IP connects with this external network, the Virtual Machines in the Subnet can access Internet.

