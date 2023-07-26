// Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив. 
// Необходимо посчитать и вернуть сумму элементов этого массива. 
// При этом накладываем на метод 2 ограничения: метод может работать только с квадратными массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать только значение 0 или 1. 
// Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.

package exceptions.sem001;

public class ex003 {

  public static void main(String[] args) {
    int[][] twoDimArr = { { 1, 0, 1 }, { 3, 1, 1 }, { 1, 1, 1 } };
    try {
      System.out.println(checkArr(twoDimArr));

    } catch (RuntimeException e) {
      System.out.println(e.getMessage());
    }
  }

  public static int checkArr(int[][] arr) {
    if (arr.length != arr[0].length) {
      throw new RuntimeException("Массив не квадратный " + arr.length + " " + arr[0].length);
    }
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        if (arr[i][j] != 0 && arr[i][j] != 1) {
          throw new RuntimeException("Некорректное значение " + arr[i][j] + "." + " i: " + i + " j: " + j);
        }
        sum += arr[i][j];
      }
    }
    return sum;
  }

}
