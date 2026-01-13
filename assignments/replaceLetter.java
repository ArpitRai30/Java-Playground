import java.util.Scanner;

public class replaceLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String input = sc.nextLine();
        String result = input.replace('e', 'i');
        System.out.println("New String: " + result);
    }
}
