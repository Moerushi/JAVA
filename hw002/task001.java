// Задание
// Дана строка sql-запроса "select * from students where ". 
// Сформируйте часть WHERE этого запроса, используя StringBuilder. 
// Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

package hw002;

public class task001 {

  public static void main(String[] args) {
    String sqlRequest = "select * from students where ";
    String filter = "name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null";
    String[] filterParts = filter
        .replaceAll("\\p{P}", " ")
        .replaceAll("\\s+", " ")
        .split(" ");
    StringBuilder resultLine = new StringBuilder(sqlRequest);
    for (int i = 0; i < filterParts.length; i += 2) {
      if (!filterParts[i+1].equals("null")) {
          resultLine.append(filterParts[i]).append(" = '").append(filterParts[i + 1]).append("'").append(" AND ");
      }
    }
    resultLine.delete(resultLine.length()-5, resultLine.length());
    System.out.println(resultLine);
  }
}