// Реализовать класс, который каким-то образом будет хранить данные с учетом нюансов set'a. И иметь один метод добавляющий новые элементы.
// Добавить метод, который удаляет элемент.

package sem006;

import java.util.HashMap;
import java.util.Iterator;

public class task001 {

  public static void main(String[] args) {
    MySet<Integer> mset = new MySet<>();
    System.out.println(mset.add(9));
    System.out.println(mset.add(9));
    System.out.println(mset.add(3));
    System.out.println(mset.add(10));
    System.out.println(mset.add(93));
    System.out.println(mset.remove(9));
    System.out.println(mset.size());

    Iterator<Integer> iter = mset.iterator();
    while (iter.hasNext()) {
      System.out.println(iter.next());
    }
    System.out.println(mset.Stroka());
  }

}

class MySet<E> { // E неявное определение типа данных

  private HashMap<E, Object> mp = new HashMap<>();
  private static final Object OBJ = new Object(); // экономит место в памяти

  public boolean add(E num) {
    return mp.put(num, OBJ) == null;
  }

  public Iterator<Integer> Iterator() {
    return null;
  }

  public boolean remove(E num) {
    return mp.remove(num) == num;
  }

  public int size() {
    return mp.size();
  }

  public Iterator<E> iterator() {
    return mp.keySet().iterator();
  }

  public String Stroka() {
    return mp.toString();
  }

}