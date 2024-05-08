package LuyenTap;

import java.io.*;

public class B2 {
    public static void main(String[] args) {
        File file = new File("src/LuyenTap/Hello.txt");
        FileReader fileReader;
        {
            try {
                fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                System.out.println(bufferedReader.readLine());
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
