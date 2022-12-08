package com.dsa.sorting;

import java.util.Arrays;

/**
 *
 * @author user
 */
public class selection_sort {

    public static void main(String[] args) {
        int arr[] = {0, 1, 8, 2, 1, -4, 0, 5};
//        int arr[] = {-4, 0, 0, 1, 1, 2, 5, 8};
//        int arr[] = {34, 11, 23, 12, 1};

        /*Find the minimum element and swap element with that
            It mainntains two subarrays in a given array.
        1. The subarray which is already sorted.
        2. Remaining subarray which is unsorted.*/
        System.out.println("arrays is : " + Arrays.toString(arr));
        int min;
        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }

            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
            
            /*issue with without using 3rd variable*/
            
//            arr[i] = arr[i] + arr[min];
//            arr[min] = arr[i] - arr[min];
//            arr[i] = arr[i] - arr[min];

        }
        System.out.println("Sorted arrays is : " + Arrays.toString(arr));
    }
}
