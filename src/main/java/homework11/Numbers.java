package homework11;

import java.util.ArrayList;

public class Numbers {

    String family;

    ArrayList<String> numbers = new ArrayList<>();

    public Numbers(String family) {
     this.family = family;
    }

    private void add(String number){
        numbers.add(number);
    }

}
