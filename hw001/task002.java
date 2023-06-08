// Задание:
// Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
// Пункты реализовать в методе main
// *Пункты реализовать в разных методах
// int i = new Random().nextInt(k);

package hw001;

import java.util.Random;

public class task002 {

  public static void main(String[] arg) {

    int max = 2000;
    int count = 0;
    int i = new Random().nextInt(0, max + 1);
    System.out.printf("Случайное число в диапазоне от 0 до %d: %d\n", max, i);
    int n = bit(i, max);
    System.out.printf("Номер старшего значащего бита выпавшего числа: %d\n", n);

    while (max / 2 != 0) {
      max = max / 2;
      count = count + 1;
    }
  }

  public static int bit(int num, int c) {
    int degree = 1 << c;
    while (num < degree) {
      degree >>= 1;
    }
    return degree;
  }

}
