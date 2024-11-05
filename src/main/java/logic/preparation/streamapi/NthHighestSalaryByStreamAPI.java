package logic.preparation.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class NthHighestSalaryByStreamAPI {
    public static void main(String[] args) {

        System.out.println("----------------------------------------------------");
        System.out.println("Find the nth highest salary ");
        System.out.println("----------------------------------------------------");

        List<Integer> saleryList = Arrays.asList(12300, 13040, 34500, 13040, 56740, 12300, 34500, 78905);
        int n = 2;

        Optional<Integer> nthHighestSalary = saleryList.stream()
                                                .distinct()
                                                .sorted((s1, s2) -> s2.compareTo(s1))
                                                .skip(n-1)
                                                .findFirst();
        if(nthHighestSalary.isPresent())
            System.out.println(n+"th highest salary - "+nthHighestSalary.get());
        else
            System.out.println(n+"th highest salary not present.");
    }
}
