// Пусть дан произвольный список целых чисел.
// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение

package hw003;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class task001 {

  public static void main(String[] args) {

    // сформировали произвольный список целых чисел
    ArrayList<Integer> someArray = new ArrayList<Integer>();
    for (int i = 0; i < (new Random().nextInt(10,20)); i++) {
      someArray.add(new Random().nextInt(100));
    }
    System.out.printf("Первоначальный список: %s \n", someArray);
    // удалили все четные числа
    for (int i = 0; i < someArray.size(); i++) {
      if (someArray.get(i) % 2 != 0) {
        someArray.remove(i);
      }
    }
    System.out.printf("Список без нечетных чисел: %s \n", someArray);

    // нашли максимальное
    someArray.sort(Comparator.naturalOrder());
    System.out.printf("Максимальное значение: %d \n", someArray.get(someArray.size()-1));
    // нашли минимальное
        System.out.printf("Минимальное значение: %d \n", someArray.get(0));
    // нашли среднее
    Float sum = 0f;
    for (int i = 0; i < someArray.size(); i++) {
      sum += someArray.get(i);
    }
    System.out.printf("Среднее значение: %.2f \n", sum/someArray.size());
  }

}
