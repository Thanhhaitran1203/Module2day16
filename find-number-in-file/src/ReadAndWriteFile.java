import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath){
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line ="";
            while ((line = br.readLine()) != null){
                numbers.add(Integer.parseInt(line));
            }
            br.close();
        }catch (IOException e){
            System.out.println("File không tồn tại hoặc nội dung có lỗi");
        }
        return numbers;
    }
    public void writeFile(String filePath, int max){
        try {
            FileWriter fw = new FileWriter(filePath,true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Giá trị lớn nhấn là "+max);
            bw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
