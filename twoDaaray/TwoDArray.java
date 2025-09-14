package twoDaaray;
import java.util.Scanner;
public class TwoDArray {
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);


        int row  = sc.nextInt();
        int col = sc.nextInt();

        int number[][] = new int[row][col];

        //Input
        //Rows
        for(int i = 0; i<row ; i++){
            //columns
            for(int j=0;j<col;j++){
                number[i][j] = sc.nextInt();
            }
        }

        //Output
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(number[i][j]+" ");
            }
            System.out.println();
        }

    }
}
