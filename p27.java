import java.io.*;

public class p27{
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("sample.txt");
            writer.write("Hello, this is a simple file writing example!\n");
            writer.write("Java makes file handling easy.\n");
            writer.close();
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing.");
            e.printStackTrace();
        }

        // Reading from a file
        try {
            FileReader reader = new FileReader("sample.txt");
            BufferedReader br = new BufferedReader(reader);

            String line;
            System.out.println("\nReading from file:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading.");
            e.printStackTrace();
        }
    }
}
