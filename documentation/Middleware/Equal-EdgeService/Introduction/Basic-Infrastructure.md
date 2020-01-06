**Basic Architecture Chart:**

![architecture.png](../../../../image/Equal-EdgeService/architecture.png)


**Key Component:**<br>
Serving as an edge computation platform, in addition to underlayer service management capacities, JEES also provides some basic function modules which are divided into a cloud management platform (cloud) and a local operation package (edge), with details as follows:
- The module epnc-core is the only entrance of edge node and cloud center, which is mainly responsible for receiving edge node information report and distributing corresponding computation task;

- The module epnc-stats is responsible for collecting usage information of edge node and computation task and for saving the same in the time sequence database and Monitoring;

- The module epnc-scheduler is responsible for scheduling the arrangement task submitted by users to appropriate edge nodes;

- The module epnc-config is responsible for saving the arrangement task information submitted by users;

- The primary program epnc-edge of local operation package is responsible for receiving management of cloud instructions and service instances, such as start, exit and protection, and for managing user’s computation tasks at the edge side. Two operation modes are supported, i.e., Native progress mode and Docker container mode.
