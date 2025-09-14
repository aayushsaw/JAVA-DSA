package Patterns;
import java.util.Scanner;
public class floydTriangle {
    public static void main(String Args[]){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int num =1;

        //outer loop for no of rows and termination
        for(int i = 1; i<=n ; i++){

            //inner loop for structure to print
            for(int j=1; j<=i;j++){
                //use num and increment it to print continues number like 1,2,3,..
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
}
