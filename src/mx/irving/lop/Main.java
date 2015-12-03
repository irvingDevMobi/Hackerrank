package mx.irving.lop;

import mx.irving.lop.difficulty8.TimeConversion;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TimeConversion tC = new TimeConversion(scanner.nextLine());
        System.out.println(tC.get24HourFormat());
    }
}
