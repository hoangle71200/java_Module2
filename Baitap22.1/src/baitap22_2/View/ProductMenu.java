package baitap22_2.View;

import Baitap20_2_1.input.Input;
import baitap22_2.Controller.ProductController;
import baitap22_2.IOFile.IOFile;
import baitap22_2.Model.Product;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class ProductMenu {
    private Scanner sc = new Scanner(System.in);
    private ProductController productController = new ProductController();
    public void showMainMenu() throws IOException {
        int choice;
        do {
            System.out.println("------------ Product Manager -----------");
            System.out.println("1.Add product");
            System.out.println("2.Edit product");
            System.out.println("3.Delete product");
            System.out.println("4.Show all product");
            System.out.println("5.Find By Name");
            System.out.println("6.Find By Type");
            System.out.println("7.Find By ID");
            System.out.println("8.Read file");
            System.out.println("Enter choice: ");
            choice = Input.getNumber();
            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    editProduct();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    showAllProduct();
                    break;
                case 5:
                    findByName();
                    break;
                case 6:
                    findByType();
                    break;
                case 7:
                    findByID();
                    break;
                case 8:
                    showReadFile();
                    break;
            }
        } while (choice != 0);
    }
    public void addProduct() {
        System.out.println("---------- Add Product ----------");
        System.out.println("Enter id: ");
        int addID = Input.getNumber();
        System.out.println("Enter name: ");
        String addName = Input.getString();
        System.out.println("Enter quantity");
        int addQuantity = Input.getNumber();
        System.out.println("Enter price: ");
        int addPrice = Input.getNumber();
        System.out.println("Enter type: ");
        String addType = Input.getString();
        Product addProduct = new Product(addID, addName, addQuantity, addPrice, addType);
        productController.add(addProduct);
        IOFile.writeFile(productController.findAll());
        System.out.println("Add Success");
    }
    public void editProduct() {
        System.out.println("---------- Edit Product ----------");
        System.out.println("Enter ID edit: ");
        int editID = Input.getNumber();
        int checkID = productController.findByID(editID);
        if(checkID == -1) {
            System.out.println("Do not have this ID");
        } else {
            System.out.println("Enter name: ");
            String editName = Input.getString();
            System.out.println("Enter quantity");
            int editQuantity = Input.getNumber();
            System.out.println("Enter price: ");
            int editPrice = Input.getNumber();
            System.out.println("Enter type: ");
            String editType = Input.getString();
            Product editProduct = new Product(editID, editName, editQuantity, editPrice, editType);
            productController.edit(checkID, editProduct);
            IOFile.writeFile(productController.findAll());
            System.out.println("Edit Success");
        }
    }
    public void deleteProduct() {
        System.out.println("---------- Delete Product ----------");
        System.out.println("Enter ID Delete");
        int deleteID = Input.getNumber();
        int checkID = productController.findByID(deleteID);
        if(checkID == -1) {
            System.out.println("Do not have this ID");
        } else {
            productController.delete(checkID);
            IOFile.writeFile(productController.findAll());
            System.out.println("Delete Success");
        }
    }
    public void showAllProduct() {
        System.out.println("---------- All Product ----------");
        List<Product> listShow = productController.findAll();
        for (Product product: listShow) {
            System.out.println(product);
        }
        System.out.println("---------- End Product ----------");

    }
    public void findByName() {
        System.out.println("---------- Find Product By Name ----------");
        System.out.println("Enter Name find");
        String findName = Input.getString();
        List<Integer> checkName = productController.findByName(findName);
        if (checkName.size() == 0) {
            System.out.println("Do not have this Name");
        } else {
            for (int i = 0; i < checkName.size(); i++) {
                System.out.println(productController.findAll().get(checkName.get(i)));
            }
        }
    }
    public void findByType() {
        System.out.println("---------- Find Product By Type ----------");
        System.out.println("Enter Type find");
        String findType = Input.getString();
        List<Integer> checkType = productController.findByType(findType);
        if (checkType.size() == 0) {
            System.out.println("Do not have this Type");
        } else {
            for (int i = 0; i < checkType.size(); i++) {
                System.out.println(productController.findAll().get(checkType.get(i)));
            }
        }
    }
    public void findByID() {
        System.out.println("---------- Find Product By ID ----------");
        System.out.println("Enter ID find");
        int index = Input.getNumber();
        int checkID = productController.findByID(index);
        if (checkID == -1) {
            System.out.println("Do not have this ID");
        } else {
            System.out.println(productController.findAll().get(checkID));
        }
    }
    public void showReadFile() {
        for (Product product: IOFile.readFile()) {
            System.out.println(product);
        }
    }
}
