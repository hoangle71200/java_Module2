package baitap22_2.Controller;
import java.util.List;

public interface IController<E> {
    void add(E e);
    void edit(int id, E e);
    void delete(int id);
    List<E> findAll();
    int findByID(int id);
    List<E> findByName(String name);
    List<E> findByType(String type);
}
