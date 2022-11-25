package quizutama.jawabannomorsatu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BarangKeluar extends Data{
    Integer jmlBarangKeluar;
    Integer hargaBarangKeluar;

    public BarangKeluar() {
    }

    public Integer getHargaBarangKeluar() {
        return hargaBarangKeluar;
    }

    public BarangKeluar(Integer pilihanBarang, Integer jmlBarangKeluar, Integer hargaBarangKeluar) {
        super.pilihanBarang = pilihanBarang;
        this.jmlBarangKeluar = jmlBarangKeluar;
        this.hargaBarangKeluar = hargaBarangKeluar;
    }

    public void inputBarangKeluar() {
        System.out.println();
        System.out.println("*** Pendataan Barang Masuk PT. Garuda Abadi Group ***");
        showDataBarang();
        List<BarangKeluar> barangKeluarList = new ArrayList<>();
        while (true) {
            System.out.print("Pilihan Anda : ");
            Scanner scanner = new Scanner(System.in);
            int pilihBarang = scanner.nextInt();

            if (pilihBarang == 0) {
                break;
            } else {
                System.out.print("Banyaknya Barang Yang Keluar : ");
                int jumlahBarang = scanner.nextInt();
                System.out.println("Data Tersimpan");
                //hitungHarga
                Integer hargaBarang = hargaBarang(pilihBarang);
                Integer totalHarga = hargaBarang * jumlahBarang;
                String formatRupiahString = convertToRupiah(totalHarga);
                System.out.println("Harga Sebesar : " + formatRupiahString);
                System.out.println(borderInner);

                BarangKeluar barangKeluar = new BarangKeluar(pilihBarang, jumlahBarang, totalHarga);
                barangKeluarList.add(barangKeluar);
            }
        }
        Calculation calculation = new CalculationImpl();
        Integer totalPengeluaran = calculation.menghitungTotalPengeluaran(barangKeluarList);
        String totalPengeluaranString = convertToRupiah(totalPengeluaran);
        System.out.println("Selesai");
        System.out.println("Total Pengeluaran => " + totalPengeluaranString);
    }
}
