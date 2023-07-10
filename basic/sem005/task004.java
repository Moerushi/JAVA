// Создать словарь. Ключ - индекс, значение - случайное число. Заменить значения их квадратами.

package sem005;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class task004 {

  public static void main(String[] args) {

    Map<Integer, Integer> primaryList = new HashMap<>();
    int finalCount = new Random().nextInt(10, 20);
    for (int i = 0; i < finalCount; i++) {
      primaryList.put(i, new Random().nextInt(10));
    }

    System.out.println("Первоначальный перечень:");
    for (var item : primaryList.entrySet()) {
      System.out.printf("Ключ: %d Значение: %s \n", item.getKey(), item.getValue());
    }

    for (int i = 0; i < finalCount; i++) {
      primaryList.replace(i, primaryList.get(i) * primaryList.get(i));
    }

    System.out.println("Итоговый перечень:");
    for (var item : primaryList.entrySet()) {
      System.out.printf("Ключ: %d Значение: %s \n", item.getKey(), item.getValue());
    }

  }

}
