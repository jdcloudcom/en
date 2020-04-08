# Install Node.JS Environment

JD Cloud & AI Node.js SDK is applicable to Node.js 8.6.0 and above, npm 5.6.0 and above. If you have already installed one that meets this requirement, you may skip this step

## Use NVM for Node.JS installation (recommended)

[NVM](https://github.com/nvm-sh/nvm) is a version manager of Node.JS, which is provided by the third-party open source community. NVM can work on any shell compatible with POSIX (sh/dash/ksh/zsh/bash), especially on Unix/macOS/Windows Subsystem for Linux platform.

### I. Install NVM

In this part, refer to [GitHub page of NVM](https://github.com/nvm-sh/nvm). The installation method will varies according to version iteration and other factors and shall be subject to that described in [GitHub page of NVM](https://github.com/nvm-sh/nvm).

Enter in the command line

```bash
curl -o- https://raw.githubusercontent.com/nvm-sh/nvm/v0.35.2/install.sh | bash
```

Or

```bash
wget -qO- https://raw.githubusercontent.com/nvm-sh/nvm/v0.35.2/install.sh | bash
```

After the steps are completed, follow the notification to add the NVM execution file to your environment variable.

Please insert the contents below at the end of the environment variable configuration file (`~/.bash_profile`, `~/.zshrc`, `~/.profile`,  `~/.bashrc`)

```shell
export NVM_DIR="$([ -z "${XDG_CONFIG_HOME-}" ] && printf %s "${HOME}/.nvm" || printf %s "${XDG_CONFIG_HOME}/nvm")"
[ -s "$NVM_DIR/nvm.sh" ] && \. "$NVM_DIR/nvm.sh"
```

### II. Use NVM to install Node.JS and NPM

Enter the command below in the command line

```shell
nvm install --lts
nvm use --lts
```



## Install Node.JS to system environment

In this part, refer to [Node.JS Official Website](https://nodejs.org/zh-cn/). The installation method will varies according to version iteration and other factors and shall be subject to that described in [Node.JS Official Website](https://nodejs.org/zh-cn/).

### Use Node.JS official script for installation

Please make sure that your machine can access the unlimited Internet, or the script may fail due to the timeout of network connection. If fail, please try other installation methods.

```shell
curl -sL https://rpm.nodesource.com/setup_10.x | sudo bash -
```



### Install Node.JS on Ubuntu/Debian

In Debian, users need to first switch the current user to root user and remove sudo in the following command

```shell
sudo apt-get update
sudo apt-get install nodejs npm
```

### Install Node.JS on CentOS/fedora

#### 1. Install EPEL

EPEL (Extra Packages for Enterprise Linux) is an extra software package repository for CentOS and relevant release versions

```bash
sudo yum install epel-release
sudo yum makecache
```

#### 2. Install Node.JS and NPM

Execute the following command  in the command line

```shell
sudo yum install nodejs npm
```

### Use Node.JS official building package (apply to mobile terminal/embedded device and other devices with ARM chip)

Please carefully check your ARM chip version before downloading. You can use the following command to view your ARM chip version

```shell
cat /proc/cpuinfo
```

For the following command, we take ARMv7 for example

#### 1. Download Linux binary file

```shell
wget https://nodejs.org/dist/v12.16.1/node-v12.16.1-linux-armv7l.tar.xz
```

#### 2. Uncompress and move the execution file to the system directory

```shell
sudo tar --strip-components 1 -xzvf node-v* -C /usr/local
```



# Install SDK

## Use npm for SDK installation (recommended)

Execute the following operations under your work directory

```shell
npm install jdcloud-sdk-js --save
```

## Use by downloading SDK source code

You can download this file and save it to your work directory. [Download Link](https://github.com/jdcloud-api/jdcloud-sdk-nodejs/archive/master.zip).

This method is not recommended. You also need to conform to SDK dependence in order to normally use this method. Take 1.2.65 version of jdcloud-sdk for example. Refer to the table below for the dependence and dependence version (such dependence version may vary and the version here is only for reference)

| Dependence                 | Dependence Version |
| -------------------- | -------- |
| ansi-regex           | 2.1.1    |
| ansi-styles          | 2.2.1    |
| babel-code-frame     | 6.26.0   |
| babel-core           | 6.26.3   |
| babel-generator      | 6.26.1   |
| babel-helpers        | 6.24.1   |
| babel-messages       | 6.23.0   |
| babel-register       | 6.26.0   |
| babel-runtime        | 6.26.0   |
| babel-template       | 6.26.0   |
| babel-traverse       | 6.26.0   |
| babel-types          | 6.26.0   |
| babylon              | 6.18.0   |
| balanced-match       | 1.0.0    |
| base64-js            | 1.3.1    |
| brace-expansion      | 1.1.11   |
| buffer               | 5.4.3    |
| chalk                | 1.1.3    |
| cipher-base          | 1.0.4    |
| concat-map           | 0.0.1    |
| convert-source-map   | 1.7.0    |
| core-js              | 2.6.11   |
| create-hash          | 1.2.0    |
| create-hmac          | 1.1.7    |
| debug                | 3.2.6    |
| detect-indent        | 4.0.0    |
| escape-string-regexp | 1.0.5    |
| esutils              | 2.0.3    |
| globals              | 9.18.0   |
| has-ansi             | 2.0.0    |
| hash-base            | 3.0.4    |
| home-or-tmp          | 2.0.0    |
| ieee754              | 1.1.13   |
| inherits             | 2.0.4    |
| invariant            | 2.2.4    |
| is-finite            | 1.1.0    |
| js-tokens            | 3.0.2    |
| jsesc                | 1.3.0    |
| json5                | 0.5.1    |
| lodash               | 4.17.15  |
| loose-envify         | 1.4.0    |
| md5.js               | 1.3.5    |
| minimatch            | 3.0.4    |
| minimist             | 0.0.8    |
| mkdirp               | 0.5.1    |
| ms                   | 2.0.0    |
| node-fetch           | 2.6.0    |
| os-homedir           | 1.0.2    |
| os-tmpdir            | 1.0.2    |
| path-is-absolute     | 1.0.1    |
| private              | 1.0.8    |
| punycode             | 1.3.2    |
| querystring          | 0.2.0    |
| regenerator-runtime  | 0.11.1   |
| repeating            | 2.0.1    |
| ripemd160            | 2.0.2    |
| safe-buffer          | 5.1.2    |
| sha.js               | 2.4.11   |
| slash                | 1.0.0    |
| source-map           | 0.5.7    |
| source-map-support   | 0.4.18   |
| strip-ansi           | 3.0.1    |
| supports-color       | 2.0.0    |
| to-fast-properties   | 1.0.3    |
| trim-right           | 1.0.1    |
| url                  | 0.11.0   |
| uuid                 | 3.4.0    |



# Node.JS Code Example

```javascript
const JDCloud = require('jdcloud-sdk-js');

// Set AK/SK
JDCloud.config.update({
    accessKeyId: '', // AK
    secretAccessKey: '' // SK
});

// Set SMS parameter
const sms = new JDCloud.SMS();
const signId = ''; // Signature ID
const templateId = ''; // Template ID
const appId = ''; // Application ID


// Send SMS: Call by callback
const batchSendCallback = (phoneList = [], params = []) => {
    sms.batchSend({
        signId, // Signature ID
        templateId, // Template ID
        phoneList, // Mobile phone number list
        params, // SMS template replacement parameter
    }, 'cn-north-1', (err, res) => {
        if (err) {
            // Error information when calling failed
            console.error(err);
        } else {
            // Executed operations when calling succeeded
            console.info(res);
        }
    });
};

// Send SMS: Call by Promise
const batchSendPromise = (phoneList = [], params = []) => {
    sms.batchSend({
        signId, // Signature ID
        templateId, // Template ID
        phoneList, // Mobile phone number list
        params, // SMS template replacement parameter
    }, 'cn-north-1')
        .then(res => {
            // Executed operations when calling succeeded
            console.info(res);
        })
        .catch(err => {
            // Error information when calling failed
            console.error(err);
        });
};

// SMS sending receipt search: Call by callback
const statusReportCallback = (sequenceNumber, phoneList = []) => {
    sms.statusReport({
        sequenceNumber, // Send SMS serial number (obtain from return value res of SMS sending API)
        phoneList, // List of mobile phone number requiring receipt
    }, 'cn-north-1', (err, res) => {
        if (err) {
            // Error information when calling failed
            console.error(err);
        } else {
            // Executed operations when calling succeeded
            console.info(res);
        }
    })
};

// SMS sending receipt search: Call by Promise
const statusReportPromise = (sequenceNumber, phoneList = []) => {
    sms.statusReport({
        sequenceNumber, // Send SMS serial number (obtain from return value res of SMS sending API)
        phoneList, // List of mobile phone number requiring receipt (optional)
    }, 'cn-north-1')
        .then(res => {
            // Executed operations when calling succeeded
            console.info(res);
        })
        .catch(err => {
            // Error information when calling failed
            console.error(err);
        });
};

// SMS reply search: Call by callback
const replyCallback = (dataDate, phoneList = []) => {
    sms.reply({
        appId, // Application ID
        dataDate, // Search time: Format xxxx-xx-xx
        phoneList // List of mobile phone number requiring reply (optional)
    }, 'cn-north-1', (err, res) => {
        if (err) {
            // Error information when calling failed
            console.error(err);
        } else {
            // Executed operations when calling succeeded
            console.info(res);
        }
    })
};

// SMS reply search: Call by Promise
const replyPromise = (dataDate, phoneList = []) => {
    sms.reply({
        appId, // Application ID
        dataDate, // Search time: Format xxxx-xx-xx
        phoneList // List of mobile phone number requiring reply (optional)
    }, 'cn-north-1')
        .then(res => {
            // Executed operations when calling succeeded
            console.info(res);
        })
        .catch(err => {
            // Error information when calling failed
            console.error(err);
        });
};
```

