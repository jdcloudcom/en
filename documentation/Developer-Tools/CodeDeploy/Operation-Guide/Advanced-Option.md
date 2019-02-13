## Advanced Options of Deployment Group

**Policy for Files with the Same Name**

How to handle files of the same name in the same directory when setting during deployment/rollback. There are three supporting methods currently: Deployment failed, namely if there is a file of the same name, it means deployment is failed; replace, namely replace the original file of duplication of name with a new file; reserve, namely reserve and not replace the original file of duplication of name.

Default option: Replace

**Notification Frequency and Method**

- Notification frequency: Select only one of the notification trigger conditions among sending in case of deployment exception, sending in every deployment, no notification. If the previous two options are selected, then when the notification condition is met, notifications will be sent according to the selected notification method.
- Notification method: Multiple choices, i.e. message, email and SMS.

Default option: No notification

**Automatic Rollback**

You can set whether to trigger automatic rollback when deployment failed, then it will roll back to the previous deployed version.

Default option: No


![Alt text](https://github.com/jdcloudcom/cn/blob/codedeploy/image/CodeDeploy/operation12.png)
