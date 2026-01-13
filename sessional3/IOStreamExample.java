package sessional3;

import java.io.*;
public class IOStreamExample {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\arpit\\Desktop\\JAVA\\sessional3\\input.txt");
            FileOutputStream fos = new FileOutputStream("C:\\Users\\arpit\\Desktop\\JAVA\\sessional3\\output.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            int data;
            while ((data = bis.read()) != -1) {
                bos.write(data);
            }
            bis.close();
            bos.close();
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.err.println("I/O Error: " + e.getMessage());
        }
    }
}


