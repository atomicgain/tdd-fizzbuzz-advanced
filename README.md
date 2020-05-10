# TDD @FizzBuzz


## 开发环境
 - JDK1.8+
 
## 业务需求

你是一名体育老师，在某次课距离下课还有五分钟时，你决定搞一个游戏。此时有N名学生在上课。游戏的规则是：

- 让所有学生排成一队，然后按顺序报数。

- 学生报数时，如果所报数字是3的倍数，那么不能说该数字，而要说Fizz；如果所报数字是5的倍数，那么要说Buzz；如果所报数字是第7的倍数，那么要说Whizz。

- 学生报数时，如果所报数字同时是两个特殊数的倍数情况下，也要特殊处理，比如3和5的倍数，那么不能说该数字，而是要说FizzBuzz, 以此类推。如果同时是三个特殊数的倍数，那么要说FizzBuzzWhizz。


## log

~~~
[root@tdd tdd-fizzbuzz]# gradle test

> Task :test

TestFizzBuzz > TestThreeIsFizz PASSED

TestFizzBuzz > TestSevenIsWhizz PASSED

TestFizzBuzz > TestFiveIsFuzz PASSED

TestFizzBuzz > TestFifteenIsFizzBuzz PASSED

TestFizzBuzz > Test35IsBuzzWhizz PASSED

TestFizzBuzz > Test105IsFizzBuzzWhizz PASSED

---------------------------------------------------------------
 Result: SUCCESS (6 Tests, 6 Successes, 0 Failures, 0 Skipped)
---------------------------------------------------------------

Deprecated Gradle features were used in this build, making it incompatible with Gradle 7.0.
Use '--warning-mode all' to show the individual deprecation warnings.
See https://docs.gradle.org/6.4/userguide/command_line_interface.html#sec:command_line_warnings

BUILD SUCCESSFUL in 1s
3 actionable tasks: 2 executed, 1 up-to-date
[root@tdd tdd-fizzbuzz]#
~~~
