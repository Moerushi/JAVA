package final_project;

import java.util.Random;

public enum ConstructorNames {
    Lego, Blocks, Minecraft, Cubes;
    public static String getConsName() {
        return String.valueOf(ConstructorNames.values()[new Random().nextInt(ConstructorNames.values().length)]);
    }
}