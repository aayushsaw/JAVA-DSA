package Function;

import java.util.Scanner;

public class xPown {
    public static int calPower(int x ,int n){
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }

        //this is for stack height same a input = n
//        int xPownm1 = calPower(x,n-1);
//        int xPown = x * xPownm1;
//        return xPown;

        //this is for stack height = logn

        if(n%2 == 0){//for even value
            return calPower(x,n/2) * calPower(x,n/2);
        }
        else{//For odd value
            return calPower(x,n/2) * calPower(x,n/2) * x;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        int ans = calPower(x,n);
        System.out.println(ans);
    }
}
