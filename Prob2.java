package Assign5;
import java.util.Scanner;

public class Prob2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(sc.hasNextInt()) {
//            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            if(num >= 0) {
//                System.out.println("-1");
                sum += num;
            }
            else {
                sum=-1;break;
            }
        }
        System.out.println("Sum of numbers: " + sum);
    }
}

