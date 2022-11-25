package quizutama.jawabannomorsatu;

import java.util.Scanner;

public class MainJawabanNomorSatu {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int pilih;
        System.out.println("                  ---Distributor PT.Garuda Abadi Group---");
        System.out.println("                  =======================================");
        System.out.println("Silahkan masukan ID Anda");
        String border = "========================";
        System.out.println(border);
        System.out.print("ID : ");
        Login login = new Login();
        login.id = scanner.next();
        boolean loginAdmin = login.isLoginAdmin(login.id);

        if (loginAdmin) {
            System.out.println();
            System.out.println("Pilih Check Data Barang : ");
            System.out.println("1. Barang Masuk");
            System.out.println("2. Barang Keluar");
            System.out.println();

            System.out.print("Masukan Pilihan Data : ");
            pilih = scanner.nextInt();
            if (pilih == 1) {
                dataAdmin(scanner, border);
                BarangMasuk barangMasuk = new BarangMasuk();
                barangMasuk.pendataanBarangMasuk();

                //barang keluar
                BarangKeluar barangKeluar = new BarangKeluar();
                barangKeluar.inputBarangKeluar();
            } else if (pilih == 2) {
                dataAdmin(scanner, border);
                BarangKeluar barangKeluar = new BarangKeluar();
                barangKeluar.inputBarangKeluar();
            }
            System.out.println();
            System.out.println("Administrasi Persediaan Barang Distributor PT. Garuda Abadi Group");
            System.out.println("Check, Data dan Anter, Ketelitian Anda dalam Administrasi di Utamakan (*_*)");
        }
    }

    protected static void dataAdmin(Scanner scanner, String border) {
        System.out.println();
        System.out.println("Silahkan Masukan Data Anda");
        System.out.println(border);
        System.out.print("Nama Admin : ");
        scanner.next();
        System.out.print("NIK Admin  : ");
        scanner.next();
    }
}
