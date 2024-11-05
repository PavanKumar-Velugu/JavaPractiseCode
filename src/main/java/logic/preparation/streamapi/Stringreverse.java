package logic.preparation.streamapi;

public class Stringreverse {

    public static String reverseString(String str){
        return str.chars()
                .mapToObj(c -> (char) c)
                .reduce("", (s, c) -> c+s, (s1, s2) -> s2);
    }

    public static void main(String[] args) {
        String str1 = "MALAYALAM";
        System.out.println("Requested String: "+str1);
        System.out.println("Reverse String1: "+reverseString(str1));

        //another method to reverse String
        char[] strArray = str1.toCharArray();
        System.out.println("length: "+strArray.length);
        String reverseStr="";
        for(int i=strArray.length-1; i>=0; i--) {
            reverseStr+=strArray[i];
        }

        System.out.println("Reverse String2: "+reverseStr);
    }
}
