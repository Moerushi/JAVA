package lection001;
import java.util.Scanner;

public class task001 {
  public static void main(String[] args) {
    String s = "Hello world!";
    Float a = 1.23f;
    Double b = 1.45;
    char ch = ']';
    var k = 123;
    var d = 123.456;
    System.out.println(s);
    System.out.println(getType(s));
    System.out.println(a);
    System.out.println(getType(a));
    System.out.println(b);
    System.out.println(getType(b));
    System.out.println(ch);
    System.out.println(getType(ch));
    System.out.println(k);
    System.out.println(getType(k));
    System.out.println(d);
    System.out.println(getType(d));

    System.out.println(Integer.MAX_VALUE);
    System.out.println(Integer.MIN_VALUE);

    int l = 8;
    System.out.println(l << 1);

    int num = 5;
    int num2 = 2;
    System.out.println(num|num2);

    int[] arr = new int[10];
    System.out.println(arr[1]);

    Scanner iScanner = new Scanner(System.in); // создали объект
    System.out.println("int a: "); // выводим текст запроса для ввода
    boolean flag = iScanner.hasNextInt(); // проверка на число
    System.out.println(flag); // выводим текст запроса для ввода
    int num4 = iScanner.nextInt(); // получаем текст
    System.out.printf("int a: %s\n", num4); // выводим текст через интерполяцию
    iScanner.close(); // закрываем считывание

  }
  static String getType(Object o) {
    return o.getClass().getSimpleName();
  }

}