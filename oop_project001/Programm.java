package oop_project001;

enum Names {
  Nick("Ник"),
  Oleg("Олег"),
  Tom("Том"),
  Ben("Бен"),
  Kate("Катя"),
  Olga("Оля"),
  Mike("Майк"),
  Dave("Дэйв");
  private String name;
  Names(String name) {
    this.name = name;
  }
  public String getName() {
    return name;
  }
}

public class Programm {

  public static void main(String[] args) {

    BasicHero basicHero = new BasicHero(Names.Nick.getName());
    basicHero.BeautifulInfo();
    BasicHero marksman = new Marksman(Names.Oleg.getName());
    marksman.BeautifulInfo();
    BasicHero monk = new Monk(Names.Tom.getName());
    monk.BeautifulInfo();
    BasicHero peasant = new Peasant(Names.Ben.getName());
    peasant.BeautifulInfo();
    BasicHero pikeMan = new Pikeman(Names.Kate.getName());
    pikeMan.BeautifulInfo();
    BasicHero rogue = new Rogue(Names.Olga.getName());
    rogue.BeautifulInfo();
    BasicHero sharpshooter = new Sharpshooter(Names.Mike.getName());
    sharpshooter.BeautifulInfo();
    BasicHero wizard = new Wizard(Names.Dave.getName());
    wizard.BeautifulInfo();

  }

}
