package String;

public class Compare {
    public static void main(String[] args) {
        //compare
        String s1 = "Aayush";
        String s2 = "Aayush";

        //1. s1 > s2 : +ve value
        //2. s1 == s2 : 0
        //3. s1 < s2 : -ve value


        //We use .compareTo method to compare string.

//        if(s1.compareTo(s2) == 0){
//            System.out.println("Strings are the same");
//        }
//        else{
//            System.out.println("Strings are not the same");
//        }
        //Output : Strings are the same

        //You have question we can same thing using ==

//        if(s1 == s2){
//            System.out.println("Strings are the same");
//        }else {
//            System.out.println("Strings are not the same");
//        }
        //Output : Strings are the same

        //But in some cases == fails and you cannot find the difference.
        //For example

        if(new String("Aayush") == new String("Aayush")){
            System.out.println("Strings are the same");
        }
        else{
            System.out.println("Strings are not the same");
        }
        //Output : Strings are not same.
        // In this case it fail new String are declare object type non-primitive datatype
        //Primitive type memory store can differ from object type non-primitive memory storage
    }
}
