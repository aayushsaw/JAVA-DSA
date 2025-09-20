package Function;

import java.util.Scanner;

public class factorial {
    public static int calfactorial(int n){
        if(n==1 || n==0) {
            return 1;
        }
        int fac_nm1 = calfactorial(n-1);
        int fac_n =  n * fac_nm1;

        return fac_n;


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans = calfactorial(n);
        System.out.println(ans);
    }
}
