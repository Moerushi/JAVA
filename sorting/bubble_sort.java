package sorting;

import java.util.Arrays;
import java.util.Random;

public class bubble_sort {

  public static void main(String[] args) {

    int arrSize = 10;
    
    int[] list = createAndFillArray(arrSize);
    System.out.println(Arrays.toString(list));
    System.out.println();
    bubbleSort(list);
    System.out.println(Arrays.toString(list));
    System.out.println();
  }

  public static void bubbleSort(int[] arr) {
    boolean finish = true;
    do {
      finish = true;
      for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i] > arr[i + 1]) {
          int temp = arr[i];
          arr[i] = arr[i + 1];
          arr[i + 1] = temp;
          finish = false;
        }
      }
    } while (!finish);

  }

  public static int[] createAndFillArray(int size) {
    int[] list = new int[size];
    for (int i = 0; i < size; i++) {
      list[i] = (new Random().nextInt(50));
    }
    return list;
  }

}
