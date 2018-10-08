# Edit Tag
When you create a new instance that needs to be bound with a tag, or when you need to change the bound tags of an instance, you can do so by editing the tag.

## Precondition
The instance state needs to be "Running" or "Stopped".

## Operation Steps

1. Access [Virtual Machines Console](https://cns-console.jdcloud.com/host/compute/list) and enter the instance list page. Or access [JD Cloud Console](https://console.jdcloud.com) Click navigation bar on the left **Elastic Compute** - **Virtual Machines** to enter the instance list page.
2. Select a region.
3. Select the instance with tag to be edited from the instance list and confirm that its status is either "Running" or "Stopped".
4. Single Operation: Click **Operation** - **More** - **Edit Tag**, or click instance name to enter the details page and then click **Operation** - **Edit Tag**.
5. In the pop-up "Edit Tag" window, the current tag displays the currently bound tags of the VMs by default. If there are 10 tags in the current tag of the current instance, **Add** is grayed out.
6. Users can select the corresponding tag key/value (Key-Value) according to the existing tags from the pull-down menu or after fuzzy matching according to the input and click **Add]. Then, it will display in the current tag
7. Click **OK** to complete the tag editing according to the display in the current tag.

		Please note:
		* The tag key of same resource cannot be repeated, and if the tag key (Key) is the same before and after editing and the value is different, the original value will be replaced by the new value.
		* Clicking **Add** does not trigger the tag editing, and the tag editing will be triggered only after **OK** is clicked. Unnecessary tags of current Virtual Machines will be unbound first according to the edited tags, and then new tags will be bound/ original tags will be replaced. For example: if currently the Virtual Machines is bound with the following tags: "Owner: Product R&D, Purpose: Test, Operator: Administrator, Environment: Pre-release", and it needs to be edited into: "Owner: Product R&D, Purpose: Development, Operator: Administrator", you will first unbind the tag "Environment: Pre-release", and then bind a new tag/ replace the original tag: "Purpose: Development". Please edit tag again, if the unbinding is successful while the binding/ replacement is not due to network jittering.

After a tag is edited, you can check whether the tag is successfully edited through the instance list page/ details page, or Click Tag Filter above the instance to filter instances. Please note that if the tag item is not displayed on the list page, you can select to display tags through edit columns. For details, refer to [Query Instance](../Instance/Query-Instance-Info.md).

## Related Reference
[Filter Instances by Tag](Filter-by-Tag.md)

[Query Instance](../Instance/Query-Instance-Info.md)



