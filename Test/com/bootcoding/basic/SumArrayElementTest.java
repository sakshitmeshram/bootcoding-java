package com.bootcoding.basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SumArrayElementTest {

    @Test
    void test1() {
        SumArrayElement t = new SumArrayElement();
        int[] a = {1, 4, 1, 7, 9};
        int[] actualSum = t.getRunningSum(a);
        int[] expectSum = {1, 5, 6, 13, 22};
        Assertions.assertArrayEquals(expectSum, actualSum);

    }

    @Test
    void test2() {
        SumArrayElement t=new SumArrayElement();
        int[] a ={1,9,15,70,9};
        int[] actualSum=t.getRunningSum(a);
        int [] expectSum={1 ,10 ,25 ,95, 104};
        Assertions.assertArrayEquals(expectSum, actualSum);
    }

    @Test
    void test3() {
        SumArrayElement t=new SumArrayElement();
        int[] a ={-1,9,15,-70,9};
        int[] actualSum=t.getRunningSum(a);
        int [] expectSum={-1 ,8 ,23 ,-47, -38};
        Assertions.assertArrayEquals(expectSum, actualSum);
    }
}