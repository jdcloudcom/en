# Release CodePipeline

## Manual Release
Click **Release** to execute CodePipeline manually.

![](/image/codepipeline/Release-Pipeline.png) 

During the execution process, different colors of the stages represent different statuses.

   - Blue: represent the stage is executing
   - Green: represent the stage execution is successful
   - Red: represent the stage execution failed
   - Grey: represent non-executed stage

## Manual Confirmation
After manual confirmation nodes are added in the operation, the execution of CodePipeline will stop at the operation, which the execution will continue after clicking **OK** on the page.

![](/image/codepipeline/Check-Pipeline.PNG) 

## Automatic Release
If you select **Update by Means of webhook** in the source code operation, then the codes submitted for each time will automatically release to CodePipeline.
