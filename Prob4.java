package Assign5;
import java.util.*;
import java.util.Scanner;


public class Prob4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0;i<=num;i++){
            int sam=i;int count=0;
            while(sam != 0){
                count++;
                sam/=10;
            }

            int sam1=i;
            double res=0;
            for(int j=0;j<count;j++){
                int last=sam1%10;
                res=res+Math.pow(last,count);
                sam1/=10;
            }
            if(res==i){
//                System.out.print(count+" ");
                System.out.println(i);
            }
        }
    }
}
