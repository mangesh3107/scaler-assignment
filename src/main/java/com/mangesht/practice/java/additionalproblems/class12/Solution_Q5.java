package com.mangesht.practice.java.additionalproblems.class12;

import java.io.InputStream;
import java.lang.*;
import java.util.*;

/**
 * Take an integer N, print the corresponding Full Pyramid pattern for N.
 * For example if N = 5 then pattern will be like:
 *     * 
 *    * * 
 *   * * * 
 *  * * * * 
 * * * * * * 
 */
public class Solution_Q5 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scanner = new Scanner(System.in);
        // int n = scanner.nextInt();
        int n = 6;
        System.out.println(String.format("Printing pattern for %d.", n));
        printTree(n);
    }

    private static void printTree(int x) {
        int k = x - 1;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(" ");
            }
            for (int l = 0; l < i + 1; l++) {
                    System.out.print("* ");
            }
            System.out.println();
            k--;
        }
    }
}