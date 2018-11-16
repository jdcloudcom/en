# Core Concepts

** Data Sets **

The data set in the Data Factory service refers to the data-source end which needs to be specified or the storage instances of different data on different target sides when there are synchronization tasks. Therefore, before creating a synchronization task, you must first connect to the data sets. The same data set can be either the data source end or the data target end for multiple synchronization tasks.

 

** Connectivity of Data Sets **

In order to verify whether the Data Integration service can connect successfully, the user needs to fill in the corresponding value for connectivity check according to the different data set type when the user creates the data set connection. The successful connection of the data set is the prerequisite for the success of the data synchronization task.

 

**Synchronized Tasks**

A synchronization task is the smallest unit for a user to make use of Data Integration service. Each synchronization task requires the user to configure the data source end, the data target end, and the corresponding synchronization strategy (such as the processing of dirty data).

 

**Workflow**

Workflows realizes the process for data and interdependence in the manner of graphical design task.