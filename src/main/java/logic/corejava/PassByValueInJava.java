package logic.corejava;

import logic.entities.Students;

public class PassByValueInJava {

    public static void main(String[] args) {

//        int x = 50;
//        change(x);
//        System.out.println("x:" + x);

        Students aValue = new Students(10, null, 0, null, 0);
        passingAObject(aValue);
        System.out.println(">> "+aValue.getId());
    }

    private static void passingAObject(Students aValue) {
        System.out.println(aValue.getId());
        aValue.setId(aValue.getId() + 20);
    }

    private static void change(int x) {
        x = x * 2;
    }
}
