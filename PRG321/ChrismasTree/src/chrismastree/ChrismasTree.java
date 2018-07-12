/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chrismastree;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author user
 */
public class ChrismasTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int space = 10;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < space - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 1 + i; j++) {
                if (i % 2 == 0) {
                    System.out.print("X ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 1 + i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < space - i; j++) {
//                if (i % 2 == 0) {
//                    System.out.print("X ");
//                } else {
//                    System.out.print("* ");
//                }
//            }
//            System.out.println("");
//        }
//        TreeMap<Integer, String> map = new TreeMap<Integer, String>();
//        map.put(101, "Player1");
//        map.put(102, "Player2");
//        map.put(102, "Player3");
//        Set s = map.entrySet();
//        
//        Iterator it = s.iterator();
//        while (it.hasNext()) {
//            map.entry = it.next();
//            
//        }


    }

}
