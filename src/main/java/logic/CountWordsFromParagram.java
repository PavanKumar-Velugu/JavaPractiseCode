package logic;

import java.util.HashMap;

public class CountWordsFromParagram {
    public static void main(String[] args) {
        String paragraph = "Developing writers can often benefit from examining an essay, a paragraph, or even a sentence to determine what makes it effective. On the following pages are several paragraphs for you to evaluate on your own, along with the Writing Center's explanation. Note: These passages are excerpted from actual student papers and retain the original wording. Some of the sentences are imperfect, but we have chosen these passages to highlight areas in which the author was successful. open-minded";

        paragraph = paragraph.toLowerCase();

        System.out.println(paragraph.replace(",",""));
        paragraph.replaceAll("[^a-zA-Z0-9]", "");

//        paragraph.replaceAll(".", "")
//                .replaceAll(",", "")
//                .replaceAll(":", "");
        //System.out.println(paragraph);

        String[] arrayString = paragraph.split(" ");
        //System.out.println(">> "+arrayString[arrayString.length-1]);
        System.out.println(""+arrayString.length);
        HashMap<String, Integer> hashMap = new HashMap<>();
        String word = "";

        int max = Integer.MIN_VALUE;
        for(String para: arrayString) {
            //System.out.println(para+" > "+hashMap.get(para));
            hashMap.put(para, hashMap.getOrDefault(para, 0)+1);
            int mapCount = (Integer) hashMap.get(para);
            if( mapCount > max) {
                //System.out.println("mapCount: "+mapCount);
                max = mapCount;
                word = para;
                //System.out.println("max: "+max);
            }
            int values = hashMap.get(para);
        }

        System.out.println("Max count of word '"+word +"' is - "+max);
        //System.out.println(hashMap);

    }
}
