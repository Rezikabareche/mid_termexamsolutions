package string.problems;

import static string.problems.Anagram.isAnagramSort;

public class UnitTestingStringProblem {
    public static void main(String[] args) {

        DuplicateWord duplicate= new DuplicateWord();

        Palindrome palindrome=new Palindrome("madam","madam");

        System.out.println(Permutation.getPermutation("ABC"));

        isAnagramSort("cat", "cat");
        System.out.println(Anagram.isAnagramSort("cat", "cat"));



    }
}
