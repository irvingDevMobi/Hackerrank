package mx.irving.lop.difficulty8;

/**
 * Created by Irving Lop on 03/12/2015.
 *
 * Problem Statement
 * Given an array of integers, calculate which fraction of the elements are positive, negative, and zeroes, respectively. Print the decimal value of each fraction.

 Input Format
 The first line, N, is the size of the array.
 The second line contains N space-separated integers describing the array of numbers (A1,A2,A3,⋯,AN).

 Output Format
 Print each value on its own line with the fraction of positive numbers first, negative numbers second, and zeroes third.

 Sample Input

 6
 -4 3 -9 0 4 1
 Sample Output

 0.500000
 0.333333
 0.166667
 Explanation

 There are 3 positive numbers, 2 negative numbers, and 1 zero in the array.
 The fraction of the positive numbers, negative numbers and zeroes are 36=0.500000, 26=0.333333 and 16=0.166667, respectively.

 Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to 10−4 are acceptable.
 */
public class PlusMinus {

    private int [] numbers;
    private float positiveNumbers;
    private float zeros;
    private float negativeNumbers;

    public PlusMinus(int size) {
        numbers = new int[size];
        positiveNumbers = 0;
        zeros = 0;
        negativeNumbers = 0;
    }

    public boolean fillArray(String input) {
        String [] numbersString = input.split(" ");
        if (numbersString.length <= numbers.length) {
            for (int num = 0; num < numbersString.length; num++) {
                numbers[num] = Integer.parseInt(numbersString[num]);
                if (numbers[num] > 0) {
                    positiveNumbers++;
                } else if (numbers[num] < 0) {
                    negativeNumbers++;
                } else {
                    zeros++;
                }
            }
            return true;
        }
        return false;
    }

    public void printPercentage() {
        System.out.println("" + positiveNumbers /numbers.length);
        System.out.println("" + negativeNumbers/numbers.length);
        System.out.println("" + zeros/numbers.length);
    }
}
