package String;

public class StringOperations {
    public static void main(String[] args) {
        String firstName = "James";
        String lastName = "Smith";

        //Concatenation
        String fullName = firstName + "@" + lastName;

        //James@Smith = 11 used .lenght()
        System.out.println(fullName.length());

        //charAt
        for(int i = 0; i < fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }

    }
}
