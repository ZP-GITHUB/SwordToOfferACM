package com.zp.SwordToOffer1;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ZP on 2019/5/16.
 * 在一个长度为 n 的数组里的所有数字都在 0 到 n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字
 * 是重复的，也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
 *Input:
 *{2, 3, 1, 0, 2, 5}
 *Output:
 *2
 */
public class SwordToOffer1 {
    public static void main(String[] args) {
        int[] arry = {2, 3, 1, 0, 2, 5};

        int num = FindRepeatNum(arry);

        System.out.println(num);
    }

    private static int FindRepeatNum(int[] arry) {
        Set set = new HashSet();

        for (int i = 0; i < arry.length; i++) {
            if(!set.add(arry[i])){
                return arry[i];
            }
        }
        return 0;
    }
}
