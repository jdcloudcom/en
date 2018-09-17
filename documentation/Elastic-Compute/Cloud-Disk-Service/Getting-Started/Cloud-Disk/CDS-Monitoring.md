# CDS Monitoring

<br>

JD Cloud has provided monitoring data up to 30 days for cloud disk attached to a VM to offer you real-time running conditions and performance monitoring metrics of cloud disk. Cloud disk currently provides the below monitoring metrics:

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


Please refer to the below procedures for viewing a certain cloud disk monitoring:

1. Open [JD Cloud Console](https://console.jdcloud.com/), select [Elastic Compute]-[Virtual Machine]-[Cloud Disk];

2. Find the cloud disk to be viewed after access to the cloud disk list page and click the corresponding name of the cloud disk in the cloud disk list to jump to its details;

3. Select "Monitoring” Tab page to view the monitoring item of the cloud disk;

**Note**:

1) Only cloud disk in "associated” status has monitoring data;

2) Name and status of a cloud disk can be viewed at top left corner of cloud disk details;


<br>
<br>

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/cloud-disk-019.png)

<br>

4. Monitoring chart: a line chart display is provided currently for monitoring data within latest 30 days. The minimum cycle for sampled data is 1 minute.

For more details, please refer to [Cloud Monitor](https://www.jdcloud.com/help/detail/94/isCatalog/1)Help Center.
