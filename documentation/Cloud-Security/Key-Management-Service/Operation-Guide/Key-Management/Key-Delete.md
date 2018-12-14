# Key Deletion

Where the user intends to destroy the specified Key, the **Intended Key Deletion** operation can be made; when the intended deletion operation is made, the Key will not be deleted immediately; and KMS will postpone such operation as per the time specified by the user (delay time range: 7-30 days).

When the Key is in the status of planned deletion, the user cannot encrypt or decrypt any data by using keys. When the planned deletion time is not due, the user can cancel the Key deletion operation and enable such Key again to use such Key again. If the planned deletion time is due, such Key will be permanently deleted by KMS and any data encrypted by such Key will be no longer decrypted. The user shall carry out the operation with care.

![删除密钥](/image/Key-Management-Service/Key-Management/计划删除密钥弹窗.png)

# Related References
- [Key Deletion via OpenAPI](/API/Key-Management-Service/Key-Management-Service/scheduleKeyDeletion.md)
- [Canceling Key Deletion via OpenAPI](/API/Key-Management-Service/Key-Management-Service/cancelKeyDeletion.md)
