package oop_project001.dictionaries;
import java.util.HashMap;

import oop_project001.classes.BasicHero;

public interface Actions {
  
  void Step(HashMap<Integer, BasicHero> enemy);

  void GetInfo(); 

}
