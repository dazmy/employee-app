package util;

import java.util.Scanner;

public class InputUtil {
    public static int inputMenu(String info) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(info + " : ");
        return scanner.nextInt();
    }

    public static String inputEmployee(String info) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(info + " : ");
        return scanner.nextLine();
    }

    public static String inputLevel(String info) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select LEVEL (number)");
        System.out.println("1. Junior");
        System.out.println("2. Middle");
        System.out.println("3. Senior");
        System.out.print(info + " : ");
        switch (scanner.nextInt()) {
            case 1 -> {
                return "Junior";
            }
            case 2 -> {
                return "Middle";
            }
            case 3 -> {
                return "Senior";
            }
            default -> {
                return "";
            }
        }
    }
}
