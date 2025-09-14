package String;

public class subString {
    public static void main(String[] args) {

//        String sentence = "My name is Jack";
//        String name = sentence.substring(11,sentence.length());
//        System.out.println(name);

        String sentence = "TonyStark";
        String name = sentence.substring(0,4);
        System.out.println(name);

        //Strings are Immutable(Not add anything and not modify)
        //for this operation like add modify we make a new string
        //And to provide ease their is String builder class
        //which is used for doing this.
    }
}
