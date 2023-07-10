// Задание:
// Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
// Пункты реализовать в методе main
// *Пункты реализовать в разных методах
// int i = new Random().nextInt(k);

package hw001;

import java.util.Scanner;

public class task004 {

  public static void main(String[] arg){
  Scanner sc = new Scanner(System.in);
  System.out.println("Введите верхнюю границу: ");
  int max = sc.nextInt();
  int min = Short.MIN_VALUE; // -32767
  System.out.println("Введите число, которому необходимо найти все кратные значения:");
  int delNumber = sc.nextInt();
  System.out.println("Результат:");
  int[] userArray = new int[0];
  for (int i = max; i >= min; i--){
    if (i%delNumber == 0){
      userArray = append(userArray);
      userArray[(userArray.length)-1] = i;
    }
  }
  sc.close();

  for (int i = 0; i < userArray.length; i++){
    System.out.println(userArray[i]);
  }
  }

  public static int[] append(int[] array) {
    int[] resultArray = new int[array.length + 1];
    System.arraycopy(array, 0, resultArray, 0, array.length);
    return resultArray;
  }

}
