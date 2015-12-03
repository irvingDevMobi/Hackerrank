package mx.irving.lop.difficulty4;

/**
 * Created by Irving on 03/12/2015.
 *
 * Problem Statement

    Your teacher has given you the task of drawing a staircase structure. Being an expert programmer, you decided to make a program to draw it for you instead. Given the required height, can you print a staircase as shown in the example?

    Input
    You are given an integer N depicting the height of the staircase.

    Output
    Print a staircase of height N that consists of # symbols and spaces. For example for N=6, here's a staircase of that height:

    #
    ##
    ###
    ####
    #####
    ######
    Note: The last line has 0 spaces before it.
 */
public class Staircase {

    private int nLevels;

    public Staircase(int levels) {
        nLevels = levels;
    }

    public void draw() {
        for (int level = 0; level < nLevels; level++) {
            for (int whiteSpace = level; whiteSpace < nLevels -1; whiteSpace++) {
                System.out.print(" ");
            }
            for (int mark = level; mark >= 0; mark--) {
                System.out.print("#");
            }
            System.out.println();
        }

    }
}
