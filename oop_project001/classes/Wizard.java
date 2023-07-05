package oop_project001.classes;

public class Wizard extends BasicHero {

  private int manaPoints;
  private int magicalDamage;

  public Wizard(String name) {
    super(name);
    super.intelligence += 8;
    super.magicResistance *=8;
    super.initiative +=8;
    super.criticalDamage *=8;
    magicalDamage = 8;
    manaPoints = 100;
    
  }

    public void GetInfo() {
    super.GetInfo();
    System.out.printf("Magical damage: %d\n", this.magicalDamage);
    System.out.printf("MP: %d\n", this.manaPoints);
    System.out.printf("Intelligence: %d\n", this.intelligence);
  }

      @Override
    public void Step() {

    }

}
