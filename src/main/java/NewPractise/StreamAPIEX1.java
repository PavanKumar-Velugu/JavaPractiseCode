package NewPractise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamAPIEX1 {
    public static void main(String[] args) {
        /**
         *  Remove a duplicate element
         * */

        List<Integer> listElement = Arrays.asList(12,23,12,334,45,34,323,567,23,334);
        Set<Integer> set = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();

        for(int i = 0; i < listElement.size(); i++) {
            if(!set1.contains(listElement.get(i))) {
                set1.add(listElement.get(i));
            } else {
                System.out.println(listElement.get(i));
            }
        }

        listElement.stream()
                .filter(e-> !set.add(e))
                .forEach(System.out::println);

        System.out.println("set - " + set.stream().sorted().collect(Collectors.toList()));

        int max = listElement.stream().max(Integer::compare).get();
        System.out.println("Maximum Number: " + max);

        int min = listElement.stream().min(Integer::compare).get();
        System.out.println("Minimum Number: " + min);

        Long count = listElement.stream().count();
        System.out.println("No.of element: " + count);

        System.out.println("---- Sorting Elements in Array ----");
        listElement.stream().sorted().forEach(System.out::println);

        List<Integer> sortedList = listElement.stream().distinct().sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList());
        System.out.println(sortedList);
        System.out.println("Total count in sortedList - " + sortedList.stream().count());
    }
}
