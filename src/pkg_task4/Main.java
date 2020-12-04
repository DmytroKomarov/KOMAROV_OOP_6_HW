package pkg_task4;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> myDigits = new ArrayList<>();
        int i=0;

        myDigits.add(10);
        myDigits.add(20);
        myDigits.add(30);
        myDigits.add(40);
        myDigits.add(50);
        myDigits.add(60);
        myDigits.add(70);
        myDigits.add(80);
        myDigits.add(90);
        myDigits.add(100);
        ListIterator<Integer> iterator = myDigits.listIterator();

        System.out.println("Digit before iterative increase by 1: " + myDigits.toString());

        for (int myDigit: myDigits) {
            myDigits.set(i,iterator.next()+1);
            i++;
        }

        System.out.println("Digit after iterative increase by 1: " + myDigits.toString());

    }
}

