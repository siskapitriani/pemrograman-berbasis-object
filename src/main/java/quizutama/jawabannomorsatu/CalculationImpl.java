package quizutama.jawabannomorsatu;

import java.util.List;

public class CalculationImpl implements Calculation{
    @Override
    public Integer menghitungTotalPemasukan(List<BarangMasuk> barangMasukList) {
        int totalPemasukan = 0;
        for (BarangMasuk barangMasuk : barangMasukList) {
            Integer hargaBarangMasuk = barangMasuk.getHargaBarangMasuk();
            totalPemasukan = totalPemasukan+hargaBarangMasuk;
        }
        return totalPemasukan;
    }

    @Override
    public Integer menghitungTotalPengeluaran(List<BarangKeluar> barangKeluarList) {
        int totalPengeluaran = 0;
        for (BarangKeluar barangKeluar : barangKeluarList) {
            Integer hargaBarangKeluar = barangKeluar.getHargaBarangKeluar();
            totalPengeluaran = totalPengeluaran+hargaBarangKeluar;
        }
        return totalPengeluaran;
    }
}
