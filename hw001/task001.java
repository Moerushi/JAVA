// Задание:
// Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
// Пункты реализовать в методе main
// *Пункты реализовать в разных методах
// int i = new Random().nextInt(k);

package hw001;

import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;

public class task001 {
  
  public static void main(String[] arg){
    int i = new Random().nextInt(0,2000);
    System.out.printf("Случайное число в диапазоне от 0 до 2000: %d\n", i);

    try(FileWriter fw = new FileWriter("hw001/file.txt", true)) {
      fw.write(Integer.toString(i));
      fw.append('\n');
      fw.flush();
      }catch(IOException ex){
      System.out.println(ex.getMessage());
    }
    
    System.out.printf("Число '%d' записано в файл.\n", i);
  }
}
