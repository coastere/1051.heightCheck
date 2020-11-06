package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
       int[] heights = {1,1,4,2,1,3};
       int[] original=heights.clone();
       Arrays.sort(heights);
       int r=0;
        for (int i = 0; i <heights.length ; i++) {
            if (heights[i] != original[i]) {
               r++;
            }
        }

        System.out.println(r);
    }
}
