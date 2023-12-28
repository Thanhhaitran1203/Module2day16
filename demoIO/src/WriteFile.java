import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        String str = "hello word";
        FileWriter fw = new FileWriter("output.txt");
        for (int i = 0; i < str.length(); i++) {
            fw.write(str.charAt(i));
        }
        System.out.println("Writing successful");
        fw.close();
    }
}