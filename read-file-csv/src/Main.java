import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Countries> myList = new ArrayList<>();
    try {
        File file = new File("demo.csv");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line="";
        while ((line = br.readLine())!= null){
            String[] temp = line.split(",");
            myList.add(new Countries(temp[0],temp[1],temp[2]));
        }
    }catch (IOException e){{
        System.err.println(e);
    }
    }
        for(Countries c:myList){
            System.out.println(c);
        }
    }
}