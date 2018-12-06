# Cloud Disk Service Monitoring

<br>

JD Cloud has provided monitoring data up to 30 days for Cloud Disk Service attached to a Virtual Machines to offer you real-time running conditions and performance monitoring metrics of Cloud Disk Service. Cloud Disk Service currently provides the below monitoring metrics:

<table class="confluenceTable tablesorter tablesorter-default">
    <thead>
        <tr class="tablesorter-headerRow firstRow">
            <th style="background: no-repeat right rgb(240, 240, 240); text-align: left; color: rgb(0, 0, 0); padding-top: 7px; padding-right: 15px; padding-bottom: 7px; vertical-align: top; border-top-color: rgb(221, 221, 221); cursor: pointer; user-select: none;" class="confluenceTh sortableHeader">
                <p>
                    <span style="color: rgb(0, 0, 0); font-family: Microsoft YaHei, &quot;Microsoft YaHei&quot;; font-size: 14px;">monitoring item</span>
                </p>
            </th>
            <th style="background: no-repeat right rgb(240, 240, 240); text-align: left; color: rgb(0, 0, 0); padding-top: 7px; padding-right: 15px; padding-bottom: 7px; vertical-align: top; border-top-color: rgb(221, 221, 221); cursor: pointer; user-select: none;" class="confluenceTh sortableHeader">
                <p>
                    <span style="color: rgb(0, 0, 0); font-family: Microsoft YaHei, &quot;Microsoft YaHei&quot;; font-size: 14px;">meaning</span>
                </p>
            </th>
            <th style="background: no-repeat right rgb(240, 240, 240); text-align: left; color: rgb(0, 0, 0); padding-top: 7px; padding-right: 15px; padding-bottom: 7px; vertical-align: top; border-top-color: rgb(221, 221, 221); cursor: pointer; user-select: none;" class="confluenceTh sortableHeader" colspan="1">
                <p>
                    <span style="color: rgb(0, 0, 0); font-family: Microsoft YaHei, &quot;Microsoft YaHei&quot;; font-size: 14px;">unit</span>
                </p>
            </th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td style="padding-top: 7px; padding-bottom: 7px; vertical-align: top;" class="confluenceTd">
                <span style="color: rgb(0, 0, 0); font-family: Microsoft YaHei, &quot;Microsoft YaHei&quot;; font-size: 14px;">disk read bandwidth</span>
            </td>
            <td style="padding-top: 7px; padding-bottom: 7px; vertical-align: top;" class="confluenceTd">
                <span style="color: rgb(0, 0, 0); font-family: Microsoft YaHei, &quot;Microsoft YaHei&quot;; font-size: 14px;">average data bulk read from disk to memory per second</span>
            </td>
            <td style="padding-top: 7px; padding-bottom: 7px; vertical-align: top;" class="confluenceTd" colspan="1">
                <span style="color: rgb(0, 0, 0); font-family: Microsoft YaHei, &quot;Microsoft YaHei&quot;; font-size: 14px;">bps</span>
            </td>
        </tr>
        <tr>
            <td style="padding-top: 7px; padding-bottom: 7px; vertical-align: top;" class="confluenceTd" colspan="1">
                <span style="color: rgb(0, 0, 0); font-family: Microsoft YaHei, &quot;Microsoft YaHei&quot;; font-size: 14px;">disk write bandwidth</span>
            </td>
            <td style="padding-top: 7px; padding-bottom: 7px; vertical-align: top;" class="confluenceTd" colspan="1">
                <span style="color: rgb(0, 0, 0); font-family: Microsoft YaHei, &quot;Microsoft YaHei&quot;; font-size: 14px;">average data bulk write from memory to disk per second</span>
            </td>
            <td style="padding-top: 7px; padding-bottom: 7px; vertical-align: top;" class="confluenceTd" colspan="1">
                <span style="color: rgb(0, 0, 0); font-family: Microsoft YaHei, &quot;Microsoft YaHei&quot;; font-size: 14px;">bps</span>
            </td>
        </tr>
        <tr>
            <td style="padding-top: 7px; padding-bottom: 7px; vertical-align: top;" class="confluenceTd" colspan="1">
                <span style="color: rgb(0, 0, 0); font-family: Microsoft YaHei, &quot;Microsoft YaHei&quot;; font-size: 14px;">disk read IOPS</span>
            </td>
            <td style="padding-top: 7px; padding-bottom: 7px; vertical-align: top;" class="confluenceTd" colspan="1">
                <span style="color: rgb(0, 0, 0); font-family: Microsoft YaHei, &quot;Microsoft YaHei&quot;; font-size: 14px;">average number of requests for read data action per second</span>
            </td>
            <td style="padding-top: 7px; padding-bottom: 7px; vertical-align: top;" class="confluenceTd" colspan="1">
                <span style="color: rgb(0, 0, 0); font-family: Microsoft YaHei, &quot;Microsoft YaHei&quot;; font-size: 14px;">number/second</span>
            </td>
        </tr>
        <tr>
            <td style="padding-top: 7px; padding-bottom: 7px; vertical-align: top;" class="confluenceTd">
                <span style="color: rgb(0, 0, 0); font-family: Microsoft YaHei, &quot;Microsoft YaHei&quot;; font-size: 14px;">disk write IOPS</span>
            </td>
            <td style="padding-top: 7px; padding-bottom: 7px; vertical-align: top;" class="confluenceTd">
                <span style="color: rgb(0, 0, 0); font-family: Microsoft YaHei, &quot;Microsoft YaHei&quot;; font-size: 14px;">average requests for write data action per second</span>
            </td>
            <td style="padding-top: 7px; padding-bottom: 7px; vertical-align: top;" class="confluenceTd" colspan="1">
                <span style="color: rgb(0, 0, 0); font-family: Microsoft YaHei, &quot;Microsoft YaHei&quot;; font-size: 14px;">number/second</span>
            </td>
        </tr>
    </tbody>
</table>


Please refer to the below procedures for viewing a certain Cloud Disk Service monitoring:

1. Open [JD Cloud Console](https://console.jdcloud.com/), select [Elastic Compute]-[Virtual Machines]-[Cloud Disk Service];

2. Find the Cloud Disk Service to be viewed after access to the Cloud Disk Service list page and click the corresponding name of the Cloud Disk Service in the Cloud Disk Service list to jump to its details;

3. Select **Monitoring** Tab page to view the monitoring item of the Cloud Disk Service;

**Note**:

1) Only Cloud Disk Service in **associated** status has monitoring data;

2) Name and status of a Cloud Disk Service can be viewed at top left corner of cloud disk details;


<br>
<br>

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/cloud-disk-019.png)

<br>

4. Monitoring chart: a line chart display is provided currently for monitoring data within latest 30 days. The minimum cycle for sampled data is 1 minute.

For more details, please refer to [Monitoring](https://www.jdcloud.com/cn/products/monitoring)Help Center.
