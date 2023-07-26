// Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив. 
// Метод должен пройтись по каждому элементу и проверить что он не равен null. 
// А теперь реализуйте следующую логику:
// Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
// Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”

package exceptions.sem001;

public class ex004 {

  public static void main(String[] args) {
    Integer[] someArray = { 1, 2, 2, 4, 3, 6 };
    try {
      checkArray(someArray);
    } catch (RuntimeException e) {
      System.out.println(e.getMessage());
    }

  }

  public static void checkArray(Integer[] arr) {
    StringBuilder sb = new StringBuilder("Null ");
    Boolean flag = false;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == null) {
        sb.append(i);
        flag = true;
      }
    }
    if (flag) {
      throw new RuntimeException(sb.toString());
    }
  }

}
