package twoDaaray;
import java.util.Scanner;
public class IndexofX {
    public static void main (String Args[]){
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();


        int number[][] = new int[row][col];

        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                number[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();

        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                if(number[i][j]==x){
                    System.out.print("Number is found at ("+i + ","+j+")");
                }
            }
        }
    }
}
