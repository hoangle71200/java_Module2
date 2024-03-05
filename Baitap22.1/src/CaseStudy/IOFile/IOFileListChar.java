package CaseStudy.IOFile;

import CaseStudy.Model.ListChar;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IOFileListChar {
    private static Scanner sc = new Scanner(System.in);
    private static File fileLístChar = new File("src/CaseStudy/data/ListChar.csv");
    public static List<ListChar> readFileListChar() {
        List<ListChar> listCharList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(fileLístChar);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                ListChar listCharData = new ListChar(Integer.parseInt(data[0]), data[1], data[2]);
                listCharList.add(listCharData);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("IOException Error");
        }
        return listCharList;
    }
    public static void writeFileListChar(List<ListChar> fileListCharWriter) {
        try {
            FileWriter fileWriter = new FileWriter(fileLístChar);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String data = "";
            for (ListChar c: fileListCharWriter) {
                data += c.getId() + "," + c.getUsername() + "," + c.getListC() + "\n";
            }
            bufferedWriter.write(data);
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("IOException error");
        }

    }
}
