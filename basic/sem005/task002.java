// Создать словарь пары ключ / значение и вывести все пары, значени которых кратно трем. Не пользуясь методом entrySet

package sem005;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class task002 {

  public static void main(String[] args) {

    Map<Integer, Integer> someDict = new HashMap<>();
    for (int i = 0; i < 10; i++) {
      someDict.put(new Random().nextInt(10), new Random().nextInt(100, 1000));
    }
    for (var item : someDict.entrySet()) {
      System.out.printf("Ключ: %d Значение: %d \n", item.getKey(), item.getValue());
    }
    System.out.println("~".repeat(15));

    for (int key : someDict.keySet()) {
      if (someDict.get(key) % 3 == 0) {
        System.out.printf("Ключ: %d Значение: %d\n", key, someDict.get(key));
      }
    }

  }

}
