package lection005;

import java.util.*;
 
public class Ex001_HashMap {
    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<Integer, String>();
        db.putIfAbsent(1, "один"); // проверяет на наличие ключа
        db.put(2, "два"); // добавляет значение и ключ в коллекцию
        db.put(null, "!null"); 
        System.out.println(db); // {null=!null, 1=один, 2=два}
        System.out.println(db.get(44));
        //db.remove(null); 
        System.out.println(db); // {1=один, 2=два}
        System.out.println(db.containsValue("один")); // true
        System.out.println(db.containsValue(1)); // false
        System.out.println(db.containsKey("один")); // false
        System.out.println(db.containsKey(1)); // true
        System.out.println(db.keySet());
        System.out.println(db.values());


    }
}