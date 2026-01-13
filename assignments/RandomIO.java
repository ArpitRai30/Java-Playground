import java.io.*;

public class RandomIO {
    public static void main(String[] args) {
        String filename = "C:\\Users\\arpit\\Desktop\\JAVA\\assignments\\rand.txt";

        try {
            RandomAccessFile raf = new RandomAccessFile(filename, "rw");

            raf.writeChar('X');      
            raf.writeInt(555);       
            raf.writeDouble(3.1412); 

            System.out.println("Data written to file successfully.");

            raf.seek(0); 
            char c = raf.readChar();
            int i = raf.readInt();
            double d = raf.readDouble();
            System.out.println("\nValues read from file:");
            System.out.println("Char: " + c);
            System.out.println("Int: " + i);
            System.out.println("Double: " + d);

            raf.seek(2); 
            int secondInt = raf.readInt();
            System.out.println("\nInteger at second item: " + secondInt);

            raf.seek(raf.length()); // move to end
            raf.writeBoolean(false);
            System.out.println("\nBoolean value appended at the end of file.");

            raf.seek(4);
            boolean b = raf.readBoolean();
            System.out.println("\nBoolean read from byte 4: " + b);

            raf.close();

        } catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
        }
    }
}
