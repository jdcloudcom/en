# Change Configuration

If configuration of this InfluxDB Instance Type is not matched with your business application requirements, you can change instance configuration until your business requirements are meet. 

InfluxDB instances support changed configuration item, including:

- Specification, i.e. CPU core number and memory capacity distributed to the instance.
- Bucket, i.e. disk capacity distributed to an instance.

## Note

- Instance Type only support configuration upgrade or configuration downgrade.
- Bucket only supports configuration upgrade rather than configuration downgrade.

## Preconditions

- Change configuration can be executed to instances which are in running and normal billing status.

## Operation Steps

1. Log in [InfluxDB Console](http://tsds-console.jdcloud.com/list).

2. Select the target instance on the "Instance List" page, click **Change Configuration** and open the "Change Configuration" popup.

   ![1564384077331](../../../../../image/JCS-for-InfluxDB/1564384077331.png)

3. Select the new configuration to be adjusted in the popup.

   ![1564374942439](../../../../../image/JCS-for-InfluxDB/1564374942439.png)

   - Specification:
     - CPU and memories occupied by instances support upgrade and downgrade both.
     - Bucket: The disk space occupied by the instance only can be upgraded rather than downgraded.
   - Network: VPC and subnet of this instance cannot be modified.
   - Billing type: The billing type of this instance cannot be modified.
   - Expiration time: Expiration time of instance in monthly package.
   - Configuration Cost:
     - If the Pay by Configuration is adopted as the billing type, the cost refers to the hourly cost of newly configured instance.
     - For the instance adopting the billing type of Monthly Package, the cost refers to the balance between the original configuration and new configuration of instance within the validity period.

4. After configuration selection is completed, click **OK** to enter the "Order Confirmation" page.

5. Confirm instance information on the "Order Confirmation" page and read the JCS for InfluxDB Service Terms.

   - Please click **Instant Account Setup** in case the billing type is pay by configuration.
   - If the Monthly Package is adopted as the billing type, please click **Pay Now**, log in the "Order Payment" page and complete the payment process.

6. After the payment process is completed, the page will automatically redirect to the InfluxDB "Instance List" page, and after the instance configuration is changed, you can view the changed configuration information on the "Instance Details" page.