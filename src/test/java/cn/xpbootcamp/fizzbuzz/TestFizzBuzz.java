package cn.xpbootcamp.fizzbuzz;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;
public class TestFizzBuzz {
      FizzBuzz fizzBuzz = new FizzBuzz();
/**
 *  如果数字中包含7 则忽略5倍数的判断
 */
      @Test
      public void TestInclude7IsFizz() {
            assertThat(fizzBuzz.say(75)).isEqualTo("Fizz");
      }
      @Test
      public void TestInclude77IsWhizz() {
            assertThat(fizzBuzz.say(77)).isEqualTo("Whizz");
      }
/**
 *  如果数字中包含5 则忽略3倍数的判断
 */
      @Test
      public void TestInclude35IsBuzzWhizz() {
            assertThat(fizzBuzz.say(35)).isEqualTo("BuzzWhizz");
      }
      @Test
      public void TestInclude55IsBuzz() {
            assertThat(fizzBuzz.say(55)).isEqualTo("Buzz");
      }
      @Test
      public void Test105IsBuzzWhizz() {
            assertThat(fizzBuzz.say(105)).isEqualTo("BuzzWhizz");
      }
      @Test
      public void Test15IsFizzBuzz() {
            assertThat(fizzBuzz.say(15)).isEqualTo("Buzz");
      }

/**
 *  如果数字中包含3 则忽略3,5,7倍数的判断
 */
      @Test
      public void TestInclude13IsFizz() {
            assertThat(fizzBuzz.say(13)).isEqualTo("Fizz");
      }
      @Test
      public void TestInclude30IsFizz() {
            assertThat(fizzBuzz.say(30)).isEqualTo("Fizz");
      }
      @Test
      public void TestInclude63IsFizz() {
            assertThat(fizzBuzz.say(63)).isEqualTo("Fizz");
      }

/**
 *  如果为3 的倍数则输出 Fizz
 */
      @Test
      public void TestThreeIsFizz() {
            assertThat(fizzBuzz.say(3)).isEqualTo("Fizz");
      }
/**
 *  如果为5 的倍数则输出 Buzz
 **/
      @Test
      public void TestFiveIsFuzz() {
            assertThat(fizzBuzz.say(5)).isEqualTo("Buzz");
      }
/**
 *  如果为7 的倍数则输出 Whizz
 **/
      @Test
      public void TestSevenIsWhizz() {
            assertThat(fizzBuzz.say(7)).isEqualTo("Whizz");
      }

      
/**
 *  如果为5 和 7  的倍数则输出 FizzBuzz
 **/
      @Test
      public void Test35IsBuzzWhizz() {
            assertThat(fizzBuzz.say(35)).isEqualTo("BuzzWhizz");
      }

/**
 *  如果为其它则输出 数字本身
 **/
      @Test
      public void Test1Is1() {
            assertThat(fizzBuzz.say(1)).isEqualTo("1");
      }
      @Test
      public void Test2Is2() {
            assertThat(fizzBuzz.say(2)).isEqualTo("2");
      }
      @Test
      public void Test4Is4() {
            assertThat(fizzBuzz.say(4)).isEqualTo("4");
      }
      @Test
      public void Test8Is8() {
            assertThat(fizzBuzz.say(8)).isEqualTo("8");
      }


      

}
