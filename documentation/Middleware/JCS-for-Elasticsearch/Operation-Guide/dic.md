## Customized Word Library
Mainly support the configuration for Primary Word Library and Stop Word Library.

```
Note:
The Primary Word Library Object and Stop Word Library Object cannot be null simultaneously. Meanwhile, the Primary Word Library Object and Stop Word Library Object cannot select the same file.
```

### Primary Word Library
The Primary Word Library is the set of special words that users want to carry out word segmentation, such as "JD Cloud", etc.</br>
- It presents the current object by default and null if there is no object.</br>
- The file of Primary Word Library must be UTF-8 encoded text file, with one word segmentation per line and maximum file size supported by the Primary Word Library being 50M.</br>
### Stop Word Library
Stop Word Library is the set of words that users do not want to carry out word segmentation or pay attention to, such as "for", "of", "what", etc., with one word segmentation per line in the file.
- It presents the current object by default and null if there is no object.
- Stop Word Library must be UTF-8 encoded text file without BOM format, with one word segmentation per line and maximum file size supported by the Stop Word Library being 20M.
