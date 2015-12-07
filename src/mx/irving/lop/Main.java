package mx.irving.lop;

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

        int [] data = {6, 7, 4, 9, 1 , 3, 2, 5, 8};
        Sort sort = new Sort(data);
        sort.quickSort(sort.getArray(), 0, data.length -1);
        sort.print();
    }
}
