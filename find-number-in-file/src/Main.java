import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReadAndWriteFile raw = new ReadAndWriteFile();
        List<Integer> list = raw.readFile("int.txt");
        int maxValue = findMax(list);
        raw.writeFile("result.txt",maxValue);
    }
    public static int findMax(List<Integer> list){
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (max<list.get(i)){
                max = list.get(i);
            }
        }
        return max;
    }
}