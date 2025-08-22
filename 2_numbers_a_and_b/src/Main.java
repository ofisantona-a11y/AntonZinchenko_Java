import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scan.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scan.nextInt();

        if (num1 == num2) {
            System.out.println(num1 + " = " + num2);
        } else {
            if (num1 > num2) {
                System.out.println(num1 + " > " + num2);
            } else {
                System.out.println(num1 + " < " + num2);
            }
        }

        int res1 = num1 + num2;
        int res2 = num1 - num2;
        int res3 = num1 * num2;
        int res4 = num1 / num2;

        System.out.print(num1 + " + " + num2 + " = ");
        System.out.println(res1);
        System.out.print(num1 + " - " + num2 + " = ");
        System.out.println(res2);
        System.out.print(num1 + " * " + num2 + " = ");
        System.out.println(res3);
        System.out.print(num1 + " / " + num2 + " = ");
        System.out.println(res4);
    }
}