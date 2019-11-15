# Getting Started

## Overview
JDFusion provides three methods for application by users, including Console, OpenAPI and CLI.

At present, JDFusion can provide various means for management of JD Cloud resources: console page operation, JD Cloud SDK or CLI tool directly calls APIs for businesses configuration. As an important supplementary form of console page operation method, JD Cloud CLI tool is automatically generated based on OpenAPI metadata, which is a command line tool for you to conveniently manage JD Cloud resources. You can use it to rapidly call JD Cloud APIs, perform automation and script processing, and combine and reuse cloud resources by multiple methods. At present, it implements to support over ten business lines such as Virtual Machines, Network and Container. JD Cloud CLI has the following characteristics:

1. Support cross-platform. At present, installation of CLI is supported by Linux, macOS and Windows system.

2. Available only after authentication. JD Cloud AccessKey and SecretKey (hereinafter referred to as AK/SK, see AccessKey Management page for details) shall be applied in advance before use.

3. Depend on JD Cloud Python SDK.

## CLI Environment Deployment

The development of JD Cloud CLI is based on Python Language and JD Cloud Python SDK, so install Python of version 2.7.* before use CLI. Access official website to download and install Python of version 2.7.*.

No manual installation is required for JD Cloud Python SDK, and Python package management tool will automatically download and install dependent packages with corresponding versions.

See [JD Cloud CLI Installation Deployment Description](https://docs.jdcloud.com/en/cli/introduction) for specific installation and deployment.

## Getting Started

As an ordinary user, you are suggested to create one Virtual Machine with the following method after logging in the JDFusion platform, to quickly get familiar with the platform environment.

Details for creating one OpenStack Virtual Machine on the JDFusion platform are as follows:

Step 1: Login

Step 2: Fusion Cloud Platform

Step 3: Create VPC and subnet

Step 4: Create security group

Step 5: Create EIP

Step 6: Create VM Instance

Step 7: Associate EIP for Virtual Machines
