import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReadAndWriteFile raw = new ReadAndWriteFile();
        List<Character> list = raw.readFile("demo.txt");
        raw.writeFile(list,"result.txt");
    }
}