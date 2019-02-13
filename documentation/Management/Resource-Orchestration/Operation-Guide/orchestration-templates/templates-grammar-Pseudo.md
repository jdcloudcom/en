# Basic Syntax Clarification of Orchestration Template

## Pseudo Parameters

Pseudo parameters are JDRO predefined parameters that can be used directly. Please do not declare them in your template. You can use them as the parameters of Ref function, in the way just the same as all the parameters.

```
JDCLOUD::StackId
```

Return Resource Stack ID

```
JDCLOUD::StackName
```

Return resource stack name, such as test_stack

```
JDCLOUD::Region
```

Return the Region where the resource stack is located, such as cn-north-1.
