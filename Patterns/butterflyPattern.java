package Patterns;

public class butterflyPattern {
    public static void main(String Args[]){
        int n = 4;

        //outer loop for upper half part
        for(int i=1;i<=n;i++){
            //staring *
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //middle space
            int spaces = 2*(n-i);
            for(int j=1; j<=spaces ;j++){
                System.out.print(" ");
            }
            //last *
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //outer loop for lower part
        for(int i=n;i>=1;i--){
            //staring *
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //middle space
            int spaces = 2*(n-i);
            for(int j=1; j<=spaces ;j++){
                System.out.print(" ");
            }
            //last *
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


        //outer loop for lower part
//        for(int i=1;i<=n;i++){
//            //staring *
//            for(int j=i;j<=n;j++){
//                System.out.print("*");
//            }
//            //middle space
//            for(int j=3;j<=2*i;j++){
//                System.out.print(" ");
//            }
//            //last *
//            for(int j=i;j<=n;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

    }
}
