package com.dsa.sorting;

import java.util.Arrays;

/**
 *
 * @author hashstudioz
 */
public class insertion_sort {

    public static void main(String[] args) {
        int arr[] = {0, 1, 8, 2, 1, -4, 0, 5};
//        int arr[] = {-4, 0, 0, 1, 1, 2, 5, 8};
//        int arr[] = {34, 11, 23, 12, 1};

        /*Its start at the 1 index */
        System.out.println("arrays is : " + Arrays.toString(arr));
        int temp, j;
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            j = i;
            while (j > 0 && arr[j - 1] > temp) {
                arr[j] = arr[j - 1];
                j = j - 1;
            }
            arr[j] = temp;
        }
        System.out.println("arrays is : " + Arrays.toString(arr));
    }
}
