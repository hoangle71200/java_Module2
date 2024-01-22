import java.sql.Array;
import java.util.Arrays;

public class jvArr1 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        // 1. thêm 11 vào cuối mảng
        int a1 = 11;
        int arr1[] = new int[arr.length + 1];
        arr1[arr1.length-1] = a1;
        for (int i=0; i<arr.length; i++) {
            arr1[i] = arr[i];
        }
        System.out.println(Arrays.toString(arr1));

        // 2. Thêm 11 vào giữa mảng
        int arr2[] = new int[arr.length + 1];
        arr2[arr.length/2] = a1;
        for (int i=0; i<arr.length; i++) {
            if (i<arr.length/2) {
                arr2[i] = arr[i];
            } else {
                arr2[i+1] = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr2));

        // 3. Xóa phần tử tại vị trí 3
        int index1 = 3;
        int arr3[] = new int[arr.length - 1];
        for (int i=0; i<arr3.length; i++) {
            if (i<index1) {
                arr3[i] = arr[i];
            } else {
                arr3[i] = arr[i+1];
            }
        }
        System.out.println(Arrays.toString(arr3));

        // 4. Xóa phần tử ở đầu mảng
        int arr4[] = new int[arr.length - 1];
        for (int i=0; i<arr4.length; i++) {
                arr4[i] = arr[i+1];
        }
        System.out.println(Arrays.toString(arr4));
    }
}
