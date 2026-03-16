package com.github.dsa.utils;

public class PerformanceTimer {
    private long startTime;

    public void start() {
        startTime = System.nanoTime();
    }

    public long stop() {
        return System.nanoTime() - startTime;
    }

    public static String formatTime(long nanos) {
        return nanos / 1_000_000.0 + " ms";
    }
}
