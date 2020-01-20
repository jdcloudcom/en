# Cron Syntax Description

Cloud Event of JD Cloud adopts the crontab syntax rule

## 1. Description to Syntax Number Range
| Time Item | Minute | Hour | Day | Month | Week | Command Item |
|-|-|-|-|-|-|-|
| Number Range | 0-59 | 0-23 | 1-31 | 1-12 | 0-7 (0 and 7 both represent Sunday) | The user does not need to fill in this item |

## 2. Special Character and Description to Its Meaning
| Special Character | Description to Its Meaning |
|-|-|
| * (Asterisk) | Refer to the accepting willing at any time. Taking `0 18 * * *` for example, day, month and week are all represented with *, which means that designated commands will be executed at 18:00 in any day and any month. |
| , (Comma) | Refer to separate periods. For example, if the work is to be executed at 03:00 and 06:00, please use: `0 2,8 * * *`. There are still five time columns, but the second column is 2,8, which means both 2 and 8 are applicable |
| - (Minus) | Refer to a time range. For example, one work will be made within 10 minutes per hour from 06:00 to 08:00: `10 6-8 * * *`. Please be noted that the second column is changed to 6-8, which means 6, 7 and 8 are applicable |
| /n (Slash) | n refers to a number, i.e., separating once per n units. For example, if the operation is made once per five minutes, please use: `*/5 * * * *`, with * matched with /5. Or, you can use 0-59/10 to represent the same meaning |

## 3. Examples

(1) Rules are executed once per X minute(s)
- Execute once per 1 minute: `*/1 * * * *` or `* * * * *`
- Execute once per 5 minutes: `*/5 * * * *`

(2) Rules are executed once per X hour(s):
- Execute once per 1 hour: `0 * * * *` or `0 */1 * * *`
- Execute at 09:00 AM per day: `0 9 * * *`
- Execute at 09:30 AM per day: `30 9 * * *`

(3) Rules are executed once per X day(s):
- Execute everyday `0 0 * * *`

(4) Rules are executed once per X week(s):
- Execute every week `0 0 * * 0`

(5) Rules are executed once per X month(s):
- Execute on the 1st day per month `0 0 1 * *`

(6) Rules are executed once per year:
- Execute on January 1st every year `0 0 1 1 *`

(7) Others
- Execute once at 14:30 every day: `30 14 * * *`
- Execute once respectively at 09:45 on the 5th and 15th day per month: `45 9 5,15 * *`
- Execute at 30th minutes of each o’clock from 14:00-16:00: `30 14-16 * * *`
- Designate to execute commands at 09:30 every Wednesday: `30 9 * * 3` (note: 0 and 7 both refer to Sunday, 1 refers to Monday and the rest can be done in the same manner. Or, the day can be represented with English letters, with sun for Sunday, mon for Monday, etc.)


