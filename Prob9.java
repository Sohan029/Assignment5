package Assign5;

import java.util.Scanner;

public class Prob9 {
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        if(!isPrime(num-2)) System.out.println("False");
        else System.out.println("True");
    }
}
