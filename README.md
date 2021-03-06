# TDD @FizzBuzz


## 开发环境
 - JDK1.8+
 
## 业务需求


你是一名体育老师，在某次课距离下课还有五分钟时，你决定搞一个游戏。此时有N名学生在上课。游戏的规则是：
- 让所有学生排成一队，然后按顺序报数。
- 学生报数时，如果所报数字是3的倍数，那么不能说该数字，而要说Fizz；如果所报数字是5的倍数，那么要说Buzz；如果所报数字是第7的倍数，那么要说Whizz。
- 学生报数时，如果所报数字同时是两个特殊数的倍数情况下，也要特殊处理，比如3和5的倍数，那么不能说该数字，而是要说FizzBuzz, 以此类推。如果同时是三个特殊数的倍数，那么要说FizzBuzzWhizz。
- 学生报数时，如果所报数字包含了3，那么也不能说该数字，而是要说相应的单词，比如要报13的同学应该说Fizz。
- 如果数字中包含了3，那么忽略规则2和规则3，比如要报30的同学只报Fizz，不报FizzBuzz。
- 如果数字中包含了5，那么忽略规则4和规则5，并且忽略被3整除的判定，比如要报35的同学不报Fizz，报BuzzWhizz，其他case自己补齐。
- 如果数字中包含了7，那么忽略规则6中忽略被3整除的判定，并且忽略被5整除的判定，比如要报75的同学只报Fizz，其他case自己补齐。


练功要求

- 写代码之前做Tasking，并产出Tasking结果，记录下来
- 小步提交，每通过一个测试，做一次Commit，Commit信息要表意
- 每一个练习你的GitHub账号下创建一个代码库，完成练习后，将你的代码库作为答案提交



## tasking

~~~
GIVEN 3 的倍数 WHEN say THEN Fizz
GIVEN 5 的倍数 WHEN say THEN Buzz
GIVEN 7 的倍数 WHEN say THEN Whizz 
GIVEN 3 and 7 的倍数 WHEN say THEN FizzWhizz 
GIVEN 包含3 则忽略 3,5,7 的倍数判断 13 WHEN say THEN Fizz
GIVEN 包含5 则忽略 3 的倍数判断 并且忽略包含 3 的判断 35 WHEN say THEN BuzzWhizz
GIVEN 包含7 则忽略5 的倍数判断 75 WHEN say THEN Fizz
GIVEN 其它数字 4 WHEN say THEN 4
~~~


