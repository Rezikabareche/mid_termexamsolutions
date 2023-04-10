package math.problems;

import static math.problems.Factorial.multiplyNumbers;
import static math.problems.Fibonacci.Fib;


public class UnitTestingMath {
    public static void main(String[] args) {


        multiplyNumbers(5);
        int num = 5;
        long factorial = multiplyNumbers(num);
        System.out.println("Factorial of " + num + " = " + factorial);
        multiplyNumbers(5);

         System.out.println(Fibonacci.Fib( 40));




            int[] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
            int n = array.length;
            System.out.println("the missing number is : " );
            FindMissingNumber.findMissing(array, n);

            System.out.println( "the lowest difference " +FindLowestDifference.findSmallestDifference());

            MakePyramid.printStars(6);

            PrimeNumber max = new PrimeNumber(1000000);
           System.out.println( "the pattern:" +Pattern.FindPattern(100));
        }
    }
