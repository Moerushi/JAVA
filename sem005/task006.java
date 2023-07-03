// Создать словарь. Ключ - индекс, значение - случайное число. Заменить значения их квадратами. Реализовать замену значения без циклов и forEach.

package sem005;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class task006 {

  public static void main(String[] args) {

    Map<Integer, Integer> primaryList = new HashMap<>();
    int finalCount = new Random().nextInt(1, 10);
    for (int i = 0; i < finalCount; i++) {
      primaryList.put(i, new Random().nextInt(10));
    }

    System.out.println("Итоговый перечень:");
    primaryList.replaceAll((k, v) -> (v*v)); // позволяет менять значения чере лямбда выражение
    primaryList.forEach((k,v) -> System.out.printf("Квадрат числа = %d\n", v));
}
}
