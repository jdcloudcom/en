# Use constraint



- Cloud disk must be attached to the virtual machine under the same region or the same availability zone
- In case of creating a new disk based on snapshot, the minimum selectable capacity of the new cloud disk is same as the snapshot capacity, and the maximum capacity is limited by the disk type
- Cloud disk must be in available status when upgrading the capacity or recovering data based on snapshot

## The following table is the constraint on using cloud disk:


| Resource	| Quota	| Exceptional application method |
| :- | :- | :- |
|Number of cloud disks under a single account	|40 blocks under the same region|Ticket|
|Number of cloud disks attachable to a single machine	|8 blocks under the same region	|Unmodifiable|
|Number of snapshots under a single account	|15 blocks under the same region|Unmodifiable|



