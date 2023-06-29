package oop_sem001;

import java.util.Random;

public class Cat extends Pet {

  public String name;
  private int age;
  public static int paws;

  // конструктор
  // для того, чтобы делать содержимое полей контролируемым
  private Cat(String name, int age) { // он не виден снаружи класса
    super(14000);
    this.name = name; // this это ссылка на переменную в текущем классе
    setAge(age);
    paws = 4;
  }

  public Cat(String name) {
    this(name, new Random().nextInt(-10, 29));
  }

  public int getAge() {
    return age;
  }; // получает данные

  public boolean setAge(int age) {
    if (age < 0 || age > 20) {
      this.age = 0;
      return false;
    }
    this.age = age;
    return true;
  }

  public String getPaws() {
    return String.valueOf(paws);
  }

  @Override
  public String toString() {
    return "Cat's name is " + name;
  }

}
