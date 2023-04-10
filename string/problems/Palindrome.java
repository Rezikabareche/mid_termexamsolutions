package string.problems;

public class Palindrome {
    Palindrome(String original,String rev) {
        original = "madam";
        String reverse = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }
        System.out.println(reverse);

        if (original.equals(reverse)) {

            System.out.println("this is a palindrome string");
        } else {
            System.out.println("this is not a palindrome string");
        }
    }
    public static void main(String[] args) {
            Palindrome palindrome=new Palindrome("madam","madam");

        }
    }




