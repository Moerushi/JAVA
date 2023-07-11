package oop_project001;

import java.util.Collections;

import oop_project001.classes.BasicHero;
import oop_project001.dictionaries.AnsiColors;

public class View {

    private static int step = 1;
    private static final int[] l = { 0 };
    private static final String top10 = formatDiv("a") + String.join("", Collections.nCopies(9, formatDiv("-b")))
            + formatDiv("-c");
    private static final String midl10 = formatDiv("d") + String.join("", Collections.nCopies(9, formatDiv("-e")))
            + formatDiv("-f");
    private static final String bottom10 = formatDiv("g") + String.join("", Collections.nCopies(9, formatDiv("-h")))
            + formatDiv("-i");

    private static void tabSetter(int cnt, int max) {
        int dif = max - cnt + 2;
        if (dif > 0)
            System.out.printf("%" + dif + "s", ":\t");
        else
            System.out.print(":\t");
    }

    private static String formatDiv(String str) {
        return str.replace('a', '\u250c')
                .replace('b', '\u252c')
                .replace('c', '\u2510')
                .replace('d', '\u251c')
                .replace('e', '\u253c')
                .replace('f', '\u2524')
                .replace('g', '\u2514')
                .replace('h', '\u2534')
                .replace('i', '\u2518')
                .replace('-', '\u2500');
    }

    public static String getChar(int x, int y) {
        String out = "| ";
        for (BasicHero human : Programm.allTeams) {
            if (human.GetPlace().x == x && human.GetPlace().y == y) {
                if (human.GetHp() == 0) {
                    out = "|" + (AnsiColors.ANSI_RED + human.getClass().getSimpleName().charAt(0) + AnsiColors.ANSI_RESET);
                    break;
                }
                if (Programm.team1.contains(human))
                    out = "|" + (AnsiColors.ANSI_GREEN + human.getClass().getSimpleName().charAt(0) + AnsiColors.ANSI_RESET);
                if (Programm.team2.contains(human))
                    out = "|" + (AnsiColors.ANSI_BLUE + human.getClass().getSimpleName().charAt(0) + AnsiColors.ANSI_RESET);
                break;
            }
        }
        return out;
    }

    public static void view() {
        if (step == 1) {
            System.out.print(AnsiColors.ANSI_YELLOW + "Первый шаг " + AnsiColors.ANSI_RESET);
        } else {
            System.out.print(AnsiColors.ANSI_YELLOW + "Шаг " + step + AnsiColors.ANSI_RESET);
        }
        step++;
        Programm.allTeams.forEach((v) -> l[0] = Math.max(l[0], v.GetInfo().length()));
        System.out.print("_".repeat(l[0] * 2));
        System.out.println("");
        System.out.print(top10 + "   ");
        System.out.print(AnsiColors.ANSI_GREEN + "\tКоманда 1" + AnsiColors.ANSI_RESET);
        // for (int i = 0; i < l[0]-9; i++)
        System.out.print(" ".repeat(l[0] - 9));
        System.out.println(AnsiColors.ANSI_BLUE + "Команда 2" + AnsiColors.ANSI_RESET);
        for (int i = 1; i < 11; i++) {
            System.out.print(getChar(1, i));
        }
        System.out.print("|    ");
        System.out.print(Programm.team1.get(0).GetInfo());
        tabSetter(Programm.team1.get(0).GetInfo().length(), l[0]);
        System.out.println(Programm.team2.get(0).GetInfo());
        System.out.println(midl10);

        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.print(getChar(i, j));
            }
            System.out.print("|    ");
            System.out.print(Programm.team1.get(i - 1).GetInfo());
            tabSetter(Programm.team1.get(i - 1).GetInfo().length(), l[0]);
            System.out.println(Programm.team2.get(i - 1).GetInfo());
            System.out.println(midl10);
        }
        for (int j = 1; j < 11; j++) {
            System.out.print(getChar(10, j));
        }
        System.out.print("|    ");
        System.out.print(Programm.team1.get(9).GetInfo());
        tabSetter(Programm.team1.get(9).GetInfo().length(), l[0]);
        System.out.println(Programm.team2.get(9).GetInfo());
        System.out.println(bottom10);
    }
}
