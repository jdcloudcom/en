# 入门指南
## 概述
JDFusion产品通过京东云提供的CLI程序的运行，需要准备相应的运行环境。

目前，京东云为您提供了多种途径管理京东云资源：控制台页面操作、京东云SDK或者CLI工具直接调用API 进行业务配置。作为控制台页面操作方式的重要补充形式，京东云CLI工具是基于OpenAPI元数据自动生成，帮助您便捷管理京东云资源的命令行工具。通过它您可快速调用京东云API、做自动化和脚本处理、以多样方式进行组合和重用云资源等。 当前已实现支持云主机、网络、容器等十多个业务线。 京东云CLI具有如下特点：

1、支持跨平台。目前支持在Linux、macOS、Windows系统上安装CLI。

2、鉴权后才可使用。使用前需提前申请京东云AccessKey和SecretKey（以下简称AK/SK，获取详情可查看：AccessKey管理页面 ）。

3、依赖京东云Python SDK。

4、JDFusion产品使用依赖邀请码。

## 环境部署

京东云CLI基于Python语言和京东云Python SDK开发，使用CLI前请安装Python 2.7.*版本。请访问官网下载并安装Python2.7.*版本。

京东云Python SDK不用手动安装，Python包管理工具会自动下载并安装对应版本的依赖包。

具体安装部署请查看[京东云CLI安装部署说明](https://docs.jdcloud.com/cn/cli/introduction)。

