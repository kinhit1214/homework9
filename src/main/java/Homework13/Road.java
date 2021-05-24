package Homework13;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class Road extends Stage {
    private int carCount;
    CyclicBarrier barrier;
    public Road(int length,int carCount) {
        this.length = length;
        this.description = "Дорога " + length + " метров";
        this.barrier = new CyclicBarrier(carCount);
    }

    public Road(int length){
        this(length,1);
    }


    @Override
    public void go(Car c) {

        try {
            System.out.println(c.getName() + " начал этап: " + description);
            Thread.sleep(length / c.getSpeed() * 1000);
            System.out.println(c.getName() + " закончил этап: " + description);
        } catch (InterruptedException   e) {
            e.printStackTrace();
        }
    }
}
