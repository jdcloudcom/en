# Features

## Support for NFS file system protocol

The Cloud File Service supports NFS v4.0 and NFS v4.1 protocols and can attach by using standard file system attach command.

## Shared File Storage

Multiple Virtual Machines can simultaneously access file storage created in the Cloud File Service, conduct read/write operation of files and implement data share of multiple computing nodes through NFS v4.0 or NFSv4.1 protocols.

## Auto Expansion of Capacity

Single file storage can provide up to PB-level capacity, so it is unnecessary to preset the file storage capacity after you creating the file storage. The file storage capacity can implement auto scaling according to your operation of adding or deleting files therein. You only need to pay for the actual usage of file storage.

## Persistent and Reliable Service

The Cloud File Service adopts distributed architecture with three-copy design. All files and directories of user are dispersed over different fault domain storage to prevent the single-point fault from causing data unaccessibility or data loss. It has high availability and high persistence.

## Access Permission Management

The attached targets of the Cloud File Service are set in user's VPC, so all accesses to file storage are protected by the network security isolation control of user's VPC; and it supports the read/write Identity and Access Management of the users to file data through standard POSIX permission control.

