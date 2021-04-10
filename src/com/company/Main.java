package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listA = new ArrayList<>();
        System.out.println("Enter words for listA:");
        listA.add(scanner.next());
        listA.add(scanner.next());
        listA.add(scanner.next());
        listA.add(scanner.next());
        listA.add(scanner.next());

        Iterator<String> iterator = listA.iterator();
        System.out.println("listA------------");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        ArrayList<String> listB = new ArrayList<>();
        System.out.println("Enter words for listB:");
        listB.add(scanner.next());
        listB.add(scanner.next());
        listB.add(scanner.next());
        listB.add(scanner.next());
        listB.add(scanner.next());
        Collections.reverse(listB);

        Iterator<String> iterator2 = listB.iterator();
        System.out.println("listB------------");
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }

        ArrayList<String> listC = new ArrayList<>();
        System.out.println("listC");


        listC.add(0,listA.get(0) );
        listC.add(1 ,listB.get(0));
        listC.add(2,listA.get(1));
        listC.add(3 ,listB.get(1));
        listC.add(4,listA.get(2));
        listC.add(5 ,listB.get(2));
        listC.add(6,listA.get(3));
        listC.add(7 ,listB.get(3));
        listC.add(8,listA.get(4));
        listC.add(9,listB.get(4));
        System.out.println(listC);
        Comparator<String> bylength = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };
        Collections.sort(listC, bylength);
        System.out.println(listC);











    }



}
