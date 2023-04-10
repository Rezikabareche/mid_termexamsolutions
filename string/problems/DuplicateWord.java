package string.problems;
import java.util.HashMap;
public class DuplicateWord {
   public DuplicateWord(){
         String word = "Java is a programming Language . Java is also an Island of Indonesia . Java is widely used language";

        String strArray[] = word.split(" ");
        HashMap<String, Integer> map = new HashMap<>();

        for (String s : strArray) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        System.out.println(map);

    }

    public static void main(String[] args) {
         DuplicateWord duplicate= new DuplicateWord();

        }

    }






