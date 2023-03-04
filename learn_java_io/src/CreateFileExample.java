import java.io.File;
import java.io.IOException;

public class CreateFileExample {
    public static void main(String[] args) {
        File file = new File("D:\\learn_io_java\\newfile.txt");
        try {
            if(file.createNewFile()) {
                System.out.println("File is created");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
