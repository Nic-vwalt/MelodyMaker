/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1practise;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

enum menu {
    Student, Lecturer
};

/**
 *
 * @author Drikus
 */
public class Test1Practise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        ArrayList arr = new ArrayList<Person>();

        int number = SC.nextInt();
        menu choice = menu.values()[number];

        switch (choice) {
            case Student:
                System.out.println(choice.toString());
                break;
            case Lecturer:
                System.out.println(choice.toString());
                break;

        }

        arr.add(new Student(23, 35, "Drikus", "Mostert", 2, 23));
        arr.add(new Student(45, 45, "JAN", "Mostert", 3, 22));
        arr.add(new Student("stefan", "Mostert", 4, 26));
        arr.add(new Student("dam", "Mostert", 5, 23));

        Collections.sort(arr);

        Iterator it = arr.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());

        }

        for (Object stud : arr) {
            System.out.println(stud.toString());
        }
    }

}
