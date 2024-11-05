package logic.preparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamStringVowelsPosition {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------");
        System.out.println("Program to find the position of Vowels in the given String");
        System.out.println("------------------------------------------------------------");
        String str = "My NAme is PavanKumar Velugu";
        List<Integer> vowelPosition = new ArrayList<>();

        char[] arrayString = str.toLowerCase().toCharArray();
        for(int i=0; i<arrayString.length; i++) {
            if(arrayString[i] == 'a' || arrayString[i] == 'e' || arrayString[i] == 'i') {
                vowelPosition.add(i);
            }
        }

        System.out.println("Vowel Position: "+vowelPosition);

        List<String> vowels = Arrays.asList("a","e","i","o", "u");
        String finalStr = str.toLowerCase();
        List<Integer> vowelsPos = IntStream.range(0, finalStr.length())
                .filter(i-> isVowels(finalStr.charAt(i)))
                .boxed()
                .collect(Collectors.toList());

        System.out.println(vowelsPos);

    }

    private static boolean isVowels(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}
