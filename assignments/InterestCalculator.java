import java.io.*;

public class InterestCalculator {
    public static void main(String[] args) {
        DataInputStream dis = new DataInputStream(System.in);

        try {
            System.out.print("Enter Principal Amount (P): ");
            double principal = Double.parseDouble(dis.readLine());

            System.out.print("Enter Rate of Interest (R) in %: ");
            double rate = Double.parseDouble(dis.readLine());
            System.out.print("Enter Number of Years (T): ");
            double time = Double.parseDouble(dis.readLine());

            double simpleInterest = (principal * rate * time) / 100;

            System.out.println("Simple Interest (SI) = " + simpleInterest);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter numeric values only.");
        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
        } finally {
            try {
                dis.close();
            } catch (IOException e) {
                System.out.println("Error closing input stream.");
            }
        }
    }
}
