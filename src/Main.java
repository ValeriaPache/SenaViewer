import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            showMainMenu();
            option = getValidOption(scanner);

            switch (option) {
                case 1:
                    showMovies();
                    break;
                case 2:
                    showSeries();
                    break;
                case 3:
                    showBooks();
                    break;
                case 4:
                    showMagazines();
                    break;
                case 5:
                    // General Report
                    generateReport();
                    break;
                case 6:
                    generateTodayReport();
                    break;
                case 0:
                    System.out.println("Saliendo de la aplicación...");
                    break;
                default:
                    System.out.println("Opcion no valida, por favor ingrese una opción valida");
                    break;
            }

        } while (option != 0);

        scanner.close();
    }

    private static void showMainMenu() {
        System.out.println("\n--- Menu ---");
        System.out.println("1. Movies");
        System.out.println("2. Series");
        System.out.println("3. Books");
        System.out.println("4. Magazines");
        System.out.println("5. Report");
        System.out.println("6. Report Today");
        System.out.println("0. Exit");
        System.out.print("Select an option: ");
    }

    private static int getValidOption(Scanner scanner) {
        int option;
        while (true) {
            if (scanner.hasNextInt()) {
                option = scanner.nextInt();
                if (option >= 0 && option <= 6) {
                    break;
                } else {
                    System.out.println("Opción no valida por favor ingrese un numero del 1 al 6");
                }
            } else {
                System.out.println("El numero no esta dentro del rango del 1 al 6 por favor ingrese nuevamente un numero");
                scanner.next();
            }
            System.out.print("Seleccione una opción: ");
        }
        return option;
    }

    private static void showMovies() {
        System.out.println("\n--- Movies List ---");
    }

    private static void showSeries() {
        System.out.println("\n--- Series List ---");
    }

    private static void showBooks() {
        System.out.println("\n--- Books List ---");
    }

    private static void showMagazines() {
        System.out.println("\n--- Magazines List ---");
    }

    private static void generateReport() {
        System.out.println("\n--- General Report ---");
    }

    private static void generateTodayReport() {
        System.out.println("\n--- Today's Report ---");
    }
}
