package data_structure;

public class sem004 {

  public static void main(String[] args) {
    HashTable<Integer, String> table = new HashTable<>();
    table.input(1, "str1");
    table.input(2, "str2");
    table.input(2, "str21");
    table.input(2, "str22");
    table.input(3, "str3");
    table.input(4, "str4");
    System.out.println(table.getV(2));
    System.out.println(table.getV(4));
    System.out.println(table.getV(5));
  }

}