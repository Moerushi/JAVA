package oop_project001.classes;

public class Monk extends BasicHero {

  protected int spiritPoints;

  public Monk(String name) {
    super(name);
    this.spiritPoints = 100;
    super.minHp += 30;
    super.phisicalDamage +=8;
    super.criticalDamage *=8;
    super.phisicResistance *=8;
    super.protection +=8;
    super.initiative +=8;

    super.stamina += 8;
    super.strength += 8;
    super.spirit += 8;

  }

    public void GetInfo() {
    super.GetInfo();
    System.out.printf("SP: %d\n", this.spiritPoints);
    System.out.printf("Strength: %d\n", this.strength);
  }

    @Override
    public void Step() {

    }

}
