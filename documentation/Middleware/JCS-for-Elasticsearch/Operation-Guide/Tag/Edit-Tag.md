## Edit Tag

When you create a new cluster that needs to be associated to tags, or for an instance already associated with tags that you need to change its associated tag situation, you may do this by editing the tags.</br>
1. Access [JCS for Elasticsearch Console](https://es-console.jdcloud.com/clusters), and enter the cluster list page. Or, access [JD Cloud Console](https://console.jdcloud.com) and enter the instance list page by clicking [Middleware]-[JCS for Elasticsearch] on the left navigation bar.</br>
2. Select regions.</br>
3. Select the clusters in the instance list whose tags need to be edited, and confirm their statuses are “running”.</br>
4. Click **Operation**-**More**-**Edit Tag**.</br>
5. In the “Edit Tag” popup, the current tags by default display the current associated tags of Virtual Machine; if there are already 10 current tags in the current instance, then no more tags can be added.</br>
6. You can pull down and select the corresponding tag Key-Value and add tags directly according to the current tags or according to the fuzzy matching based on input, and click **Add** to display it in the current tag.</br>
7. Click **OK** to complete the tag editing according to the display situation in the current tag.</br>

```
Note:
* For the same resource, the tag key cannot be repeated. Before and after editing, if the tag Keys are the same and the values are different, the old value will be replaced by the new value.
* Clicking **Add** does not trigger editing tag. Only clicking **Confirm** will trigger editing tag. The tag not needed any more of the current Virtual Machine will be disassociated first according to the edited tag, and then the new tag will be associated/the original tag will be replaced. If you encounter network jitter, you may also encounter a situation where the disassociation succeeded but the association/replacement failed. In such case, please operate Edit Tag again.
After completing editing tags, you can check whether the tag is successfully edited through the instance list page/details page, or click **Tag Filter** to check whether it has been changed.
```

After completing editing tags, you can check whether the tag is successfully edited through the instance list page/details page, or click **Tag Filter** to check whether it has been changed.
