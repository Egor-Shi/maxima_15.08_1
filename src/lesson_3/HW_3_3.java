package lesson_3;

import java.util.Scanner;

public class HW_3_3 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if ((a>=1 && a <=2) || a ==12){
            System.out.println("Зима");}
            else if(a>=3 && a<=5){
                System.out.println("Весна");
            }
            else if(a>=6 && a<=8){
                System.out.println("Лето");}
                else if(a>=9 && a<=11){
                    System.out.println("Осень");
                }
                else {
            System.out.println("Такого месяца нет");
        }
            }
        }


