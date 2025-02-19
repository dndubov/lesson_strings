import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите фамилию: ");
        String lastName = scanner.nextLine();

        System.out.print("Введите имя: ");
        String firstName = scanner.nextLine();

        System.out.print("Введите отчество: ");
        String middleName = scanner.nextLine();

        String fullName = lastName + " " + firstName + " " + middleName;

        // Задача 1:
        System.out.println("Задача 1:");
        System.out.println("Ф. И. О. сотрудника — " + fullName);

        // Задача 2:
        String upperCaseFullName = fullName.toUpperCase();
        System.out.println("\nЗадача 2:");
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + upperCaseFullName);

        // Задача 3:
        String correctedFullName = fullName.replace("ё", "е");
        System.out.println("\nЗадача 3:");
        System.out.println("Данные Ф. И. О. сотрудника — " + correctedFullName);

        scanner.close();
    }
}
