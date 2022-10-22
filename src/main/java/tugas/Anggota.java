package tugas;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class Anggota {
    String nama;
    String nik;
    String noHp;
    Double simpan;
    Double pinjam;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public Double getSimpan() {
        return simpan;
    }

    public void setSimpan(Double simpan) {
        this.simpan = simpan;
    }

    public Double getPinjam() {
        return pinjam;
    }

    public void setPinjam(Double pinjam) {
        this.pinjam = pinjam;
    }

    public Anggota() {
    }

    public Anggota(String nik, Double simpan) {
        this.nik = nik;
        this.simpan = simpan;
    }

    public Anggota(String nama, String nik, String noHp, Double pinjam) {
        this.nama = nama;
        this.nik = nik;
        this.noHp = noHp;
        this.pinjam = pinjam;
    }

    public void saving(Anggota anggota){
        Double jumlahUang = anggota.getSimpan();
        if (jumlahUang < 10000){
            System.out.println("Jumlah uang yang di simpan minimal 10000");
        }else {
            System.out.println("Berhasil menyimpan uang sebesar " +
                    jumlahUang);
        }

    }

    public void pinjaman(Anggota anggota){
        Double jumlahUang = anggota.getPinjam();
        double besarAngsuran;
        if(jumlahUang > 100000000){
            System.out.println("Tidak bisa meminjam di atas 100 juta");
        }else {
            besarAngsuran = hitungBesarAngsuran(jumlahUang);
            System.out.println("Nik : " + anggota.getNik());
            System.out.println("Nama : " + anggota.getNama());
            System.out.println("Berhasil meminjam sebesar "+ jumlahUang);
            System.out.println("Jumlah angsuran 6 kali");
            System.out.println("Besar angsuran : " + besarAngsuran);
        }
    }

    private double hitungBesarAngsuran(Double jumlahUang) {
        double besarAngsuran;
        besarAngsuran = (jumlahUang + (jumlahUang*0.05))/6;
        return besarAngsuran;
    }
}
