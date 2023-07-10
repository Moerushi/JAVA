package oop_project001.dictionaries;
import java.util.ArrayList;

import oop_project001.classes.BasicHero;

public interface Actions {
  
  void Step(ArrayList<BasicHero> enemy, ArrayList<BasicHero> ally);

  void GetInfo(); 

}
