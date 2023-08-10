// Создайте класс Счетчик, у которого есть метод add(), увеличивающий значение внутренней int переменной на 1. Сделайте так, чтобы с объектом такого типа можно было работать в блоке try-with-resources. Подумайте, что должно происходить при закрытии этого ресурса? Напишите метод для проверки, закрыт ли ресурс. При попытке вызвать add() у закрытого ресурса, должен выброситься IOException

package exceptions.sem003;

import java.io.IOException;

public class task002 {

  public static void main(String[] args) {
    try (Counter counter = new Counter()) {
      counter.increase();
      System.out.println(counter.getCount());
      counter.close();
      System.out.println(counter.getCount());
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }

}

class Counter implements AutoCloseable {

  private Integer counter = 0;

  public int getCount() throws IOException {
    checkClose();
    return this.counter;
  }

  public Counter() {
    this.counter = 0;
  }

  public int increase() throws IOException {
    checkClose();
    return this.counter++;
  }

  @Override
  public void close() {
    this.counter = null;
  }

  private void checkClose() throws IOException {
    if (this.counter == null) {
      throw new IOException("Переменная закрыта!");
    }
  }

}
