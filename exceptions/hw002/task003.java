// Дано:
// public static void main(String[] args) throws Exception {
//    try {
//        int a = 90;
//        int b = 3;
//        System.out.println(a / b);
//        printSum(23, 234);
//        int[] abc = { 1, 2 };
//        abc[3] = 9;
//    } catch (Throwable ex) {
//        System.out.println("Что-то пошло не так...");
//    } catch (NullPointerException ex) {
//        System.out.println("Указатель не может указывать на null!");
//    } catch (IndexOutOfBoundsException ex) {
//        System.out.println("Массив выходит за пределы своего размера!");
//    }
// }
// public static void printSum(Integer a, Integer b) throws FileNotFoundException {
//    System.out.println(a + b);
// }

package exceptions.hw002;

public class task003 {

  public static void main(String[] args) {
    try {
      int a = 90;
      int b = 1;
      System.out.println(a / b);
      printSum(23, 234);
      int[] abc = { 1, 2 };
      abc[1] = 9;
    } catch (ArithmeticException ex) { // если b = 0
      System.out.println("Делить на 0 нельзя!");
    } catch (NullPointerException ex) {
      System.out.println("Указатель не может указывать на null!");
    } catch (IndexOutOfBoundsException ex) {
      System.out.println("Массив выходит за пределы своего размера!");
    } catch (Throwable ex) { // переместил в конец
      System.out.println("Что-то пошло не так...");
  }
}

  public static void printSum(Integer a, Integer b) { // убрал исключение, оно лишнее
    System.out.println(a + b);
  }

}
