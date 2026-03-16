package com.github.dsa.algorithm;

public interface SortAlgorithm<T extends Comparable<T>> {
    void sort(T[] array);
    String getAlgorithmName();
}
