package homework11;

//1. Создать массив с набором слов (10-20 слов, среди которых должны встречаться повторяющиеся).
//   Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
//   Посчитать, сколько раз встречается каждое слово.
//2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
//   В этот телефонный справочник с помощью метода add() можно добавлять записи.
//   С помощью метода get() искать номер телефона по фамилии.
//   Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
//   тогда при запросе такой фамилии должны выводиться все телефоны.
//   Желательно как можно меньше добавлять своего, чего нет в задании (т.е. не надо в телефонную запись добавлять еще дополнительные поля (имя, отчество, адрес),
//    делать взаимодействие с пользователем через консоль и т.д.). Консоль желательно не использовать (в том числе Scanner),
//   тестировать просто из метода main(), прописывая add() и get().

import java.util.*;

public class Main {

    public static void main(String[] args) {
      //  testTaskOne();

        testTaskTwo();

    }

    private static void testTaskTwo() {
        Directory directory= new Directory();
        directory.add("Медведь","1234");
        directory.add("Медведь","3242");
        directory.add("Медведь","3764");
        directory.add("Заяц","6573");
        directory.add("Заяц","2346");
        directory.add("Кот","6573");
        directory.add("Пес","5623");
        directory.add("Кот","7432");
        directory.add("Кот","5425");
        directory.add("Белка","3032");
        directory.add("Корова","301");
        directory.add("Лошадь","0651","9324","4234d");

     //   directory.display();

        directory.get("Медведь");

    }

    private static void testTaskOne() {
        int count = 0;
        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            words.add(randomWord());
        }
        System.out.println(words);
        HashSet<String> uniqueWords = new HashSet<>();
        for (String word:
                words) {
            uniqueWords.add(word);
        }
        System.out.println(uniqueWords);
        HashMap<String,Integer> tablWord = new HashMap<>();
        for (String word:
                uniqueWords) {
            for (int i = 0; i <words.toArray().length; i++) {
                if (word.equals(words.get(i)))
                    count++;
            }
            tablWord.put(word,count);
            count = 0 ;
        }
        for (Map.Entry<String, Integer> o : tablWord.entrySet()) {
            System.out.println("Слово "+o.getKey() + " повторяется " + o.getValue());
        }
    }

    private static String randomWord() {
        String[] words = {"струна", "приют", "принц", "аккомпанемент", "ртуть",
                "лицо", "строгий", "образование", "отступать", "японец",
                "ложить", "колун", "гнев"};
        return words[(int)(Math.random()*12)];
    }
}
