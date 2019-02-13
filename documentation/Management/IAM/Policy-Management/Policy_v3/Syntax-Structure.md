# Syntactic Structure

The syntactic structure the entire policy is as shown in the figure below.

- The policy is composed of version and statement.
- The statement is composed of several arrays. Each array comprises four elements, i.e. action, resource, condition and effect. The condition is optional field.
- Display order of each block is not restricted. For example, in a policy, version_block can follow effect_block.

## JSON Format

The policy refers to a JSON document defining one or more permissions, and developing policies shall follow the JSON syntax specification.

## Syntax Agreement

The following agreement is made in the syntax description:
The following characters are used for describing special characters in the policy syntax, which are used for specifying policy syntaxes in this document and is not contained in the policy:

```
  = < > ( ) | ...
```

Question Mark After Element (?) Represent that the element is the optional field. For example:

```
<condition_block?>
```

If the elements are the enumeration values, they shall be represented by being separated with the mark "|" and ranges of the enumeration values shall be defined with the bracket "()".
For example:

```
("allow" | "deny")
```

The character string elements are marked with the double quotation marks.
For example:

```
<version_block> = "version" : "3"
```

The following characters are the JSON characters contained in the policy syntax:

```
{ } [ ] " , :
```

- Where several values are allowed by one element, please separate them with the delimiter comma. For example:

```
"resource":["resource_string", "resource_string”]  
"action":["action_string", "action_string”]  
"Principal":{<Principal_map>, <Principal_map>}
```

When several values are allowed, only one value can be comprised. When the element only has one value, the following two expression methods are equivalent.
For example:

```
"resource": ["resource_string"]     
"resource": "resource_string"
```

### Syntax Description

```
policy  = {
     <version_block>
     <principal_block?>,
     <statement_block>
}

<version_block> = "version" : "3"

<statement_block> = "statement" : [ <statement>, <statement>, ... ]

<statement> = {     
    <effect_block>,
    <action_block>,
    <resource_block>,
    <condition_block?>
}

<effect_block> = "effect" : ("allow" | "deny")  

<principal_block> = "principal": ("*" | <principal_map>)

<principal_map> = { <principal_map_entry>, <principal_map_entry>, ... }

<principal_map_entry> = "JDCloud":   
[<principal_id_string>, <principal_id_string>, ...]

<action_block> = "action": 
("*" | [<action_string>, <action_string>, ...])

<resource_block> = "resource": 
("*" | [<resource_string>, <resource_string>, ...])

<condition_block> = "condition" : { <condition_map> }

<condition_map> = 
{ 
  <condition_type_string> : { <condition_key_string> : <condition_value_list> },
  <condition_type_string> : { <condition_key_string> : <condition_value_list> }, ...
}  

<condition_value_list> = [<condition_value>, <condition_value>, ...]

<condition_value> = ("string" | "number" |"boolean")
```

> The functions of Condition is continuously under update, coming soon
