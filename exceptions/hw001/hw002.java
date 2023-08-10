package exceptions.hw001;

import java.util.Arrays;

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class hw002 {
  public static void main(String[] args) {
    int[] a = {};
    int[] b = {};

    if (args.length == 0) {
      // При отправке кода на Выполнение, вы можете варьировать эти параметры
      a = new int[] { 4, 5, 6 };
      b = new int[] { 1, 2, 3, 4};
    } else {
      a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
      b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
    }

    Answer1 ans = new Answer1();
    String itresume_res = Arrays.toString(ans.subArrays(a, b));
    System.out.println(itresume_res);
  }
}

class Answer1 {
  public int[] subArrays(int[] a, int[] b) {
    if (a.length == b.length) {
      int[] resArr = new int[a.length];
      for (int i = 0; i < a.length; i++) {
        resArr[i] = a[i] - b[i];
      }
      return resArr;
    } else {
      int[] resArr = { 0 };
      return resArr;
    }

  }
}
