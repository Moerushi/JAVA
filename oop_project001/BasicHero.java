package oop_project001;

public class BasicHero {

  protected static int heroId;
  protected String name;

  protected int minlvl;
  protected int maxlvl;
  protected int minHp;
  protected int phisicalDamage;
  protected float criticalDamage;
  protected float phisicResistance;
  protected float magicResistance;
  protected float protection;
  protected int initiative;

  protected int stamina;
  protected int strength;
  protected int agility;
  protected int intelligence;
  protected int spirit;

  static {
    heroId = 0;
  }

  public BasicHero(String name) {
    this.name = name;
    heroId++;
    this.minlvl = 1;
    this.maxlvl = 100;
    this.minHp = 100;
    this.phisicalDamage = 2;
    this.criticalDamage = 0.1f;
    this.phisicResistance = 0.1f;
    this.magicResistance = 0.1f;
    this.protection = 0.1f;
    this.initiative = 1;

    this.stamina = 1;
    this.strength = 1;
    this.agility = 1;
    this.intelligence = 1;
    this.spirit = 1;
  }

  public void GetInfo() {
    System.out.printf("Hero #%s: %s\n", heroId, this.name);
    System.out.printf("Class: %s\n", this.getClass().getSimpleName());
    System.out.println("-".repeat(20));
    System.out.printf("HP: %s\n", this.minHp);
    System.out.printf("Phisical damage: %s\n", this.phisicalDamage);
    System.out.printf("Initiative: %s\n", this.initiative);
    System.out.printf("Intelligence: %s\n", this.intelligence);
  }

  public void BeautifulInfo () {
    System.out.println("~".repeat(20));
    this.GetInfo();
    System.out.println("~".repeat(20));
  }

}
