package String;
import java.util.Scanner;
public class Strings {
    public static void main(String[] args) {

        //String Declaration
//        String name ="Aayush";
//        String fullName = "Aayush Saw";
//        String Sentence = "I am Aayush Saw";

        Scanner sc = new Scanner(System.in);

        // .next is used to get a single string as a input.
        String name = sc.next();
        System.out.println("Your name is " + name);

        // .nextLine is used to get full line as a input.
        String fullName = sc.nextLine();
        System.out.println("Your Full Name is " + fullName);




    }
}
