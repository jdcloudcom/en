# Best Practices of VR Live Streaming

## 1.VR Live Streaming Signal Collection

VR Live Streaming requires professional VR collection devices and relevant software, such as Detu, Insta360, etc. You may choose the corresponding device according to your needs.   
If you already have a professional VR collection device, you can collect VR Live Streaming signals according to the device instructions.

## 2. VR Live Streaming Image Stitching

Because VR Live Streaming signals are collected by a number of lenses, the live streaming signals collected can only be pushed when their images are stitched. Generally, VR device manufacturers will offer the supporting stitching software. You only need to download and install the stitching software offered by the manufacturer, and then stitch the images from the live streaming signals transmitted by a number of lenses of the collection devices according to the software instructions.
##
## 3. VR Live Streaming Signals Pushing Streaming

**3.1. Enable JD Cloud VR Live Streaming service**

Before pushing streaming, you need to enable JD Cloud VR Live Streaming service and create the pushing streaming domain on the Console and associate CNAME and so on. For details, refer to [Getting Started](https://github.com/jdcloudcom/cn/blob/edit/documentation/VR-Cloud-Services/VR-Live/Getting-Started/Service-Provisioning.md)".

**3.2 VR Live Streaming Pushing Streaming**

A. Use a pushing streaming tool provided by VR device manufacturer for pushing streaming  
Many VR collection device manufacturers provide live pushing streaming tools. Before pushing streaming, you need to download and install a pushing streaming tool offered by the manufacturer and conduct the pushing streaming according to the operation instructions. In this course, you need to take the pushing streaming domain configured in 3.1 as the output pushing streaming address.

B. Use RTMP server + common pushing streaming tools for pushing streaming  
Link all hardware such as VR collection device, RTMP server on VR Live Streaming site to a LAN and ensure it has access to the external network and meet the uplink bandwidth actually required; and then enable the RTMP server to push the live streaming signals stitched by VR collection device to the RTMP server; finally, use a common pushing streaming tool (e.g. OBS) that is set on the pushing streaming address configured by JD Cloud for pushing streaming.
 

