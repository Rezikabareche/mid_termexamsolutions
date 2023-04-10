package math.problems;

public class Fibonacci {
    static int n;

    public static int Fib(int n) {
        if (n <= 1) {
            return n;
        } else {
            return Fib(n - 1) + Fib(n - 2);

            }
        }

        public static void main (String[]args){
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
            for (n = 1; n < 40; n++) {
           Fib(0);
            System.out.println("the 40 Fibonacci series are : "+Fib(n));

        }
    }

}











