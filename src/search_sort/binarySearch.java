package search_sort;

import java.util.Scanner;

public class binarySearch {
    public static int binarySearch(int[] array,int element) {
        int start =0;
        int end = array.length - 1;
        int mid=0;
        while(start<=end) {
            mid = (start+end)/2;
            if(array[mid]==element) {
                return mid;
            } else if (array[mid]>element) {
                end = mid-1;
            } else {
                start = mid + 1;
            }
        }
        return mid;
    }
    public static void main(String[] args) {
        int[] arr = new int[5];
        int element = 0;
        Scanner s = new Scanner(System.in);

        for(int i =0;i<5;i++) {
            arr[i] = s.nextInt();
        }
        for (int i=0;i<5;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Enter the element to search: ");
        element = s.nextInt();
        System.out.print(binarySearch(arr,element));
    }

}
