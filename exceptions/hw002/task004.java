// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

package exceptions.hw002;

import java.util.Scanner;

public class task004 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите текст: ");
    boolean flag = false;
    while (!flag) {
      try {
        String str = sc.nextLine();
        if (str.isEmpty() || str.equals(" ")) {
          throw new RuntimeException("Вы не ввели данные. Пустые строки вводить нельзя! Введите текст: ");
        } else {
          System.out.println("Введенный текст: " + str);
        }
        flag = true;
      } catch (RuntimeException e) {
        System.out.println(e.getMessage());
      }
    }
    sc.close();
  }
}
