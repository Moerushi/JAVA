package final_project;

import java.util.Random;

public enum DollNames {
    Masha, Dasha, Barbie;
    public static String getDollName() {
        return String.valueOf(DollNames.values()[new Random().nextInt(DollNames.values().length)]);
    }
}