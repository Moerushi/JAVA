// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый элемент которого равен сумме элементов двух входящих массивов в той же ячейке.
// Если длины массивов не равны, необходимо как-то оповестить пользователя.

package exceptions.sem001;

public class ex007 {
  
public static void main(String[] args) {
  int [] arr1 = {1,2,3,4,5};
  int [] arr2 = {1,2,3,4,5};

  try {
    printArr(massArr(arr1, arr2));
  } catch (RuntimeException e) {
    System.out.println(e.getMessage());
  }


}

public static int[] massArr (int[] arr1, int[] arr2) {
  int[] massArr = new int[arr1.length];
  if (arr1.length != arr2.length){throw new RuntimeException("Длины не равны. " +"Длина первого: " +arr1.length+" Длина второго: "+arr2.length);}
  for (int i = 0; i < massArr.length; i++) {
    massArr[i] = arr1 [i] + arr2[i];
  }
  return massArr;
}

public static void printArr (int[] arr) {
  for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
  }
}

}
