package com.zp.SwordToOffer2;

/**
 * Created by ZP on 2019/5/16.
 * 给定一个二维数组，其每一行从左到右递增排序，从上到下也是递增排序。给定一个数，
 * 判断这个数是否在该二维数组中。
 Consider the following matrix:
 [
     [1,   4,  7, 11, 15],
     [2,   5,  8, 12, 19],
     [3,   6,  9, 16, 22],
     [10, 13, 14, 17, 24],
     [18, 21, 23, 26, 30]
 ]
 Given target = 5, return true.
 Given target = 20, return false.
 */
public class SwordToOffer2 {
    public static void main(String[] args) {
        int array[][] = {
                {1,   2,  8,  9},
                {2,   4,  9, 12},
                {4,   7, 10, 13},
                {6,   8, 11, 15}
        };
        int target = 7;
        Boolean aBoolean = FindTargetNum(array,target);
        System.out.println(aBoolean);
    }

    private static Boolean FindTargetNum(int[][] array, int target) {
        if(array == null || array.length == 0 || array[0].length == 0)
            return false;
        int lenX = array[0].length-1, lenY = 0;
        while (lenX < array[0].length && lenY < array.length && lenX >=0 && lenY >= 0){
            if(target == array[lenY][lenX]){
                return true;
            } else if(target > array[lenY][lenX]){
                lenY++;
            } else {//(target < array[lenY][lenX])
                lenX--;
            }
        }
        return false;
    }
}
