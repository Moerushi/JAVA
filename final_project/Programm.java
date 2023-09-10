package final_project;

import java.io.*;
import java.util.*;

public class Programm {
    // Cписок игрушек
    static ArrayList<Toy> awards = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        // Задаем количество призов
        String totalAwards;
        do {
            System.out.println("Input number of awards:");
            totalAwards = new Scanner(System.in).nextLine();
        } while (!isNumeric(totalAwards));

        // Ввод удельного веса каждого типа игрушек и проверка на соответствие их суммы
        // значению 1 или 0,99
        boolean totalWeightIsCorrect;
        double constructorWeight = 0;
        double robotWeight = 0;
        double dollWeight = 0;
        do {
            totalWeightIsCorrect = true;
            try {
                constructorWeight = toyWeight(String.valueOf(ToyTypes.values()[0]));
                robotWeight = toyWeight(String.valueOf(ToyTypes.values()[1]));
                dollWeight = toyWeight(String.valueOf(ToyTypes.values()[2]));
                if ((constructorWeight + robotWeight + dollWeight) != 1 &&
                        (int) ((constructorWeight + robotWeight + dollWeight) * 100) != 99) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException e) {
                System.out.println("Total sum of frequences is not equal to 1, try again: ");
                totalWeightIsCorrect = false;
            }
        } while (!totalWeightIsCorrect);

        // Подсчитываем количество каждого типа игрушек в розыгрыше, несущественную
        // разницу
        // в результате округлений дозаполняем конструкторами
        int numberOfConstructors = (int) (Integer.parseInt(totalAwards) * constructorWeight);
        int numberOfRobots = (int) (Integer.parseInt(totalAwards) * robotWeight);
        int numberOfDolls = (int) (Integer.parseInt(totalAwards) * dollWeight);
        while ((numberOfConstructors + numberOfRobots + numberOfDolls) != Integer.parseInt(totalAwards)) {
            numberOfConstructors++;
        }

        // Вкладываем игрушки в случайном порядке
        int count = 0;
        do {
            int newPrize = new Random().nextInt(3);
            switch (newPrize) {
                case 0 -> {
                    if (numberOfConstructors != 0) {
                        awards.add(new Toy(count, String.valueOf(ToyTypes.values()[0]), ConstructorNames.getConsName(),
                                constructorWeight));
                        numberOfConstructors--;
                        count++;
                    }
                }
                case 1 -> {
                    if (numberOfRobots != 0) {
                        awards.add(new Toy(count, String.valueOf(ToyTypes.values()[1]), RobotNames.getRobotName(),
                                robotWeight));
                        numberOfRobots--;
                        count++;
                    }
                }
                default -> {
                    if (numberOfDolls != 0) {
                        awards.add(new Toy(count, String.valueOf(ToyTypes.values()[2]), DollNames.getDollName(),
                                dollWeight));
                        numberOfDolls--;
                        count++;
                    }
                }
            }
        } while (count < Integer.parseInt(totalAwards));

        // выбрасываем случайное число и достаем приз, записываем в файл с перечнем призов к выдаче
        while (!awards.isEmpty()) {
            Collections.shuffle(awards);
            File file = new File("final_project/awards.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            List<String> fileContent = readFile(file);
            writeFile(fileContent, file, getToy(), awards.size());
        }
    }

    // Получение игрушки
    public static Toy getToy() {
        return awards.remove(new Random().nextInt(awards.size()));
    }

    // Проверка введенного значения
    public static boolean isNumeric(String val) {
        try {
            Integer.parseInt(val);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Ввод удельного веса каждого типа игрушки
    public static double toyWeight(String type) {
        System.out.println("Input number of frequency from 0 to 1 using (,) as divider for " + type);
        double weight = 0;
        boolean weightIsCorrect = false;
        while (!weightIsCorrect) {
            try {
                weight = new Scanner(System.in).nextDouble();
                if (weight < 0 || weight > 1) {
                    throw new RuntimeException();
                }
                weightIsCorrect = true;
            } catch (Exception e) {
                System.out.println("Incorrect input. Try again: ");
            }
        }
        return weight;
    }

    // Чтение файла
    public static List<String> readFile(File file) {
        List<String> lst = new ArrayList<>();
        try (FileReader fr = new FileReader(file); BufferedReader bf = new BufferedReader(fr)) {
            String line;
            while ((line = bf.readLine()) != null) {
                lst.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File is not found" + file.getName());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    // Запись данных в файл
    public static void writeFile(List<String> lst, File file, Toy toy, int awardsInLottery) {
        try (FileWriter fw = new FileWriter(file); BufferedWriter bf = new BufferedWriter(fw)) {
            for (String item : lst) {
                bf.write(item);
                bf.newLine();
            }
            bf.write(toy.toString());
            bf.newLine();
            bf.write("Awards to be got: " + awardsInLottery);
            bf.newLine();
        } catch (FileNotFoundException e) {
            System.out.println(String.format("File %s is not found", file.getName()));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}