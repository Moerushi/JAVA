package oop_sem001;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    
    Cat persic = new Cat("Persik");
    Cat barsic = new Cat("Barsic");
    Tiger tiger = new Tiger("Simba");
    Pet pet = new Tiger("Bali");
    ((Tiger)pet).name = "Name";
    ArrayList<Pet> list = new ArrayList<>();
    list.add(new Tiger("wq"));

    System.out.println(barsic.getPaws());
    System.out.println(barsic.toString());
    System.out.println(persic.toString());
    System.out.println(tiger.toString());
  }
  

}
