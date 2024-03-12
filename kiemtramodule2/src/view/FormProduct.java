package view;

import controller.ProductController;
import input.Input;
import iofile.IOFileProduct;
import model.Product;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class FormProduct {
    private ProductController productController = new ProductController();
    private Scanner sc = new Scanner(System.in);
    public void showFormProduct() {
        int choice;
        do {
            System.out.println("======== CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM ========");
            System.out.println("Chọn chức năng theo số (để tiếp tục)");
            System.out.println("1. Xem danh sách");
            System.out.println("2. Thêm mới");
            System.out.println("3. Cập nhật");
            System.out.println("4. Xóa");
            System.out.println("5. Sắp xếp");
            System.out.println("6. Tìm sản phẩm có giá đắt nhất");
            System.out.println("7. Đọc từ file");
            System.out.println("8. Ghi vào file");
            System.out.println("9. Thoát");
            System.out.printf("Chọn chức năng: ");
            choice = Input.getNumber();
            switch (choice) {
                case 1:
                    showAllProduct();
                    System.out.println();
                    break;
                case 2:
                    addProduct();
                    System.out.println();
                    break;
                case 3:
                    editProduct();
                    System.out.println();
                    break;
                case 4:
                    deleteProduct();
                    System.out.println();
                    break;
                case 5:
                    sortProduct();
                    System.out.println();
                    break;
                case 6:
                    findByMaxPrice();
                    System.out.println();
                    break;
                case 7:
                    readFile();
                    System.out.println();
                    break;
                case 8:
                    writeFile();
                    System.out.println();
                    break;
                case 9:
                    break;
            }
        } while (choice != 0);
    }
    public void addProduct() {
        System.out.println("---------- Thêm sản phẩm ----------");
        System.out.println("Enter id: ");
        int addID = Input.getNumber();
        System.out.println("Enter name: ");
        String addName = Input.getString();
        System.out.println("Enter price: ");
        float addPrice = Input.getNumber();
        System.out.println("Enter quantity: ");
        int addQuantity = Input.getNumber();
        System.out.println("Enter description");
        String addDescription = Input.getString();
        Product addProduct = new Product(addID, addName, addPrice, addQuantity, addDescription);
        productController.add(addProduct);
        System.out.println("Thêm mới thành công");
    }
    public void editProduct() {
        System.out.println("---------- Cập nhật sản phẩm ----------");
        System.out.println("Nhập mã sản phẩm cần sửa: ");
        int findID = Input.getNumber();
        int checkID = productController.findByID(findID);
        if(checkID == -1) {
            System.out.println("Không tìm được sản phẩm với mã sản phẩm trên.");
        } else {
            System.out.println(productController.findAll().get(checkID));
            System.out.println("Nhập mã mới: ");
            int editID = Input.getNumber();
            System.out.println("Nhập tên mới: ");
            String editName = Input.getString();
            System.out.println("Nhập giá mới: ");
            float editPrice = Input.getNumber();
            System.out.println("Nhập số lượng mới: ");
            int editQuantity = Input.getNumber();
            System.out.println("Nhập mô tả mới: ");
            String editDescription = Input.getString();
            Product editProduct = new Product(editID, editName, editPrice, editQuantity, editDescription);
            productController.edit(checkID, editProduct);
            System.out.println("Sửa thành công");

        }
    }
    public void deleteProduct() {
        System.out.println("---------- Xóa sản phẩm ----------");
        System.out.println("Nhập mã sản phẩm muốn xóa: ");
        int deleteID = Input.getNumber();
        int checkID = productController.findByID(deleteID);
        if(checkID == -1) {
            System.out.println("Không tìm được sản phẩm với mã sản phẩm trên.");
        } else {
            System.out.println("Xác nhận xóa? Y/N");
            String isDelete = Input.getString();
            if (isDelete.equals("Y")) {
                productController.delete(checkID);
                System.out.println("Xóa thành công");
            } else {
                return;
            }
        }
    }
    public void showAllProduct () {
        System.out.println("---------- Hiển thị danh sách ----------");
        System.out.println("1. Thêm mới");
        List<Product> listShowAll = productController.findAll();
        for (Product product: listShowAll) {
            System.out.println(product);
        }
        int choice = Input.getNumber();
        if (choice == 1) {
            addProduct();
        } else
            return;
    }
    public void sortProduct() {
        System.out.println("1. Sắp xếp tăng dần");
        System.out.println("2. Sắp xếp giảm dần");
        System.out.println("3. Về menu");
        int choice = Input.getNumber();
        switch (choice) {
            case 1:
                System.out.println("---------- Tăng dần ----------");
                sortUp();
                showAllProduct();
                break;
            case 2:
                System.out.println("---------- Giảm dần ----------");
                sortDown();
                showAllProduct();
                break;
            case 3:
                return;
        }
    }
    public void findByMaxPrice() {
        System.out.println("---------- Sản phẩm có giá đắt nhất ----------");
        sortDown();
        System.out.println(productController.findAll().get(0));
    }
    public void readFile() {
        for (Product product: IOFileProduct.readFileProduct()) {
            System.out.println(product);
        }
    }
    public void writeFile() {
        IOFileProduct.writeFileProduct(productController.findAll());
        System.out.println("Ghi thành công");
    }
    public void sortDown() {
        Collections.sort(productController.findAll(), new Comparator<Product>() {
            @Override
            public int compare(Product pr1, Product pr2) {
                if (pr1.getPrice() < pr2.getPrice()) {
                    return 1;
                } else {
                    if (pr1.getPrice() == pr2.getPrice()) {
                        return 0;
                    } else {
                        return -1;
                    }
                }
            }
        });
    }
    public void sortUp() {
        Collections.sort(productController.findAll(), new Comparator<Product>() {
            @Override
            public int compare(Product pr1, Product pr2) {
                if (pr1.getPrice() > pr2.getPrice()) {
                    return 1;
                } else {
                    if (pr1.getPrice() == pr2.getPrice()) {
                        return 0;
                    } else {
                        return -1;
                    }
                }
            }
        });
    }
}
