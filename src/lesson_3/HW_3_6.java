package lesson_3;

import java.util.Scanner;

public class HW_3_6 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a % 400 == 0) {
            System.out.println("Количество дней в этом году: " + "366");
        }
        else if(a % 400 ==0 && a % 100 == 0){
            System.out.println("Количество дней в этом году: " + "365");

        }
        else if(a % 400 ==0 && a % 100 == 0 && a % 4 == 0){
            System.out.println("Количество дней в этом году: " + "366");
        }
        else{
            System.out.println("Количество дней в этом году: " + "365");
        }
        }
    }

