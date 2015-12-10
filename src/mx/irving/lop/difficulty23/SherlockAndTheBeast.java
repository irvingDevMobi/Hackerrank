package mx.irving.lop.difficulty23;

/**
 * Created by Irving Lop on 09/12/2015.
 * Problem Statement

 Sherlock Holmes suspects his archenemy, Professor Moriarty, is once again plotting something diabolical. Sherlock's
 companion, Dr. Watson, suggests Moriarty may be responsible for MI6's recent issues with their supercomputer,
 The Beast.

 Shortly after resolving to investigate, Sherlock receives a note from Moriarty boasting about infecting The Beast with
 a virus; however, he also gives him a clue—a number, N. Sherlock determines the key to removing the virus is to find
 the largest Decent Number having N digits.

 A Decent Number has the following properties:

 Its digits can only be 3's and/or 5's.
 The number of 3's it contains is divisible by 5.
 The number of 5's it contains is divisible by 3.
 Moriarty's virus shows a clock counting down to The Beast's destruction, and time is running out fast. Your task is to
 help Sherlock find the key before The Beast is destroyed!

 Constraints
 1≤T≤20
 1≤N≤100000


 Input Format

 The first line is an integer, T, denoting the number of test cases.

 The T subsequent lines each contain an integer, N, detailing the number of digits in the number.

 Output Format

 Print the largest Decent Number having N digits; if no such number exists, tell Sherlock by printing -1.

 Sample Input

 4
 1
 3
 5
 11
 Sample Output

 -1
 555
 33333
 55555533333
 Explanation

 For N=1, there is no such number.
 For N=3, 555 is the only possible number.
 For N=5, 33333 is the only possible number.
 For N=11, 55555533333 and all permutations of these digits are valid numbers; among them, the given number is the
 largest one.
 */
public class SherlockAndTheBeast {

    public static long decentNumber(int digits) {
        int remainderTo5 = digits % 5;
        int remainderTo3 = digits % 3;
        int remainderTo6 = digits % 6;
        int remainderTo8 = digits % 8;
        if (remainderTo5 == 0) {
            System.out.println("all 5´s");
        } else if(digits > 3 && remainderTo5 % 3 == 0) {
            System.out.println("5 and then 3");
        }
        else if (remainderTo3 == 0 || remainderTo6 == 0) {
            System.out.println("all 3´s");
        } else if (remainderTo6 % 5 == 0 || remainderTo8 == 0) {
            System.out.println("5 and then 3 3s > 5s ");
        } else {
            System.out.println("-1");
            return -1;
        }
        return -1;
    }
}
