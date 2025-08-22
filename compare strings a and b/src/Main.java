import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите первую строку: ");
        String str1 = scan.nextLine();

        System.out.print("Введите вторую строку: ");
        String str2 = scan.nextLine();


        if (str1.equals(str2)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }
}