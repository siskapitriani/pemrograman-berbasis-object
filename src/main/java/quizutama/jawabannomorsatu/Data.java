package quizutama.jawabannomorsatu;

import java.text.NumberFormat;
import java.util.Locale;

public abstract class Data {
    final Integer modalAwal = 20000000;
    final String borderInner = "-----------------------------------------------------";
    Integer pilihanBarang;

    public void showDataBarang() {
        System.out.println(borderInner);
        System.out.println("||Jenis Barang || Nama Barang || Jumlah || Harga  ||");
        System.out.println(borderInner);
        System.out.println("||1. Buku   || Buku Tulis  || 1 Pak || Rp. 45.000 ||");
        System.out.println("||2. Buku   || Buku Gambar || 1 Pak || Rp. 50.000 ||");
        System.out.println("||3. Kertas || Kertas A4   || 1 Rim || Rp. 40.000 ||");
        System.out.println("||4. Bulpen || Bulpen Biru || 1 Pak || Rp. 38.000 ||");
        System.out.println("||5. Pensil || Pensil Raut || 1 Pak || Rp. 22.000 ||");
        System.out.println(borderInner);
        System.out.println(borderInner);
    }

    public Integer hargaBarang(Integer pilihBarang) {
        int harga;
        switch (pilihBarang) {
            case 1:
                harga = 45000;
                break;
            case 2:
                harga = 50000;
                break;
            case 3:
                harga = 40000;
                break;
            case 4:
                harga = 38000;
                break;
            case 5:
                harga = 22000;
                break;
            default:
                harga = 0;
        }
        return harga;
    }

    public String convertToRupiah(Integer totalHarga) {
        Locale localeID = new Locale("in", "ID");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);

        return formatRupiah.format(totalHarga);
    }
}