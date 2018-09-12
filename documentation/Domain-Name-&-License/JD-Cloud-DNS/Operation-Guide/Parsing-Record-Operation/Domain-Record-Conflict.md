- ## **Record Conflict Rule:**

  |         | A    | AAAA | CNAME | URL Skip | TXT  | CAA  | MX   | SRV  | NS   |
  | ------- | ---- | ---- | ----- | ------- | ---- | ---- | ---- | ---- | ---- |
  | A       | -    | -    | Conflict  | Conflict    | -    | -    | -    | -    | Conflict |
  | AAAA    | -    | -    | Conflict  | Conflict    | -    | -    | -    | -    | Conflict |
  | CNAME   | Conflict | Conflict | Conflict  | Conflict    | -    | -    | -    | Conflict | Conflict |
  | URL Skip | Conflict | Conflict | Conflict  | Conflict    | -    | -    | -    | Conflict | Conflict |
  | TXT     | -    | -    | -     | -       | -    | -    | -    | -    | Conflict |
  | CAA     | -    | -    | -     | -       | -    | -    | -    | -    | Conflict |
  | MX      | -    | -    | -     | -       | -    | -    | -    | -    | Conflict |
  | SRV     | -    | -    | Conflict  | Conflict    | -    | -    | -    | -    | Conflict |
  | NS      | Conflict | Conflict | Conflict  | Conflict    | Conflict | Conflict | Conflict | Conflict | -    |

  \- means no conflict
