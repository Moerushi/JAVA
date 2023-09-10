package sorting;

import java.util.Arrays;
import java.util.Random;

public class quick_sort {
  public static void main(String[] args) {

    int arrSize = 10;
    int[] list = createAndFillArray(arrSize);
    System.out.println(Arrays.toString(list));
    System.out.println();
    quickSort(list,0,list.length-1);
    System.out.println(Arrays.toString(list));
    System.out.println();
  }

  public static void quickSort(int[] array, int startPosition, int endPosition) {
    int leftPosition = startPosition;
    int rightPosition = endPosition;
    int pivot = array[(startPosition+endPosition)/2];
    do{
      while (array[leftPosition]<pivot){
        leftPosition++;
      }
      while (array[rightPosition]>pivot){
        rightPosition--;
      }
      if (leftPosition <= rightPosition) {
        if (leftPosition < rightPosition){
          int temp = array[leftPosition];
          array[leftPosition] = array[rightPosition];
          array[rightPosition] = temp;
        }
        leftPosition++;
        rightPosition--;
      }
    } while (leftPosition<=rightPosition);

    if (leftPosition < endPosition){
      quickSort(array, leftPosition, endPosition);
    }
     if (startPosition < rightPosition){
      quickSort(array, startPosition, rightPosition);
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
