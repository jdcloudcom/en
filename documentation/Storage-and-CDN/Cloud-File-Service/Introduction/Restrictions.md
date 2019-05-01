# Use Constraint

## Supported Operating System

Cloud File Storage currently supports NFS v4.1 and NFS v4.0 protocols for Linux Virtual Machines. The compatible JD Cloud Public Image versions include:

- CentOS 6.9 64-bit and versions above, including: NFSv4.1 protocol for CentOS 7.3 and above, and NFSv4.0 protocol for CentOS 6.9 to CentOS 7.2.
- Ubuntu 14.04 64-bit and Ubuntu 16.04 64-bit



## Resource Restriction

| **Resource**                 | **Limit**                 |
| ------------------------ | ------------------------ |
| File storage number               |  cn-south-1   -  not exceeding 20 |
| The attached target number of each file storage | not exceeding 1                |
| The VPC number of each file storage | not exceeding 1                |
| The maximum capacity of each File Storage     | 1PB(1T during Beta period)          |



## Size limit of a single file

During product Beta period, a single file size of up to 140G is supported. After the product is officially released, it supports a single file of up to 8T.



## Support for NFS protocol

- File storage supports NFS v4.1 and NFS v4.0 version protocols, and does not support NFS v2 or NFS v3.


- The following features of the NFSv4.1 and NFSv4.0 version protocols are not supported currently:


  - pNFS

  - Any type of client delegation or callback

  - The OPEN operation always returns OPEN_DELEGATE_NONE as the delegate type

  - OPEN returns NFSERR_NOTSUPP for the CLAIM_DELEGATE_CUR and CLAIM_DELEGATE_PREV declaration types.

  - Compulsory Lock
    All locks in JD Cloud file storage are advisory locks, which means that READ and WRITE operations do not check for conflict locks before they are executed.

  - Deny Sharing
    NFS supports the concept of sharing denial, which is primarily used by users' Windows clients to deny others access to specific files that are already open. The JD Cloud File Storage does not support this operation and returns the NFS error NFSERR_NOTSUPP for any OPEN command that specifies a sharing deny value other than OPEN4_SHARE_DENY_NONE. The Linux NFS client does not use anything other than OPEN4_SHARE_DENY_NONE.

  - Identity and Access Management List (ACL)

  - JD Cloud File Storage does not update the time_access attribute read by the file. JD Cloud File Storage update the time_access in the following events:
    1)Create File (will create inode).
    2) When it explicitly calls setattr on the NFS client.
    3) Write content to the inode due to file size changes or file metadata changes.
    4) Update any inode attribute.

  - Namespace.

  - Persistent reply cache.

  - Kerberos-based security.

  - NFSv4.1 data retention.

  - SetUID on the directory.

  - File types not supported when using CREATE operations: Block storage device (NF4BLK), character device (NF4CHR), attribute directory (NF4ATTRDIR), and naming attribute (NF4NAMEDATTR).

  - Attributes not supported: FATTR4_ARCHIVE, FATTR4_FILES_AVAIL, FATTR4_FILES_FREE, FATTR4_FS_LOCATIONS, FATTR4_MIMETYPE, FATTR4_QUOTA_AVAIL_HARD, FATTR4_QUOTA_AVAIL_SOFT, FATTR4_QUOTA_USED, FATTR4_TIME_BACKUP and FATTR4_ACL, Attempting to set these properties will result in an NFS4RR_ATTRNOTSUPP error being sent back to the client.
