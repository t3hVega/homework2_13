package com.homework213.homework213;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        StringList stringList1 = new StringList(3);
        stringList1.add("Стас");
        stringList1.add(1, "Иван");
        stringList1.add(1, "Олег");


        StringList stringList2 = new StringList(3);
        stringList2.add("Стас");
        stringList2.add(1, "Иван");
        stringList2.add(1, "Олег");




        System.out.println(stringList1.equals(stringList2));
        stringList1.remove("Олег");
        System.out.println(stringList1.size());
        System.out.println(Arrays.toString(stringList1.toArray()));
    }
}