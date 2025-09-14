package Patterns;
import java.util.Scanner;
public class HalfPyramidNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //outer for terminate the lines
        for(int i=1;i<=n;i++){
            //inner j=1 for  print 1 in every row first column
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

}