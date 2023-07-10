// Задание:
// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package sem001;

import java.util.Scanner;

public class task001 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите число для вычисления n! и суммы числе от 1 до n:");
    int userNumber = scanner.nextInt();
    int resultFactorial = Factorial(userNumber);
    scanner.close();
    System.out.printf("Факториал числа %d = %d\n", userNumber, resultFactorial);
    System.out.println("~".repeat(20));
    int resultSum = Sum(userNumber);
    System.out.printf("Сумма чисел от 1 до %d = %d\n", userNumber, resultSum);
  }

  public static int Factorial(int num) {
    if (num == 1) {
      return 1;
    } else {
      return num * Factorial(num - 1);
    }
  }

  public static int Sum(int num) {
    if (num == 1) {
      return 1;
    } else {
      return num + Sum(num - 1);
    }
  }

}
