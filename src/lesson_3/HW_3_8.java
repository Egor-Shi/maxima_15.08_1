package lesson_3;

import java.util.Scanner;

public class HW_3_8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
if (a <= 3){
    System.out.println("Горит зеленый");
}
else if(a > 3 && a <= 4){
    System.out.println("Горит желтый");
}
else if(a > 4 && a<=5){
    System.out.println("Горит красный");
}
else if (a % 5 <= 3){
    System.out.println("Горит зеленый");

}
else if(a % 5 > 3 && a % 5 < 4){
    System.out.println("Горит желтый");
}
else if(a % 5 >= 4){
    System.out.println("Горит красный");
}
    }
}
