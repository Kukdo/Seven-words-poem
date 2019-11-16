# 计182 2018310781 姜志鹏
## 实验名称：字符串实验
### 实验目的
#### 掌握字符串String及其方法的使用
#### 掌握异常处理结构
### 业务要求
#### 内容：利用已学的字符串处理知识编程完成《长恨歌》古诗的整理对齐工作，写出功能函数，并运行。达到如下功能：
#### 1.	每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”
#### 2.	允许提供输入参数，统计古诗中某个字或词出现的次数
#### 3.	考虑操作中可能出现的异常，在程序中设计异常处理程序
##### 注意： 输入的内容，利用main方法中的args数组传递
#### To make a long string ( peom without puctuation and space ) into a form contains seven words and add punctuations automatically, to count the specific word's appearing times.
### 操作步骤：
#### 1.在Eclipse中的Run Configuration中在Arugments中添加参数（诗歌）
![image1](https://github.com/Kukdo/Seven-words-poem/blob/master/images/1.PNG)
#### 2.利用循环将诗歌进行切片操作，并且添加标点符号
![image2](https://github.com/Kukdo/Seven-words-poem/blob/master/images/2.PNG)
#### 3.根据用户输入的词通过Indexof方法统计词频
##### 例1：查找“三”出现的次数
![image3](https://github.com/Kukdo/Seven-words-poem/blob/master/images/3.PNG)
##### 例2：查找“三千”出现的次数
![image4](https://github.com/Kukdo/Seven-words-poem/blob/master/images/4.PNG)
##### 例3：查找“从此”出现的次数
![image5](https://github.com/Kukdo/Seven-words-poem/blob/master/images/5.PNG)
