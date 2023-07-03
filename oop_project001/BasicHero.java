package oop_project001;

public class BasicHero {

  public int minHp;
  public int phisicalDamage;
  public int phisicResistance;
  public int magicResistance;
  public int protection;
  public int minlvl;
  public int maxlvl;
  public int power;
  public int intelligence;
  public int stamina;
  public int strength;
  public int agility;
  public int spirit;
  public int initiative;
  public int manaPoints;
  public int magicalDamage;

  public int Move() {
    return 1;
  }

  public int Attack(BasicHero target) {
    return 1;
  }

   public int Heal(BasicHero target) {
    return 1;
  }

   public void HeroDeath(BasicHero self) {
    System.out.println("I'll be back!");
  }

}
