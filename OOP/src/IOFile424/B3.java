package vn.codegym.IOFile424;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class B3 {
    public static void main(String[] args) {
        File file = new File("java/vn/codegym/IOFile424/DATA.in");
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            List list = new ArrayList<>();
            String line = bufferedReader.readLine();
            System.out.println(line);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
