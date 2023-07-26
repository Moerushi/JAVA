// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.

package exceptions.hw002;

import java.util.Scanner;

public class task001 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите дробное число: ");
    System.out.println("Ваше дробное число: " + getFloat(sc));
  }

  public static float getFloat(Scanner sc) {
    String userStr = sc.nextLine();
    try {
      float num = Float.parseFloat(userStr);
      return num;
    } catch (NumberFormatException e) {
      System.out.println("Ваше число некорректно. Введите корректное число: ");
      return getFloat(sc);
    }
  }
}
