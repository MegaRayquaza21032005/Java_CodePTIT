package danhsachsinhvien1;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        //Doc FIle nhi phan
        ObjectInputStream obj = new ObjectInputStream(new FileInputStream("SV.in"));
        ArrayList<SinhVien> arr = (ArrayList<SinhVien>) obj.readObject();
//        obj.close();
        for(SinhVien sv : arr) {
            System.out.println(sv);
        }
    }
}
