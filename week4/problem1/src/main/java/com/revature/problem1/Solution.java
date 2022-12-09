package com.revature.problem1;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int elementNotInArray(int[] arr, int k) {
        boolean notFound = true;
        ArrayList newArray = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            newArray.add(arr[i]);
        }


        while(notFound == true) {
            k = k+1;
            System.out.println(k);
            boolean doesContain = newArray.contains(k);
            System.out.println(doesContain);

            if(doesContain == false) {
                notFound = false;
            }

        }
        return k;
    }
}
