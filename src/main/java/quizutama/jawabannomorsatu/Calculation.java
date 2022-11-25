package quizutama.jawabannomorsatu;

import java.util.List;

public interface Calculation {
    Integer menghitungTotalPemasukan(List<BarangMasuk> barangMasukList);
    Integer menghitungTotalPengeluaran(List<BarangKeluar> barangKeluarList);
}