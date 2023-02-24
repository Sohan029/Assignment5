package Assign5;

import java.util.Scanner;

public class Prob6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            char ch ='A';
            for(int j=0;j<n;j++){
                if(i+j==n-1){
                    ch='A';
                    for(int k=0;k<(2*i)+1;k++){
                        System.out.print(ch++);
                    }
                }
                else{
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(' ');
            }
            char ch ='A';
            for(int k=0;k<(n+2)-(2*i);k++){
                System.out.print(ch++);
            }
            System.out.println();
        }
    }
}
