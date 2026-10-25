// Java program demonstrating multithreading using both approaches:
// 1. Extending Thread
// 2. Implementing Runnable
//
// Run with: javac Java_Multithreading.java
//           java Java_Multithreading

class GoodMorningThread extends Thread {
    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            System.out.println("Good Morning");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class HelloThread extends Thread {
    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            System.out.println("Hello");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class WelcomeThread extends Thread {
    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            System.out.println("Welcome");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class GoodMorningRunnable implements Runnable {
    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            System.out.println("Good Morning");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class HelloRunnable implements Runnable {
    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            System.out.println("Hello");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class WelcomeRunnable implements Runnable {
    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            System.out.println("Welcome");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class Java_Multithreading {
    public static void main(String[] args) {
        // Method 1: Extending Thread class
        Thread goodMorning1 = new GoodMorningThread();
        Thread hello1 = new HelloThread();
        Thread welcome1 = new WelcomeThread();

        goodMorning1.start();
        hello1.start();
        welcome1.start();

        // Method 2: Implementing Runnable interface
        Thread goodMorning2 = new Thread(new GoodMorningRunnable());
        Thread hello2 = new Thread(new HelloRunnable());
        Thread welcome2 = new Thread(new WelcomeRunnable());

        goodMorning2.start();
        hello2.start();
        welcome2.start();
    }
}
