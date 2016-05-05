package mx.irving.lop.codility.lesson1;

/**
 * Created by Irving Lop on 05/05/2016.
 * A binary gap within a positive integer N is any maximal sequence of consecutive zeros
 * that is surrounded by ones at both ends in the binary representation of N.

 For example, number 9 has binary representation 1001 and contains a binary gap of length 2.
 The number 529 has binary representation 1000010001 and contains two binary gaps: one of length
 4 and one of length 3. The number 20 has binary representation 10100 and contains one binary gap
 of length 1. The number 15 has binary representation 1111 and has no binary gaps.

 Write a function:

 class Solution { public int solution(int N); }
 that, given a positive integer N, returns the length of its longest binary gap. The function should
 return 0 if N doesn't contain a binary gap.

 For example, given N = 1041 the function should return 5, because N has binary representation
 10000010001 and so its longest binary gap is of length 5.

 Assume that:

 N is an integer within the range [1..2,147,483,647].
 Complexity:

 expected worst-case time complexity is O(log(N));
 expected worst-case space complexity is O(1).

 Copyright 2009–2016 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or
 disclosure prohibited.

 Only gaps between one´s, Examples:
    110 - 0
 110100 - 1
 100001 - 5
 101001 - 2
 */
public class BinaryGap {

    public static void main(String[] args)
    {
        BinaryGap binaryGap = new BinaryGap();
        for (int i = 0; i < 50; i++) {
            System.out.println(i);
            System.out.println("::: " + binaryGap.solution(i));
            System.out.println("--------------");
        }
//        System.out.println("::: " + binaryGap.solution(6));
    }

    public int solution(int N)
    {
        if (N == 0)
            return 1;
        String binary = Integer.toBinaryString(N);
        System.out.println(binary);
        int length = binary.length();
        double possible = Math.pow(2, length);
        if (possible/2 == N) {
            // only the first position is '1', the rest of digits are zeros
            return 0;
        } else if (possible - 1 == N) {
            // all digits are '1'
            return 0;
        } else {
            return zeros(binary);
        }
    }

    /**
     * Count the sequence max of zeros in a binary number
     * @param binary representation of the number in binary domain
     * @return the sequence max
     */
    private int zeros(String binary) {
        // Start from position 1 because always the first value is '1'
        int from = 1;
        int pivot = 0;
        while (from < binary.length()) {
            int zero = findChar('0', from, binary);
            int one = findChar('1', zero + 1, binary);
            if (one > 0) {
                if (one - zero > pivot) {
                    pivot = one - zero;
                }
                from = one + 1;
            } else {
                break;
            }
        }
        return pivot;
    }

    /**
     * Return the position of the first coincidence in a string
     * @param sought Char searched
     * @param from index from the search start
     * @param binary String with data
     * @return position searched
     */
    private int findChar(char sought, int from, String binary) {

        while (from < binary.length() && binary.charAt(from) != sought) {
            from++;
        }
        if (from >= binary.length()) {
            return -1;
        }
        return from;
    }
}
