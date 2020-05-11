package cn.xpbootcamp.fizzbuzz;


public class FizzBuzz {
    public String say(int i) {
        String res="";
        String str_i=""+i;
        if (str_i.contains("7")){
            if (str_i.contains("5")){
                if (i%3==0)
                    res += "Fizz";
                if (i%7==0)
                    res += "Whizz";  //378 ? rule 7
                if (i%3!=0 && i%7!=0)
                    res += i;
                return res;
            }
            if (str_i.contains("3") && i%3!=0)
                return "Fizz";
            if (i%3==0)
                res += "Fizz";
            if (i%7==0)
                res += "Whizz";  //378 ? rule 7
            if (i%3!=0 && i%7!=0)
                res += i;
        }
        else if (str_i.contains("5")){
            if (i%5==0)
                res += "Buzz";
            if (i%7==0)
                res += "Whizz";
            if (i%5!=0 && i%7!=0)
                res += i;
        }
        else if (str_i.contains("3")){
            res += "Fizz";
        }
        else {
            if (i%3==0)
                res += "Fizz";
            if (i%5==0)
                res += "Buzz";
            if (i%7==0)
                res += "Whizz";
            if (i%3!=0 && i%5!=0 && i%7!=0)
                res += i;
        } 
        return res;
    }
}
