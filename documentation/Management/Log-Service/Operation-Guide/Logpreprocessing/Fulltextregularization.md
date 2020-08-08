# Single Line and Full Text Regular Extraction Mode
## Overview
The single line full text regular expression refers to a single line log using a line break as the ending mark, which is subject to structural treatment as per the regular expression provided by a user. After being processed, log contents will be stored in the key-value pair form. While retrieving a log, a user can conduct key-value retrieval as per extracted fields.

## Precondition
1. Log subjects of log sets have been created.
2. Select a business application log as the log source and complete log source setting.
3. Enter log pre-processing step.

## Operation Steps
1. Switch key-value extraction mode to "Single Line and Full Text Regular Expression"
2. Enter or paste log samples.
3. Enter or paste a regular expression.
4. Click **Extract Fields** and then key value will be extracted from a log among log samples as per the regular expressions entered. Extraction results will be displayed in the log extraction field list below. If such extraction fails, it needs to check if the entered log samples or the regular expressions filled in are correct.

<img src="https://raw.githubusercontent.com/jdcloudcom/cn/zhangwenjie-only/image/LogService/operationguide/Onelinefulltextregular.jpg" width=60% height=60% />

## Notes
1. The size of a single line regular log sample shall not exceed 1K
2. The length of a single line regular expression shall not exceed 256 characters.
3. Restrictions on extracted field quantity and types are as follows: String Type fields shall not exceed 30; Integer Type fields shall not exceed 30; Float Type fields shall not exceed 20; Time Type fields shall not exceed 5; IP Type fields shall not exceed 5. 
4. At least one extracted field shall be reserved and deletion of all extracted fields is not allowed.
5. Users need to set time resolution format for Time Type fields.
