// Запишите в файл следующие строки:
// Анна=4
// Елена=5
// Марина=6
// Владимир=?
// Константин=?
// Иван=4
// Реализуйте метод, который считывает данные из файла и сохраняет в двумерный массив (либо HashMap, если студенты с ним знакомы). В отдельном методе нужно будет пройти по структуре данных, если сохранено значение ?, заменить его на соответствующее число.Если на каком-то месте встречается символ, отличный от числа или ?, бросить подходящее исключение.Записать в тот же файл данные с замененными символами ?.

package exceptions.sem002;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ex003 {

  public static void main(String[] args) {

    File file = new File("exceptions/sem002/somefile.txt");
    List<String[]> list = readFile(file);
    changeList(list);
    writeFile(list, file);
  }

  public static void writeFile(List<String[]> lst, File file) {
    try {
      FileWriter fw = new FileWriter(file);
      BufferedWriter bf = new BufferedWriter(fw);
      for (String[] item : lst) {
        bf.write(item[0] + "=" + item[1]);
        bf.newLine();
      }
      bf.close();
    } catch (FileNotFoundException e) {
      System.out.println("FileNotFoundException" + file.getAbsolutePath());
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }

  public static List<String[]> readFile(File file) {
    List<String[]> lst = new ArrayList<>();
    try {
      FileReader fr = new FileReader(file);
      BufferedReader bf = new BufferedReader(fr);
      String line;
      while ((line = bf.readLine()) != null) {
        lst.add(line.split("="));
      }
      bf.close();
    } catch (FileNotFoundException e) {
      System.out.println("FileNotFoundException" + file.getAbsolutePath());
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
    return lst;
  }

  public static List<String[]> changeList(List<String[]> lst) {
    for (String[] item : lst) {
      if (!item[1].equals("?") && !isNumeric(item[1])) {
        throw new RuntimeException("Incorrect value " + item[0]);
      }
      if (item[1].equals("?")) {
        item[1] = String.valueOf(item[0].length());
      }
    }
    return lst;
  }

  public static boolean isNumeric(String val) {
    try {
      Integer.parseInt(val);
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }

}
