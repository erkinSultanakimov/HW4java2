package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listA = new ArrayList<>();
        System.out.println("Enter words for listA:");
        for (int i = 0; i < 5; i++) {
            listA.add(scanner.next());
        }
        Print(listA);


        ArrayList<String> listB = new ArrayList<>();
        System.out.println("Enter words for listB:");
        for (int i = 0; i < 5; i++) {
            listB.add(scanner.next());

        }
        Print(listB);

        Collections.reverse(listB);


        ArrayList<String> listC = new ArrayList<>();
        System.out.println("listC");

        for (int i = 0; i <5 ; i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(i));

        }
        Print(listC);

        Comparator<String> bylength = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };
        Collections.sort(listC, bylength);
        System.out.println(listC);


    }

    public static void Print(ArrayList<String> list) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }


}

