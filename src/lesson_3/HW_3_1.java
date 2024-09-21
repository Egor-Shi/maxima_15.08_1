package lesson_3;

import java.util.Scanner;

public class HW_3_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a > 5){
            System.out.println("Число больше 5");
        }
        else if(a == 5){
            System.out.println("Число равно 5");
        }
        else if(a < 5){
            System.out.println("Число меньше 5");

        }
    }
}
