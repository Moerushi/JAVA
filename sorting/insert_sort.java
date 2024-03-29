package sorting;

import java.util.Arrays;
import java.util.Random;

public class insert_sort {

  public static void main(String[] args) {

    int arrSize = 10;
    Integer[] list = createAndFillArray(arrSize);
    System.out.println(Arrays.toString(list));
    System.out.println();
    insertSort(list);
    System.out.println(Arrays.toString(list));
    System.out.println();
  }

  public static void insertSort(Integer[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] > arr[j]) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }

  }

  public static Integer[] createAndFillArray(int size) {
    Integer[] list = new Integer[size];
    for (int i = 0; i < size; i++) {
      list[i] = (new Random().nextInt(50));
    }
    return list;
  }

}
