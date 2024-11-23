package logic.corejava;

import java.util.HashMap;
import java.util.Map;

public class GetMissingNumberUsingHashMap {
    public static void main(String[] args) {

        int a[] = {1,2,3,4,5,6,7,8,9,10,12,13,14,15,16,17,18,19,20};
        int b[] = {1,2,3,4,5,6,7,8,9,10,12,13,14,15,16,17,18,19,20,21};

        GetMissingNumberUsingHashMap missingNo = new GetMissingNumberUsingHashMap();
        int result = missingNo.returnMissingNumber(a, b);
        System.out.println("Missing Number: "+result);
    }

    private int returnMissingNumber(int[] a, int[] b) {

        Map<Integer, Integer> map = new HashMap<>();
        for(int num: a) {
            map.put(num, map.getOrDefault(num,0)+1);
        }

        for(int num: b) {
            System.out.println(num);
            if(!map.containsKey(num))
                return num;
        }
        return 0;
    }
}
