package homework11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Directory {

    HashMap<String, ArrayList> phoneDirectory = new HashMap<>();

    public Directory() {
    }

    void add(String family, String... numbers){
        for (String number:
             numbers) {
            add(family,number);
        }
    }

    void add(String family, String number){
        try {
            Integer.parseInt(number);
        }catch (NumberFormatException e){
            System.out.println("Такого номера не может существовать: " +number);
            return;
        }
        for (Map.Entry<String, ArrayList> o : phoneDirectory.entrySet()){
            if (family.equals(o.getKey())){
                phoneDirectory.get(family).add(number);
                return;
            }
        }
        ArrayList<String> numbers = new ArrayList<>();
        numbers.add(number);
        phoneDirectory.put(family,numbers);
    }

    protected void get(String family){
        System.out.println("Фамилия " + family + "\n номер телефона: "+ phoneDirectory.get(family));
    }
    protected void display(){
        for (Map.Entry<String, ArrayList> o : phoneDirectory.entrySet()){
            System.out.println("Фамилия " + o.getKey() + "\n номер телефона: "+ o.getValue());
        }
    }
}
