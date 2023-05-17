package com.kumar;

public class tut72_threadcycle {
        public static void main(String[] args) {
            Thread thread1 = new Thread(new MyThread("Thread 1"));
            Thread thread2 = new Thread(new MyThread("Thread 2"));
            Thread thread3 = new Thread(new MyThread("Thread 3"));
            try {
                thread1.start();
                thread2.start();
                thread3.start();
                thread1.join();
                thread2.join();
                thread3.join();
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
            System.out.println("All threads have finished executing.");
        }

        private static class MyThread implements Runnable {
            private final String threadName;

            public MyThread(String threadName) {
                this.threadName = threadName;
            }

            public void run() {
                try {
                    for (int i = 0; i < 5; i++) {
                        System.out.println(threadName + " is running. Count: " + i);
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    System.out.println(threadName + " was interrupted: " + e.getMessage());
                }
                System.out.println(threadName + " has finished executing.");
            }
        }
    }

