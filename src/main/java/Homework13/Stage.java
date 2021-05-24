package Homework13;

import java.util.concurrent.CyclicBarrier;

public abstract class Stage {
    private int carCount;
    protected int length;
    protected String description;
    public String getDescription() {
        return description;
    }
    public abstract void go(Car c);
}

