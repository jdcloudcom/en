# Release API Groups

The information of API group can be used via publishing after creation. Currently, the JD Cloud provides 3 sets of publishing environment: Test, pre-launch, online. You can publish and test the API group in test and pre-publish environment, and down load the SDK and documents; and officially publish the SDK and documents of on-line API group in on-line environment.

API caller can access and call the API through custom domain or secondary domain after publishing.

Please note that:
- If selecting Mock backend in publishing, directly return to normal constant result instead of requesting the real back service when commissioning. This method applies to test if the request link of API is correct and skip the APP authentication and signature verification;
- The gateway will actually request the backend service if selecting the unique backend and recording the backend address.

## Relevant References:

- [Description of steps for publishing](../Operation-Guide/Create-Publish/Create-Publish.md)
