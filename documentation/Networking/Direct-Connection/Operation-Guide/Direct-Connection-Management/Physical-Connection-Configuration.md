## Physical Connection
Physical Connection accesses public cloud via physical link Direct Connection so that the customer’s enterprise IDC can access the VPC resources. Physical Connection logically represents a physical link.

### Operation Steps
##### 1. Create a Physical Connection
Customers who have completed enterprise real-name verification can use a Physical Connection.<br />
a) Log in [JD Cloud & AI Physical Connection Console](https://cns-console.jdcloud.com/host/physicalConnection/list);  <br />
b) Select region and click **Create**;<br />
c) Enter the name, access region, access method, the customer’s IDC Address, partners/access point, contacts, contact information and description to create a Physical Connection;<br />
d) Two access modes of self-service access and partner access are supported. When the self-service access mode is selected, the access point shall be selected; when the partner access mode is selected, the available partners or service duration shall be selected, or the partners should be contacted for more information (Partners have entered JD Cloud Marketplace, and their detailed information is available in JD Cloud Market);<br />
e) Generally speaking, 1 to 2 working days are required for auditing a newly created Physical Connection;<br />

```
  Two access modes of self-service access and partner access are supported. Self-service access represents customers can access public cloud via exclusive port; partner access represents JD Cloud & AI has been pre-connected to some private line service providers, so customers can choose to connect with such private line service providers and access public cloud by sharing the device port the partner pre-connects with JD Cloud & AI with other customers.

  Self-service access point is provided by JD Cloud & AI, you can choose the access point closest to your IDC to complete access. From the perspective of business high availability, it is recommended to choose two different access points at one time. Meanwhile, it is also recommended to use different operators in different routes. When the ISP Line or device of one access point breaks down, it is possible to quickly switch to the ISP Line of other access points, and the overall service will not be affected.

  Via partner access, you can contact with partners, and choose the access point closest to your IDC to complete access. From the perspective of business high availability, it is recommended choose at least two access points of a partner, or to choose different partners at one time for access.

  Partners can provide you with more access points and more flexible access modes. For customers whose bandwidth is less than 1Gbps, it is recommended to choose to access JD Cloud & AI via the partner access mode.
```

```
  Physical Connection’s Status Instruction:
  To be audited: After the customer applies for a Physical Connection, it will enter into the status of "to be audited". The Physical Connection shall be audited by the background personnel of JD Cloud & AI, and the items to be audited include: Whether the customer has completed the enterprise real-name verification, whether the chosen access points or partners meet the access requirements, etc. If approved, the Physical Connection will enter into the status of "to be paid", and the corresponding order will be generated. The Direct Connection order of Cloud Marketplace shall be generated in the mode of "partner access"; the ordinary order of JD Cloud & AI shall be generated in the mode of "self-service access". If unapproved, the Physical Connection will enter into the status of "unapproved";
  To be paid: Under such a status, the customer may make a payment for the corresponding order. After the customer pays for the order, the Physical Connection via "self-service access" will automatically enter into the status of "under construction". Regarding to the Physical Connection via "partner access" mode, when partners confirm to start construction, the Physical Connection will enter into the status of "under construction";
  Under construction: Regarding to "self-service access" mode, after the physical link connects to the Direct Connection device port of JD Cloud & AI and the link layer is successfully debugged (when port is UP, the optical transmitting and receiving is normal), the construction is deemed as completed, and then the Physical Connection will enter into the status of "to be confirmed". Regarding to "partner access" mode, after the physical link connects to the Direct Connection device port of partners and the link layer is successfully debugged, the construction is deemed as completed, and then the Physical Connection will enter into the status of "to be confirmed";
  To be confirmed: When the Physical Connection is under the status of "to be confirmed", the customer can conduct network joint debugging test to physical link with JD Cloud & AI & operators and partners. When the network joint debugging test is passed, the customer shall confirm that the construction of Physical Connection is completed on JD Cloud & AI Console. Upon confirmation, the Physical Connection will enter into the status of "available";
  Available: It represents the Physical Connection can be normally used now. When some causes result the physical link cannot be normally used, the Physical Connection will enter into the status of "unavailable";
  Unavailable: It represents the Physical Connection cannot be normally used now. After failures are removed, the Physical Connection will enter into the status of "available";
  Deleting: When the customers no longer need the Physical Connection, they can delete it. As the physical link needs to be removed, the customer shall submit an application for link removal 1 month in advance at least. Upon the customer deletes the Physical Connection, the Physical Connection will enter into the status of "deleting". For the Physical Connection applied via "self-service access" mode, after the physical link is confirmed to have been removed, JD Cloud & AI’s background personnel will verify the removal, delete the Physical Connection synchronously and clear all configuration information related to the Physical Connection in the Direct Connection physical device. For the Physical Connection applied via "partner access" mode, partners will delete the Physical Connection synchronously and clear all configuration information related to the Physical Connection in the Direct Connection physical device;
  Unapproved: It is the status when the Physical Connection is unapproved due to some causes;
```

![](../../../../../image/Networking/Direct-Connect-Service/Operation-Guide/create-physical-connection.png)

##### 2. Modify Physical Connection
You can modify the name and description of Physical Connection.<br />
a) Log in [JD Cloud & AI Physical Connection Console](https://cns-console.jdcloud.com/host/physicalConnection/list);  <br />
b) Select corresponding Physical Connection and log in the details of Physical Connection;<br />
c) Modification of the name and description of Physical Connection is supported, and the restriction of each configuration item is the same as the creation of Physical Connection;<br />

![](../../../../../image/Networking/Direct-Connect-Service/Operation-Guide/update-physical-connection.png)

##### 3. Resize Physical Connection
If you need to resize the physical port specification due to business changes, please consult with JD Cloud off line for the specific change time and prepare the required single-mode optical module of new specification. The data center personnel will change the port after the physical connection cuts off the traffic. After the port is changed and the traffic is confirmed to be recovered (the speed limit of the physical port then is the original specification), please resize the port configuration in the Console in order for billing as per the new port specification. The speed limit will be automatically resized as the new rate after the payment is made.<br />
a) Log in [JD Cloud & AI Physical Connection Console](https://cns-console.jdcloud.com/host/physicalConnection/list);  <br />
b) Select the corresponding physical connection and click **Resize** on the operation bar. Please upgrade or downgrade the configuration as per your actual needs;<br />

##### 4. Delete Physical Connection
If you do not need physical connection anymore, you can delete it.<br />
a) Log in [JD Cloud Physical Connection Console](https://cns-console.jdcloud.com/host/physicalConnection/list);  <br />
b) Select the corresponding physical connection and click **Delete** on the operation bar. The physical connection without private virtual interface created can be deleted;<br />

![](../../../../../image/Networking/Direct-Connect-Service/Operation-Guide/delete-physical-connection.png)
