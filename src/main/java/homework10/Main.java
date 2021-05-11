package homework10;

public class Main {


    public static void main(String[] args) {

        Box<Orange> or = new Box<>();
        Box<Orange> or1 = new Box<>();
        Box<Apple> ap = new Box<>();
        Box<Apple> ap1 = new Box<>();

        or.addFruit(new Orange(), 2);
        or1.addFruit(new Orange(), 2);
        ap.addFruit(new Apple(), 1);
        ap1.addFruit(new Apple(), 2);
        testWeight(or,or1,ap,ap1);
        ap.moving(ap1);
        or.moving(or1);
    }

    private static void testWeight(Box<Orange> or, Box<Orange> or1, Box<Apple> ap, Box<Apple> ap1) {
        System.out.println(or.getWeight());
        System.out.println(or1.getWeight());
        System.out.println(ap.getWeight());
        System.out.println(ap1.getWeight());
    }


}
