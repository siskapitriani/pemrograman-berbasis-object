package quizutama.jawabannomorsatu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BarangMasuk extends Data {
    Integer hargaBarangMasuk;
    Integer jmlBarangMasuk;

    public BarangMasuk() {
    }

    public Integer getHargaBarangMasuk() {
        return hargaBarangMasuk;
    }

    public BarangMasuk(Integer pilihanBarang, Integer jmlBarangMasuk, Integer hargaBarangMasuk) {
        super.pilihanBarang = pilihanBarang;
        this.jmlBarangMasuk = jmlBarangMasuk;
        this.hargaBarangMasuk = hargaBarangMasuk;
    }

    protected void pendataanBarangMasuk() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("*** Pendataan Barang Masuk PT. Garuda Abadi Group ***");

        showDataBarang();
        List<BarangMasuk> barangMasukList = new ArrayList<>();
        while (true) {
            System.out.print("Pilihan Anda : ");
            int pilihBarang = scanner.nextInt();

            if (pilihBarang == 0) {
                break;
            } else {
                System.out.print("Banyaknya Barang Yang Masuk : ");
                int jumlahBarang = scanner.nextInt();
                System.out.println("Data Tersimpan");
                //hitungHarga
                Integer hargaBarang = hargaBarang(pilihBarang);
                Integer totalHarga = hargaBarang * jumlahBarang;
                String formatRupiahString = convertToRupiah(totalHarga);
                System.out.println("Harga Sebesar : " + formatRupiahString);
                System.out.println(borderInner);

                BarangMasuk barangMasuk = new BarangMasuk(pilihBarang, jumlahBarang, totalHarga);
                barangMasukList.add(barangMasuk);
            }
        }
        //hitung Total pemasukan
        CalculationImpl calculation = new CalculationImpl();
        Integer totalPemasukan = calculation.menghitungTotalPemasukan(barangMasukList);
        String totalPemasukanString = convertToRupiah(totalPemasukan);

        //hitung total kas
        Integer totalKas = modalAwal + totalPemasukan;
        String totalKasString = convertToRupiah(totalKas);
        System.out.println("Selesai");
        System.out.println("Total Pemasukan   => " + totalPemasukanString);
        System.out.println("Total Kas         => " + totalKasString);
    }
}
