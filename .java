import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число: ");
        int number = scanner.nextInt();
        if ((number & (number - 1)) == 0) {
                    System.out.println("Число є степенем числа 2");
                }
                else System.out.println("Число не являється степенем 2");
            }
        }

