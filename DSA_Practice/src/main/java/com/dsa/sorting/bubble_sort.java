package com.dsa.sorting;

import java.util.Arrays;

/**
 *
 * @author hashstudioz
 */
public class bubble_sort {

    public static void main(String[] args) {
        int arr[] = {0, 1, 8, 2, 1,-4, 0, 5};
//        int arr[] = {-4, 0, 0, 1, 1, 2, 5, 8};
        int temp = 0;
        boolean flag = false;

        System.out.println("arrays is : " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
//                    temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;

                    /*Swaping the element without using 3rd variable*/
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];

                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
        System.out.println("Sorted arrays is : " + Arrays.toString(arr));

    }
}
