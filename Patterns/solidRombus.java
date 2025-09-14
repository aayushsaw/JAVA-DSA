package Patterns;

public class solidRombus {
    public static void main(String Args[]){
        int n = 5;

        //outer loop
        for(int  i=1; i <= n;i++){
            //inner loop for space
            int space = n-i;
            for(int j=1; j <= space ; j++){
                System.out.print(" ");
            }

            //inner loop for print *
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
