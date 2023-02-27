package Assign5;

import java.util.*;
import java.util.Scanner;

public class Prob8 {
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
        int n=sc.nextInt();
        int num=2;
        for(int i=1;i<=n;i++){
            for(int k=n-i+1;k>1;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                while(! isPrime(num)){
                    num++;
                }
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
