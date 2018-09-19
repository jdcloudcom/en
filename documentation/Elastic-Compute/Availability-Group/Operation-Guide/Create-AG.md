# Create Availability Group

## Precondition

Before you create the Availability Group, you first need to finish [Create Instance Template](../../Virtual-Machine/Operation-Guide/Instance-Template/Create-Instance-Template.md)

## Operational Steps

1. Access[High Availability Groups Console](https://cns-console.jdcloud.com/availabilitygroup/list) to enter the Availability Groups List page. Or access[JD Cloud Console](https://console.jdcloud.com) and then click on the left navigation bar **Elastic Compute**-**High Availability Groups** to enter the Availability Groups List page.
2. Choose region.
3. Click **Create** to go to the Create page of the Availability Group.
4. Select Regions: At this step, you are able to choose the corresponding region for new Availability Group. If the number of the selected region has reached its quota limit, you can open ticket to increase the quota.
5. Set up the attribute of the Availability Zone of the Availability Group. In order to ensure the best service availability, we recommend you choose multiple Availability Zones. VMs in the Availability Group will be allocated evenly, so as to reduce the influence to your service in case of a single failure in the Availability Zone.
6. Set up a name and description for Availability Group, e.g.: High Availability Group for Web Services.
7. Select instance template. A drop down box will show a list of satisfied instance templates. Please remember to choose the instance template configured with second generation VM specification. Please choose herein the “Instance Template of Web service” created in previous step.
8. Click the **OK** to trigger the creation of Availability Group. You can see the Availability Group created successfully on the Availability Group Listing page.

		Please note that: The information in the Availability Zone cannot be modified after the Availability Group has been created.


## Related References

[Create Instance Template](../../Virtual-Machine/Operation-Guide/Instance-Template/Create-Instance-Template.md)