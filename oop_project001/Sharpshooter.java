package oop_project001;

public class Sharpshooter extends BasicHero {

  protected int concentration;

public Sharpshooter(String name) {
    super(name);

    super.minHp += 10;
    super.phisicalDamage += 1;
    super.criticalDamage *= 2;
    super.phisicResistance *= 2;
    super.protection *= 2;
    super.initiative += 1;
    super.agility += 1;

    this.concentration = 100;

  }

    public void GetInfo() {
    super.GetInfo();
    System.out.printf("CP: %s\n", this.concentration);
    System.out.printf("Agility: %s\n", this.agility);
  }


  
}
