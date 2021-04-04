package homework;

public class Lesson1 {

    public static void main(String args[]){

        byte q = 34;
        short w = 1234;
        int x,y,z;
        long l = 34223;
        char s = 23;
        float a,b,c,d;
        double v = 423.265;
        boolean t = true;
        x = 5;
        y = 8;
        z = 20;
        a = 45f;
        b = 24f;
        c = 675f;
        d = 0f;
        if (d!=0) {
            System.out.println(calculate(4f, 6f, 7f, 13f));
        }
        else System.out.println("На ноль делить нельзя");
        System.out.println(task10and20(x,y));
        isPositiveOrNegative(x);
        System.out.println(isNegative(y));
        greetings("Саша");
        leapYear(2020);


    }

    public static float calculate(float a,float b, float c,float d){
            return  a*(b+(c/d));

    }

    public static boolean task10and20(int x1, int x2) {
        if ((x1+x2)<20 && (x1+x2)>10){
            return true;
        } return false;
    }

    public static void isPositiveOrNegative(int x) {
        if(x < 0) {
            System.out.println("Число является отрицательным");
        } else {
            System.out.println("Число является положительным");
        }
    }
    public static boolean isNegative(int x) {
        if(x < 0) {
            return true;
        }
        return false;
    }
    public static void greetings(String name) {
        System.out.println("Привет," +name);
    }

    public static void leapYear(int x){
        if ((x % 4)!=0 || ((x % 400) != 0 && (x % 100) == 0)){
            System.out.println("Не является високосным годом");
        } else
             System.out.println("Является високосным годом");
    }

}