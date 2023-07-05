package oop_project001;

import java.util.HashMap;
import java.util.Random;

import oop_project001.classes.BasicHero;
import oop_project001.classes.Marksman;
import oop_project001.classes.Monk;
import oop_project001.classes.Peasant;
import oop_project001.classes.Pikeman;
import oop_project001.classes.Rogue;
import oop_project001.classes.Sharpshooter;
import oop_project001.classes.Wizard;
import oop_project001.dictionaries.HeroNames;

public class Programm {

  public static void main(String[] args) throws Exception {

    int qtyMax = 10;

    System.out.println("Команда 1");
    HashMap<Integer, BasicHero> team1 = new HashMap<>();

    do {
      AddHeros(team1);
    } while (team1.size() != qtyMax);

    for (var key : team1.entrySet()) {
      key.getValue().TypeInfo();
    }

    System.out.println("Команда 2");
    HashMap<Integer, BasicHero> team2 = new HashMap<>();

    do {
      AddHeros(team2);
    } while (team1.size() != qtyMax);
    for (var key : team2.entrySet()) {
      key.getValue().TypeInfo();
    }
  }

  public static void AddHeros(HashMap<Integer, BasicHero> arr) throws Exception {
    switch (new Random().nextInt(0, 7)) {
      case 0:
        arr.putIfAbsent(BasicHero.GetId(), new Monk(HeroNames.GetName()));
        break;
      case 1:
        arr.putIfAbsent(BasicHero.GetId(), new Marksman(HeroNames.GetName()));
        break;
      case 2:
        arr.putIfAbsent(BasicHero.GetId(), new Peasant(HeroNames.GetName()));
        break;
      case 3:
        arr.putIfAbsent(BasicHero.GetId(), new Pikeman(HeroNames.GetName()));
        break;
      case 4:
        arr.putIfAbsent(BasicHero.GetId(), new Rogue(HeroNames.GetName()));
        break;
      case 5:
        arr.putIfAbsent(BasicHero.GetId(), new Sharpshooter(HeroNames.GetName()));
        break;
      case 6:
        arr.putIfAbsent(BasicHero.GetId(), new Wizard(HeroNames.GetName()));
    }
  }

}
