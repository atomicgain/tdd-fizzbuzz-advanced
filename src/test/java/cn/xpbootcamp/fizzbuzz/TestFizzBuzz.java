package cn.xpbootcamp.fizzbuzz;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;
public class TestFizzBuzz {
      FizzBuzz fizzBuzz = new FizzBuzz();

      
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
/**
 *  如果为3 and 7 的倍数则输出 FizzWhizz
 **/
      @Test
      public void should_return_FizzWhizz_when_number_is_21() {
            assertThat(fizzBuzz.say(21)).isEqualTo("FizzWhizz");
      }

/**
 *  如果数字中包含3 则忽略3,5,7倍数的判断
 */
      @Test
      public void should_return_Fizz_when_number_include_3() {
            assertThat(fizzBuzz.say(13)).isEqualTo("Fizz");
            assertThat(fizzBuzz.say(30)).isEqualTo("Fizz");
      }
/**
 *  如果数字中包含3 则忽略3,5,7倍数的判断
 */
//      @Test
//      public void should_return_Fizz_when_number_include_3() {
//            assertThat(fizzBuzz.say(13)).isEqualTo("Fizz");
//            assertThat(fizzBuzz.say(30)).isEqualTo("Fizz");
//            assertThat(fizzBuzz.say(30)).isEqualTo("Fizz");
//      }

/**
 *  如果数字中包含7 则忽略5倍数的判断
 */
    @Test
    public void should_return_Fizz_when_number_include_7() {
        assertThat(fizzBuzz.say(75)).isEqualTo("Fizz");
        assertThat(fizzBuzz.say(77)).isEqualTo("Whizz");
    }


    /**
 *  如果为其它则输出 数字本身
 **/
//      @Test
//      public void should_return_itself_when_number_is_othercase() {
//            assertThat(fizzBuzz.say(1)).isEqualTo("1");
//            assertThat(fizzBuzz.say(2)).isEqualTo("2");
//            assertThat(fizzBuzz.say(4)).isEqualTo("4");
//            assertThat(fizzBuzz.say(8)).isEqualTo("8");
//      }
     
