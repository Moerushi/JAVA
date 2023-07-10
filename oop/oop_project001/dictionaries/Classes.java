package oop_project001.dictionaries;

public enum Classes {
  Marksman ("Снайпер"),
  Monk ("Монах"),
  Peasant ("Крестьянин"),
  Pikeman ("Копейщик"),
  Rogue ("Разбойник"),
  Sharpshooter ("Арбалетчик"),
  Wizard ("Волшебник");

  private String name;

  Classes (String name) {
    this.name = name;
  }

  public String GetName() {
    return name;
  }

}
