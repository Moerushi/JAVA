package final_project;

import java.util.Random;

public enum RobotNames {
    R2D2, Wallie, Eva, Terminator;
    public static String getRobotName() {
        return String.valueOf(RobotNames.values()[new Random().nextInt(RobotNames.values().length)]);
    }
}