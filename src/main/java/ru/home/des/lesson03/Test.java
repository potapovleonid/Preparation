package ru.home.des.lesson03;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        final MyCounter counter = new MyCounter();
        ExecutorService service = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 10; i++) {
            service.execute(() -> {
                for (int j = 0; j < 500; j++) {
                    counter.increment();
                }
            });
        }

        service.shutdown();
        service.awaitTermination(5, TimeUnit.MINUTES);
        counter.printCount();
    }

}
