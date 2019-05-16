# Manually Add Instances

When an Availability Group is selected to deploy business, you need to add new instances to the Availability Group. The Availability Group cannot be added with created instances, so the added instance is a new instance. Creating an instance requires Real-name Verification, and if you need to create a pay by configuration instance, you also need to make sure that your account balance + available Coupon are greater than the threshold. You can customize new instances in Availability Groups manually or by automatically scaling them. If you choose to add them manually, you have to follow these steps:

## Operational Steps

1. Access[Availability Groups Console](https://cns-console.jdcloud.com/availabilitygroup/list) to enter the Availability Groups List page. Or access[JD Cloud Console](https://console.jdcloud.com) and then click on the left navigation bar **Elastic Compute**-**Availability Groups** to enter the Availability Groups List page.
2. Choose region.
3. Find the Availability Group in need of adding new instance.
4. Click **New Instance** to skip to the Instance Creation page and Creation Method is a “Create instance in Availability Group”, and select the corresponding Availability Group for the corresponding Availability Group, such as: AG-of-Web-Service. It is matched to the current page based on the information configured in the startup template associated with the Availability Group. It is necessary to note, however, that such configuration information is not allowed to be modified.
5. You can choose different billing types and purchase quantity. The billing types are divided into monthly-package billing or pay by configuration billing. If you buy monthly-package instance, you need to specify the Purchase Duration.
6. If you add only one instance at a time, you can also specify its private IP address. Note that the private  address should be within the range of corresponding subnet CIDR.
7. Set the instance name and description;
8. After completing the above configuration, click **Buy Now**. After yearly package and monthly package instances, you can view the created instances on the Availability Group Details page or Instance List page. The instance pay by configuration billing will trigger the creation directly. There will be a few minutes from the creation to the availability of the instance, and please be patient.

If instance templates the Availability Group associated have configured with a private image that has deployed services and self-starting,it is considered that you have obtained a group of high availability instances for outbound service after adding the new instances.

## Related References

[Create instance](../../Virtual-Machine/Operation-Guide/Instance/Create-Instance.md)