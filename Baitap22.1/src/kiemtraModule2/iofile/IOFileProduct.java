package kiemtraModule2.iofile;

import CaseStudy.Model.User;
import kiemtraModule2.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class IOFileProduct {
    private static Scanner sc = new Scanner(System.in);
    private static File fileProduct = new File("src/kiemtraModule2/data/Product.csv");
    public static List<Product> readFileProduct() {
        List<Product> users = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(fileUser);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                User userData = new User(Integer.parseInt(data[0]), data[1], data[2], data[3]);
                users.add(userData);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("IOException Error");
        }
        return users;
    }
    public static void writeFileUser(List<User> fileUserWriter) {
        try {
            FileWriter fileWriter = new FileWriter(fileUser);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String data = "";
            List<Integer> idUserList = new ArrayList<>();
            for (int i = 0; i < fileUserWriter.size(); i++) {
                idUserList.add(fileUserWriter.get(i).getId());
            }
            idUserList.sort(Comparator.naturalOrder());
            for (User u: fileUserWriter) {
                data += u.getId() + "," + u.getUsername() + "," + u.getPassword() + "," + u.getPosition()  + "\n";
            }
            bufferedWriter.write(data);
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("IOException error");
        }

    }
}
