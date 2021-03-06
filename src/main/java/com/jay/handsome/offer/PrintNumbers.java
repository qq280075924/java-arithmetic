package com.jay.handsome.offer;

import java.util.ArrayList;

/**
 * 剑指 Offer 17. 打印从1到最大的n位数
 * https://leetcode.cn/problems/da-yin-cong-1dao-zui-da-de-nwei-shu-lcof/
 *
 * @author jay
 * @date 2022/6/10 17:53
 */
public class PrintNumbers {
    public int[] printNumbers(int n) {
        ArrayList<Integer> arrayList = new ArrayList();
        for (int i = 1;isLegal(i,n);i++){
            arrayList.add(i);
        }
        int[] ints = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            ints[i] = arrayList.get(i);
        }
        return ints;
    }

    public boolean isLegal(int x, int n) {
        double v = x % (Math.pow(10, n));
        if (v == 0D){
            return false;
        }
        return true;
    }

    public int[] printNumbers1(int n) {
        if (n<=0) return null;
        int pow = (int)Math.pow(10, n);
        int[] ints = new int[pow-1];
        for (int i = 0; i < (pow-1); i++) {
            ints[i] = i+1;
        }
        return ints;
    }

    public static void main(String[] args) {
        new PrintNumbers().printNumbers1(1);
    }
}
