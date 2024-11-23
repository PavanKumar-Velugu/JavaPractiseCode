package logic.preparation.streamapi;

import java.util.Arrays;
import java.util.List;

public class SumOfAllArray {
    public static void main(String[] args) {
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,6,7),
                Arrays.asList(8,9,10));

        int sum = listOfLists.stream()
                .flatMapToInt(list -> list.stream().mapToInt(Integer::intValue))
                .sum();

        System.out.println("sum - " + sum);
    }
}
