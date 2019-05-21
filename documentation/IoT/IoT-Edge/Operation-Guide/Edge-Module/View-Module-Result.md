# View the edge computing result

You can view the result of image detection and the image captured by cameras in your own OSS space.

## Note

1. The image detection module has been correctly deployed on the edge node.

```
docker ps
```

   View in the list displayed: After being successfully deployed, the statuses of two services, i.e., object-detector and device-service-webcam are UP.

2. The USB camera should be correctly connected to the edge node, and is in on status.

3. Your OSS service has been confirmed as normally enabled.

## Operation Steps

1. Log in to your OSS Console to enter the Bucket created by you for edge computing.
2. The default storage path is:
   ${edgename}/edgedata/${cameraname}/
3. You can see the detected image information and result file (the detected image and result file have the same file name)
   Result File Description:
```
{"lable":"couch","score":0.77111024,"left":265,"right":598,"top":204,"bottom":481}
{"lable":"couch","score":0.3735574,"left":516,"right":627,"top":202,"bottom":470}
{"lable":"couch","score":0.3014214,"left":448,"right":582,"top":223,"bottom":470}
```
   Where:
        lable is the result identified in the detection
        score is credibility (similarity)
        left/right/top/bottom is where the detected object is located in the corresponding image.
        
## Related References 

- [Create the edge computing node](../../Getting-Started/Create-Edgenode.md)
- [Install the Edge system](../../Getting-Started/Install-Edge-System.md)
- [Deploy the edge computing module](../Edge-Module/Deploy-Edge-Module.md)
- [Control the edge node sub-device](../../Best-Practices/Control-Device.md)
