package com.ponagayba;


public class BinarySearch {

    public static int search(int[] a, int key) {
        int low = 0;
        int high = a.length-1;

        while (low <= high) {
            int mid = (low + high) >>> 1;

            if (a[mid] == key)
                return mid;

            if (a[mid] > a[low] && a[mid] < a[high] && a[low] < a[high]) {
                if (key < a[mid])
                    high = mid-1;
                else
                    low = mid+1;
            } else if (a[mid] > a[low] && a[mid] > a[high] && a[low] > a[high]) {
                if (key < a[mid] && key >= a[low])
                    high = mid-1;
                else
                    low = mid+1;
            } else {
                if (key < a[mid] && key >= a[low] || key == a[low])
                    high = mid-1;
                else
                    low = mid+1;
            }
        }
        return -(low + 1);
    }
}

// 123  m>l, m<h, l<h
// 231  m>l, m>h, l>h
// 312  m<l, m<h, l>h