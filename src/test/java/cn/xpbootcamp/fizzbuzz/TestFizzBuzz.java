package cn.xpbootcamp.fizzbuzz;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;
public class TestFizzBuzz {
      FizzBuzz fizzBuzz = new FizzBuzz();
/**
 *  如果数字中包含7 则忽略5倍数的判断
 */
      @Test
      public void should_return_Fizz_when_number_include_7() {
            assertThat(fizzBuzz.say(75)).isEqualTo("Fizz");
            assertThat(fizzBuzz.say(77)).isEqualTo("Whizz");
      }
/**
 *  如果数字中包含5 则忽略3倍数的判断
 */
      @Test
      public void should_return_BuzzWhizz_when_number_include_5() {
            assertThat(fizzBuzz.say(35)).isEqualTo("BuzzWhizz");
            assertThat(fizzBuzz.say(55)).isEqualTo("Buzz");
            assertThat(fizzBuzz.say(105)).isEqualTo("BuzzWhizz");
            assertThat(fizzBuzz.say(15)).isEqualTo("Buzz");
      }

/**
 *  如果数字中包含3 则忽略3,5,7倍数的判断
 */
      @Test
      public void should_return_Fizz_when_number_include_3() {
            assertThat(fizzBuzz.say(13)).isEqualTo("Fizz");
            assertThat(fizzBuzz.say(30)).isEqualTo("Fizz");
            assertThat(fizzBuzz.say(30)).isEqualTo("Fizz");
      }
      
/**
 *  如果为3 的倍数则输出 Fizz
 */
      @Test
      public void should_return_Fizz_when_number_is_3_multiple() {
            assertThat(fizzBuzz.say(3)).isEqualTo("Fizz");
            assertThat(fizzBuzz.say(6)).isEqualTo("Fizz");
      }
/**
 *  如果为5 的倍数则输出 Buzz
 **/
      @Test
      public void should_return_Fuzz_when_number_is_5_multiple() {
            assertThat(fizzBuzz.say(5)).isEqualTo("Buzz");
      }
/**
 *  如果为7 的倍数则输出 Whizz
 **/
      @Test
      public void should_return_Whizz_when_number_is_7_multiple() {
            assertThat(fizzBuzz.say(7)).isEqualTo("Whizz");
      }
      @Test
      public void should_return_FizzWhizz_when_number_is_21() {
            assertThat(fizzBuzz.say(21)).isEqualTo("FizzWhizz");
      }

/**
 *  如果为其它则输出 数字本身
 **/
      @Test
      public void should_return_itself_when_number_is_othercase() {
            assertThat(fizzBuzz.say(1)).isEqualTo("1");
            assertThat(fizzBuzz.say(2)).isEqualTo("2");
            assertThat(fizzBuzz.say(4)).isEqualTo("4");
            assertThat(fizzBuzz.say(8)).isEqualTo("8");
      }
      
}
