package NewPractise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountWords {
    public static void main(String[] args) {

        String str = "The class String includes methods for examining individual characters of the sequence, for comparing strings, for searching strings, for extracting substrings, and for creating a copy of a string with all characters translated to uppercase or to lowercase. Case mapping is based on the Unicode Standard version specified by the Character class.";

        Map<String, Long> wordCount = Arrays.stream(str.split("\\s+")).collect(Collectors
                .groupingBy(Function.identity(), Collectors.counting()));

        wordCount.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue() ));


        String str1 = str.replace(".", " ").replace("." ," ");
        String stringArray[] = str1.split("\\s+");

        Map<String, Integer> wordCount1 = new HashMap<>();
        int max = Integer.MIN_VALUE;
        String stringMax = "";

        for (String strr: stringArray) {
            wordCount1.put(strr, wordCount1.getOrDefault(strr, 0) + 1);
            if(wordCount1.containsKey(strr)) {
                if(wordCount1.get(strr) > max) {
                    max = wordCount1.get(strr);
                    stringMax = strr;
                }
            }
        }

        System.out.println("word : '"+ stringMax +"', count - " + max);
    }
}
