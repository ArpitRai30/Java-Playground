import java.io.*;

public class AddLineNumbers {
    public static void main(String[] args) {
        String inputFile = "C:\\Users\\arpit\\Desktop\\JAVA\\assignments\\input.txt";   
        String outputFile = "C:\\Users\\arpit\\Desktop\\JAVA\\assignments\\output.txt"; 

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            String line;
            int lineNumber = 1;

            while ((line = reader.readLine()) != null) {
                // Write line number + line content to output file
                writer.write(lineNumber + ": " + line);
                writer.newLine(); // move to next line
                lineNumber++;
            }

            reader.close();
            writer.close();

            System.out.println("File created successfully with line numbers in " + outputFile);

        } catch (IOException e) {
            System.out.println("Error processing file: " + e.getMessage());
        }
    }
}
