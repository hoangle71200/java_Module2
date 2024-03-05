package baitap22_2.IOFile;

import baitap22_2.Model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOFile {
    private static File file = new File("src/baitap22_2/Data/products.csv");
    public static List<Product> readFile() {
        List<Product> listReader = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                Product readProduct = new Product(Integer.parseInt(data[0]), data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]), data[4]);
                listReader.add(readProduct);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.err.println("Error IOException");
        }
        return listReader;
    }
    public static void writeFile(List<Product> listWriter) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String data = "";
            for (Product product: listWriter) {
                data += product.getId() + "," + product.getName() + "," + product.getQuantity() + "," + product.getPrice() + "," + product.getType() + "\n";
            }
            bufferedWriter.write(data);
            bufferedWriter.close();
        } catch (IOException e) {
            System.err.println("Error IOException");
        }
    }
}
