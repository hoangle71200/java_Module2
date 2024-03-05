package baitap22_2.IOFile;

import baitap22_2.Model.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOFileUser {
    private static File file = new File("src/baitap22_2/Data/user.csv");
    public static List<User> readFile() {
        List<User> listReader = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                User readUser = new User(Integer.parseInt(data[0]), data[1], data[2], data[3]);
                listReader.add(readUser);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.err.println("Error IOException");
        }
        return listReader;
    }
    public static void writeFile(List<User> listWriter) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String data = "";
            for (User user: listWriter) {
                data += user.getId() + "," + user.getUsername() + "," + user.getPassword() + "," + user.getType() + "\n";
            }
            bufferedWriter.write(data);
            bufferedWriter.close();
        } catch (IOException e) {
            System.err.println("Error IOException");
        }
    }
}
