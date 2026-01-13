import java.util.Scanner;

public class CompanyInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter companies and value: ");
        String sample = sc.nextLine();
        String[] companies = sample.split("@");

        for (int i = 0; i < companies.length; i++) {
            String info = companies[i];

            int slashIndex = info.indexOf('/');

            String companyName = info.substring(0, slashIndex);
            String value = info.substring(slashIndex + 1);

            System.out.println("Company name : " + companyName + ", Value : " + value);
        }
    }
}
