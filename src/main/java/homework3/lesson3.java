package homework3;

import java.util.Scanner;

public class lesson3 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] arr){
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String Word = words[(int)(Math.random()*24)];
        System.out.println(Word);
        do {
            System.out.println("Попробуйте угадать слова!!!");
        }while (chekAnswer(Word) != true);

    }

    private static boolean chekAnswer(String Word) {
        String Answer = sc.next();
        if (Word.equals(Answer) == true){
            System.out.println("Поздравляем!!! Вы угадали слово" +
                                "\nПравильный ответ : " +Answer);
            return true;
        } else {
            System.out.println("К сожалению Вы не угадали(((");
            System.out.print("Буквы которые стоят на своих местах : ");
            for (int i = 0; i < 15; i++) {
                if ((i < Word.length()) && (i < Answer.length()))
                    System.out.print(Word.charAt(i)==Answer.charAt(i) ? Word.charAt(i):"*");
                else System.out.print("*");
            }
            System.out.println();
            return false;
        }
    }
}
