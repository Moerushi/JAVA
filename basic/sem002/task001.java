// Сравнить две строки
// Сравнить две строки, одна из который читается в одном порядке, а другая в обратном
// Дана строка ".34 + 2.66 =". Необходимо вычислить.

package sem002;

import java.util.Arrays;
import java.util.Scanner;

public class task001 {

  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  System.out.println("Введите первую строку: ");
  String s1 = scanner.nextLine();
  System.out.println("Введите вторую строку: ");
  String s2 = scanner.nextLine();
  System.out.println(s1.equals(s2));
  scanner.close();

  System.out.println(
  s1.equals(
  new StringBuilder(s2)
  .reverse()
  .toString()));
  }

  public static void main1(String[] args) {
    String str = ".34 + 2.66 =";
    System.out.println(Arrays.toString(str.split(" ")));
    double a = Double.parseDouble(str.split(" ")[0]) + Double.parseDouble(str.split(" ")[2]);
    System.out.println(a);
  }
}