package mx.irving.lop;

import mx.irving.lop.difficulty23.SherlockAndTheBeast;
import mx.irving.lop.difficulty28.Encryption;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
         // Timer Conversion problem
        Scanner scanner = new Scanner(System.in);
        TimeConversion tC = new TimeConversion(scanner.nextLine());
        System.out.println(tC.get24HourFormat());
         */

        /*
        // Staircase
        Scanner scanner = new Scanner(System.in);
        Staircase staircase = new Staircase(Integer.parseInt(scanner.nextLine()));
        staircase.draw();
        */

        /*
        Scanner scanner = new Scanner(System.in);
        PlusMinus plusMinus = new PlusMinus(Integer.parseInt(scanner.nextLine()));
        plusMinus.fillArray(scanner.nextLine());
        plusMinus.printPercentage();
        */

        /*Scanner scanner = new Scanner(System.in);
        int testsC = Integer.parseInt(scanner.nextLine());
        UtopianTree [] utopianTrees = new UtopianTree[testsC];
        for (int t = 0; t < testsC; t++) {
            int cycle = Integer.parseInt(scanner.nextLine());
            utopianTrees[t] = new UtopianTree(cycle);
        }
        for (UtopianTree tree : utopianTrees) {
            System.out.println("" + tree.height());
        }*/

        /*Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String input = scanner.nextLine();
        CutSticks cutSticks = new CutSticks(input);
        cutSticks.startCut();*/

        /*Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String [] initValues = input.split(" ");
        int n = Integer.parseInt(initValues[0]);
        int m = Integer.parseInt(initValues[1]);
        AcmIcpcTeam acmIcpcTeam = new AcmIcpcTeam(n, m);
        for (int persons = 0; persons < n; persons++) {
            acmIcpcTeam.fill(persons, scanner.nextLine());
        }
        acmIcpcTeam.evaluate();*/

//        for (int d = 1; d < 61; d++) {
//            System.out.println(d + " " + SherlockAndTheBeast.getDecentNumber(d));
//        }

        /*Scanner scanner = new Scanner(System.in);
        int tests = Integer.parseInt(scanner.nextLine());
        int[] testValue = new int[tests];
        for(int t = 0; t < tests ; t++) {
             testValue [t] = Integer.parseInt(scanner.nextLine());
        }
        for (int value : testValue) {
            System.out.println(SherlockAndTheBeast.getDecentNumber(value));
        }*/

        Scanner scanner = new Scanner(System.in);
        Encryption encryption = new Encryption(scanner.nextLine());
        System.out.println(encryption.getMessage());
    }
}
