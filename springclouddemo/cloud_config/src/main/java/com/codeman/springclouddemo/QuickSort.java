package com.codeman.springclouddemo;

import java.util.*;

/**
 * @author qinzhanlong
 */
public class QuickSort {
    public static List<Integer> quickSort(List<Integer> list) {
        if (list.size() < 1) {
            return list;
//            Objects
        }
        int header = list.get(0);
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        int len = list.size();
        int ele;
        for (int i = 1; i < len; i++) {
            ele = list.get(i);
            if (ele <= header) {
                left.add(ele);
            } else {
                right.add(ele);
            }
        }
        List<Integer> leftResult = quickSort(left);
        List<Integer> rightResult = quickSort(right);
        List<Integer> result = new ArrayList<>();
        result.addAll(leftResult);
        result.add(header);
        result.addAll(rightResult);
        return result;
    }



//    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(1, 2, 4, 3, 6, 0, -2, 1);
//        Collections.sort(list);
//        System.out.println(list);
//    }
}
