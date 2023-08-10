package exceptions.sem003;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class task003 {
  public static void main(String[] args) throws MyFileNotFound {
    try {
      int a = 1;
      int b = 1; // для ошибки поменять на 0
      System.out.println(a / b);
    } catch (ArithmeticException e) {
      try {
        throw new DividionByZero();
      } catch (DividionByZero z) {
        System.out.println(z.getMessage());
      }
    }

    int i = 0;
    try {
      Integer[] arr = { 1, 2, 3, 4, 5, 6 }; // для ошибки поменять на null одно из значений
      for (i = 0; i < arr.length; i++) {
        arr[i]++;
        System.out.println(arr[i]);
      }
    } catch (NullPointerException e) {
      try {
        throw new NullPointerArray(i);
      } catch (NullPointerArray z) {
        System.out.println(z.getMessage());
      }

    }

    String path = "text.txt"; // для ошибки поменять на несуществующий файл
    try {
      FileReader fr = new FileReader(path);
      System.out.println(fr);
    } catch (FileNotFoundException e) {
      throw new MyFileNotFound(path);
    }

  }
}

class DividionByZero extends ArithmeticException {

  public DividionByZero() {
    super("Деление на 0 запрещено!");
  }
}

class NullPointerArray extends NullPointerException {
  public NullPointerArray(int index) {
    super("Обращение к пустому элементу массива # " + index);
  }

  public NullPointerArray() {
    super("Обращение к пустому элементу массива");
  }
}

class MyFileNotFound extends FileNotFoundException {
  public MyFileNotFound(String path) {
    super("Файл не найден " + path);
  }

  public MyFileNotFound() {
    super("Файл не найден");
  }
}