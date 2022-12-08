package com.dsa.sorting;

import java.util.Arrays;

/**
 *
 * @author user
 */
public class bubble_sort {

    public static void main(String[] args) {
//   int arr[] = {0, 1, 8, 2, 1,-4, 0, 5};
        int arr[] = {};
//        int arr[] = {-4, 0, 0, 1, 1, 2, 5, 8};
        int temp = 0;
        boolean flag = false;
        
        /* Run a nested for loop to traverse the input array using two variables i and j, such that 0 ≤ i < n-1 and 0 ≤ j < n-i-1
            If arr[j] is greater than arr[j+1] then swap these adjacent elements, else move on
            Print the sorted array
        */
        System.out.println("arrays is : " + Arrays.toString(arr));
        if(arr.length==0){
            System.err.println("Array can't be blank");
            return;
        }
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
    
    /*Worst and Average Case Time Complexity: O(N2). 
    The worst case occurs when an array is reverse sorted.
    Best Case Time Complexity: O(N). The best case occurs when an array is already sorted.
    Auxiliary Space: O(1)*/
}
