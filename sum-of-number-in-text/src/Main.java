import java.io.*;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)  {
    sumNumberInText("demo.txt");
    }
    public static double sumNumberInText(String filename){
        try {
            File file = new File(filename);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
        BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while  ((line = br.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("Tổng là:" + sum);
        }catch (Exception o){
            System.err.println("file không tồn tại hoặc nội dung nỗi");
        }
        return 0;
    }

}