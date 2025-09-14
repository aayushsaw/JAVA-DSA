package Patterns;
import java.util.Scanner;

public class InvertedHalfPyramid {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Outer For loop
        for(int i=1;i<=n;i++){
            //Inner for loop
            for(int j=n;i<=j;j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
