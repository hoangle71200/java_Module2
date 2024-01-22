import static java.lang.Math.max;
import java.util.Scanner;


public class Bai2 {

    public static void main(String[] args) {
        nhap();
    }

    static String dao(String s){
        String s1 = "";
        for(int i = 0; i< s.length(); i++ )
            s1+= s.charAt(s.length()-1-i);
        return s1; // chuoi sau khi dao
    }

    static String add(String s1, String s2 ){
        String s = "";
        int nho = 0;
        int max = max(s1.length(), s2.length());
        s1 = dao(s1);
        s2 = dao(s2);
        for(int i = max; i>s1.length(); i-- ) s1+= "0";
        for(int i = max; i>s2.length(); i-- ) s2+= "0";
        for(int i = 0; i< max; i++ ){
            int x = s1.charAt(i) - '0' + s2.charAt(i) - '0' + nho;
            s+= x%10;
            nho = x/10;
        }
        if(nho > 0 ) s+= 1;
        s = dao(s);
        return s;
    }