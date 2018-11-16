# Instance Life Cycle

The instance life cycle refers to the cycle from the start of creation (purchase) to the final release (the expiration of the monthly package instance, the arrears of the billing paid by configuration instance, or the active deletion of the payment by configuration instance user). The following table shows the possible status of an instance during the life cycle instance.

Status|Status Attribute|Description
:---|:---|:---|                
Pending|Intermediate Status | After submitting the task of creating instance and entering the status before "Running". If it is in this status for a long time, it means that an exception occurs to create instance.                
Running|Stable Status|Instance in Normal Running Status, you can run your business on this instance status, and can perform corresponding operations on the instance at the same time.                
Stopped|Stable Status|The status after the instance was stopped normally, the instance in this status stops providing services externally.                
Error|Stable Status|The status of the instance after the exception occurred in the operation instance is defined as the "error" status. The system will automatically roll back the "Error" instance caused by the instance exception. (The instance will not be queried after a period of time. There is no charge for the instance: if the billing is paid by configuration, there will be no relevant bill for the next deduction period; if it is the monthly package billing, advance receipts will be returned to the original payment method), and the user does not need to delete it by himself; for other "Error" instances caused by exception operation, the user can delete automatically or contact customer service support through ticket.                
Deleting|Intermediate Status|Instance that is pay by configuration billing, error status or monthly package expiration, the status between the deletion instance and the deletion success submitted from console.                
Starting|Intermediate Status|The "Stopped" status instance status that is after the "Start" operation to the "Running" status, if it is in this status for a long time, an exception occurs.                
Stopping|Intermediate status|The status of instance under "Running" status after the "Stop" operation and before entering the "Stop" status, if this status lasts for a long time, it indicates occurrence of an exception.                
Rebooting|Intermediate Status|The status of instance under "Running" status after the "Rebooting" operation and before entering the "Running" status, if this status lasts for a long time, it indicates occurrence of an exception.                
Resizing|Intermediate Status|The status of instance under "Stopped" status after the "Upgrade Resize" operation and before reentering the "Stop" status, if this status lasts for a long time, it indicates occurrence of an exception.                
|Rebuilding|Intermediate Status|The status of instance under "Stopped" status after the "Upgrade Resize" operation and before reentering the "Stop" status, if this status lasts for a long time, it indicates occurrence of an exception.                

If there is an exception in your instance, please open ticket.