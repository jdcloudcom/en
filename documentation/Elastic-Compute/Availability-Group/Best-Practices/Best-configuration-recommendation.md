# Recommended Best Configuration

*Different services shall be allocated with independent Availability Groups. If there are two instances of different function applied in one Availability Group, one occurrence of fault will influence all the instances of same function and thus leads to the failure of the whole service.
* The Availability Group is configured with multiple Availability Zones to cope with central-data level fault.
* Create instance in Availability Group (no less than two instances), so as to avoid single point service failure.
* Attach the Availability Group to load balancer to serve as backend service group for service allocation.
* Enable the auto-scaling (optional) to cope with load fluctuation.

The following figure shows an example of high availability of Web service. The Availability Group of Web service and Database are different and two Availability Zones are already configured into the two Availability Groups. Each Availability Group is deployed with multiple instances and are all attached to the responding load balancer. Instances in Availability Group of Web service will receive service traffic from the Internet load balancer. The fault of one FD will only influence instances of the affected FD and will not influence Web instances and database instances in other FDs.

	The figure only gives an example of 2 FDs in each Availability Zone of Availability Group. There are actually 5 FDs in each Availability Zone.

![](../../../../image/ag/scenarios1.png)
