import java.util.Scanner;

public class SplitString {
    public static String[] split(String str) {
        String result = "";
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '/' || ch == '#') {
                result += " " + ch + " ";
            }
            else {
                result += ch;
            }
        }
        String[] token = result.split(" ");
        return token;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string:");
        String input = sc.nextLine();
        String[] token = split(input);
        for (String tokens : token) {
            System.out.println(tokens);
        }
    }
}