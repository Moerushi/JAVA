// Создать два словаря. Ключи - случайные числа, значение для первого словаря мужские имена, а для второго женские. Вывести мужские и женские имена только если в обоих словарях есть соотвествующий ключ.
// Лучше сделать через enum.

package sem005;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class task003 {

  public static void main(String[] args) {

    String[] maleNames = new String[] { "Артем", "Арсений", "Марк", "Александр", "Евгений", "Кирилл" };
    String[] femaleNames = new String[] { "Клавдия", "Зоя", "Тамара", "Ксения", "Нина", "Алевтина" };

    Map<Integer, String> males = FillList(maleNames);
    Map<Integer, String> females = FillList(femaleNames);

    PrintToCheck(males);
    System.out.println("~".repeat(20));
    PrintToCheck(females);
    System.out.println("~".repeat(20));
    System.out.println("Результат работы программы:");
    DoNewList(males, females);
  }

  public static Map<Integer, String> FillList(String[] list) {
    int count = 0;
    Map<Integer, String> arr = new HashMap<>();
    while (arr.size() != 6) {
      int rn = new Random().nextInt(10);
      if (!arr.keySet().contains(rn)) {
        arr.put(rn, list[count]);
        count += 1;
      }
    }
    return arr;
  }

  public static void PrintToCheck(Map<Integer, String> dict) {
    for (var item : dict.entrySet()) {
      System.out.printf("Ключ: %d Значение: %s \n", item.getKey(), item.getValue());
    }
  }

  public static void DoNewList(Map<Integer, String> dict1, Map<Integer, String> dict2) {
    
    for (int item : dict1.keySet()) {
      if (dict2.containsKey(item)) {
        System.out.printf("Мужской словарь - Ключ: %d Значение: %s \n", item, dict1.get(item));
        System.out.printf("Женский словарь - Ключ: %d Значение: %s \n", item, dict2.get(item));
        System.out.println("~".repeat(20));
      }
    }

  }
}
