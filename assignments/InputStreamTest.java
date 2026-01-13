
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamTest {
    public static void main(String[] args) {
        String filename = "InputStreamTest.java";
        
        try (FileInputStream fis = new FileInputStream(filename)) {
            
            int totalBytes = fis.available();
            System.out.println("Total bytes available: " + totalBytes);
            
            int oneFourth = totalBytes / 4;
            
            System.out.println("\nReading first one-fourth byte by byte:");
            for (int i = 0; i < oneFourth; i++) {
                int byteData = fis.read();
                if (byteData != -1) {
                    System.out.print((char) byteData);
                }
            }
            
            System.out.println("\n\nRemaining bytes: " + fis.available());
            
            byte[] buffer = new byte[oneFourth];
            int bytesRead = fis.read(buffer);
            String content = new String(buffer, 0, bytesRead);
            System.out.println("\nSecond one-fourth content:");
            System.out.println(content);
            
            long skipped = fis.skip(oneFourth);
            System.out.println("\nSkipped " + skipped + " bytes");
            
            System.out.println("Bytes still available: " + fis.available());
            
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }
    }
}