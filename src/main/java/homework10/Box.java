package homework10;

import java.util.ArrayList;

public class Box<F extends Fruit> {
    private ArrayList<F> box = new ArrayList<>();
    int countFruit = 0;

    public Box(){}

    public float getWeight(){
        try {
            return box.get(0).getWeight() * box.toArray().length;
        }catch (IndexOutOfBoundsException e) {
            System.out.println("Коробка пустая");
            return 0;
        }
    }

    public boolean compare(Box anotherBox) {
        if(getWeight() == anotherBox.getWeight())
            return true;
        return false;
    }

    public void addFruit(F fruit, int value){
        for(int i = 0;i < value;i++){
            box.add(fruit);
        }
    }

    public void moving(Box anotherBox) {
        try {
            anotherBox.addFruit(box.get(0), box.toArray().length);
            box.clear();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Из пустой коробки нельзя ничего пересыпать");
        }
    }
}