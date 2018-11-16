# Create Video Snapshot Workflow

## Action Steps

1. Login **Media Processing Service Console**(https://mps-console.jdcloud.com/).

2. Click **Video Snapshot Workflow**.

3. Choose the Region in need.

4. Click **Create Task**.

![](../../../../image/Media-Processing-Service/MPS-007.png)

5. In New Task popup, respectively click source **Bucket** and target **Bucket**, snapshot file format, and snapshot method. click source video file or input file name for retrieval. Input snapshot file prefix, file format, snapshot width, snapshot height, and snapshot number. Click OK to submit video snapshot task.

Snapshot method supports single snapshot, multiple snapshots, average snapshot. Start time must be input for single snapshot, while start time and end time must be input for multiple snapshots

Number must be specified for multiple snapshots and average snapshot, and snapshot number shall be between 1 and 3600

Keyframe is on by default

6. View snapshot task and status

In [Media Processing Service]>>[Video Snapshot Workflow] task list Choose Region , Time Range, View Snapshot Task

  i. View Task List and snapshot status

  ![](../../../../image/Media-Processing-Service/MPS-008.png)

  ii. Click **TaskId** to view task details

  ![](../../../../image/Media-Processing-Service/MPS-009.png)
