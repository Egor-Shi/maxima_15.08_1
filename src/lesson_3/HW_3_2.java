package lesson_3;

import java.util.Scanner;

public class HW_3_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a>= 50 && a<=100){

            System.out.println("Число " + a + " содержится в интервале");
        }
        else{
            System.out.println("Число " + a + " не содержится в интервале");
        }


    }
}
