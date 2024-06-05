package hieunq23_117;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = 0;
        while(number >= 0) {
            switch(number) {
                case 1:
                    QuanLyDongVat.nhap();
                    break;
                case 2:
                    QuanLyDongVat.xuat();
                    break;
                case 3:
                    QuanLyDongVat.timTen();
                    break;
                case 4:
                    QuanLyDongVat.timKhoangCanNang();
                    break;
                case 5:
                    QuanLyDongVat.taoThuCung();
                    break;
                case 0:
                    break;
            }
            System.out.println("1. Nhap ds doi tuong");
            System.out.println("2. Xuat ds doi tuong");
            System.out.println("3. Tim theo ten");
            System.out.println("4. Tim theo can nang");
            System.out.println("5. Thoat");
            
            System.out.println("Nhap lua chon: ");
            Scanner sc = new Scanner(System.in);
            number = sc.nextInt();
            if (number == 0) {
                break;
            }
        } 
    }
    
}
