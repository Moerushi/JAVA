// Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4. При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
// Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
// В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException и вывести результат расчета (сумму элементов, при условии что подали на вход корректный массив).

package exceptions.sem003;

import java.io.IOException;

public class task004 {

  public static void main(String[] args) throws MyArraySizeException {

    String[][] arrayStr = { { "1", "2", "3", "4" }, { "1", "f", "3", "4" }, { "1", "2", "3", "4" },
        { "1", "2", "3", "4" }};
    try {
      System.out.println(sumArrayFourToFour(arrayStr));
    } catch (MyArraySizeException | MyArrayDataException e) {
      System.out.println(e.getMessage());
    }

  }

  public static int sumArrayFourToFour(String[][] arr) throws MyArraySizeException {
    int sum = 0;
    if (arr.length != 4 || arr[0].length != 4) {
      throw new MyArraySizeException(arr.length, arr[0].length);
    } else {
      for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[0].length; j++) {
          try {
            sum += Integer.parseInt(arr[i][j]);
          } catch (NumberFormatException e) {
            throw new MyArrayDataException(i, j);
          }
        }
      }
    }
    return sum;
  }

}

class MyArraySizeException extends IOException {
  public MyArraySizeException(int rows, int columns) {
    super("Некорректный массив. Нужно 4х4. Ваш " + rows + "x" + columns);
  }
}

class MyArrayDataException extends NumberFormatException {
  public MyArrayDataException(int indexRow, int indCol) {
    super("Невозможно преобразовать строку, неходящиеся в ячейке [" + indexRow + "," + indCol + "]");
  }
}
