import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) throws IOException {
        FileWriter file = new FileWriter("output.txt");
        file.write("This is going to be written in the file!");
        file.close();
        System.out.println("Data written successfully.");
    }
}
