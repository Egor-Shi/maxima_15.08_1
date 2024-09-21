package lesson_3;

import java.util.Scanner;

public class HW_3_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a>0){
            a=a*2;
            System.out.println(a);
        }
        else if(a<0){
            a=a+1;
            System.out.println(a);
        }
        else{
            System.out.println(a);
        }
    }
}
