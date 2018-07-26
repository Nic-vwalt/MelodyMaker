package cinema;

import java.util.ArrayList;
import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        ArrayList<ArrayList<Seat>> seatlist = new ArrayList<>();
        System.out.println("Enter the amount of seats per row :");
        int column = SC.nextInt();
        System.out.println("Enter the amount of rows : ");
        int rows = SC.nextInt();
        for (int i = 0; i < rows; i++) {
            ArrayList<Seat> seatrows = new ArrayList<>();
            for (int j = 0; j < column; j++) {
                seatrows.add(new Seat(i + "" + j, false));
            }
            seatlist.add(seatrows);
        }
        
        Client c1 = new Client(seatlist.get(1).get(1), 1,18, "Ernes", "Smit");
        Client c2 = new Client(seatlist.get(1).get(1), 1,23, "Drikus", "Mostert");
        c1.start();
        c2.start();
    }

}
