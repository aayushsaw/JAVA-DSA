package Patterns;

public class palindromeNoPyramid {
    public static void main(String args[]){
        int n = 5;

        //outer loop

        for(int i=1;i<=n;i++){
            //space (1 to n-i)
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //number 1 and before 1(i to 1)
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            //number after 1(2 to i)
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
