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
      AddHeros(team1, 1, new Random().nextInt(1,100));
    } while (team1.size() != qtyMax);

    for (var key : team1.entrySet()) {
      key.getValue().TypeInfo();
    }

    System.out.println("Команда 2");
    HashMap<Integer, BasicHero> team2 = new HashMap<>();

    do {
      AddHeros(team2, 10, new Random().nextInt(1,100));
    } while (team2.size() != qtyMax);
    for (var key : team2.entrySet()) {
      key.getValue().TypeInfo();
    }

    System.out.println("Команда 1 к команде 2");
    team1.entrySet().forEach(key -> key.getValue().Step(team2));
     System.out.println("Команда 2 к команде 1");
    team2.entrySet().forEach(key -> key.getValue().Step(team1));

  }

  public static void AddHeros(HashMap<Integer, BasicHero> arr, int x, int y) throws Exception {
    switch (new Random().nextInt(0, 7)) {
      case 0:
        arr.putIfAbsent(BasicHero.GetId(), new Monk(HeroNames.GetName(),x,y));
        break;
      case 1:
        arr.putIfAbsent(BasicHero.GetId(), new Marksman(HeroNames.GetName(),x,y));
        break;
      case 2:
        arr.putIfAbsent(BasicHero.GetId(), new Peasant(HeroNames.GetName(),x,y));
        break;
      case 3:
        arr.putIfAbsent(BasicHero.GetId(), new Pikeman(HeroNames.GetName(),x,y));
        break;
      case 4:
        arr.putIfAbsent(BasicHero.GetId(), new Rogue(HeroNames.GetName(),x,y));
        break;
      case 5:
        arr.putIfAbsent(BasicHero.GetId(), new Sharpshooter(HeroNames.GetName(),x,y));
        break;
      case 6:
        arr.putIfAbsent(BasicHero.GetId(), new Wizard(HeroNames.GetName(),x,y));
    }

  }

}
