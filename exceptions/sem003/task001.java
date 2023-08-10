// Создайте метод doSomething(), который может быть источником одного из типов checked exceptions (тело самого метода прописывать не обязательно). Вызовите этот метод из main и обработайте в нем исключение, которое вызвал метод doSomething().

package exceptions.sem003;

import java.io.IOException;

public class task001 {

  public static void main(String[] args) {

    try {
          doSomething();
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }

  }

  public static void doSomething () throws IOException{
    
  }
  
}
