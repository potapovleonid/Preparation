package ru.home.des.lesson03;

public class PingPong {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            public void run() {
                int count = 0;
                try {
                    while (count != 5) {
                        System.out.println("Ping");
                        count++;
                        Thread.sleep(2000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(new Runnable() {
            public void run() {
                int count = 0;
                try {
                    Thread.sleep(500);
                    while (count != 5) {
                        System.out.println("Pong");
                        count++;
                        Thread.sleep(2000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

}
