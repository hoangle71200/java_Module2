import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class TestArr {
    public static void main(String[] args) {
        int arr1[] = new int[5];
        for (int i=0; i< arr1.length; i++) {
            arr1[i] = i+1;
        }
        System.out.println(arr1[3]);
    }
}
