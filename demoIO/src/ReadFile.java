import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        int ch;
        FileReader rd = null;
        try {
            rd = new FileReader("output.txt");
        }catch (FileNotFoundException fe){
            System.out.println("file not found");
        }
        while ((ch=rd.read()) !=-1){
            System.out.print((char) ch);
        }
        rd.close();
    }
}
