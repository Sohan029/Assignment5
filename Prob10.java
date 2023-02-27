package Assign5;

import java.util.Scanner;

public class Prob10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i*i<=n;i++){
            System.out.print(i*i+" ");
        }
    }
}
