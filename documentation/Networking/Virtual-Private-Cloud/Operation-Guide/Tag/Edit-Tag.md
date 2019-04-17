# Edit Tag
When newly applied Public IP needs to associate tag, or edit associated tag, it can be implemented with Edit tag.

## Operation Steps

1. Access [Public IP Console](https://cns-console.jdcloud.com/host/pip/list) to enter Public IP List page. Or access [JD Cloud Console](https://console.jdcloud.com) and click **VPC** - **Elastic IP** at the navigation bar on the left to enter Public IP List page.
2. Select regions.
3. Select the public IP with tags to be edited in the Public IP List.
4. Operations for single host: Click **Operation** - **More** - **Edit Tag**, or click **Public IP Name** to enter Details page and click **Operation** - **Edit Tag**.
5. In the "Edit Tag" popup, the Current Tag displays the tags that the Public IP currently associated by default. If there are 10 tags of the current public IP in the Current Tag, then **Add** will be disabled.
6. You can pull down and select the corresponding tag Key-Value and add tags directly according to the current tags or according to the fuzzy matching based on input, and click **Add** to display it in the current tag
7. Click **OK** to complete the tag editing according to the display situation in the current tag.

		Note:
		* For the same resource, the tag key cannot be repeated. Before and after editing, if the tag Keys are the same and the values are different, the old value will be replaced by the new value.
		* Clicking **Add** will not trigger Edit Tag. Only clicking **OK** will trigger Edit Tag, which tags that are no longer needed by the current public IP will be disassociated according to the edited tags, and then associate new tags/replace original tags. Example: The public IP currently associates the following tags: "Owner: Product R&D, Usage: Test, Operator: Administrator, Environment: Pre-release", which needs to be edited as: "Owner: Product R&D, Usage: Development, Operator: Administrator". It shall disassociate the tag of "Environment: Pre-release" first, then associate the new tag/replace the original tag: "Usage: Development". If you encounter network jitter, you may also encounter a situation where the disassociation succeeded but the association/replacement failed. In such case, please operate Edit Tag again.

After completion of editing tags, you can view whether the edit is succeeded through Public IP List page/Details page, or click **Tag Filter** at the top of Public IP List [Filter Resources](Filter-by-Tag.md). Please note if the list page does not display tag information items, you can select Tags to be displayed through customized list. See [View Resources](../Instance/Query-Instance-Info.md) for detailed operation steps.

## Related References
[Select Resources by Tag Filter](Filter-by-Tag.md)

[View Resources](../Instance/Query-Instance-Info.md)



