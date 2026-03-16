package com.github.dsa.algorithm;

import java.util.Arrays;

public class MergeSort<T extends Comparable<T>> implements SortAlgorithm<T> {

    @Override
    public void sort(T[] array) {
        if (array.length < 2) return;
        
        int mid = array.length / 2;
        T[] left = Arrays.copyOfRange(array, 0, mid);
        T[] right = Arrays.copyOfRange(array, mid, array.length);

        sort(left);
        sort(right);

        merge(array, left, right);
    }

    private void merge(T[] result, T[] left, T[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i].compareTo(right[j]) <= 0) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }
        while (i < left.length) result[k++] = left[i++];
        while (j < right.length) result[k++] = right[j++];
    }

    @Override
    public String getAlgorithmName() {
        return "Merge Sort (O(n log n))";
    }
}
