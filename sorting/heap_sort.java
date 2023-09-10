package sorting;

import java.util.Arrays;
import java.util.Random;

public class heap_sort {
  public static void main(String[] args) {
    int arrSize = 10;
    int[] list = createAndFillArray(arrSize);
    System.out.println(Arrays.toString(list));
    System.out.println();
    sort(list);
    System.out.println(Arrays.toString(list));
    System.out.println();
  }

  public static void sort (int[] array){
    for (int i = array.length / 2 -1; i>= 0; i--){
      heapSort(array, array.length, i);
    }
    for (int i = array.length - 1; i>= 0; i--){
      int temp = array[0];
      array[0]=array[i];
      array[i]=temp;
      heapSort(array, i, 0);
    }
  }


  public static void heapSort(int[] arr, int heapSize, int rootIndex) {
    int largest = rootIndex;
    int leftChild = 2 * rootIndex +1;
    int rightChild = 2 * rootIndex +2;

    if (leftChild < heapSize && arr[leftChild] > arr[largest]){
      largest = leftChild;
    }
        if (rightChild < heapSize && arr[rightChild] > arr[largest]){
      largest = rightChild;
    }
    if (largest != rootIndex){
      int temp = arr[rootIndex];
      arr[rootIndex] = arr[largest];
      arr[largest]=temp;
      heapSort(arr, heapSize, largest);
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
