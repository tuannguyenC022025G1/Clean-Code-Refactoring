public class FizzBuzz {
    public static String fizzBuzz(int number){
        boolean b = number % 3 == 0;
        boolean b1 = number % 5 == 0;
        if(b && b1)
            return "FizzBuzz";

        if(b)
            return "Fizz";

        if(b1)
            return "Buzz";

        return number + "";
    }
}
