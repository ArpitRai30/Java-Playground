import java.io.*;

public class InputStreamDemo {
    public static void main(String[] args) {
        String filename = "C:\\Users\\arpit\\Desktop\\JAVA\\assignments\\InputStreamDemo.java";

        try {
            FileInputStream fis = new FileInputStream(filename);

            int totalBytes = fis.available();
            System.out.println("Total bytes in the file: " + totalBytes);

            int quarter = totalBytes / 4;

            System.out.println("\nFirst 1/4 of file (byte by byte)");
            for (int i = 0; i < quarter; i++) {
                int b = fis.read(); 
                System.out.print((char) b); 
            }
            System.out.println("\n\nBytes remaining after first read: " + fis.available());

            byte[] buffer = new byte[quarter];
            int bytesRead = fis.read(buffer); 
            String text = new String(buffer, 0, bytesRead);
            System.out.println("\nNext 1/4 of file (using byte array)");
            System.out.println(text);

            long bytesSkipped = fis.skip(quarter);
            System.out.println("\nBytes skipped: " + bytesSkipped);

            System.out.println("Bytes still available after skipping: " + fis.available());

            fis.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
        }
    }
}
