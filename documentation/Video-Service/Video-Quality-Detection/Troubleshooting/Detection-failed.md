# Detection failed

## Problem Description

Is the detection failure result returned in a short time after a task is created and detected and detection is executed?

## Troubleshooting

1. As JD Cloud Video Quality Detection can access and execute detection via URL you provided, please detect that if video URL you provided has any access permission, such as Anti-Leech. If yes, please release the permission or configure JD Cloud to the white list. Otherwise, detection will fail because no video content is accessed.

2. If your video information is saved in OSS of a cloud manufacturer, please check if you have enabled the Internet access permission. If yes, please enable Internet access permission and check if there is any other permission control.

