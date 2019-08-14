# Product Overview

## Product Introduction
Tag is the tool for JD Cloud’s users to manage their own resource instances. You can categorize the resources by associate tags for resources, thus you can manage your various types of resources in JD Cloud more effectively.
Each tag is composed of a "key" and a "value", for example: "Using Department: Basic R&D Department". At here, the "Using Department" is the "key" of this tag and the "Basic R&D Department" is the value of this "key".
Each resource can associate 10 tags with different key.

The tag itself has no effect on the instance and it cannot be created independently without resource instance. When the last resource instance associated by a tag is deleted, this tag will also be deleted.
Currently, only the operation of associate and disassociate the tag by console is supported. You can associate tag for resource after the resource is created.

## Benefits
Users can use the tag service function, and classify and manage cross-region and cross-product-type resources in multiple dimensions according to their needs. For example, resources are marked according to different dimensions such as resource owners, departments and usages. In this way, these resources can be counted and managed in batches in different dimensions.


## Resource Type Supported
Currently, the sources supported by JD Cloud’s tag management include the types as follows:

 - Virtual Machines
 - Cloud Disk Service
 - Native Container Instance
 - Native Container pod
 - Public IP 
 - JCS for Kubernetes  
 - Cloud File Service 
 - CDN 
 - SQL Server Database
 - MySQL
 - Percona
 - MariaDB
 - PostgreSQL
 - MongoDB
 - Distributed Relational Database Service DRDS
 - JCS for Elasticsearch
 - JCS for Memcached
 - JCS for Redis
 - Message Queue JCQ
 - Queue Service 


There will be a follow-up increase of resources of the types that support to associate tags
