package quizutama.jawabannomordua;

import java.util.Scanner;

public class MainSoalNomorDua {
    public static void main(String[] args){
        Integer pilih;
        DataWarga dataWarga = new DataWarga();
        IuranWarga iuranWarga = new IuranWarga();
        String lanjutBayar = "";
        Scanner scanner = new Scanner(System.in);
        String borderHeader = "==============================";
        System.out.println(borderHeader);
        System.out.println("Pendataan dan Pembayaran Iuran Warga");
        System.out.println(borderHeader);
        System.out.println("1. Input data warga");
        System.out.println("2. Input Iuran Warga");
        pilih = scanner.nextInt();

        System.out.println("PILIHAN MENU : " + pilih);

        if(pilih == 1){
            dataWarga.inputData();
            System.out.println("Lanjut bayar iuran");
            lanjutBayar = scanner.next();
        }
        if("ya".equalsIgnoreCase(lanjutBayar) || pilih == 2){
            iuranWarga.inputData();
            System.out.println();
            System.out.println();
            String doublePipe = "||";

            String doubleSpace = "  ";
            System.out.println(doublePipe + " NIK                           " + doublePipe + doubleSpace + dataWarga.getNik());
            System.out.println(doublePipe + " Total Pembayaran Iuran Warga  " + doublePipe + doubleSpace + iuranWarga.menghitungTotalIuranWarga());
            System.out.println("Terimakasih " + dataWarga.getNama() + " Iuran Anda Sudah dibayarkan");
        }
    }
}
