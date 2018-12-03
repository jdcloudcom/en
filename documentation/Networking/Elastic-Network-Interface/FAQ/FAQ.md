# FAQ

**Q: What resources can be associated to ENI?**

A: Currently, an ENI can be associated with VM resource. The virtual private cloud attribute of the ENI must be consistent with that of VM.

**Q: Does an ENI have any availability zone limitation?**

A: The ENI has a region-level attribute. The unassociated ENI is not restricted to availability zone and can be associated to any VM that meets the virtual private cloud restriction. After the ENI is associated, the attribute of the availability zone is consistent with that of the VM.

**Q: Does an ENI support the migration across the availability zone?**

A: An ENI can be migrated between VMs in different availability zones within the same region.

**Q: Can the primary network interface be elastically plugged on a VM?**

A: The life cycle of the primary network interface of the VM shall be consistent with that of the VM instance, and the elastic plugging is not allowed.
   
**Q: Can the primary IP of the ENI be released?**

A: The primary IP of the ENI (including the primary network interface and the secondary network interface) cannot be released, and each ENI is only provided with one primary IP.

**Q: How to display the associating information when the ENI associated by elastic IP is in a free state (not associated to the VM)?**

A: The ID and name of the associated network interface can be displayed on the list of elastic IP. If the ENI is unassociated and the elastic IP is associated to the ENI, the state of elastic IP is displayed as associated with the associated network displayed. However, the instance type family and the instance name are displayed as blank.
