package mx.irving.lop;

import mx.irving.lop.difficulty16.CutSticks;

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

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String input = scanner.nextLine();
        CutSticks cutSticks = new CutSticks(input);
        cutSticks.startCut();
//        cutSticks.print();
    }
}
