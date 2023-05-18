import java.util.Stack;

public class ReverseStrWStack {


    public static String reverseStr(String str){


        String str2 = "";

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) stack.push(str.charAt(i));

        for (int i = 0; i < str.length(); i++) str2 += stack.pop();


        return str2;

    }


    public static void main(String[] args) {

        String str = "almi";


        System.out.println(reverseStr(str));

    }

}
