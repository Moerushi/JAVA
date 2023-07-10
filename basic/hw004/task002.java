package hw004;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class task002 {

  public static void main(String[] args) {

    ArrayList<String[]> humans = new ArrayList<>();
    String exit = "";
    ArrayList<Integer> id = new ArrayList<>();
    int count = 0;
    // получение данных от пользователя
    do {
      humans.add((getInput("Введите имя, фамилию, отчество, возраст, пол: ")).split(" "));
      id.add(count);
      count += 1;
      exit = (getInput("Для завершения ввода введите Q. Для продолжения ввода нажмите Enter.")).toLowerCase();
    } while (!exit.equals("q"));

    // извлекаем все значения возраста из списка
    ArrayList<Integer> age = new ArrayList<>();
    for (String[] item : humans) {
      age.add(Integer.parseInt(item[3])); // age
    }
    
    // сортируем по возрастанию по возрасту
    Integer temp = 0;
    for (int i = 0; i < id.size(); i++) {
      for (int j = 0; j < id.size()-1; j++) {
        if (age.get(j) > age.get(j+1)) {
          temp = id.get(j);
          id.set(j, id.get(j+1));
          id.set(j+1, temp);
        }
      }
    }

    // вывод после сортировки по возрасту
    for (int i = 0; i < id.size(); i++){
    System.out.printf(
      "%s %s.%s. %s %s\n",
      Arrays.asList(humans.get(id.get(i))).get(1),
      Arrays.asList(humans.get(id.get(i))).get(0).charAt(0),
      Arrays.asList(humans.get(id.get(i))).get(2).charAt(0),
      Arrays.asList(humans.get(id.get(i))).get(3),
      Arrays.asList(humans.get(id.get(i))).get(4)
      );
    }
    System.out.println("~".repeat(20));

    // сортировка по полу
    ArrayList<Integer> male = new ArrayList<>();
    ArrayList<Integer> female = new ArrayList<>();
     for (int i = 0; i < id.size(); i++){
      if (Arrays.asList(humans.get(id.get(i))).get(4).equals("м")){
        male.add(id.get(i));
      } else {
        female.add(id.get(i));
      }
    }
    id.clear();
    id.addAll(female);
    id.addAll(male);

    // вывод после сортировки по полу
    for (int i = 0; i < id.size(); i++){
    System.out.printf(
      "%s %s.%s. %s %s\n",
      Arrays.asList(humans.get(id.get(i))).get(1),
      Arrays.asList(humans.get(id.get(i))).get(0).charAt(0),
      Arrays.asList(humans.get(id.get(i))).get(2).charAt(0),
      Arrays.asList(humans.get(id.get(i))).get(3),
      Arrays.asList(humans.get(id.get(i))).get(4)
      );
    }
  }

  public static String getInput(String msg) {
    Scanner sc = new Scanner(System.in);
    System.out.println(msg);
    return sc.nextLine();
  }

}
