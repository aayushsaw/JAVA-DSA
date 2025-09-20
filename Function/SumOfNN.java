package Function;

import java.util.Scanner;

public class SumOfNN {
    public static void printSum(int i,int n , int sum){
        if (i == n){
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(i+1,n,sum);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Natural Number To find Sum :");
        int n=sc.nextInt();

        printSum(1,n,0);

    }
}
