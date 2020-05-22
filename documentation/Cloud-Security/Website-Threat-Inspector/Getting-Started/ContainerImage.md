# Scan Docker Image Asset

​		Your docker image used on JD Cloud & AI will be securely scanned to ensure security of your docker image files. The security scanning and vulnerability analysis of docker image file assets are an indispensable part of docker security.

## 1. Preconditions for Scanning Docker Image

- Regions where you can get a repository: At present, the repository image can be obtained in North China (Beijing), East China (Shanghai) and South China (Guangzhou).
- Create management registry and container registry: For details, please refer to Container Registry Documentation: https://docs.jdcloud.com/cn/container-registry/product-overview

## 2. Operation Steps for Scanning Docker Image

### (1) Create Security Scan Tasks

Click **Image Security Scan** on the left menu bar, select an image in the container registry, and click **Operation** on the right side to create a security scan task.

![](../../../../image/Website-Threat-Inspector/wts-Container-01.png)

Depending on the image categories, flexibly configure "Image Scan Module" and "View Vulnerability Level" in the created scan task, and click **OK**.

![](../../../../image/Website-Threat-Inspector/wts-Container-02.png)

| Scan Task Configuration | Configuration Content                             |
| ------------ | ------------------------------------ |
| Image Scan Module | Vulnerability Scan, Malicious Software Scan, Sensitive Information Scan |
| View Vulnerability Level | Low Risk, Moderate Risk, High Risk, Severe, Unrated       |

### (2) Manage Image Scan Tasks

Click **Digest** to manage this image scan task and you can perform viewing configuration, task deletion, viewing security reports and other operations.

![](../../../../image/Website-Threat-Inspector/wts-Container-03.png)

### (3) View Image Security Reports

Click **Security Reports** in the right optional "Image Scan Task Management". You can view and export the security reports on this image asset.

- Security Overview

You can view the scanned image assets to check the existing security risks (security vulnerability, malicious software, sensitive information disclosure)

![](../../../../image/Website-Threat-Inspector/wts-Container-04.png)

| Security Risk Overview     | Classified Risk and Content Category               |
| ---------------- | ------------------------------ |
| Security Vulnerability Analysis     | Severe, High Risk, Moderate Risk, Low Risk, Unrated |
| Malicious Software Analysis     | Webshell, Virus Webshell             |
| Sensitive Information Disclosure Analysis | Account & Password, Source Code, Certificate         |

Click **Export Reports** on the top left corner and you can export the scan reports on this docker image in this scan task.

- Detail Description

In detail description, you can view the risk details on the image scan file objective in this scan task.

| Category of Risk Detail     |                                                              |
| ---------------- | ------------------------------------------------------------ |
| Vulnerability Detail         | Vulnerability Number, Vulnerability Level, Software Package, Software Package Version, Patch Version Number, Vulnerability Location |
| Malicious Software Detail     | File Name, MD5, Malicious Software Type, Virtue Name, Malicious Software Location          |
| Sensitive Information Disclosure Detail | File Name, Disclosure Type, Match Detail, Sensitive Information Location                   |

- - Vulnerability Detail

![](../../../../image/Website-Threat-Inspector/wts-Container-05.png)

- - Malicious Software Detail

![](../../../../image/Website-Threat-Inspector/wts-Container-06.png)

- - Sensitive Information Disclosure Detail

![](../../../../image/Website-Threat-Inspector/wts-Container-07.png)
