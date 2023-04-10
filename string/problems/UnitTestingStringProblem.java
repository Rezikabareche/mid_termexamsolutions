package string.problems;

import java.util.Map;

import static string.problems.Anagram.isAnagramSort;

public class UnitTestingStringProblem {
    public static void main(String[] args) {

        DuplicateWord duplicate= new DuplicateWord();

        Palindrome palindrome=new Palindrome("madam","madam");

        System.out.println(Permutation.getPermutation("ABC"));

        isAnagramSort("cat", "cat");
        System.out.println(Anagram.isAnagramSort("cat", "cat"));

        Map largestWord= DetermineLargestWord.findTheLargestWord("Human brain is a biological learning machine");
        System.out.println("the largest word is : "  +largestWord);



    }
}
