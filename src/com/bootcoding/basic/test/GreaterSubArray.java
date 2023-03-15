package com.bootcoding.basic.test;

import java.util.ArrayList;
import java.util.Collections;

public class GreaterSubArray {

    public static int  checkSubArray(int[] arr){
        int max = 1, len = 1;
        int n=arr.length;

        for (int i=1; i<n; i++)
        {

            if (arr[i] > arr[i-1])
                len++;
            else
            {

                if (max < len)
                    max = len;

                len = 1;
            }
        }


        if (max < len)
            max = len;

        return max;
    }

    public static void main(String[] args) {
        int []a={5,6,3,5,7,8,9,1,2};
        System.out.println(checkSubArray(a));
    }
}
