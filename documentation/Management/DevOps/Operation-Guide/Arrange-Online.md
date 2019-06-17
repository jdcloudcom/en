# Arrange on-line


Support across-application deployment and release operation by compiling json, and provide settings of serial, parallel, failure threshold and others.

Click **Continuous Delivery** in the menu bar to log in the "Arrange On-line".

1. New View

Enter view name, time-out period and other configurations

2. Write view content

- The layers are serialized
- Jobs within each layer can be parallelized, and if the level of concurrency is set to 6, up to 6 jobs can be executed simultaneously
- Concurrency within job is set in the way supported by the job supports and is consistent with the page operating behavior. Taking package deployment job for example, its concurrency field values and meanings are as follows: 0-serial, 30-30%, 70-70%, 100-parallel. However, for image deployment job, its concurrency field values are as follows: 0-parallel, 1-serial …
- When the number of failed jobs in the layer reaches the configured max_fail (failure threshold), such layer and the overall view are marked as failures. Please view examples below:,

```
[
    // Level 1
    {
        "concurrency": 2, // Concurrency in group 1 (Note: 0 stands for full concurrency, 1 stands for serial, n stands for up to n jobs are executed at the same time)
        "timeout": 1200,  // time-out time of group 1 (s)
        "pause": 1,       // After the execution of this level is completed, the view will enter into the "pause" status; click **Continue to Execute** in the execution records to continue executing the following levels
        "max_fail": 3,    // The level (and the whole view) will only be marked as failed when the number of failed jobs in this level reaches 3; if it is given 0 here, all the failed jobs will be ignored
        // Deployment job in group 1, each job corresponds to the deployment of one APP
        "jobs": [
            // job1
            {
                "app_name": "yangxiaojia-test-app1",  // job1 APP name
                "concurrency": "0",                   // job1 instance concurrency (package deployment: 0-serial, 30-30%, 70-70%, 100-parallel || Image deployment: 0-serial, 1-serial, 2-up to 2 parallel instances at the same time…)
                "instance_timeout": 300,              // job1 execution time-out time (s)
                // job1 Deployment Target
                "target": [
                    "group-hb",                      // Target group (if it is package deployment, it can be instance too, such as 0.group-hb)
                    "group-sh"
                ],
                "type": "1",                          // job1 online type:1-package deployment, 2-image deployment, 4-elastic deployment, 5-elastic expansion
                "version": "4f40681d-20170622095458"  // job1 online package version
            }
            // Other jobs
            ...
        ]
    }
    // Other Levels
    ...
]
```

3. After saving the view, editing, executing, viewing the execution history and deleting operations can be supported
