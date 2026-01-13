import java.io.*;

public class CompareBinaryFiles {
    public static void main(String[] args) {
        String file1 = "C:\\Users\\arpit\\Desktop\\JAVA\\assignments\\file1.bin"; 
        String file2 = "C:\\Users\\arpit\\Desktop\\JAVA\\assignments\\file2.bin"; 

        try {
            FileInputStream fis1 = new FileInputStream(file1);
            FileInputStream fis2 = new FileInputStream(file2);

            boolean identical = true; // flag to check if files are same
            int byte1, byte2;
            while ((byte1 = fis1.read()) != -1) {
                byte2 = fis2.read();

                if (byte1 != byte2) {
                    identical = false;
                    break;
                }
            }
            if (fis2.read() != -1) {
                identical = false;
            }
            fis1.close();
            fis2.close();
            if (identical) {
                System.out.println("The files are identical.");
            } else {
                System.out.println("The files are different.");
            }
        } catch (IOException e) {
            System.out.println("Error reading files: " + e.getMessage());
        }
    }
}
