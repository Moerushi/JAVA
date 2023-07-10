// Задание:
// Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
// Пункты реализовать в методе main
// *Пункты реализовать в разных методах
// int i = new Random().nextInt(k);

package hw001;

import java.util.Scanner;

public class task003 {

  public static void main(String[] arg){
  Scanner sc = new Scanner(System.in);
  System.out.println("Введите нижнюю границу: ");
  int min = sc.nextInt();
  int max = Short.MAX_VALUE; // 32767
  System.out.println("Введите число, которому необходимо найти все кратные значения:");
  int delNumber = sc.nextInt();
  System.out.println("Результат:");
  int[] userArray = new int[0];
  for (int i = min; i <= max; i++){
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
