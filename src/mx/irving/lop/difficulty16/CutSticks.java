package mx.irving.lop.difficulty16;

import mx.irving.lop.Sort;

/**
 * Created by Irving Lop on 07/12/2015.
 * Problem Statement

 You are given  sticks, where the length of each stick is a positive integer. A cut operation is performed
 on the sticks such that all of them are reduced by the length of the smallest stick.
 Suppose we have six sticks of the following lengths:
 5 4 4 2 2 8
 Then, in one cut operation we make a cut of length 2 from each of the six sticks. For the next cut operation
 four sticks are left (of non-zero length), whose lengths are the following:
 3 2 2 6
 The above step is repeated until no sticks are left.
 Given the length of  sticks, print the number of sticks that are left before each subsequent cut operations.
 Note: For each cut operation, you have to recalcuate the length of smallest sticks (excluding zero-length sticks).

 Input Format
 The first line contains a single integer .
 The next line contains  integers: a0, a1,...aN-1 separated by space, where ai represents the length of ith stick.

 Output Format
 For each operation, print the number of sticks that are cut, on separate lines.

 Constraints
 1 ≤ N ≤ 1000
 1 ≤ ai ≤ 1000

 Sample Input #00

 6
 5 4 4 2 2 8
 Sample Output #00

 6
 4
 2
 1
 */
public class CutSticks {

    int values [];

    public CutSticks(String input) {
        String [] inputValues = input.split(" ");
        values = new int[inputValues.length];
        for (int v = 0; v < values.length; v++) {
            values[v] = Integer.parseInt(inputValues[v]);
        }
    }

    public void startCut() {
        Sort.quickSort(values, 0, values.length - 1);
        cut(values, 0);
    }

    private void cut(int [] array, int left) {
        int size = array.length - left;
        if (size > 0) {
//            print();
            System.out.println("" + size);
            int less = array[left];
            for (int p = left; p < array.length; p++) {
                array[p] -= less;
                if (array[p] == 0) {
                    left++;
                }
            }
            cut(array, left);
        }
    }

    public void print() {
        for (int value : values) {
            System.out.print(value + " ");
        }
    }
}
