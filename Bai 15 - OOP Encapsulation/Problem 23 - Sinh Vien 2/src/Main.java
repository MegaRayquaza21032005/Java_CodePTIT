import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<SinhVien> arr = new ArrayList<>();
        for(int i = 1; i <= n; ++i) {
            sc.nextLine();
            String name = sc.nextLine();
            String birth = sc.nextLine();
            String className = sc.nextLine();
            double gpa = sc.nextDouble();
            SinhVien s = new SinhVien(i, name, birth, className, gpa);
            s.chuanHoaBirth();
            s.chuanHoaName();
            arr.add(s);
        }

        Collections.sort(arr, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if(o1.getGpa() < o2.getGpa()) return 1;
                else return  -1;
            }
        });
        for(SinhVien x : arr)
        {
            System.out.println(x);
        }
    }
}

/*
3
Nguyen Thanh Dat
21/03/2005
CN10
3,8
NGUYen tU kIEn
08/01/05
CN03
3,6
ngUyen Quang Chien
16/1/05
CN10
4,0

SV003 16/01/0005 CN10 16/1/05 4,00
SV001 21/03/2005 CN10 21/03/2005 3,80
SV002 08/01/0005 CN03 08/01/05 3,60

 */