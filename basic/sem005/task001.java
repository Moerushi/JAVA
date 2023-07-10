// Создать словарь ключ / число. Значение случайное число. Вывести пары в консоль.

package sem005;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class task001 {

  public static void main(String[] args) {

    Map<Integer, Integer> someDict = new HashMap<>();
    for (int i = 0; i < 10; i++) {
      someDict.put(new Random().nextInt(10), new Random().nextInt(100, 1000));
    }
    for (var item : someDict.entrySet()) {
      System.out.printf("Ключ: %d Значение: %d \n", item.getKey(), item.getValue());
    }

  }

}
