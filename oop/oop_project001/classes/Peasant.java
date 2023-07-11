package oop_project001.classes;

import java.util.ArrayList;

public class Peasant extends Infantry {

  public Peasant(String name, int x, int y) {
    super(name, x, y);
    this.minHp += 10;
  }

  public boolean busy = false;

  @Override
  public void Step(ArrayList<BasicHero> enemy, ArrayList<BasicHero> ally) {

    if (minHp > 0) {busy = false;}

  }

}
