package com.company;

public class Sort {

    public int[] insertionSort(int[] arr){
        int temp = 0;
        for (int i=1;i<arr.length;i++) {
            int j = i;
            while ( j!= 0 && arr[j] < arr[j - 1 ]) {
                temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
        return arr;
    }

    public int heapSort(int[] arr, int x){
        int pos = 0;
        for(int i=0;i<arr.length;i++){
            if (arr[i] == x){
                pos = i;
                break;
            }
        }
        return pos;
    }

    public int[] selectionSort(int[] arr){
        int temp =0;
        for(int i=0;i<arr.length;i++){
            int min = arr[i];
            int pos = i;
            for(int j=i;j<arr.length;j++){
            if (arr[j] <= min) {
                min = arr[j];
                pos = j;
            }
            }
            if (min!=arr[i]){
                temp = arr[pos];
                arr[pos] = arr[i ];
                arr[i ] = temp;
            }
        }
        return arr;
    }

    public int mergeSort(int[] arr, int x){
        int pos = 0;
        for(int i=0;i<arr.length;i++){
            if (arr[i] == x){
                pos = i;
                break;
            }
        }
        return pos;
    }

    public int quickSort(int[] arr, int x){
        int pos = 0;
        for(int i=0;i<arr.length;i++){
            if (arr[i] == x){
                pos = i;
                break;
            }
        }
        return pos;
    }

    public int countingSort(int[] arr, int x){
        int pos = 0;
        for(int i=0;i<arr.length;i++){
            if (arr[i] == x){
                pos = i;
                break;
            }
        }
        return pos;
    }

}
