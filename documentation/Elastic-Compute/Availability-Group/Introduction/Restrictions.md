# Restrictions

* The quota of the Availability Group is 20. If you need additional resources, please apply for the ticket.
* The Availability Zone property of the Availability Group is not allowed to be modified after creation.
* Availability Groups support only the second generation instance type or the GPU type, that is, the instance template selected when creating Availability Groups needs to be configured with the second generation instance type or the GPU type. Detailed specifications can be referred to [Instance Type](../../Virtual-Machines/Introduction/Instance-Type-Family.md)
* If an instance template needs to be changed after the Availability Group is created, the VPC configured by the instance template before the change needs to be the same as the instance template after the change.
* Adding new instances to Availability Groups means creating new instances with instance templates associated with Availability Groups. To ensure normal addition, you need to ensure that the resources associated with the instance template are not deleted and available, otherwise the operation will fail.
* The existing instances cannot be added to the Availability Group.
* If an instance is manually removed from the Availability Group, it is not allowed to be re-added to the Availability Group.
* The maximum number of instances in an Availability Group is limited by your Virtual Machines quota in the current region, and if you turn on auto-scaling for Availability Groups, it is also limited by the auto-scaling maximum you set.

## Related References

[Instance Type](../../Virtual-Machines/Introduction/Instance-Type-Family.md)
