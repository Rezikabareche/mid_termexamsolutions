package string.problems;

import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {
    public static void main(String[] args) {
        Map largestWord= DetermineLargestWord.findTheLargestWord("Human brain is a biological learning machine");
        System.out.println("the largest word is : "  +largestWord);
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
    }
        String s = "Human brain is a biological learning machine";
        public static Map<Integer, String> findTheLargestWord (String s){
            Map<Integer, String> map = new HashMap<Integer, String>();
            String[] words = s.split("\\s+");
            int maxLength = 0;
            for (String word : words) {
                if (word.length() > maxLength) {
                    maxLength = word.length();
                    s = word;
                }
            }
            map.put(maxLength, s);
            return map;
        }
    }
