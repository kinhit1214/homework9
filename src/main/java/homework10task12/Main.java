package homework10task12;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList arr1 = new ArrayList();
        int[] arr = {1,2,3,4,5};
        moving(arr,1,3);
        arr1 = arrayList(arr,arr1);
        arr1.add(" d");
        for (var a:
                arr1) {
            System.out.print(a+ " ");
        }
    }

    public static void display(int[] array){
        for (int a:
                array) {
            System.out.print(a+ " ");
        }
    }


    private static ArrayList arrayList(int[] arr,ArrayList arr1) {
        for (int a:
             arr) {
            arr1.add(a);
        }
        return arr1;
    }

    private static int[] moving(int[] arr, int i, int j) {
        int t;
        t=arr[i];
        arr[i] = arr[j];
        arr[j] = t ;
        return arr;
    }
}
