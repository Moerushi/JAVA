// Задание на семинар:
// 1. написать программу, которая просит ввести пользователя данные: имя, фамилию, отчество, возраст и пол. Данных может быть сколько угодно.
// 2. Обеспечить выход и режима ввода
// 3. Программа должна вывести все введенные данные. 
// 4. Программа предлагает выйти через кнопку и при этом сортирует по возрасту
// 5. Реализовать сортировку по возрасту и полу с использованием индексов
// Примечание. Классы создавать нельзя.

package sem004;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class task001 {

  public static void main(String[] args) {
    
    ArrayList<String[]> humans = new ArrayList<>();
    String exit = "";
    // получение данных
    do { 
    humans.add((getInput("Введите имя, фамилию, отчество, возраст, пол: ")).split(" "));
    exit = (getInput("Для завершения ввода введите Q. Для продолжения ввода нажмите Enter.")).toLowerCase();
    } while (!exit.equals("q"));

    // сортировка по возрасту через Comparator
    humans.sort(new Comparator<String[]>(){
      @Override // переопределили метод compare, можно убрать
      public int compare(String[] arr1, String[] arr2) { 
        return Integer.parseInt(arr1[3]) - Integer.parseInt(arr2[3]);
        // если одинаковые то 0
        // если arr1 больше, то +1
        // если arr1 меньше, то -1
      }
    }
    );

    // вывод списка
    for (String[] item : humans) {
      System.out.printf("%s %s.%s. %s %s\n", item[1], item[0].charAt(0),item[2].charAt(0), item[3], item[4]);
    }
  }

  public static String getInput(String msg) {
    Scanner sc = new Scanner(System.in);
      System.out.println(msg);
      return sc.nextLine();
  }

}
