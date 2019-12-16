# Manage Metadata

The management metadata function can modify the HTTP response header of files to control policies of client cache time, file force download, etc. In addition to some general response headers, it also supports configuring customized metadata.

## Console Configuration

1. Log in the Console->Object Storage Service->Space Management->Enter a Bucket->A File->More->Manage Metadata

![管理元数据入口](https://github.com/jdcloudcom/cn/blob/edit/image/Object-Storage-Service/OSS-168.png)

2. The metadata configuration dialog box is shown as follows:

![管理元数据配置页面](https://github.com/jdcloudcom/cn/blob/edit/image/Object-Storage-Service/OSS-169.png)

## Metadata List Supported

Name|Description|Remark
---|---|---
Cache-Control|[RFC2616](httpsCache rule control defined in ://www.ietf.org/rfc/rfc2616.txt?spm=a2c4g.11186623.2.9.5b613bdb255OGR&file=rfc2616.txt). |The value of Cache-Control cannot exceed 30 characters.
Content-Disposition|[RFC2616](httpsThe default filename response header defined in ://www.ietf.org/rfc/rfc2616.txt?spm=a2c4g.11186623.2.9.5b613bdb255OGR&file=rfc2616.txt). Controlled file downloading is mandatory|The value of Content-Disposition cannot exceed 100 characters.
Content-Encoding|[RFC2616](httpsThe file encoding response header defined in ://www.ietf.org/rfc/rfc2616.txt?spm=a2c4g.11186623.2.9.5b613bdb255OGR&file=rfc2616.txt). |The value of Content-Encoding cannot exceed 20 characters.
Content-Type|[RFC2616](httpsThe request content type defined in ://www.ietf.org/rfc/rfc2616.txt?spm=a2c4g.11186623.2.9.5b613bdb255OGR&file=rfc2616.txt). |The value of Content-Type cannot exceed 128 characters.
Expires|[RFC2616](httpsThe expiration time defined in ://www.ietf.org/rfc/rfc2616.txt?spm=a2c4g.11186623.2.9.5b613bdb255OGR&file=rfc2616.txt). |Support Unix time stamp, GMT and ISO8601. 
x-amz-meta-\*|You can specify your own customized metadata for the key values|The sum of key values of the customized metadata cannot exceed 2KB.

* Details Description: The default of metadata needs to meet the standards of [RFC2616](https://www.ietf.org/rfc/rfc2616.txt?spm=a2c4g.11186623.2.9.5b613bdb255OGR&file=rfc2616.txt).
