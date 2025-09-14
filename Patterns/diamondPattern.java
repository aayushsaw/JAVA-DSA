package Patterns;

public class diamondPattern {
    public static void main(String[] args) {
        int n = 4;

        //Upper half
        for(int i=1;i<=n;i++){
            //Space
            for(int j = 1; j<=n-i ;j++){
                System.out.print(" ");
            }
            //Star
            for(int j=1; j<=2*i-1 ;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //lower half
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
