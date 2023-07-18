package oop_project001;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

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

  public static int qtyMax = 10;
  public static ArrayList<BasicHero> team1;
  public static ArrayList<BasicHero> team2;
  public static ArrayList<BasicHero> allTeams;

  public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);

    team1 = CreateAndFillTeams(1, qtyMax);
    team2 = CreateAndFillTeams(10, qtyMax);
    allTeams = new ArrayList<>();

    allTeams.addAll(team1);
    allTeams.addAll(team2);
    allTeams.sort((o2, o1) -> o1.getInitiative() - o2.getInitiative());

    oop_project001.View.view();

    while (TotalHp(team1, team2)) {
      sc.nextLine();
      for (BasicHero item : allTeams) {
        if (team1.contains(item)) {
          item.Step(team2, team1);
        } else {
          item.Step(team1, team2);
        }
      }
      oop_project001.View.view();
    }
    System.out.println("Конец");
  }

  public static void AddHeros(ArrayList<BasicHero> arr, int x, int y) throws Exception {

    switch (new Random().nextInt(0, 7)) {
      case 0:
        arr.add(new Monk(HeroNames.GetName(), x, y));
        break;
      case 1:
        arr.add(new Marksman(HeroNames.GetName(), x, y));
        break;
      case 2:
        arr.add(new Peasant(HeroNames.GetName(), x, y));
        break;
      case 3:
        arr.add(new Pikeman(HeroNames.GetName(), x, y));
        break;
      case 4:
        arr.add(new Rogue(HeroNames.GetName(), x, y));
        break;
      case 5:
        arr.add(new Sharpshooter(HeroNames.GetName(), x, y));
        break;
      case 6:
        arr.add(new Wizard(HeroNames.GetName(), x, y));
    }

  }

  public static ArrayList<BasicHero> CreateAndFillTeams(Integer startLine, Integer qty) throws Exception {
    ArrayList<BasicHero> outTeam = new ArrayList<>();
    for (int i = 1; i <= qty; i++) {
      AddHeros(outTeam, startLine, i);
    }
    return outTeam;
  }

  public static boolean TotalHp(ArrayList<BasicHero> arr1, ArrayList<BasicHero> arr2) {
    int sum1 = 0;
    int sum2 = 0;
    for (BasicHero basicHero : arr1) {
      sum1 += basicHero.GetHp();
    }
    for (BasicHero basicHero : arr2) {
      sum2 += basicHero.GetHp();
    }
    if (sum1 == 0 || sum2 == 0) {return false;}
    return true;
}
}
