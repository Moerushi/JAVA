package oop_project001.dictionaries;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;

public class HeroNames {

  public static String GetName() throws Exception {

    BufferedReader br = new BufferedReader(new FileReader("oop_project001/dictionaries/Names.txt"));
    String str = br.readLine();
    br.close();

    String[] filterParts = str
        .replaceAll("\\p{P}", " ")
        .replaceAll("\\s+", " ")
        .split(" ");

    return filterParts[new Random().nextInt(filterParts.length)];

  }

}
