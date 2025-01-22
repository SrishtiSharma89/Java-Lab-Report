package PackageImplementation;

import java.io.File;

public class IOPackage {
    public static void main(String[] args) {
        File file = new File("example.txt");

        if (file.exists()) {
            System.out.println("File exists: " + file.getName());
        } else {
            System.out.println("File does not exists.");
        }
    }
}
