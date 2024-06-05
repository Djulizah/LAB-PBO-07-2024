package TP8;

import java.util.concurrent.ExecutorService; //(thread pool).
import java.util.concurrent.Executors; //method utk membuat ExecutorService.
import java.util.Random; // angka acak

class TaskTimeHelper { //hasilkan angka acak antr 1-6
    public static int waktuRandom() {
        return new Random().nextInt(6) + 1;
    }
}

class Task implements Runnable { 
    final int time1;
    final int time2; 

    public Task(int time1, int time2) {
        this.time1 = time1;
        this.time2 = time2;
    }

    public Task(int time1) {
        this(time1, 0);
    }

    @Override
    public void run() { //mmnggil executeTask untuk time1 dan time2
        try {
            executeTask(time1);
            if (time2 > 0) {
                executeTask(time2);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void executeTask(int time) throws InterruptedException {//mengatur jeda
        Thread.sleep(time * 1000);
        TP8_1_H071231076.incrementDone();
        if (time >= 5) {
            System.out.println("Request Timeout (" + time + "s)");
            TP8_1_H071231076.incrementFailed();
        }
    }
}

class UiThread implements Runnable {
    @Override
    public void run() { //menghitung wktu dlm detik n memeriksa semua tugas
        System.out.println("Start load 4 Data");
        for (int i = 1; i <= 12; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("Loading... (" + i + "s)");
                if (TP8_1_H071231076.isAllTasksDone()) {
                    System.out.println("\nTask Finish.");
                    System.out.println("Time Execution: " + i + "s");
                    TP8_1_H071231076.printSummary();
                    break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class TP8_1_H071231076 extends TaskTimeHelper {
    private static int failed = 0;
    private static int done = 0;

    public static synchronized void incrementFailed() { 
        failed++;
    }

    public static synchronized void incrementDone() {
        done++;
    }

    public static synchronized boolean isAllTasksDone() {
        return done == 4;
    }

    public static synchronized void printSummary() {
        if (failed > 0) {
            System.out.println((4 - failed) + " Data Successfully loaded & " + failed + " Data failed to load");
        } else {
            System.out.println("All data is successfully loaded");
        }
    }

    public static void main(String[] args) {
        Task task1 = new Task(waktuRandom(), waktuRandom());
        Task task2 = new Task(waktuRandom());
        Task task3 = new Task(waktuRandom());

        System.out.println("Task 1    : " + task1.time1);
        System.out.println("Task 2    : " + task1.time2);
        System.out.println("Task 3    : " + task2.time1);
        System.out.println("Task 4    : " + task3.time1);
        System.out.println();

        ExecutorService executor = Executors.newFixedThreadPool(4);
        executor.submit(new UiThread());
        executor.submit(task1);
        executor.submit(task2);
        executor.submit(task3);
        executor.shutdown();
    }
}
