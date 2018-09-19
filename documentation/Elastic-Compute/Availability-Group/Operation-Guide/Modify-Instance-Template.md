# Modify Instance Template

## Precondition

For Availability Groups that have been created, their new VM will be created according to the configuration information of the currently associated instance template. If you need to modify the configuration information of the newly added VMs due to the adjustment of your business, you can realize it by modifying the instance template associated with the Availability Group. It should be noted that the VPC configured by the instance template before and after modification needs to be consistent, and the configuration instance type is the second generation VM specification.


## Operational Steps

1. Access[High Availability Groups Console](https://cns-console.jdcloud.com/availabilitygroup/list) to enter the Availability Groups List page. Or access[JD Cloud Console](https://console.jdcloud.com) and then click on the left navigation bar **Elastic Compute**-**High Availability Groups** to enter the Availability Groups List page.
2. Choose region.
3. Select the area where the Availability Group that needs to be operated, and click the name to enter its details page.
4. Click **Resource information Tab**-**Instance Template** and then **Modify** icon.
5. The instance template drop-down box of the pop-up modification window will display the instance template that satisfies the condition (the second generation VM specification with the same VPC and configuration), and you can select the instance template that you need to replace.
6. Click **OK** to trigger the modification of the instance template. After the modification is completed, the popup will be closed and it will return to the details page.
