package oop_sem001;

public class Tiger extends Cat {

  public float speed;
  public boolean dangerous;

  public Tiger(String name) {
    super(name);
  }

  @Override
  public String toString() {
    return "Tiger's name is " + name;
  }
  
}