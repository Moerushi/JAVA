package exceptions.hw001;

public class hw001 {
    public static void main(String[] args) {
      Answer ans = new Answer();
      try {
        ans.arrayOutOfBoundsException();
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Выход за пределы массива");
      }

      try {
        ans.divisionByZero();
      } catch (ArithmeticException e) {
        System.out.println("Деление на ноль");
      }

      try {
        ans.numberFormatException();
      } catch (NumberFormatException e) {
        System.out.println("Ошибка преобразования строки в число");
      }
    }
  }

  class Answer {
  public void arrayOutOfBoundsException() {
    int[] arr = {1,2,3,4,5,6,7};
    System.out.println(arr[11]);

  }

  public void divisionByZero() {
    int num1 = 10;
    int num2 = 0;
    System.out.println(num1/num2);

  }

  public void numberFormatException() {
    String str = "abc";
    System.out.println(Integer.parseInt(str));
  }
}
