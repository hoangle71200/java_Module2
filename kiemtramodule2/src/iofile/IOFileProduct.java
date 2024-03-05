package iofile;

import model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class IOFileProduct {
    private static Scanner sc = new Scanner(System.in);
    private static File fileProduct = new File("src/data/Product.csv");
    public static List<Product> readFileProduct() {
        List<Product> products = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(fileProduct);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                Product productData = new Product(Integer.parseInt(data[0]), data[1], Float.parseFloat(data[2]), Integer.parseInt(data[3]), data[4]);
                products.add(productData);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("IOException Error");
        }
        return products;
    }
    public static void writeFileProduct(List<Product> fileProductWriter) {
        try {
            FileWriter fileWriter = new FileWriter(fileProduct);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String data = "";
            for (Product p: fileProductWriter) {
                data += p.getId() + "," + p.getName() + "," + p.getPrice() + "," + p.getQuantity() + "," + p.getDescription()  + "\n";
            }
            bufferedWriter.write(data);
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("IOException error");
        }

    }
}
