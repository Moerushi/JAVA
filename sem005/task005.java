// Создать словарь. Ключ - индекс, значение - случайное число. Заменить значения их квадратами. Реализовать замену значения без циклов.

package sem005;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class task005 {

  public static void main(String[] args) {

    Map<Integer, Integer> primaryList = new HashMap<>();
    int finalCount = new Random().nextInt(1, 10);
    for (int i = 0; i < finalCount; i++) {
      primaryList.put(i, new Random().nextInt(10));
    }

    System.out.println("Итоговый перечень:");
    primaryList.forEach((k,v) -> { // лямбда выражение
      primaryList.replace(k, v, v*v);
      System.out.printf("Квадрат числа %d = %d\n", v, v*v);
    });

  }

}
