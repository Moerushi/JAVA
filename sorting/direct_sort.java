package sorting;

import java.util.Arrays;
import java.util.Random;

public class direct_sort {

  public static void main(String[] args) {

    int arrSize = 10;
    int[] list = createAndFillArray(arrSize);
    System.out.println(Arrays.toString(list));
    System.out.println();
    directSort(list);
    System.out.println(Arrays.toString(list));
    System.out.println();
  }

  public static void directSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      int minPosition = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[minPosition]) {
          minPosition = j;
        }
      }
      if (i != minPosition) {
        int temp = arr[i];
        arr[i] = arr[minPosition];
        arr[minPosition] = temp;
      }
    }
  }

  public static int[] createAndFillArray(int size) {
    int[] list = new int[size];
    for (int i = 0; i < size; i++) {
      list[i] = (new Random().nextInt(50));
    }
    return list;
  }

}
