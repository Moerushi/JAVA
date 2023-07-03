// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами, их необходимо считать, как одного человека с разными телефонами. Вывод должен быть отсортирован по убыванию числа телефонов. Нельзя использовать class. Имя и телефон. Будет hashmap и внутри будет arrayList.

package hw005;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class task001 {

  public static void main(String[] args) {

    // создаем ключ String и список к каждому ключу
    HashMap<String, ArrayList<String>> telBook = new HashMap<>();
    // наполняем значениями
    addNumber(telBook, "Никита", "12-23-34");
    addNumber(telBook, "Сестра Никиты", "12-34-23");
    addNumber(telBook, "Никита", "+7-986-543-21-23");
    addNumber(telBook, "Сестра Никиты", "+7-898-767-65-56");
    addNumber(telBook, "Никита", "2387");
    addNumber(telBook, "Подруга Никиты", "90-87-65");

   // создаем список в который добавляем все ключи коллекции telBook
    ArrayList<String> list = new ArrayList<>();
    for (String item : telBook.keySet()) {
      list.add(item);
    }

    System.out.println(telBook);

     // сортировка списка с ключами по возрастанию через компортаор
    Collections.sort(list, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        return telBook.get(o1).size() - telBook.get(o2).size();
        // если одинаковые то 0
        // если o1 больше, то +1
        // если o1 меньше, то -1
      }
    });

    System.out.println(list);

  }

  private static void addNumber(HashMap<String, ArrayList<String>> telBook, String name, String number) {
    telBook.putIfAbsent(name, new ArrayList<>());
    telBook.get(name).add(number);
  }
}
