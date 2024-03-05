package baitap22_2.Controller;

import baitap22_2.IOFile.IOFile;
import baitap22_2.Model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductController implements IController<Product> {
    private Scanner sc = new Scanner(System.in);
//    private List<Product> list = new ArrayList<>();
    private List<Product> list = IOFile.readFile();

    @Override
    public void add(Product product) {
        list.add(product);
    }

    @Override
    public void edit(int id, Product product) {
        list.set(id, product);
    }

    @Override
    public void delete(int id) {
        list.remove(id);
    }

    @Override
    public List findAll() {
        return list;
    }

    @Override
    public int findByID(int id) {
        for (int i = 0; i < list.size(); i++) {
            if(id == list.get(i).getId()){
                return i;
            }
        }
        return -1;
    }

    @Override
    public List findByName(String name) {
        List<Integer> listByName = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getName().contains(name)){
                listByName.add(i);
            }
        }
        return listByName;
    }

    @Override
    public List findByType(String type) {
        List<Integer> listByType = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getType().equals(type)){
                listByType.add(i);
            }
        }
        return listByType;
    }
}
