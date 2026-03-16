package com.github.dsa;

import com.github.dsa.algorithm.BubbleSort;
import com.github.dsa.algorithm.MergeSort;
import com.github.dsa.algorithm.SortAlgorithm;
import com.github.dsa.utils.PerformanceTimer;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== DSA Algorithm Analyzer ===");
        System.out.println("1. Test Sorting Algorithms");
        System.out.print("Choose option: ");
        
        int choice = scanner.nextInt();
        
        if (choice == 1) {
            runSortingDemo();
        } else {
            System.out.println("Invalid option.");
        }
    }

    private static void runSortingDemo() {
        // Generate random data
        Integer[] data = generateRandomArray(10000);
        
        // We clone the array so both algorithms sort the exact same data
        Integer[] dataForBubble = data.clone();
        Integer[] dataForMerge = data.clone();

        // 1. Bubble Sort
        SortAlgorithm<Integer> bubbleSort = new BubbleSort<>();
        runTest(bubbleSort, dataForBubble);

        // 2. Merge Sort
        SortAlgorithm<Integer> mergeSort = new MergeSort<>();
        runTest(mergeSort, dataForMerge);
    }

    private static void runTest(SortAlgorithm<Integer> algorithm, Integer[] data) {
        PerformanceTimer timer = new PerformanceTimer();
        
        System.out.println("\nRunning: " + algorithm.getAlgorithmName());
        timer.start();
        algorithm.sort(data);
        long duration = timer.stop();
        
        System.out.println("Time taken: " + PerformanceTimer.formatTime(duration));
        // Uncomment below to print sorted array (only for small arrays!)
        // System.out.println("Result: " + Arrays.toString(data));
    }

    private static Integer[] generateRandomArray(int size) {
        Random rand = new Random();
        Integer[] arr = new Integer[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(100000);
        }
        return arr;
    }
}
