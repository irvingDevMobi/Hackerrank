package mx.irving.lop;

import mx.irving.lop.difficulty4.Staircase;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /**
         // Timer Conversion problem
        Scanner scanner = new Scanner(System.in);
        TimeConversion tC = new TimeConversion(scanner.nextLine());
        System.out.println(tC.get24HourFormat());
         **/

        // Staircase
        Scanner scanner = new Scanner(System.in);
        Staircase staircase = new Staircase(Integer.parseInt(scanner.nextLine()));
        staircase.draw();


    }
}
