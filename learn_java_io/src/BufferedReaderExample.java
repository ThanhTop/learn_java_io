import java.io.*;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("D:\\learn_io_java\\newfile.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        line = bufferedReader.readLine();
        System.out.println(line);
    }
}
