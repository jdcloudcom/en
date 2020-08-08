# Delimiter Extraction Mode
## Overview
The separator log refers to a single log which can be subject to structural extraction by designated separators. Each log adopts a line break as the end mark. Log contents segmented by separators shall act as field value and users need to define field key and field type.

## Precondition
1. Log subjects of log sets have been created.
2. Select a business application log as the log source and complete log source setting.
3. Enter log pre-processing step.

## Operation Steps
1. Switch the key-value extraction mode to the "Separator".
2. Select log separators. If separators provided by default cannot meet demands, customized separators can be selected or separators of users can be entered.
3. Enter or paste log samples.
4. Click **Extract Fields** and then entered log samples will be segmented as per the separators set by users. After segmentation, the segmentation results will be displayed in the log extraction field list. If such segmentation failed, the cause may be that the selected or entered separators or the entered log samples are wrong.
5. Users need to customize field key. By default all fields are of string type. Users need to adjust field type according to actual conditions and only value type field supports aggregation calculation.
6. For fields which are not required to be stored and monitored, a user can directly delete them from the log extraction fields.

<img src="https://raw.githubusercontent.com/jdcloudcom/cn/zhangwenjie-only/image/LogService/operationguide/Separator.jpg" width=60% height=60%  />

## Notes
1. When delimiter is customized by users, only 3 ASCII characters are supported.
2. The size of a delimiter log sample shall not exceed 1K.
3. Restrictions on extracted field quantity and types are as follows: String Type fields shall not exceed 30; Integer Type fields shall not exceed 30; Float Type fields shall not exceed 20; Time Type fields shall not exceed 5; IP Type fields shall not exceed 5.
4. At least one extracted field shall be reserved and deletion of all extracted fields is not allowed.
5. Users need to set time resolution format for Time Type fields with 64 characters to be input at most in resolution format.
