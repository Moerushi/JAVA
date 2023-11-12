package exceptions.hw003;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class task001 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean flag = false;

    while (!flag) {
      System.out.println("Для ввода данных введите y, для выхода из программы введите n:");
      switch (sc.nextLine().toLowerCase()) {
        case "n":
          flag = true;
          break;
        case "y":
          String[] userData = getUserData();
          checkDate(userData);
          checkPhone(userData);
          checkGender(userData);
          saveFile(userData);
          break;
        default:
          System.out.println("Неверный формат данных. Попробуйте попытку!");
          break;
      }
    }
    sc.close();
  }

  // получить данные от пользователя и проверить длину
  public static String[] getUserData() throws ArrayIndexOutOfBoundsException {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите Фамилию, Имя, Отчество, Дату рождения, Номер телефона и Пол (m/f) через пробел: ");
    String[] userData = sc.nextLine().split(" ");
    if (userData.length != 6) {
      System.out.println("Вы ввели меньше данных, чем требуется! Попробуйте еще раз: ");
      return getUserData();
    }
    sc.close();
    return userData;
  }

  // проверили корректность ввода даты
  public static void checkDate(String[] userData) {
    String birthDate = userData[3];
    try {
      String[] bd = birthDate.split("\\p{P}");
      Integer day = Integer.parseInt(bd[0]);
      Integer month = Integer.parseInt(bd[1]);
      Integer year = Integer.parseInt(bd[2]);
      if ((day.toString().length() != 2) && (month.toString().length() != 2) && (year.toString().length() != 4)) {
        throw new RuntimeException("Неверная дата!");
      }
    } catch (NumberFormatException e) {
      throw new NumberFormatException("Неверное преобразование даты!");
    }
  }

  // проверил корректность ввода телефона
  public static void checkPhone(String[] userData) {
    String phoneNumber = userData[4];
    try {
     Long pn = Long.parseLong(phoneNumber);
    } catch (NumberFormatException e) {
      throw new NumberFormatException("Неверный номер телефона:" + phoneNumber);
    }
  }

  // проверил корректность ввода пола
  public static void checkGender(String[] userData) {
    String gender = userData[5];
    if ((userData[5].length() == 1) && (userData[5].equals("m") || userData[5].equals("f"))) {
      gender = userData[5];
    } else {
      throw new RuntimeException("Неверный ввод пола: " + gender);
    }
  }

  // создает файл
  public static void saveFile(String[] userData) {
    String fileName = "exceptions/hw003/" + userData[0] + ".txt";
    try (
        FileWriter fw = new FileWriter(fileName, true)) {
      fw.write(userData[0] + " " + userData[1] + " " + userData[2] + " " + userData[3] + " " + userData[4] + " "
          + userData[5]);
      fw.append('\n');
      fw.close();
    } catch (IOException ex) {
      System.out.println(ex.getMessage());
    }
  }

}