      @Test
      public void full_test () {
            assertThat(fizzBuzz.say( 1 )).isEqualTo(  "1" );
            assertThat(fizzBuzz.say( 3 )).isEqualTo(  "Fizz" );
            assertThat(fizzBuzz.say( 4 )).isEqualTo(  "4" );
            assertThat(fizzBuzz.say( 5 )).isEqualTo(  "Buzz" );
            assertThat(fizzBuzz.say( 6 )).isEqualTo(  "Fizz" );
            assertThat(fizzBuzz.say( 7 )).isEqualTo(  "Whizz" );
            assertThat(fizzBuzz.say( 10 )).isEqualTo(  "Buzz" );
            assertThat(fizzBuzz.say( 13 )).isEqualTo(  "Fizz" );
            assertThat(fizzBuzz.say( 14 )).isEqualTo(  "Whizz" );
            assertThat(fizzBuzz.say( 15 )).isEqualTo(  "Buzz" );
            assertThat(fizzBuzz.say( 17 )).isEqualTo(  "17" );
            assertThat(fizzBuzz.say( 21 )).isEqualTo(  "FizzWhizz" );
            assertThat(fizzBuzz.say( 27 )).isEqualTo(  "Fizz" );
            assertThat(fizzBuzz.say( 30 )).isEqualTo(  "Fizz" );
            assertThat(fizzBuzz.say( 35 )).isEqualTo(  "BuzzWhizz" );
            assertThat(fizzBuzz.say( 37 )).isEqualTo(  "Fizz" );
            assertThat(fizzBuzz.say( 51 )).isEqualTo(  "51" );
            assertThat(fizzBuzz.say( 52 )).isEqualTo(  "52" );
            assertThat(fizzBuzz.say( 53 )).isEqualTo(  "53" );
            assertThat(fizzBuzz.say( 56 )).isEqualTo(  "Whizz" );
            assertThat(fizzBuzz.say( 57 )).isEqualTo(  "Fizz" );
            assertThat(fizzBuzz.say( 60 )).isEqualTo(  "FizzBuzz" );
            assertThat(fizzBuzz.say( 63 )).isEqualTo(  "Fizz" );
            assertThat(fizzBuzz.say( 70 )).isEqualTo(  "Whizz" );
            assertThat(fizzBuzz.say( 73 )).isEqualTo(  "Fizz" );
            assertThat(fizzBuzz.say( 75 )).isEqualTo(  "Fizz" );
            assertThat(fizzBuzz.say( 105 )).isEqualTo(  "BuzzWhizz" );
            assertThat(fizzBuzz.say( 130 )).isEqualTo(  "Fizz" );
            assertThat(fizzBuzz.say( 133 )).isEqualTo(  "Fizz" );
            assertThat(fizzBuzz.say( 135 )).isEqualTo(  "Buzz" );
            assertThat(fizzBuzz.say( 140 )).isEqualTo(  "BuzzWhizz" );
            assertThat(fizzBuzz.say( 147 )).isEqualTo(  "FizzWhizz" );
            assertThat(fizzBuzz.say( 153 )).isEqualTo(  "153" );
            assertThat(fizzBuzz.say( 157 )).isEqualTo(  "157" );
            assertThat(fizzBuzz.say( 170 )).isEqualTo(  "170" );
            assertThat(fizzBuzz.say( 175 )).isEqualTo(  "Whizz" );
            assertThat(fizzBuzz.say( 210 )).isEqualTo(  "FizzBuzzWhizz" );
            assertThat(fizzBuzz.say( 235 )).isEqualTo(  "Buzz" );
            assertThat(fizzBuzz.say( 237 )).isEqualTo(  "Fizz" );
            assertThat(fizzBuzz.say( 245 )).isEqualTo(  "BuzzWhizz" );
            assertThat(fizzBuzz.say( 252 )).isEqualTo(  "Whizz" );
            assertThat(fizzBuzz.say( 270 )).isEqualTo(  "Fizz" );
            assertThat(fizzBuzz.say( 275 )).isEqualTo(  "275" );
            assertThat(fizzBuzz.say( 315 )).isEqualTo(  "BuzzWhizz" );
            assertThat(fizzBuzz.say( 357 )).isEqualTo(  "FizzWhizz" );
            assertThat(fizzBuzz.say( 370 )).isEqualTo(  "Fizz" );
            assertThat(fizzBuzz.say( 371 )).isEqualTo(  "Fizz" );
            assertThat(fizzBuzz.say( 375 )).isEqualTo(  "Fizz" );
            assertThat(fizzBuzz.say( 378 )).isEqualTo(  "Fizz" );  //? 7 multiple rule 7
             assertThat(fizzBuzz.say( 532 )).isEqualTo(  "Whizz" );
             assertThat(fizzBuzz.say( 537 )).isEqualTo(  "Fizz" );
             assertThat(fizzBuzz.say( 567 )).isEqualTo(  "FizzWhizz" );
             assertThat(fizzBuzz.say( 574 )).isEqualTo(  "Whizz" );
             assertThat(fizzBuzz.say( 630 )).isEqualTo(  "Fizz" );
             assertThat(fizzBuzz.say( 735 )).isEqualTo(  "FizzWhizz" );
             assertThat(fizzBuzz.say( 1330 )).isEqualTo(  "Fizz" );
             assertThat(fizzBuzz.say( 1357 )).isEqualTo(  "1357" ); //? rule 4
             assertThat(fizzBuzz.say( 1375 )).isEqualTo(  "1375" ); //? rule 4
             assertThat(fizzBuzz.say( 1470 )).isEqualTo(  "FizzWhizz" );
             assertThat(fizzBuzz.say( 1533 )).isEqualTo(  "Whizz" );
             assertThat(fizzBuzz.say( 1575 )).isEqualTo(  "FizzWhizz" );
             assertThat(fizzBuzz.say( 2370 )).isEqualTo(  "Fizz" );
             assertThat(fizzBuzz.say( 2370 )).isEqualTo(  "Fizz" );
             assertThat(fizzBuzz.say( 3157 )).isEqualTo(  "Whizz" ); //? rule 4
             assertThat(fizzBuzz.say( 3710 )).isEqualTo(  "Fizz" );
             assertThat(fizzBuzz.say( 3745 )).isEqualTo(  "Whizz" );  //? rule 4
      }
      
      
}
