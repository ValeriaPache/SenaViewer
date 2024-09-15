import java.util.Scanner;
import edu.misena.senaviewer.model.Book;
import edu.misena.senaviewer.model.Magazine;
import edu.misena.senaviewer.model.Movie;
import edu.misena.senaviewer.model.Serie;
import java.util.ArrayList;
import java.util.List;

public class Main {

    // crear un array list en java
    private static List<Movie> movies = new ArrayList<>();
    private static List<Serie> series = new ArrayList<>();
    private static List<Book> books = new ArrayList<>();
    private static List<Magazine> magazines = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        // Ejemplos de datos predefinidos
        initializeSampleData();

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
        for (Movie movie : movies) {
            System.out.println(movie.getTitle() + " (" + movie.getYear() + ") - " + movie.getGenre());
        }
    }

    private static void showSeries() {
        System.out.println("\n--- Series List ---");
        for (Serie serie : series) {
            System.out.println(serie.getTitle() + " (" + serie.getGenre() + ") - " + serie.getDuration());
        }
    }

    private static void showBooks() {
        System.out.println("\n--- Books List ---");
        for (Book book : books) {
            System.out.println(book.getTitle() + " (" + book.getEditionDate() + ") - " + book.getIsbn());
        }
    }

    private static void showMagazines() {
        System.out.println("\n--- Magazines List ---");
        for (Magazine magazine : magazines) {
            System.out.println(magazine.getTitle() + " (" + magazine.getEditionDate() + ") - " + magazine.getEditorial());
        }
    }

    private static void generateReport() {
        System.out.println("\n--- General Report ---");
        System.out.println("Total Movies: " + movies.size()); //El .size es para contar los elementos de un array
        System.out.println("Total Series: " + series.size());
        System.out.println("Total Books: " + books.size());
        System.out.println("Total Magazines: " + magazines.size());
    }

    private static void generateTodayReport() {
        System.out.println("\n--- Today's Report ---");
    }

    private static void initializeSampleData() {
        // Agregar datos de ejemplo al arrayList en java
        movies.add(new Movie("Inception", "Sci-Fi", "Christopher Nolan", "148", 2010));
        movies.add(new Movie("The Matrix", "Sci-Fi", "Wachowski Brothers", "136", 1999));

        series.add(new Serie("Breaking Bad", "Drama", "47", "2:00"));
        series.add(new Serie("Game of Thrones", "Fantasy", "57","2:00"));

        books.add(new Book("The Hobbit", "1937-09-21", "George Allen & Unwin", "1234567890123"));
        books.add(new Book("1984", "1949-06-08", "Secker & Warburg", "9780451524935"));

        magazines.add(new Magazine("Time", "2023-08-21", "Time USA LLC"));
        magazines.add(new Magazine("National Geographic", "2023-08-15", "National Geographic Partners"));
    }
}
