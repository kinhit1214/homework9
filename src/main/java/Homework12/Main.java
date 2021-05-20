package Homework12;

import java.util.HashMap;

public class Main {
    static final int SIZE = 100000;
    static final int H = SIZE/2;
    static float[] arr = new float[SIZE];
    static float[] a2 = new float[H];
    static float[] a1 = new float[H];

    public static void main(String[] args) {
        methodOne();
        methodTwo();
    }

    private static void methodTwo() {
        Thread start = new Thread(new InitArr());
        start.start();
        try {
            start.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        long o = System.currentTimeMillis();
        System.arraycopy(arr, 0, a1, 0, H);
        System.arraycopy(arr, H, a2, 0, H);
        Thread t1 = new Thread(()-> {
            for (int i = 0; i < H; i++)
                a1[i] = (float) (a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        });
        Thread t2 = new Thread(()-> {
            for (int i = 0; i < H; i++)
                a2[i] = (float) (a2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.arraycopy(a1, 0, arr, 0, H);
System.arraycopy(a2, 0, arr, H, H);
        System.out.println(System.currentTimeMillis() - o);
    }

    public static class InitArr extends Thread {

        @Override
        public void run() {
            for (float a : arr) a = 1f;
        }
    }


    private static void methodOne() {

        float[] arr = new  float[SIZE];
        for (float a: arr) a = 1;
        long o = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++)
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));

        System.out.println(System.currentTimeMillis() - o);
    }




}
