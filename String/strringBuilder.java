package String;

public class strringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //Char at index 0
        System.out.println(sb.charAt(0));

        //set char at index 0
        sb.setCharAt(0, 'R');
        System.out.println("It set R at 0 index in place of T : "+sb);

        //Insert any char at any index
        sb.insert(2, 'n');
        sb.insert(0, 'T');
        System.out.println("It insert T at 0 and n at 2 index : "+sb);

        //Delete any char from any index or any string
        sb.delete(0, 2);
        System.out.println("It delete char from 0,1 index : "+sb);

        //Delete for any particular index
        sb.deleteCharAt(2);
        System.out.println("It delete char from 2 index : "+sb);

        //Append Something means add in end
        sb.append("y");
        System.out.println("It Appends y : "+sb);

        // .length is used to get the length of string
        System.out.println(sb.length());

        //reverse is used to reverse the string.
        System.out.println(sb.reverse());


    }


}
