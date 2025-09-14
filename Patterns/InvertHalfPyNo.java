package Patterns;
import java.util.Scanner;
public class InvertHalfPyNo {
    public static void main(String Args[]){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        //outer loop for termination of lines
        for(int i = 0 ; i <= n ; i++){

            //inner loop for print the number
            for(int j = 1 ; j<=n-i ;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
