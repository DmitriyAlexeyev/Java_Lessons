package lesson1;
import java.util.Scanner;

/*
Спросить у пользователя число
Если оно попадает в диапазон от 1 до 100 или в диапазон от -1000 до -100, вывести в консоль "+"
Если оно не попадает ни в один из этих диапазонов, вывести "-"
 */
public class HW3 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println((number >= 1 && number <= 100 || number >= -1000 && number <= -100) ? "+" : "-");
    }
}
