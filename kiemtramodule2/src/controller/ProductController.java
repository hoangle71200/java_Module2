package controller;

import iofile.IOFileProduct;
import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductController implements IController<Product> {
    List<Product> list = IOFileProduct.readFileProduct();
    @Override
    public void add(Product product) {
        list.add(product);
    }

    @Override
    public void edit(int index, Product product) {
        list.set(index, product);
    }

    @Override
    public void delete(int index) {
        list.remove(index);
    }

    @Override
    public List<Product> findAll() {
        return list;
    }

    @Override
    public int findByID(int id) {
        for (int i = 0; i < list.size(); i++) {
            if(id == list.get(i).getId()) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> listByName = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getName().contains(name)) {
                listByName.add(list.get(i));
            }
        }
        return listByName;
    }
}
