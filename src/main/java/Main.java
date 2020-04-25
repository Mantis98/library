import java.util.Scanner;

import static java.awt.SystemColor.menu;

public class Main {

    private static Scanner SCANNER;

    public static void main(String[] args) {

        SCANNER = new Scanner(System.in);
        System.out.println("Witaj w bibliotece! Co chcialbys zrobic?");

        while (true) {
            menu();
            int option = SCANNER.nextInt();
            switch (option) {
                case 1:
                    System.out.println("[Wyswietl wszystkie ksiazki] jeszcze nie zaimplementowana");
                    break;
                case 2:
                    System.out.println("[Dodaj ksiazke] jeszcze nie zaimplementowana");
                    break;
                case 3:
                    System.out.println("[Usun ksiazke] jeszcze nie zaimplementowana");
                    break;
                default:
                    System.out.println("Operacja o wybranym numerze nie istnieje");
            }
        }


    }

    private static void menu() {
        System.out.println("1) wyswietl wszystkie ksiazki");
        System.out.println("2) dodaj ksiazke");
        System.out.println("3) usun ksiazke");
        System.out.println("Wybieram: ");
    }
}
