// Дополнительные задания
// Дана json-строка (можно сохранить в файл и читать из файла)
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
// {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
// {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Написать метод(ы), который распарсит json и, используя 
// StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

package hw002;

import java.io.*;

public class task002 {

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new FileReader("hw002/task001.txt"));
    String str = br.readLine();
    br.close();

    String[] filterParts = str
        .replaceAll("\\p{P}", " ")
        .replaceAll("\\s+", " ")
        .split(" ");
    StringBuilder resultLine = new StringBuilder();
    for (int i = 1; i < filterParts.length; i += 6) {
      resultLine
          .append("Студент(ка) ").append(filterParts[i + 1])
          .append(" получил(а) ").append(filterParts[i + 3])
          .append(" по предмету ").append(filterParts[i + 5])
          .append(".");
      System.out.println(resultLine);
      resultLine.delete(0, resultLine.length());
    }
  }
}