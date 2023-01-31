package com.company;

public class Main {

    public static void main(String[] args) {
        Sort a = new Sort();
        int[] arr = {3, 2, 6, 9, 12};
        arr = a.selectionSort(arr);
        for ( int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }
}