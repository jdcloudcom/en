# Create Topic
  You can create topic on the Topic Management page.

 ## Prerequisites
 
- You have created a JD Cloud account and finished real-name verification. Your account is usable and doesn't exist in the black list. If you don't have an account, please [Register](https://accounts.jdcloud.com/p/regPage?source=jdcloud&ReturnUrl=%2f%2fuc.jdcloud.com%2fpassport%2fcomplete%3freturnUrl%3dhttp%3A%2F%2Fuc.jdcloud.com%2Fredirect%2FloginRouter%3FreturnUrl%3Dhttps%253A%252F%252Fwww.jdcloud.com%252Fhelp%252Fdetail%252F734%252FisCatalog%252F1), and [verify real-name](https://uc.jdcloud.com/account/certify)。
- Because the Billing Type of the product is charged by amount, please confirm that your account cannot be overdued.

## Considerations
- During public beta, the user can create at most 5 topics.


## Procedure
### 1.Topic管理页面点击"新建"按钮
从控制台左侧菜单中，找到互联网中间件-消息队列 JCQ-Topic管理页面，点击新建
 ![创建topic步骤1](https://github.com/jdcloudcom/cn/blob/edit/image/Internet-Middleware/Message-Queue/创建topic-01.PNG)

### 2.填写完Topic信息，点击"创建"按钮
页面刷新，完成新topic的创建
 ![创建topic步骤2](https://github.com/jdcloudcom/cn/blob/edit/image/Internet-Middleware/Message-Queue/创建topic-02.png)  
I. The topic name can be entered according to the prompt information, and cannot be modified.  
II. Message types are divided into unordered messages and global ordered messages：  
- Unordered messages: Cannot guarantee first in first out (FIFO) ordered consumption, including general messages and delayed messages.
- Global ordered messages: The production and consumption of messages are carried out according to the publishing order of messages (FIFO).  

III. You should enter the remarks according to the requirements, and cannot exceed 255 bytes.
