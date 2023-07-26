// Дано:

// try {
//    int d = 0;
//    double catchedRes1 = intArray[8] / d;
//    System.out.println("catchedRes1 = " + catchedRes1);
// } catch (ArithmeticException e) {
//    System.out.println("Catching exception: " + e);
// }

package exceptions.hw002;

public class task002 {

    public static void main(String[] args) {
        try {
            int d = 1;
            int[] intArray = new int[10]; // добавили массив
            intArray[8] = 10; // добавили значение для проверки
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) { // деление на 0
            System.out.println("Catching exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) { // добавили исключение выход за размеры массива
            System.out.println("Catching exception: " + e);
        }
    }
}
