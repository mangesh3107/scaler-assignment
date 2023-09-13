package com.mangesht.practice.java.assignment.class14;

import java.io.InputStream;
import java.lang.*;
import java.util.*;
/**
 * Give a N * N square matrix A, return an array of its anti-diagonals. Look at the example for more details.
 * Input : 
 * [ [1,2,3],
 * [4,5,6],
 * [7,8,9] ]
 * Output : 
 * [ [1,0,0],
 * [2,4,0],
 * [3,5,7],
 * [6,8,0],
 * [9,0,0] ]
 */
public class Solution_Q2 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> columns = new ArrayList();
        columns.add(0, getRow(1, 2, 3));
        columns.add(1, getRow(4, 5, 6));
        columns.add(2, getRow(7, 8, 9));
        System.out.println("!...Input Matrix...!");
        for (int i = 0; i < columns.size(); i++) {
            for (int j = 0; j < columns.get(i).size(); j++) {
                System.out.print(columns.get(i).get(j) + " ");
            }
            System.out.println();
        }
        System.out.println("!...Input Matrix...!");
        ArrayList<ArrayList<Integer>> antiDiagonals = diagonal(columns);
        System.out.println("!...Anti-Diagonal Matrix...!");
        for (int i = 0; i < antiDiagonals.size(); i++) {
            for (int j = 0; j < antiDiagonals.get(i).size(); j++) {
                System.out.print(antiDiagonals.get(i).get(j) + " ");
            }
            System.out.println();
        }
        System.out.println("!...Anti-Diagonal Matrix...!");
    }

    private static ArrayList<Integer> getRow(int a, int b, int c) {
        ArrayList<Integer> row = new ArrayList();
        row.add(a);
        row.add(b);
        row.add(c);
        return row;
    }

    public static ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
        int l = A.size();
	    ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < 2 * l - 1; ++i) {
    	    int offset = i < l ? 0 : i - l + 1;
	        ArrayList<Integer> row = new ArrayList<Integer>();
	        int k=0;
    	    for (int j = offset; j <= i - offset; ++j) {
		        row.add(A.get(j).get(i - j));
		        k++;
    	    }
    	    for(int j = k; j< l ;j++){
    	        row.add(0);
    	    }
	        res.add(row);
        }
        return res;
    }
}