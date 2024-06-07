package hieunq23_117;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyDongVat {
    public static ArrayList<DongVat> arrLst = new ArrayList<DongVat>();
   
    public static void nhap() {
        System.out.println("Nhap so luong dong vat: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 0; i < number; i++) {
            DongVat dv = new DongVat();
            System.out.println("Nhap ten: ");
            String ten = sc.next();
            dv.setTen(ten);
            
            System.out.println("Nhap can nang: ");
            int canNang = sc.nextInt();
            dv.setCanNang(canNang);
            
            System.out.println("Nhap gioi tinh: ");
            int gioiTinh = sc.nextInt();
            dv.setGioiTinh(gioiTinh);
            
            arrLst.add(dv);
        }
    }
    
    public static void xuat() {
        for (int i = 0; i < arrLst.size(); i++) {
            System.out.println("Ten: " + arrLst.get(i).getTen());
            System.out.println("Can nang: " + arrLst.get(i).getCanNang());
            System.out.println("Gioi tinh: " + arrLst.get(i).getGioiTinh());
        }
    }
    
    public static void timTen() {
        System.out.println("Nhap ten can tim: ");
        Scanner sc = new Scanner(System.in);
        String ten = sc.next();
        
        for (int i = 0; i < arrLst.size(); i++) {
            if (arrLst.get(i).getTen().equals(ten)) {
                System.out.println("Ten: " + arrLst.get(i).getTen());
                System.out.println("Can nang: " + arrLst.get(i).getCanNang());
                System.out.println("Gioi tinh: " + arrLst.get(i).getGioiTinh());
            }
            else {
                System.out.println("Khong co");
            }
        }
    }
    
    public static void timKhoangCanNang() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tu: ");
        int tu = sc.nextInt();
        System.out.println("Den: ");
        int den = sc.nextInt();
        
        for (int i = 0; i < arrLst.size(); i++) {
            if (arrLst.get(i).getCanNang() >= tu && arrLst.get(i).getCanNang() <= den) {
                System.out.println("Ten: " + arrLst.get(i).getTen());
                System.out.println("Can nang: " + arrLst.get(i).getCanNang());
                System.out.println("Gioi tinh: " + arrLst.get(i).getGioiTinh());
            }
            else {
                System.out.println("Khong co");
            }
        }
    }
    
    public static void taoThuCung() {
        ThuCung tc = new ThuCung("cho1", "cho", 2, 1);
        System.out.println("Ten: " + tc.getTen());
        System.out.println("Can nang: " + tc.getCanNang());
        System.out.println("Gioi tinh: " + tc.getGioiTinh());
        System.out.println("Ma thu cung: " + tc.maThuCung);
    }
}
