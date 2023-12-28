import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Character> readFile(String filename){
        List<Character> list = new ArrayList<>();
        try {
            File file = new File(filename);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            int line;
            while ((line = br.read())!= -1){
                list.add((char)line);
            }
            br.close();
        }catch (IOException e){
            System.out.println("File không tồn tại");
        }
        return list;
    }
    public void writeFile(List<Character> list, String fileName){
        try {
            File file = new File("result.txt");
            if (file.exists()){
                throw new FileNotFoundException();
            }
            FileWriter fw = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < list.size(); i++) {
                bw.write(list.get(i));
            }
            bw.close();
        }catch (IOException e){
            System.out.println("File đã tồn tại");
        }
    }
}