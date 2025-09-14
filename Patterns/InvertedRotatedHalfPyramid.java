package Patterns;
import java.util.Scanner;
public class InvertedRotatedHalfPyramid {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //outer loop to print rows or to terminate line
        for (int i=1;i<=n;i++){
            //inner loop to print starting space
            //for(int j=1;j<=n-i;j++) also do same thing.
            for (int j=i;j<=n;j++){
                System.out.print(" ");
            }

            //inner loop to print last space
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
