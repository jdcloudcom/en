# Cloud Products Supporting IAM

The purpose of IAM is to support all cloud products and services on the JD Cloud to control operations of resources for sub-users and roles. This document mainly lists the current cloud products accessing IAM and their corresponding access method and specific details.

The information in the table is defined as follows:

- Cloud Product: the name of a cloud product or service in JD Cloud.

- Service Name: unique identifier of a cloud product in JD Cloud.

- Policy Version: v2 or v3

> At present, IAM supports two versions, which are v2 and v3.
>
> v2: this version is the native version of IAM, which only supports the permission control granularity of read only (R), modify (M), delete (D). At present, this version is no longer to be iterated, the current accessed cloud products will be updated into v3 subsequently.
>
> v3: this version is the update version of IAM, which is currently capable of supporting permission control at service level, operation level, resource level, the cloud products accessing IAM subsequently will use this kind of method to determine permissions uniformly.

- Open API: determine whether the current products support IAM to manage permissions, of which "✔" represents support and "-" represents temporarily not support.

- Console: determine whether the current products support IAM to manage permissions, of which "✔" represents support and "-" represents temporarily not support.

- Authorization Granularity: permission control granularity supported by the current product.

> Authorization Granularity is divided into service level, operation level and resource level according to the granularity.
>
> - Service level: define whether there is access permissions to the whole of service, which includes allowing full operation permissions or denying full operation permissions to cloud products.
> - Operation level: define whether there is access permissions to the specific interface (API) of cloud product, e.g., grant permission that the sub-user can read policy list in IAM.
> - Resource level: define whether there is access permission to specific resources, which is the smallest authorization granularity, e.g., grant permission that the sub-user can modify the policy details in IAM.

|  **Cloud Products**  | **Service Name** | **Policy Version** | **Open API** | **Console** | **Authorization Granularity** | **User Roles** | **Service Roles** |
| :----------: | :--------------: | :------: | :------: | :----: | :------: | :------: | :------: |
|    Virtual Machines    |      server      |    v2    |    ✔     |   ✔    |   －     |   －   |    －     |
|    Cloud Image    |      image       |    v2    |    ✔     |   ✔    |    －    |   －    |    －     |
|    Cloud Disk Service    |      volume      |    v2    |    ✔     |   ✔    |    －    |   －    |    －    |
|    Public IP    |    floatingIp    |    v2    |    ✔     |   ✔    |    －    |    －     |    －   |
|   Cloud Database   |     database     |    v2    |    ✔     |   ✔    |    －    |    －   |    －    |
|    JCS    |      cache       |    v2    |    ✔     |   ✔    |   －   |    －    |   －     |
|     VPC      |       vpc        |    v2    |    ✔     |   ✔    |    －    |   －    |   －     |
|   Endpoint Security   |       hips       |    v3    |    ✔     |   ✔    |Operation level  |   －     |   －   |
| Anti-DDoS Basic |     baseanti     |    v3    |    ✔     |   ✔    | Resource level  |   －    |   －    |
|   Situation Awareness   |       csa        |    v3    |    ✔     |   ✔    |  Operation level  |   －     |   －     |
| Application Security Gateway |       sgw        |    v3    |    ✔     |   ✔    |Resource level  |   －     |    －     |
|   Load Balancer   |        lb        |    v3    |    ✔     |   ✔    |  Resource level  |   －    |   －     |
|     POD      |       pod        |    v3    |    ✔     |   ✔    |  Resource level  |    －    |   －    |
| Message Queue JCQ  |       jcq        |    v3    |    ✔     |   ✔    | Resource level  |   －     |    －    |
